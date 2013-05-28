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
import java.util.Map;

public class RmcVariables {
	private final List<BigDecimal> variableValues = new ArrayList<BigDecimal>();
	private final Map<String, Integer> variablePairNameId = new HashMap<String, Integer>();
	public int getVariableIdFromName(String variableName) {
		if(variablePairNameId.containsKey(variableName)) {
			return variablePairNameId.get(variableName);
		}
		return createVariable(variableName);
	}
	private int createVariable(String variableName) {
		int variableId = variableValues.size();
		variableValues.add(variableId, new BigDecimal(0));
		variablePairNameId.put(variableName, variableId);
		return variableId;
	}
	public BigDecimal getVariableValueFromId(int variableId) {
		return variableValues.get(variableId);
	}
	public void setVariableValue(String name, BigDecimal value) {
		variableValues.set(variablePairNameId.get(name), value);
	}
	public BigDecimal getVariableValueFromName(String variableName) {
		return getVariableValueFromId(getVariableIdFromName(variableName));
	}
}
