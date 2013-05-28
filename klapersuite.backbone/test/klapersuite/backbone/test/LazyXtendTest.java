/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.test;
import static org.junit.Assert.*;
import klapersuite.backbone.utility.LazyXtend;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EPackage;
import org.junit.*;

public class LazyXtendTest {
	@Test
	public void simpleXpandTransformation() throws ExecutionException {
		assertEquals("Hello World", (String) new LazyXtend(new EPackage[]{},"transformation::hello", "sayHello", new Object[]{"World"}).run());
	}
}
