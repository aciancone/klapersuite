/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


import static org.junit.Assert.*;

import org.junit.Test;

import rmc.mat.Calculator;



public class RmcCalculatorTest {
	@Test(expected=NumberFormatException.class)
	public void emptyExpression() {
		(new Calculator()).result("");
	}
	@Test
	public void zeroString() {
		assertEquals(0, (new Calculator()).result("0.00"), 0);
	}
	@Test
	public void oneString() {
		assertEquals(1, (new Calculator()).result("1.00"), 0);
	}
	@Test
	public void multiplication() {
		assertEquals(0.2, (new Calculator()).result("1*0.2"), 0);
	}
	@Test
	public void subtraction() {
		assertEquals(0.2, (new Calculator()).result("1.00-0.8"), 0);
	}
	@Test
	public void parentesis() {
		assertEquals(0.2, (new Calculator()).result("0.50*(1.00-0.6)"), 0);
	}
	@Test
	public void multipleParentesis() {
		assertEquals(0.0, (new Calculator()).result("(0.9*1)-(1-0.1))"), 0);
	}
	@Test
	public void parentesisError() {
		assertEquals(0.81, (new Calculator()).result("0.9*(1-0.1))"), 0);
	}
	@Test
	public void numberWithExponentFormat() {
		assertEquals(2.0E-6, (new Calculator()).result("2.0E-6"), 0);
	}
	@Test
	public void numberWithExponentFormatInExpression() {
		assertEquals(1.0E-6, (new Calculator()).result("(2.0E-6*0.5)"), 0);
	}
}
