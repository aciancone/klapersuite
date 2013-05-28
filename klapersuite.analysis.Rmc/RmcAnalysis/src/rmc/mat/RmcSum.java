/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

import java.math.BigDecimal;

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
}
