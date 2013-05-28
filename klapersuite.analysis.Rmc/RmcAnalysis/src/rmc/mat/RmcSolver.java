/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RmcSolver implements Solver {
	private final List<RmcEquation> rmcEquations; 
	private final RmcVariables inputVariables;
	private final List<BigDecimal> resultVariables;
	private long currentIterations = 0;
	private double currentMSV = Double.MAX_VALUE;
	public RmcSolver(RmcVariables inputVariables, List<RmcEquation> equations){
		this.inputVariables = inputVariables;
		this.rmcEquations = equations;
		this.resultVariables = new ArrayList<BigDecimal>(equations.size());
		for(int i=0; i < equations.size(); i++) {
			this.resultVariables.add(null);
		}
	}
	public long getNumIterations() {
		return currentIterations;
	}
	public void printCurrentAssign() {
		for(RmcEquation equation: rmcEquations) {
			System.out.println(equation.variableName+"="+resultVariables.get(inputVariables.getVariableIdFromName(equation.variableName)));
		}
	}
	public HashMap<String, Double> getCurrentAssignment() {
		HashMap<String, Double> assignmentOfVariables = new HashMap<String, Double>();
		for(RmcEquation equation: rmcEquations) {
			assignmentOfVariables.put(equation.variableName, inputVariables.getVariableValueFromName(equation.variableName).doubleValue());
		}
		return assignmentOfVariables;
	}
	public void setCurrentAssignment(HashMap<String, Double> assigns) throws Exception {
		for(String key: assigns.keySet()) {
			 inputVariables.setVariableValue(key, new BigDecimal(assigns.get(key).toString()));
		}
	}
	public void iterateUntilMSVlessThan(double maxMSV, long maxIterations) throws Exception {
		while(currentMSV > maxMSV && currentIterations < maxIterations) {
			currentMSV = 0;
			currentIterations++;
			for(RmcEquation rmcEquation: rmcEquations) {
				resultVariables.set(rmcEquation.variableId, rmcEquation.calculate());
			}
			for(RmcEquation rmcEquation: rmcEquations) {
				currentMSV = Math.max(currentMSV, resultVariables.get(rmcEquation.variableId).subtract(
					inputVariables.getVariableValueFromId(rmcEquation.variableId)).abs().doubleValue());
				inputVariables.setVariableValue(rmcEquation.variableName, resultVariables.get(rmcEquation.variableId));
			}
		}
	}
	public double getValue(String variableName) throws TargetVariableNotFoundException {
		return resultVariables.get(inputVariables.getVariableIdFromName(variableName)).doubleValue();
	}
	public void iterateUntilTargetDeltalessThan(String var,
			double maxVariation, long maxIterations) throws Exception {	
		throw new Exception("Not implemented");
	}
	public void iterateUntilTargetAVG10DeltalessThan(String var,
			double maxVariation, long maxIterations) throws Exception {
		throw new Exception("Not implemented");
	}
	public void doNIterations(long num) throws Exception {
		throw new Exception("Not implemented");
	}
	public double getMSV() {
		return currentMSV;
	}
}