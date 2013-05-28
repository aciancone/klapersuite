/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package klapersuite.RmcAnalysis;

import rmc.core.ModuleInstantiationException;
import rmc.core.NodeInstantiationException;
import rmc.core.NodeNotFoundException;
import rmc.core.ProbabilityException;
import rmc.core.RMC;
import klapersuite.backbone.dtmc.IDtmcModel;
import rmc.importer.dtmc.Transfomation;
import rmc.mat.BasicSolver;
import rmc.mat.RmcSolver;
import rmc.mat.RmcVariables;
import rmc.mat.Solver;

public class ReliabilityAnalysis {
	public static int DEFAULT_RESULT_PRECISION = 12;

	private final IDtmcModel dtmcModel;
	private RMC rmc;
	private Solver ns;

	private int resultDecimalDigitsPrecision;
	public ReliabilityAnalysis(IDtmcModel dtmcModel, int resultDecimalDigitsPrecision) {
		this.dtmcModel = dtmcModel;
		this.resultDecimalDigitsPrecision = resultDecimalDigitsPrecision;
	}

	public ReliabilityAnalysisResult executionV2() {
		long resultPrecisionBase2 = 1+(long)(resultDecimalDigitsPrecision*Math.log(10)/Math.log(2));

			RmcVariables inputVariables = new RmcVariables();
			try {
				rmc=new Transfomation().generateRMC(dtmcModel);
				ns = new RmcSolver(inputVariables, rmc.getRmcEquations(inputVariables));
				ns.iterateUntilMSVlessThan(0, (long)Math.pow(2, resultPrecisionBase2));
		} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (NodeInstantiationException e) {
				e.printStackTrace();
			} catch (NodeNotFoundException e) {
				e.printStackTrace();
			} catch (ProbabilityException e) {
				e.printStackTrace();
			} catch (ModuleInstantiationException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new ReliabilityAnalysisResult(rmc,  ns);
	}
	public ReliabilityAnalysisResult execute() {
		long resultPrecisionBase2 = 1+(long)(resultDecimalDigitsPrecision*Math.log(10)/Math.log(2));
		try {
			rmc=new Transfomation().generateRMC(dtmcModel);
			rmc.computeEquations();
			System.out.println("RMC validation : "+rmc.validate());
			System.out.println("Equations: {");
			for(String s : rmc.getEquations()){
				System.out.println(s);
			}
			System.out.println("}");

			if(rmc.validate()==false){
				throw new RuntimeException("Invalid RMC equations");
			}
				System.out.println("BASIC Solver");
				ns = new BasicSolver(rmc.getEquations());
				long starttime = System.currentTimeMillis();
				ns.iterateUntilMSVlessThan(0, (long)Math.pow(2, resultPrecisionBase2));
				long totaltime = System.currentTimeMillis()-starttime;
				ns.printCurrentAssign();
				System.out.println("Milliseconds: "+totaltime);
				System.out.println("Reliability: "+ns.getValue(rmc.getInitialModule().getName()+rmc.getInitialModule().getStart().getName()));
				System.out.println("MSV: "+ns.getMSV());
				System.out.println("Iterations: "+ns.getNumIterations());
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		return new ReliabilityAnalysisResult(rmc,  ns);
	}
}