/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import klapersuite.backbone.model.CompleteModel;
import klapersuite.backbone.model.EmptyModel;

import org.junit.Test;


public class KlapersuiteModelExample {
	@Test
	public void completeDtmcModel() {
		assertTrue(new CompleteModel().getDtmcModel()!=null);
		assertEquals(19, new CompleteModel().getDtmcModel().getModules().size());
	}
	@Test
	public void completeKlaperModel() {
		assertTrue(new CompleteModel().getKlaperModel()!=null);
		assertEquals(7, new CompleteModel().getKlaperModel().getResource().size());
	}
	@Test
	public void emptyDtmcModel() {
		assertTrue(new EmptyModel().getDtmcModel()!=null);
	}
	@Test
	public void emptyKlaperModel() {
		assertTrue(new EmptyModel().getKlaperModel()!=null);
	}
	@Test
	public void emptySimJavaModel() {
		assertTrue(new EmptyModel().getSimJavaModel()!=null);
	}
}
