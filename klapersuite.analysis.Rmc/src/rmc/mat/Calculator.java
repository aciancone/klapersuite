/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

//import static org.junit.Assert.*;
//import org.junit.Test;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//XXX doesn't support operator precedences and sequence of operations without parenthesis
public class Calculator {
	public static String doubleNumberRegex="[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?";
	public double result(String expression) {
		if(expression.length()<1)
			throw new NumberFormatException("Empty expression");
		Pattern p = Pattern.compile("\\(?("+doubleNumberRegex+")([-\\*])("+doubleNumberRegex+")\\)?");
		Matcher m = p.matcher(expression);
		while(m.find()) {
//			System.out.println(expression);
			expression = m.replaceFirst(operation(m.group(3)).calculate(new BigDecimal(m.group(1)), new BigDecimal(m.group(4))).toString());
			m = p.matcher(expression);
		}
//		System.out.println("="+expression);
		return new BigDecimal(expression).doubleValue();
	}
	private Operation operation(String operator) {
		Operation[] operations = {new Multiplication(), new Subtraction()};
		for(Operation operation: operations) {
			if(!operation.operatorMatch(operator)) continue;
			return operation;
		}
		return null;
	}
	interface Operation {
		public boolean operatorMatch(String operator);
		public BigDecimal calculate(BigDecimal preOperator, BigDecimal postOperator);
	}
	class Subtraction implements Operation {
		public BigDecimal calculate(BigDecimal preOperator, BigDecimal postOperator) {
			return preOperator.subtract(postOperator);
		}
		public boolean operatorMatch(String operator) {
			return "-".equals(operator);
		}
	}
	class Multiplication implements Operation {
		public BigDecimal calculate(BigDecimal preOperator, BigDecimal postOperator) {
			return preOperator.multiply(postOperator);
		}
		public boolean operatorMatch(String operator) {
			return "*".equals(operator);
		}
	}
}
