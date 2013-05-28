/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import klaper.core.CoreFactory;
import klaper.core.KlaperModel;
import klaper.core.impl.CoreFactoryImpl;
import klaper.expr.impl.ExprFactoryImpl;
import klaper.probability.impl.ProbabilityFactoryImpl;
import klapersuite.backbone.utility.ResourceHelper;


public class KlaperModelGenerator {
	//	coreFactory = (CoreFactoryImpl) EPackage.Registry.INSTANCE.getEFactory(klaper.core.CorePackage.eNS_URI);
	protected CoreFactory coreFactory = new CoreFactoryImpl();
	protected ProbabilityFactoryImpl probabilityFactory = new ProbabilityFactoryImpl();
	protected ExprFactoryImpl exprFactory = new ExprFactoryImpl();

	public KlaperModel generateModel() {
		return coreFactory.createKlaperModel();
	}
	public static void saveModel(KlaperModel klaperModel, String file) throws IOException{
		List<EObject> modelToSave = new ArrayList<EObject>();
		modelToSave.add(klaperModel);
		new ResourceHelper().toFile(modelToSave, org.eclipse.emf.common.util.URI.createFileURI(file));
	}
}