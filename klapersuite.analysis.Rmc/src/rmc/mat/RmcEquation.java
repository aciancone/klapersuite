/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

import java.math.BigDecimal;

public class RmcEquation {
	private final RmcVariables inputVariables;
	public final String variableName;
	public final RmcValue variableValue;
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
	public RmcValue derivateWithRespectTo(String variableName) {
		return derivateWithRespectTo(inputVariables.getVariableIdFromName(variableName));
	}
	public RmcValue derivateWithRespectTo(int variableId) {
		return variableValue.derivateWithRespectTo(inputVariables, variableId);
	}
}