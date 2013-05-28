/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.model;

import klaper.core.KlaperModel;
import simulator.base.SimModel;
import dtmc.Dtmc;

public class EmptyModel {
	public final KlaperModel getKlaperModel() {
		return klaper.core.CoreFactory.eINSTANCE.createKlaperModel();
	}
	public final Dtmc getDtmcModel() {
		return dtmc.DtmcFactory.eINSTANCE.createDtmc();
	}
	public final SimModel getSimJavaModel() {
		return simulator.base.BaseFactory.eINSTANCE.createSimModel();
	}
}
