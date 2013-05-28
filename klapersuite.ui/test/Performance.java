import static org.junit.Assert.assertTrue;

import java.io.File;

import klaper.core.KlaperModel;
import klapersuite.RmcAnalysis.Klaper2DtmcTransformation;
import klapersuite.RmcAnalysis.ReliabilityAnalysis;
import klapersuite.RmcAnalysis.ReliabilityAnalysisResult;
import klapersuite.backbone.dtmc.DtmcModel;
import klapersuite.backbone.generator.KlaperModelGeneratorFactory;
import klapersuite.prismanalysis.linux.Dtmc2PrismTransformation;
import klapersuite.prismanalysis.linux.PrismAnalysis;
import klapersuite.prismanalysis.linux.PrismAnalysisResult;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.junit.Test;

import dtmc.Dtmc;

public class Performance {
	@Test
	public void onLinearModel() throws Exception {
        Logger.getRootLogger().setLevel(Level.ALL);    
        Logger.getRootLogger().addAppender(new ConsoleAppender(new SimpleLayout())); 

		Runtime rt = Runtime.getRuntime();
		System.out.println("Total memory allocated to VM: " + rt.totalMemory());
		System.out.println("Memory currently available: " + rt.freeMemory());
		
		System.out.println("Generate model");
		KlaperModel linearModel = new KlaperModelGeneratorFactory()
			.setResourceNumber(1, 1)
			.setServiceInResource(10, 10)
			.setActivityInService(5, 5)
			.setServiceCallInService(1, 1)
			.setLoopService(1, 50, 50)
			.setPercentageTerminalService(1)
			.setPercentageBranchingService(0)
			.setSimpleProbabilityNumber(true)
			.threeModel().generateModel();
		
		System.out.println("Transform model");
		Dtmc dtmcModel = (Dtmc) new Klaper2DtmcTransformation().run(linearModel).get(0);
		
		System.out.println("Analyze with Rmc");
		long rmcTime = new java.util.Date().getTime();
		ReliabilityAnalysisResult rmcResult = new ReliabilityAnalysis(new DtmcModel(dtmcModel), 12).executeRMCNewtonSolver();
		rmcTime = new java.util.Date().getTime() - rmcTime;
//		System.out.println(rmcResult.getRmcModelDetails());
		System.out.println("Exec time: "+rmcTime/1000);
		
		System.out.println("Analyze with Prism");
		new Dtmc2PrismTransformation(dtmcModel).run("/tmp/");
		long prismTime = new java.util.Date().getTime();
		PrismAnalysisResult prismResult = new PrismAnalysis(new File("/tmp/output.pm"), new File("/tmp/properties.pctl"), 12).execute();
		prismTime = new java.util.Date().getTime() - prismTime;
		System.out.println("Exec time: "+prismTime/1000);
		
		assertTrue(rmcTime > prismTime);
	}
}