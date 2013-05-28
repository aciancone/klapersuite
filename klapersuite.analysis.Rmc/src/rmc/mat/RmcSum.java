/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

import java.math.BigDecimal;
import java.util.List;

public class RmcSum extends RmcValue {
	private final RmcValue leftValue;
	private final RmcValue rightValue;

	public RmcSum(RmcValue leftValue, RmcValue rightValue) {
		this.leftValue= leftValue;
		this.rightValue = rightValue;
	}

	@Override
	public BigDecimal calculate() {
		return leftValue.calculate().add(rightValue.calculate());
	}

	@Override
	public List<List<RmcAtomicValue>> getSumOfProducts() {
		List<List<RmcAtomicValue>> leftTerms = leftValue.getSumOfProducts();
		List<List<RmcAtomicValue>> rightTerms = rightValue.getSumOfProducts();
		leftTerms.addAll(rightTerms);
		return leftTerms;
	}
	@Override
	public boolean equals(Object arg0) {
		return arg0 instanceof RmcSum && equals((RmcSum) arg0);
	}
	public boolean equals(RmcSum other) {
		return (leftValue.equals(other.leftValue) && rightValue.equals(other.rightValue))
			|| (leftValue.equals(other.rightValue) && rightValue.equals(other.leftValue));
	}
	@Override
	public String toString() {
		return "=" +toStringValue();
	}
	public String toStringValue() {
		return leftValue.toStringValue()+"+"+rightValue.toStringValue();
	}
}
