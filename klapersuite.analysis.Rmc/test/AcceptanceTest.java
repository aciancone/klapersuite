/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import klaper.core.CorePackage;
import klaper.expr.ExprPackage;
import klaper.probability.ProbabilityPackage;
import klapersuite.RmcAnalysis.Klaper2DtmcTransformation;
import klapersuite.RmcAnalysis.ReliabilityAnalysis;
import klapersuite.RmcAnalysis.ReliabilityAnalysisResult;
import klapersuite.backbone.dtmc.DtmcModel;
import klapersuite.backbone.model.DtmcModels;
import klapersuite.backbone.model.KlaperModels;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import QVTOTransformation.QVTOTransformationRunningException;
import dtmc.DtmcPackage;

public class AcceptanceTest {
	@BeforeClass
	public static void setUp() {
		Logger.getRootLogger().setLevel(Level.ALL);             
		Logger.getRootLogger().addAppender(new ConsoleAppender(new SimpleLayout()));  
	}
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
		try {
			List<EObject> dtmcModel = new Klaper2DtmcTransformation().run(new KlaperModels().getEmptyModel());
			assertEquals(1, dtmcModel.size());
			assertTrue(dtmcModel.get(0) instanceof dtmc.Dtmc);
		}catch(QVTOTransformationRunningException e) {
			fail(e.result.diagnosticDetails());
		}
	}
	@Test
	public void rmcAnalysisFromDtmcFile() throws IOException {
		dtmc.Dtmc dtmcModel = new DtmcModels().getCompleteModel();
		
		ReliabilityAnalysisResult resultNew = new ReliabilityAnalysis(new DtmcModel(dtmcModel), 12).executeRMCBaseSolver();
		assertEquals(0.9922374721293388, resultNew.getReliability(), 1E-11);
		
		ReliabilityAnalysisResult resultNewton = new ReliabilityAnalysis(new DtmcModel(dtmcModel), 12).executeRMCNewtonSolver();
		assertEquals(0.9922374721293388, resultNewton.getReliability(), 1E-11);
		
		ReliabilityAnalysisResult resultOld = new ReliabilityAnalysis(new DtmcModel(dtmcModel), 12).executeJEPSolver();
		assertEquals(0.9922374721293388, resultOld.getReliability(),1E-11);

		assertEquals(resultNew.getIterations(), resultOld.getIterations()+1);
		assertEquals(resultNew.getMSV(), resultOld.getMSV(), 0);
	}
}
