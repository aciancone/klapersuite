/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.generator;

public class KlaperModelGeneratorFactory {
	private int minResource = 0;
	private int maxResource = 0;
	private int minService = 0;
	private int maxService = 0;
	private int minActivity = 0;
	private int maxActivity = 0;
	private int minServiceCall = 0;
	private int maxServiceCall = 0;
	private int minLoopRepetition = 0;
	private int maxLoopRepetition = 0;
	private float percentageLoopService = 0;
	private float minPercentageTerminalService = 0;
	private float maxPercentageTerminalService = 1;
	private float percentageBranchingService = 0;
	private boolean simpleProbabilityNumber = true;
	
	public KlaperModelGeneratorFactory setResourceNumber(int min, int max) {
		if(min<0) return null;
		if(min>max) return null;
		minResource = min;
		maxResource = max;
		return this;
	}
	public KlaperModelGeneratorFactory setServiceInResource(int min, int max) {
		if(min<0) return null;
		if(min>max) return null;
		minService = min;
		maxService = max;
		return this;
	}
	public KlaperModelGeneratorFactory setServiceCallInService(int min, int max) {
		if(min<0) return null;
		if(min>max) return null;
		minServiceCall = min;
		maxServiceCall = max;
		return this;
	}
	public KlaperModelGeneratorFactory setActivityInService(int min, int max) {
		if(min<0) return null;
		if(min>max) return null;
		minActivity = min;
		maxActivity = max;
		return this;
	}
	public KlaperModelGeneratorFactory setPercentageTerminalService(float min, float max) {
		if(min<0) return null;
		if(min>max) return null;
		minPercentageTerminalService = min;
		maxPercentageTerminalService = max;
		return this;
	}
	public KlaperModelGeneratorFactory setPercentageTerminalService(float value) {
		if(value<0) return null;
		minPercentageTerminalService = value;
		maxPercentageTerminalService = value;
		return this;
	}
	public KlaperModelGeneratorFactory setPercentageBranchingService(float value) {
		if(value<0) return null;
		percentageBranchingService = value;
		return this;
	}
	public KlaperModelGeneratorFactory setLoopService(float percentage, int minRepetition, int maxRepetition) {
		if(percentage<0) return null;
		if(minRepetition<1) return null;
		if(minRepetition>maxRepetition) return null;
		percentageLoopService  = percentage;
		this.minLoopRepetition = minRepetition;
		this.maxLoopRepetition = maxRepetition;
		return this;
	}
	public KlaperModelGeneratorFactory setSimpleProbabilityNumber(boolean value) {
		simpleProbabilityNumber = value;
		return this;
	}
	public TreeKlaperModelGenerator threeModel() {
		return new TreeKlaperModelGenerator(minResource, maxResource, minService, maxService, minActivity, maxActivity, minServiceCall, maxServiceCall, minPercentageTerminalService, maxPercentageTerminalService, percentageBranchingService, percentageLoopService, minLoopRepetition, maxLoopRepetition, simpleProbabilityNumber);
	}
	public static TreeKlaperModelGenerator threeModel(int minResource, int maxResource, int minService, int maxService, int minActivity, int maxActivity, int minServiceCall, int maxServiceCall, float minPercentageTerminalService, float maxPercentageTerminalService, float percentageBranchingService, boolean simpleProbabilityNumber) {
		return new TreeKlaperModelGenerator(minResource, maxResource, minService, maxService, minActivity, maxActivity, minServiceCall, maxServiceCall, minPercentageTerminalService, maxPercentageTerminalService, percentageBranchingService, simpleProbabilityNumber);
	}
	public static KlaperModelGenerator klaperModel() {
		return new KlaperModelGenerator();
	}
}