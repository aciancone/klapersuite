/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.generator;
/*
 * model type
 * - a tree
 * - a chaotic network (could contains loop)
 * 
 * number of resource from to
 * distribution of service for resource
 * depth of service call chain
 * number of call in a service
 * percentage of callee service
 * percentage of caller service
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.hamcrest.SelfDescribing;

import com.ibm.icu.math.BigDecimal;

import klaper.core.Activity;
import klaper.core.Behavior;
import klaper.core.Binding;
import klaper.core.Branch;
import klaper.core.End;
import klaper.core.KlaperModel;
import klaper.core.Resource;
import klaper.core.Service;
import klaper.core.ServiceControl;
import klaper.core.Start;
import klaper.core.Step;
import klaper.core.Transition;
import klaper.core.Workload;
import klaper.core.WorkloadType;
import klaper.expr.Double;
import klaper.probability.Constant;
import klaper.probability.Exponential;


public class TreeKlaperModelGenerator extends KlaperModelGenerator {
	List<Service> toConnectService = new ArrayList<Service>();
	List<Service> connectedService = new ArrayList<Service>();
	int numberOfTerminalService = 0;
	
	private boolean simpleNumber;
	private int resourceId = 1;
	private int serviceId = 1;

	private final int resourceNumber;
	private final int minResource;
	private final int maxResource;
	private final int minService;
	private final int maxService;
	private final int minActivity;
	private final int maxActivity;
	private final int minServiceCall;
	private final int maxServiceCall;
	
	private final float percentageTerminalService;
	private final float minPercentageTerminalService;
	private final float maxPercentageTerminalService;
	private final float percentageBranchingService;
	private final float percentageLoopService;
	private final int minLoopRepetitions;
	private final int maxLoopRepetitions;

	TreeKlaperModelGenerator(int minResource, int maxResource, int minService, int maxService, int minActivity, int maxActivity, int minServiceCall, int maxServiceCall, float minPercentageTerminalService, float maxPercentageTerminalService, float percentageBranchingService, boolean simpleNumber) {
		this(minResource, maxResource, minService, maxService, minActivity, maxActivity, minServiceCall, maxServiceCall, minPercentageTerminalService, maxPercentageTerminalService, percentageBranchingService, 0, 0, 0, simpleNumber);
	}
	TreeKlaperModelGenerator(int minResource, int maxResource, int minService, int maxService, int minActivity, int maxActivity, int minServiceCall, int maxServiceCall, float minPercentageTerminalService, float maxPercentageTerminalService, float percentageBranchingService, float percentageLoopService, int minLoopRepetitions, int maxLoopRepetitions, boolean simpleNumber) {
		this.minService = minService;
		this.maxService = maxService;
		this.minActivity = minActivity;
		this.maxActivity = maxActivity;
		this.minServiceCall = minServiceCall;
		this.maxServiceCall = maxServiceCall;
		
		this.minResource =  minResource;
		this.maxResource = maxResource;
		this.resourceNumber = randomUnsignedIntegerBetween(minResource, maxResource);
		
		this.minPercentageTerminalService = minPercentageTerminalService;
		this.maxPercentageTerminalService = maxPercentageTerminalService;
		this.percentageTerminalService =
			randomUnsignedFloatBetween(minPercentageTerminalService, maxPercentageTerminalService);
		
		this.percentageBranchingService = percentageBranchingService;
		this.percentageLoopService = percentageLoopService;
		
		this.simpleNumber = simpleNumber;
		
		this.minLoopRepetitions = minLoopRepetitions;
		this.maxLoopRepetitions = maxLoopRepetitions;
	}

	public KlaperModel generateModel() {
		KlaperModel model = super.generateModel(); 
		model.getResource().addAll(generateResources(minService, maxService, minActivity, maxActivity, minServiceCall, maxServiceCall));
		model.getWorkload().add(generateWorkload("tree["+minResource+":"+maxResource+" "+minService+":"+maxService+"]"));
		return model;
	}

	private Workload generateWorkload(String configuration) {
		Workload workload = coreFactory.createWorkload();
		workload.setName("generated with "+configuration);
		workload.setType(WorkloadType.CLOSED);
		Behavior generatedBehaviour = generateWorkloadBehavior();
		workload.setBehavior(generatedBehaviour);
		return workload;
	}

	private Behavior generateWorkloadBehavior() {
		Behavior behavior = coreFactory.createBehavior();
		while(connectedService.size()>0) {
			if(toConnectService.size()<=connectedService.size()) break; // currently impossible by construction, last created service is not connected
			toConnectService.remove(connectedService.get(0));
			connectedService.remove(0);
		}
		while(toConnectService.size()>0) {
			Service callee = getRandomServiceToConnect();
			ServiceControl caller = generateServiceCall(callee);
			behavior.getStep().add(caller);
			toConnectService.remove(callee);
			connectedService.remove(callee);
		}
		Start start = coreFactory.createStart();
		End end = coreFactory.createEnd();
		behavior.getTransition().addAll(generateControlFlow(start, end, behavior.getStep()));
		behavior.getStep().add(start);
		behavior.getStep().add(end);
		return behavior;
	}
	private List<Transition> generateControlFlow(Start start, End end, List<Step> internalSteps) {
		List<Step> stepToLink = new ArrayList<Step>(internalSteps);
		List<Transition> transitions = new ArrayList<Transition>();
		generateLinearControlFlow(start, end, stepToLink, transitions);
		return transitions;
	}
	private void generateLinearControlFlow(Start start, End to, List<Step> stepToLink, List<Transition> transitions) {
		generateLinearControlFlow((Step) start, (Step) to, stepToLink, transitions, stepToLink.size());
	}
	private void generateLinearControlFlow(Step from, Step to, List<Step> stepToLink, List<Transition> transitions, int flowLength) {
		while(stepToLink.size()>0 && flowLength-->0) {
			Step next = stepToLink.get(randomUnsignedIntegerBetween(0, stepToLink.size()-1));
			transitions.add(createTransition(from, next, 1));
			stepToLink.remove(next);
			from = next;
		}
		transitions.add(createTransition(from, to, 1));
	}
	private List<Transition> generateBranchControlFlow(Start start, End end, List<Step> internalSteps) {
		List<Transition> transitions = new ArrayList<Transition>();
		if(internalSteps.isEmpty()) {
			transitions.add(createTransition(start, end, 1));
			return transitions;
		}
		List<Step> stepToLink = new ArrayList<Step>(internalSteps);
		Branch branch = generateBranch();
		generateBranchControlFlow(start, end, branch, stepToLink, transitions);
		internalSteps.add(branch);
		return transitions;
	}
	private void generateBranchControlFlow(Start from, End to, Branch branch, List<Step> stepToLink, List<Transition> transitions) {
		transitions.add(createTransition(from, branch, 1));
		if(stepToLink.isEmpty()) return; // currently impossible by construction
		int oneSideLength = randomUnsignedIntegerBetween(1, stepToLink.size());
		Step next = stepToLink.get(randomUnsignedIntegerBetween(0, stepToLink.size()-1));
		transitions.add(createTransition(branch, next, .5f));
		stepToLink.remove(next);
		generateLinearControlFlow(next, to, stepToLink, transitions, oneSideLength);
		if(stepToLink.isEmpty()) {
			transitions.add(createTransition(branch, to, .5f));
			return;
		}
		next = stepToLink.get(randomUnsignedIntegerBetween(0, stepToLink.size()-1));
		transitions.add(createTransition(branch, next, .5f));
		stepToLink.remove(next);
		generateLinearControlFlow(next, to, stepToLink, transitions, stepToLink.size());
	}

	private Behavior generateBehavior(int activityNumber, int serviceCallNumber, int loopRepetition) {
		Behavior behavior = coreFactory.createBehavior();
		for(int counter = activityNumber; counter > 0; counter--) {
			behavior.getStep().add(generateActivity(1, 1, generateFailureProbabilityValue()));
		}
		for(int counter = serviceCallNumber; counter > 0; counter--) {
			if(toConnectService.size() <= 0) break;
			behavior.getStep().add(generateServiceCall(getRandomServiceToConnect()));
		}
		if(randomUnsignedFloatBetween(0,1) <= percentageLoopService && loopRepetition > 1) {
			Activity loop = generateLoop(loopRepetition);
			behavior.getStep().add(loop);
		}
		Start start = coreFactory.createStart();
		End end = coreFactory.createEnd();
		if(randomUnsignedFloatBetween(0,1) >= percentageBranchingService) {
			behavior.getTransition().addAll(generateControlFlow(start, end, behavior.getStep()));
		}else {
			behavior.getTransition().addAll(generateBranchControlFlow(start, end, behavior.getStep()));
		}
		behavior.getStep().add(start);
		behavior.getStep().add(end);		
		return behavior;
	}

	private Branch generateBranch() {
		return coreFactory.createBranch();
	}
	private Activity generateLoop(int loopRepetition) {
		Activity loop = generateActivity(1, loopRepetition, 0);
		loop.setNestedBehavior(generateBehavior(
				randomUnsignedIntegerBetween(minActivity, maxActivity),
				randomUnsignedIntegerBetween(minServiceCall, maxServiceCall),
				1));
		return loop;
	}
	private Activity generateActivity(int executionTime, int repetitions, double failureProbability) {
		Activity activity = coreFactory.createActivity();
		
		Double expressionOfOne = createDoubleExpression(executionTime);
		Constant execTime = probabilityFactory.createConstant();
		execTime.setValue(expressionOfOne);
		activity.setInternalExecTime(execTime);
		
		Double probExpression = createDoubleExpression(failureProbability);
		Constant failProbability = probabilityFactory.createConstant();
		failProbability.setValue(probExpression);
		activity.setInternalFailProb(failProbability);

		Constant repetitionsExpression = probabilityFactory.createConstant();
		repetitionsExpression.setValue(createDoubleExpression(repetitions));
		activity.setRepetitions(repetitionsExpression);
		return activity;
	}

	private double generateFailureProbabilityValue() {
		if(!simpleNumber) {
			return randomUnsignedFloatBetween(0.000000001f, 0.000009f);
		}
		return new BigDecimal(randomUnsignedIntegerBetween(1,9)+"E-"+randomUnsignedIntegerBetween(6, 9)).doubleValue();		
	}

	private Double createDoubleExpression(double value) {
		Double expr = exprFactory.createDouble();
		expr.setValue(value);
		return expr;
	}

	private ServiceControl generateServiceCall(Service callee) {
		ServiceControl caller = coreFactory.createServiceControl();
		Binding bind = coreFactory.createBinding();
		caller.setBinding(bind);
		
		bind.setCall(callee);
		considerToExcludeAnAlreadyConnectedServiceFromConnectableList();
		
		Double execExpr = createDoubleExpression(1);
		Constant execTime = probabilityFactory.createConstant();
		execTime.setValue(execExpr);
		caller.setInternalExecTime(execTime);

		return caller;
	}

	private void considerToExcludeAnAlreadyConnectedServiceFromConnectableList() {
		if(connectedService.isEmpty()) return; //currently impossible by construction, always called after a service is connected
		if(toConnectService.size()<=1) return;
		// the probability to remove a service increase with the ratio of service/serviceCall
		if( randomUnsignedFloatBetween(0,1) > serviceForServiceCall()) {
			return;
		}
		Service elected4NoMoreCallToIt = connectedService.get(randomUnsignedIntegerBetween(0, connectedService.size()-1));
		connectedService.remove(elected4NoMoreCallToIt);
		toConnectService.remove(elected4NoMoreCallToIt);	
	}

	private float serviceForServiceCall() {
		float approximatedExtimationOfTotalService = resourceNumber*(minService+maxService)/2;
		float approximatedExtimationOfTotalServiceCall = approximatedExtimationOfTotalService*(1-percentageTerminalService)*(minServiceCall+maxServiceCall)/2;
		if(approximatedExtimationOfTotalServiceCall<=0) return 1;
		return approximatedExtimationOfTotalService/approximatedExtimationOfTotalServiceCall;
	}

	private Service getRandomServiceToConnect() {
		if(toConnectService.size() <= 0) return null;
		Service service = toConnectService.get(randomUnsignedIntegerBetween(0, toConnectService.size()-1));
		if(!connectedService.contains(service)) {
			connectedService.add(service);
		}
		return service;
	}

	private Transition createTransition(Step fromStep, Step toStep, double probability) {
		Transition transition = coreFactory.createTransition();
		transition.setFrom(fromStep);
		transition.setTo(toStep);
		transition.setProb(probability);
		return transition;
	}

	private Collection<? extends Resource> generateResources(int minService, int maxService, int minActivity, int maxActivity, int minServiceCall, int maxServiceCall) {
		ArrayList<Resource> resources = new ArrayList<Resource>();
		while(resources.size()<resourceNumber) {
			resources.add(generateResource(minService, maxService, minActivity, maxActivity, minServiceCall, maxServiceCall));
		}
		return resources;
	}

	private int randomUnsignedIntegerBetween(int minimumValue, int maximumValue) {
		if(maximumValue == minimumValue) {
			return minimumValue;
		}
		int randomValue = minimumValue + new Random().nextInt(maximumValue-minimumValue);
		return randomValue;
	}

	private float randomUnsignedFloatBetween(float minimumValue, float maximumValue) {
		if(new Float(minimumValue).equals(maximumValue)) {
			return minimumValue;
		}
		return minimumValue + (new Random().nextFloat()%(maximumValue-minimumValue));
	}
	
	private Resource generateResource(int minService, int maxService, int minActivity, int maxActivity, int minServiceCall, int maxServiceCall) {
		Resource resource = coreFactory.createResource();
		resource.setName("R"+resourceId++);
		resource.getOfferedService().addAll(generateServices(minService, maxService, minActivity, maxActivity, minServiceCall, maxServiceCall));
		return resource;
	}

	private Collection<? extends Service> generateServices(int minService, int maxService, int minActivity, int maxActivity, int minServiceCall, int maxServiceCall) {
		ArrayList<Service> services = new ArrayList<Service>();
		int serviceNumber = randomUnsignedIntegerBetween(minService, maxService);
		while(services.size()<serviceNumber) {
			Service service = null;
			if(numberOfTerminalService <=0 || Math.abs(new Random().nextFloat())%1<percentageTerminalService) {
				service = generateService(minActivity, maxActivity, 0, 0);
			}else {
				service = generateService(minActivity, maxActivity, minServiceCall, maxServiceCall);
			}
			services.add(service);
			toConnectService.add(service);
		}
		return services;
	}
	private Service generateService(int minActivity, int maxActivity, int minServiceCall, int maxServiceCall) {		
		Service service = coreFactory.createService();
		service.setName("S"+serviceId++);
		int serviceCall = randomUnsignedIntegerBetween(minServiceCall, maxServiceCall); 
		int activity = randomUnsignedIntegerBetween(minActivity, maxActivity);
		int LoopRepetition = randomUnsignedIntegerBetween(minLoopRepetitions, maxLoopRepetitions);
		if(serviceCall == 0) numberOfTerminalService++;
		service.setBehavior(generateBehavior(activity, serviceCall, LoopRepetition));
		return service;
	}
}
