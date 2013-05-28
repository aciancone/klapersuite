/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */



package klapersuite.RmcAnalysis;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import klaper.core.KlaperModel;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import QVTOTransformation.QVTOTransformation;
import QVTOTransformation.QVTOTransformationResult;

public class Klaper2DtmcTransformation {
	@SuppressWarnings("unchecked")
	public List<EObject> run(KlaperModel klaperModel) throws IOException {
		List<EObject> genericModel = new ArrayList<EObject>(1);
		genericModel.add(klaperModel);
		List<EObject>[] transformationModels = new List[]{genericModel, null};
//		File transformationScript = File.createTempFile("klaper2dtmc", ".qvto");
//		transformationScript.deleteOnExit();
//		createTranformationScriptFile(transformationScript);
//		String fileName = "file:"+transformationScript.getAbsolutePath();
		String fileName = "platform:/plugin/klapersuite.analysis.Rmc/transformation/klaper2dtmc.qvto";
		QVTOTransformation transformation = new QVTOTransformation(
				new HashMap<String, Object>(),
				transformationModels, URI.createURI(fileName));
		QVTOTransformationResult result = transformation.launch();
		return result.inoutModels[1];
	}
	private void createTranformationScriptFile(File transformationScript)
			throws FileNotFoundException, IOException {
		BufferedInputStream transformationScriptInJar = new BufferedInputStream(this.getClass().getResourceAsStream("/transformation/klaper2dtmc.qvto"));
		BufferedOutputStream transformationScriptTmp = new BufferedOutputStream(new FileOutputStream(transformationScript));
		  byte[] buffer = new byte[4096];
		  int len;
		  while ((len = transformationScriptInJar.read(buffer)) > 0){
			  transformationScriptTmp.write(buffer, 0, len);
		  }
		  transformationScriptInJar.close();
		  transformationScriptTmp.close();
	}

}
