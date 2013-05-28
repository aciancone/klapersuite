/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.model;

import java.io.IOException;

import klaper.core.KlaperModel;
import klapersuite.backbone.utility.ResourceHelper;

import org.eclipse.emf.common.util.URI;

public class KlaperModels {
	public final klaper.core.KlaperModel getEmptyModel() {
		return klaper.core.CoreFactory.eINSTANCE.createKlaperModel();
	}
	public final KlaperModel getCompleteModel() {
		try {
			return (KlaperModel) new ResourceHelper().fromFile(URI.createURI("platform:/plugin/klapersuite.backbone/model/example1.klaper")).get(0);
		} catch (IOException e) {
			return klaper.core.CoreFactory.eINSTANCE.createKlaperModel();
		}
	}
}
