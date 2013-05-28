/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

import java.math.BigDecimal;
import java.util.List;

public class RmcMultiplication extends RmcValue {
	private final RmcValue leftValue;
	private final RmcValue rightValue;

	public RmcMultiplication(RmcValue leftValue, RmcValue rightValue) {
		this.leftValue= leftValue;
		this.rightValue = rightValue;
	}

	@Override
	public BigDecimal calculate() {
		return leftValue.calculate().multiply(rightValue.calculate());
	}

	@Override
	public List<List<RmcAtomicValue>> getSumOfProducts() {
		List<List<RmcAtomicValue>> leftTerms = leftValue.getSumOfProducts();
		List<List<RmcAtomicValue>> rightTerms = rightValue.getSumOfProducts();
		for(List<RmcAtomicValue> aProductRightTerm: rightTerms) {
			for(List<RmcAtomicValue> aProductLeftTerm: leftTerms) {
				aProductLeftTerm.addAll(aProductRightTerm);
			}
		}
		return leftTerms;
	}
	@Override
	public boolean equals(Object arg0) {
		return arg0 instanceof RmcMultiplication && equals((RmcMultiplication) arg0);
	}
	public boolean equals(RmcMultiplication other) {
		return (leftValue.equals(other.leftValue) && rightValue.equals(other.rightValue))
			|| (leftValue.equals(other.rightValue) && rightValue.equals(other.leftValue));
	}
	@Override
	public String toString() {
		return "=" +toStringValue();
	}
	public String toStringValue() {
		return "("+leftValue.toStringValue()+")*("+rightValue.toStringValue()+")";
	}
}
