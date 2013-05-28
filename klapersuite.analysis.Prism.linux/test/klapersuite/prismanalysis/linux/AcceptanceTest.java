/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

import klapersuite.backbone.model.DtmcModels;
import klapersuite.prismanalysis.linux.Dtmc2PrismTransformation;
import klapersuite.prismanalysis.linux.PrismAnalysis;
import klapersuite.prismanalysis.linux.PrismAnalysisResult;
import klapersuite.prismanalysis.linux.PrismRunner;
import klapersuite.prismanalysis.preference.PrismPreferencePage;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.junit.BeforeClass;
import org.junit.Test;

import dtmc.Dtmc;

public class AcceptanceTest {
	@BeforeClass
	public static void setUp() {
		Logger.getRootLogger().setLevel(Level.ALL);             
		Logger.getRootLogger().addAppender(new ConsoleAppender(new SimpleLayout()));  
	}
	@Test
	public void prismRunnerInstallation() throws Exception {
		assertTrue(new PrismRunner().install());
		new PrismRunner().checkPrismInstallation();
		assertTrue(new PrismRunner().uninstall());
	}
	@Test
	public void primsAnalysis() throws IOException {
		File pmFile = createTemporaryFile(
			"dtmc\n" +
        	"\n" +
			"module die\n" + 
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
        	"endmodule", "pm"); 
		File pctlFile = createTemporaryFile("P=? [ true U s=7 & d=6 ]\n", "pctl");
		PrismAnalysisResult result = new PrismAnalysis(pmFile, pctlFile, 6).execute();
		assertEquals(.166666, result.getReliability().doubleValue(),1E-6);
	}
	@Test
	public void customPrimsInstallation() throws IOException {
		File pmFile = createTemporaryFile(
				"dtmc\n" +
	        	"\n" +
				"module die\n" + 
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
	        	"endmodule", "pm"); 
			File pctlFile = createTemporaryFile("P=? [ true U s=7 & d=6 ]\n", "pctl");
		new File(System.getProperty("java.io.tmpdir")+"/prism-3.3.1-linux/bin/prism").delete();
		File customInstallation = new File(System.getProperty("java.io.tmpdir")+"/alternativePrism/");
		customInstallation.delete();
		customInstallation.mkdir();
		new PrismRunner(customInstallation, customInstallation+"/prism-3.3.1-linux/bin/prism").install();
		new PrismRunner(customInstallation, customInstallation+"/prism-3.3.1-linux/bin/prism").launch(pmFile, pctlFile, 6);
	}
	@Test
	public void prismAnalysisFromDtmcFile() throws Exception {
		Dtmc dtmcModel = new DtmcModels().getCompleteModel();
		new Dtmc2PrismTransformation((dtmc.Dtmc) dtmcModel).run("/tmp/");
		PrismAnalysisResult result = new PrismAnalysis(new File("/tmp/output.pm"), new File("/tmp/properties.pctl"), 12).execute();
		assertEquals(0.992237472129, result.getReliability().doubleValue(),1E-11);
	}
	@Test
	public void prismExecutablePath() {
		new PrismPreferencePage().setPrismExecutablePath("/test1");
		assertEquals("/test1", new PrismPreferencePage().getPrismExecutablePath());

		new PrismPreferencePage().setPrismExecutablePath("/test2");
		assertEquals("/test2", new PrismPreferencePage().getPrismExecutablePath());
	}
	@Test
	public void prism4ResultValue() {	
		PrismAnalysisResult result = PrismAnalysisResult.factory(new StubPrismProcess(0,
			"Time for model checking: 0.312 seconds.\n" +
			"\n" +
			"Result (probability): 0.9922374721293382\n" +
			"\n" + 
			"Time for model checking: 0.007 seconds.\n" +
			"\n" +
			"Result: 0.6490543275079254 (value in the initial state)\n" +
			"\n" +
			"Time for model checking: 0.0020 seconds.\n" +
			"\n" + 
			"Result (probability): 0.16666650772094727\n"
			), null, null);
		assertEquals(new BigDecimal("0.16666650772094727"), result.getReliability());
	}
	@Test
	public void prism_ModelInfo() {
		PrismAnalysisResult result = PrismAnalysisResult.factory(new StubPrismProcess(0,
		"Type:        DTMC\n"+
		"Modules:     M34 M30 M26 M43 M39 M52 M48 M61 M57 M70 M66 M21 M17 M13 M9 M5 M1 M77 Workload\n"+ 
		"Variables:   s_M34 s_M30 s_M26 s_M43 s_M39 s_M52 s_M48 s_M61 s_M57 s_M70 s_M66 s_M21 s_M17 s_M13 s_M9 s_M5 s_M1 s_M77 s_Workload\n"+ 
		"\n"+
		"States:      535 (1 initial)\n"+
		"Transitions: 1107\n"+
		"Transition matrix: 5111 nodes (27 terminal), 1107 minterms, vars: 68r/68c"), null, null);
		assertEquals(5111, result.getModelNodes());
		assertEquals(1107, result.getModelTransitions());
		assertEquals(68, result.getModelVariables());
	}
	private File createTemporaryFile(String fileContent, String extension) throws IOException {
		File temporaryFile = File.createTempFile("prism", "."+extension);
		temporaryFile.deleteOnExit();
		BufferedWriter out = new BufferedWriter(new FileWriter(temporaryFile));
		out.write(fileContent); out.close();
		return temporaryFile;
	}
	class StubPrismProcess extends Process {
		private int exitValue;
		private String inputString;
		public StubPrismProcess(int exitValue, String inputString) {
			this.exitValue = exitValue;
			this.inputString = inputString;
		}
		@Override
		public void destroy() {	}
		@Override
		public int exitValue() {
			return 0;
		}
		@Override
		public InputStream getErrorStream() {
			return null;
		}
		@Override
		public InputStream getInputStream() {
			return new ByteArrayInputStream(inputString.getBytes());
		}
		@Override
		public OutputStream getOutputStream() {
			return null;
		}
		@Override
		public int waitFor() throws InterruptedException {
			return 0;
		}
	}
}