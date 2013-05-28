/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


import static org.junit.Assert.*;

import java.math.BigDecimal;
import org.junit.Test;

import rmc.mat.RmcDecimal;
import rmc.mat.RmcEquation;
import rmc.mat.RmcMultiplication;
import rmc.mat.RmcSum;
import rmc.mat.RmcValue;
import rmc.mat.RmcVariable;
import rmc.mat.RmcVariables;


public class RmcEquationTest {
	@Test
	public void derivateOfConstant() {
		String x = "x";
		String y = "y";
		RmcVariables vars = new RmcVariables();
		assertEquals(new RmcDecimal(new BigDecimal(0)), new RmcEquation(vars, y, new RmcDecimal(new BigDecimal(-1))).derivateWithRespectTo(x));
		assertEquals(new RmcDecimal(new BigDecimal(0)), new RmcEquation(vars, y, new RmcDecimal(new BigDecimal(0))).derivateWithRespectTo(x));
		assertEquals(new RmcDecimal(new BigDecimal(0)), new RmcEquation(vars, y, new RmcDecimal(new BigDecimal(1))).derivateWithRespectTo(x));
		assertEquals(new RmcDecimal(new BigDecimal(0)), new RmcEquation(vars, y, new RmcDecimal(new BigDecimal(42))).derivateWithRespectTo(x));
	}
	@Test
	public void derivateOfSingleVar() {
		String x = "x";
		String y = "y";
		RmcVariables vars = new RmcVariables();
		RmcVariable equationValue = new RmcVariable(vars, vars.getVariableIdFromName(x));
		RmcEquation equation = new RmcEquation(vars, y, equationValue);

		assertEquals(new RmcDecimal(new BigDecimal(1)), equation.derivateWithRespectTo(x));
		assertEquals(new RmcDecimal(new BigDecimal(0)), equation.derivateWithRespectTo("z"));
	}
	@Test
	public void derivateOfMultiplication() {
		String x = "x";
		String y = "y";
		RmcVariables vars = new RmcVariables();
		RmcValue equationValue = new RmcMultiplication(new RmcDecimal(new BigDecimal(-2)), new RmcVariable(vars, vars.getVariableIdFromName(x)));
		RmcEquation equation = new RmcEquation(vars, y, equationValue);

		assertEquals(new RmcDecimal(new BigDecimal(-2)), equation.derivateWithRespectTo(x));
		assertEquals(new RmcDecimal(new BigDecimal(0)), equation.derivateWithRespectTo("z"));
	}
	@Test
	public void derivateOfSum() {
		String x = "x";
		String z = "z";
		String y = "y";
		RmcVariables vars = new RmcVariables();
		RmcValue equationValue = new RmcSum(new RmcVariable(vars, vars.getVariableIdFromName(x)), 
				new RmcMultiplication(new RmcVariable(vars, vars.getVariableIdFromName(x)), new RmcVariable(vars, vars.getVariableIdFromName(z))));
		RmcEquation equation = new RmcEquation(vars, y, equationValue);

		assertEquals(
				new RmcMultiplication(new RmcDecimal(new BigDecimal(1)),new RmcVariable(vars, vars.getVariableIdFromName(x))),
				equation.derivateWithRespectTo(z));
		assertEquals(
				new RmcSum(new RmcDecimal(new BigDecimal(1)),
					new RmcMultiplication(new RmcDecimal(new BigDecimal(1)),new RmcVariable(vars, vars.getVariableIdFromName(z)))),
				equation.derivateWithRespectTo(x));
	}
}
