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

public class RmcDecimal extends RmcValue implements RmcAtomicValue {
	private final BigDecimal value;
	public RmcDecimal(BigDecimal value) {
		this.value = value;
	}
	@Override
	public BigDecimal calculate() {
		return value;
	}
	@Override
	public boolean equals(Object obj) {
		return obj instanceof RmcDecimal && equals((RmcDecimal) obj);
	}
	public boolean equals(RmcDecimal other) {
		return this.value.equals(other.value);
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
		indexOfProductTerms.multiplyNumericFactorFor(value);
	}
	@Override
	public String toString() {
		return "=" +toStringValue();
	}
	public String toStringValue() {
		return value.toString();
	}
}
