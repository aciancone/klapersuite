/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package klapersuite.RmcAnalysis;

import java.util.HashMap;
import java.util.Set;

import rmc.core.RMC;
import rmc.mat.Solver;
import rmc.mat.TargetVariableNotFoundException;


public class ReliabilityAnalysisResult {
	private final RMC rmc;
	private final Solver solver;

	public ReliabilityAnalysisResult(RMC rmc, Solver solver) {
		this.rmc = rmc;
		this.solver = solver;
	}
	public Set<String> getEquations() {
		return rmc.getEquations();
	}
	public String getRmcModelDetails() {
		String result = "RMC validation : "+ rmc.validate() +"\n"+
		"Equations: {\n";
		for(String s : rmc.getEquations()){
			result += s + "\n";
		}
		result += "}\n"+ 
			"Values: {\n"+
			solver.getCurrentAssign()+
			"}";
		return result;
	}
	public HashMap<String, Double> getAssignment() {
		return solver.getCurrentAssignment();
	}
	public double getReliability() {
		try {
			return solver.getValue(rmc.getInitialModule().getName()+rmc.getInitialModule().getStart().getName());
		} catch (TargetVariableNotFoundException e) {
			return 0;
		}
	}
	public double getMSV() {
		return solver.getMSV();
	}
	public long getIterations() {
		return solver.getNumIterations();
	}
}
