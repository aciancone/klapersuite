/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import klaper.core.CorePackage;
import klaper.probability.ProbabilityPackage;
import klaper.expr.ExprPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import klapersuite.RmcAnalysis.Launcher;
import klapersuite.RmcAnalysis.ReliabilityAnalysis;
import klapersuite.RmcAnalysis.ReliabilityAnalysisResult;
import klapersuite.backbone.dtmc.DtmcModel;
import klapersuite.backbone.utility.ResourceHelper;

import dtmc.DtmcPackage;


import QVTOTransformation.QVTOTransformationRunningException;

public class AcceptanceTest {
	@Before
	public void initMetaModels() {
		// wiki.eclipse.org/EMF/FAQ - How do I use EMF in standalone applications (such as an ordinary main)?"
		EPackage.Registry.INSTANCE.put(DtmcPackage.eNS_URI, DtmcPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ProbabilityPackage.eNS_URI, ProbabilityPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ExprPackage.eNS_URI, ExprPackage.eINSTANCE);
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("dtmc", new XMIResourceFactoryImpl());
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("klaper", new XMIResourceFactoryImpl());
		DtmcPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		ExprPackage.eINSTANCE.eClass();
		ProbabilityPackage.eINSTANCE.eClass();
	}
	@Test
	public void klaper2dtmcFromklaperFile() throws IOException {
		ResourceHelper resources = new ResourceHelper();
		try {
			//String fileName = this.getClass().getResource("/example1.klaper").getFile();
			String fileName = "platform:/plugin/klapersuite.RmcAnalysis/transformation/example1.klaper";
			List<EObject> dtmcModel = new Launcher().transformKlaperModel2DtmcModel(
				resources.fromFile(URI.createURI(fileName)));
			assertEquals(1, dtmcModel.size());
			assertTrue(dtmcModel.get(0) instanceof dtmc.Dtmc);
		}catch(QVTOTransformationRunningException e) {
			fail(e.result.diagnosticDetails());
		}
	}
	@Test
	public void rmcAnalysisFromDtmcFile() throws IOException {
		ResourceHelper resources = new ResourceHelper();
		//String fileName = this.getClass().getResource("/example1.dtmc").getFile();
		String fileName = "platform:/plugin/klapersuite.RmcAnalysis/transformation/example1.dtmc";
		List<EObject> dtmcModel = resources.fromFile(URI.createURI(fileName));
		assertEquals(1, dtmcModel.size());
		assertTrue(dtmcModel.get(0) instanceof dtmc.Dtmc);
		
		long starttime;
	
		starttime = System.currentTimeMillis();
		ReliabilityAnalysisResult resultNew = new ReliabilityAnalysis(new DtmcModel((dtmc.Dtmc) dtmcModel.get(0)), 12).executionV2();
		assertEquals(0.9922374721293388, resultNew.getReliability(),1E-11);
		long executionTimeNew = System.currentTimeMillis()-starttime;
		
		starttime = System.currentTimeMillis();
		ReliabilityAnalysisResult resultOld = new ReliabilityAnalysis(new DtmcModel((dtmc.Dtmc) dtmcModel.get(0)), 12).execute();
		assertEquals(0.9922374721293388, resultOld.getReliability(),1E-11);
		long executionTimeOld = System.currentTimeMillis()-starttime;

		assertEquals(resultNew.getIterations(), resultOld.getIterations()+1);
		assertEquals(resultNew.getMSV(), resultOld.getMSV(), 0);
		assertTrue(executionTimeOld <= executionTimeOld);
	}
}