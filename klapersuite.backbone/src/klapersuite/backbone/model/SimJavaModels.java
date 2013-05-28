/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.model;

import simulator.base.SimModel;

public class SimJavaModels {
	public final SimModel getEmptyModel() {
		return simulator.base.BaseFactory.eINSTANCE.createSimModel();
	}
}
