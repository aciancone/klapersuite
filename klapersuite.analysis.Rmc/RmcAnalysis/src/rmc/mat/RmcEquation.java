/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

import java.math.BigDecimal;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RmcEquation {
	private final RmcVariables inputVariables;
	public final String variableName;
	private final RmcValue variableValue;
	public final int variableId;
	public RmcEquation(RmcVariables inputVariables, String variableName, RmcValue variableValue) {
		this.inputVariables = inputVariables;
		this.variableName = variableName;
		this.variableId = inputVariables.getVariableIdFromName(variableName);
		this.variableValue = variableValue;
	}
	public BigDecimal calculate() {
		return variableValue.calculate();
	}
}