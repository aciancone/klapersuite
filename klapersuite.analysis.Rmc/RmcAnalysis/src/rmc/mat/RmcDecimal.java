/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

import java.math.BigDecimal;

public class RmcDecimal extends RmcValue {
	private final BigDecimal value;
	public RmcDecimal(BigDecimal value) {
		this.value = value;
	}
	@Override
	public BigDecimal calculate() {
		return value;
	}
}
