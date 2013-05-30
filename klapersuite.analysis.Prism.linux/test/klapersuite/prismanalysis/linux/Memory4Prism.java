/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.prismanalysis.linux;

import static org.junit.Assert.*;
import org.junit.Test;


public class Memory4Prism {
	@Test
	public void getAvailableMemory() {
		assertNotNull(new SystemMemory().availableRam(null));
	}
}
