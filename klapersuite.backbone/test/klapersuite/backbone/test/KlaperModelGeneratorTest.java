/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.junit.Before;
import org.junit.Test;

import dtmc.DtmcPackage;

import klaper.core.Activity;
import klaper.core.CorePackage;
import klaper.core.KlaperModel;
import klaper.core.Step;
import klaper.expr.ExprPackage;
import klaper.probability.Constant;
import klaper.probability.ProbabilityPackage;
import klapersuite.backbone.generator.KlaperModelGenerator;
import klapersuite.backbone.generator.KlaperModelGeneratorFactory;


public class KlaperModelGeneratorTest {
	@Before
	public void initMetaModels() {
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ProbabilityPackage.eNS_URI, ProbabilityPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ExprPackage.eNS_URI, ExprPackage.eINSTANCE);

		CorePackage.eINSTANCE.eClass();
		ExprPackage.eINSTANCE.eClass();
		ProbabilityPackage.eINSTANCE.eClass();
	}
	@Test
	public void emptyModelGenerator() {
		assertTrue(KlaperModelGeneratorFactory.klaperModel().generateModel() instanceof KlaperModel);
	}
	@Test
	public void simplestTreeModelGenerator() {
		KlaperModel klaperModel = KlaperModelGeneratorFactory.threeModel(1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, true).generateModel();
		assertTrue(klaperModel instanceof KlaperModel);
		assertEquals(1, klaperModel.getResource().size());
		assertEquals(1, klaperModel.getResource().get(0).getOfferedService().size());

		assertEquals(3, klaperModel.getResource().get(0).getOfferedService().get(0).getBehavior().getStep().size());
		assertEquals(2, klaperModel.getResource().get(0).getOfferedService().get(0).getBehavior().getTransition().size());

		assertEquals(3, klaperModel.getWorkload().get(0).getBehavior().getStep().size());
		assertEquals(2, klaperModel.getWorkload().get(0).getBehavior().getTransition().size());
	}
	@Test
	public void workload4OneService() {
		KlaperModel klaperModel = KlaperModelGeneratorFactory.threeModel(1, 1, 2, 2, 0, 0, 1, 1, 0, 0, 0, false).generateModel();
		assertEquals(3, klaperModel.getWorkload().get(0).getBehavior().getStep().size());
		assertEquals(2, klaperModel.getWorkload().get(0).getBehavior().getTransition().size());
	}
	@Test
	public void workload4TwoServices() {
		KlaperModel klaperModel = KlaperModelGeneratorFactory.threeModel(1, 1, 2, 2, 1, 1, 0, 0, 1, 1, 0, false).generateModel();
		assertEquals(4, klaperModel.getWorkload().get(0).getBehavior().getStep().size());
		assertEquals(3, klaperModel.getWorkload().get(0).getBehavior().getTransition().size());
	}
	@Test
	public void branchServices() {
		KlaperModel klaperModel = KlaperModelGeneratorFactory.threeModel(1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, false).generateModel();
		assertEquals(4, klaperModel.getResource().get(0).getOfferedService().get(0).getBehavior().getStep().size());
		assertEquals(4, klaperModel.getResource().get(0).getOfferedService().get(0).getBehavior().getTransition().size());
	}
	@Test
	public void highNumberOfServices() {
		KlaperModel klaperModel = KlaperModelGeneratorFactory.threeModel(10, 10, 0, 10, 0, 10, 0, 10, 0, 1, 1, false).generateModel();
		assertEquals(10, klaperModel.getResource().size());
	}
	@Test
	public void loopServices() {
		KlaperModel klaperModel = new KlaperModelGeneratorFactory()
			.setResourceNumber(1, 1)
			.setServiceInResource(1, 1)
			.setActivityInService(2, 2)
			.setPercentageBranchingService(0)
			.setLoopService(1, 12, 12)
			.setPercentageTerminalService(1, 1)
			.setSimpleProbabilityNumber(true)
			.threeModel()
			.generateModel();
		List<Step> steps = klaperModel.getResource().get(0).getOfferedService().get(0).getBehavior().getStep();
		assertEquals(5, steps.size());
		assertTrue(steps.get(0) instanceof Activity);
		assertTrue(((Activity) steps.get(2)).getRepetitions() instanceof Constant);
		assertTrue(((Constant) ((Activity) steps.get(2)).getRepetitions()).getValue() instanceof klaper.expr.Double);
		assertEquals(12, ((klaper.expr.Double) ((Constant) ((Activity) steps.get(2)).getRepetitions()).getValue()).getValue(), 0);
		assertEquals(4, ((Activity) steps.get(2)).getNestedBehavior().getStep().size());
	}
	@Test
	public void saveModel() throws IOException {
		KlaperModel klaperModel = KlaperModelGeneratorFactory.threeModel(10, 10, 0, 10, 0, 10, 0, 10, 0, 1, 1, false).generateModel();
		KlaperModelGenerator.saveModel(klaperModel, "/tmp/asdf.klaper");
	}
}
