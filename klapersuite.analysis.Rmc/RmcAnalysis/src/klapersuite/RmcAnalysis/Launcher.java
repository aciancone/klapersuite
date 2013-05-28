/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */



package klapersuite.RmcAnalysis;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import QVTOTransformation.QVTOTransformation;
import QVTOTransformation.QVTOTransformationResult;

public class Launcher {
	public List<EObject> transformKlaperModel2DtmcModel(List<EObject> klaperModel) throws IOException {
		List<EObject>[] transformationModels = new List[]{klaperModel, null};
		//String fileName = "file:/"+this.getClass().getResource("/klaper2dtmc.qvto").getFile();
		String fileName = "platform:/plugin/klapersuite.RmcAnalysis/transformation/klaper2dtmc.qvto";
		QVTOTransformation transformation = new QVTOTransformation(
				new HashMap<String, Object>(),
				transformationModels, URI.createURI(fileName));
		QVTOTransformationResult result = transformation.launch();
		IStatus status = BasicDiagnostic.toIStatus(result.diagnosticResult);
//		Activator.getDefault().getLog().log(status);
		return result.inoutModels[1];
}

}
