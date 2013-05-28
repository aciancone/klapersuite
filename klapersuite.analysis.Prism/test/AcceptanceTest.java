/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import klapersuite.backbone.dtmc.DtmcModel;
import klapersuite.backbone.utility.ResourceHelper;
import klapersuite.prismanalysis.linux.PrismAnalysis;
import klapersuite.prismanalysis.linux.PrismAnalysisResult;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

public class AcceptanceTest {
	@Test
	public void primsAnalysisFromFiles() throws IOException {
		String pmFile = "dtmc\n" +
		"module die\n" + 
		"\n" +
        "// local state\n" +
        "s : [0..7] init 0;\n" +
        "// value of the die\n" +
        "d : [0..6] init 0;\n" +
        "\n" +
        "[] s=0 -> 0.5 : (s'=1) + 0.5 : (s'=2);\n" +
        "[] s=1 -> 0.5 : (s'=3) + 0.5 : (s'=4);\n" +
        "[] s=2 -> 0.5 : (s'=5) + 0.5 : (s'=6);\n" +
        "[] s=3 -> 0.5 : (s'=1) + 0.5 : (s'=7) & (d'=1);\n" +
        "[] s=4 -> 0.5 : (s'=7) & (d'=2) + 0.5 : (s'=7) & (d'=3);\n" +
        "[] s=5 -> 0.5 : (s'=7) & (d'=4) + 0.5 : (s'=7) & (d'=5);\n" +
        "[] s=6 -> 0.5 : (s'=2) + 0.5 : (s'=7) & (d'=6);\n" +
        "[] s=7 -> (s'=7);\n" +
        "endmodule";
		String pctlFile = "\n";
		PrismAnalysisResult result = new PrismAnalysis(new File(pmFile), new File(pctlFile), 12).execute();
		assertEquals(0.45, result);
	}
	@Test
	public void dtmc2PrimsFromFile() throws IOException {
		ResourceHelper resources = new ResourceHelper();
		String fileName = "platform:/plugin/klapersuite.analysis.Prism/transformation/example1.dtmc";
		List<EObject> dtmcModel = resources.fromFile(URI.createURI(fileName));
		assertEquals(1, dtmcModel.size());
		assertTrue(dtmcModel.get(0) instanceof dtmc.Dtmc);
		//PrismAnalysisResult result = new PrismAnalysis(new DtmcModel((dtmc.Dtmc) dtmcModel.get(0))).execute();
		//assertEquals(0.45, result);
	}
}
