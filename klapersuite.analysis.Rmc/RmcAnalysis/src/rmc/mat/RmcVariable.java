/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

import java.math.BigDecimal;

public class RmcVariable extends RmcValue {
	private final RmcVariables rmcVariables;
	private final int variableId;
	public RmcVariable(RmcVariables rmcVariables, int variableId) {
		this.rmcVariables = rmcVariables;
		this.variableId = variableId;
	}
	@Override
	public BigDecimal calculate() {
		return rmcVariables.getVariableValueFromId(variableId);
	}

}
