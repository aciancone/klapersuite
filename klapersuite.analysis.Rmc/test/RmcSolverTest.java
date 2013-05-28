/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import rmc.mat.*;

public class RmcSolverTest {
	@Test
	public void rmcEquation() {
		RmcVariables inputVariables = new RmcVariables();
		RmcEquation equation = new RmcEquation(inputVariables, "A", new RmcDecimal(new BigDecimal(.45)));
		assertEquals("A", equation.variableName);
		assertEquals(0, equation.variableId);
		assertEquals(0.45, equation.calculate().doubleValue(), 0);
	}
	@Test
	public void rmcDecimalValue() {
		RmcDecimal rmcValue = new RmcDecimal(new BigDecimal(0.34));
		assertEquals(0.34, rmcValue.calculate().doubleValue(), 0);		
	}
	@Test
	public void rmcVariableValue() {
		RmcVariables inputVariables = new RmcVariables();
		RmcVariable rmcValue = new RmcVariable(inputVariables, inputVariables.getVariableIdFromName("var1"));
		assertEquals(0, rmcValue.calculate().doubleValue(), 0);		
		inputVariables.setVariableValue("var1", new BigDecimal(0.41));
		assertEquals(0.41, rmcValue.calculate().doubleValue(), 0);
	}
	@Test
	public void rmcMultiplicationValue() {
		RmcMultiplication rmcValue = new RmcMultiplication(
				new RmcDecimal(new BigDecimal(.2)),
				new RmcDecimal(new BigDecimal(.3)));
		assertEquals(0.06, rmcValue.calculate().doubleValue(), 0);		
	}
	@Test
	public void rmcSumValue() {
		RmcSum rmcValue = new RmcSum(
				new RmcDecimal(new BigDecimal(.2)),
				new RmcDecimal(new BigDecimal(.3)));
		assertEquals(0.5, rmcValue.calculate().doubleValue(), 0);		
	}
	@Test
	public void rmcSolver() throws Exception {
		RmcVariables inputVariables = new RmcVariables();
		ArrayList<RmcEquation> equations = new ArrayList<RmcEquation>();

		/* 
		 * Equations:
		 * E = 1
		 * A = .8*S+.2*E
		 * S = .3*A+.7*F
		 */
		equations.add(new RmcEquation(inputVariables, "F", 
				new RmcDecimal(new BigDecimal(0))));
		equations.add(new RmcEquation(inputVariables, "E", 
			new RmcDecimal(new BigDecimal(1))));
		equations.add(new RmcEquation(inputVariables, "A",
				new RmcSum(
					new RmcMultiplication(
						new RmcDecimal(new BigDecimal(.8)),
						new RmcVariable(inputVariables, inputVariables.getVariableIdFromName("S"))),
					new RmcMultiplication(
						new RmcDecimal(new BigDecimal(.2)),
						new RmcVariable(inputVariables, inputVariables.getVariableIdFromName("E"))))));
		equations.add(new RmcEquation(inputVariables, "S",
				new RmcSum(
					new RmcMultiplication(
						new RmcDecimal(new BigDecimal(.3)),
						new RmcVariable(inputVariables, inputVariables.getVariableIdFromName("A"))),
					new RmcMultiplication(
						new RmcDecimal(new BigDecimal(.7)),
						new RmcVariable(inputVariables, inputVariables.getVariableIdFromName("F"))))));		

//		Solver solver = new RmcSolver(inputVariables, equations);
//
//		assertEquals(0, solver.getNumIterations());
//		solver.iterateUntilMSVlessThan(1E-18, 200);
//		assertTrue(solver.getNumIterations() > 0);
//
//		assertEquals(1, solver.getValue("E"), 0);
//		assertEquals(.8*.2*.3/(1-.3*.8)+.2, solver.getValue("A"), 0);
//		assertEquals(.2*.3/(1-.3*.8), solver.getValue("S"), 0);
//		assertEquals(0, solver.getValue("F"), 0);

		Solver solver = new RmcNewtonSolver(inputVariables, equations);
		assertEquals(0, solver.getNumIterations());
		solver.iterateUntilMSVlessThan(1E-18, 200);
		assertTrue(solver.getNumIterations() > 0);

		assertEquals(1, solver.getValue("E"), 0);
		assertEquals(.8*.2*.3/(1-.3*.8)+.2, solver.getValue("A"), 0);
		assertEquals(.2*.3/(1-.3*.8), solver.getValue("S"), 0);
		assertEquals(0, solver.getValue("F"), 0);		
	}
}