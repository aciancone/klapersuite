/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RmcVariable extends RmcValue implements RmcAtomicValue {
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
	public boolean isVariableCalled(String name) {
		return rmcVariables.getVariableIdFromName(name) == variableId;
	}
	public int getId() {
		return variableId;
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof RmcVariable && equals((RmcVariable) obj);
	}
	public boolean equals(RmcVariable other) {
		return this.variableId == other.variableId;
	}
	@Override
	public List<List<RmcAtomicValue>> getSumOfProducts() {
		List<List<RmcAtomicValue>> termsList = new ArrayList<List<RmcAtomicValue>>();
		ArrayList<RmcAtomicValue> atomicTerm = new ArrayList<RmcAtomicValue>();
		termsList.add(atomicTerm);
		atomicTerm.add(this);
		return termsList;
	}
	public void updateIndexOfProductTerms(RmcIndexOfProductTerms indexOfProductTerms) {
		indexOfProductTerms.incrementOccurrenceOfVariableId(variableId);
	}
	@Override
	public String toString() {
		return "=" +toStringValue();
	}
	public String toStringValue() {
		return "var("+variableId+")";
	}
}
