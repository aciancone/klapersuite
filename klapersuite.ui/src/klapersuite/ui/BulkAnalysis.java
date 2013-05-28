package klapersuite.ui;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import javax.naming.spi.DirStateFactory.Result;

import klaper.core.CorePackage;
import klaper.core.KlaperModel;
import klaper.expr.ExprPackage;
import klaper.probability.ProbabilityPackage;
import klapersuite.RmcAnalysis.Klaper2DtmcTransformation;
import klapersuite.RmcAnalysis.ReliabilityAnalysis;
import klapersuite.RmcAnalysis.ReliabilityAnalysisResult;
import klapersuite.backbone.dtmc.DtmcModel;
import klapersuite.prismanalysis.linux.Dtmc2PrismTransformation;
import klapersuite.prismanalysis.linux.PrismAnalysis;
import klapersuite.prismanalysis.linux.PrismAnalysisResult;
import klapersuite.backbone.generator.KlaperModelGeneratorFactory;
import klapersuite.backbone.generator.KlaperModelGenerator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.eclipse.emf.ecore.EPackage;
import dtmc.Dtmc;
import dtmc.DtmcPackage;

public class BulkAnalysis {
	private File pathForAnalysis;
    private File prismAnalysis;
	private int maxSeconds4Analysis;
	private String prismExecutablePath;

	public void run(String pathForAnalysis, int startingNumberOfServices, int incrementSizeOfService, int incrementTimesOfService, int startingNumberOfActivities, int incrementSizeOfActivity, int incrementTimesOfActivity, int startingNumberOfLoopIteration, int incrementSizeOfLoopIteration, int incrementTimesOfLoopIteration, int repetitions, int maxSeconds4Analysis, String prismExecutablePath) throws IOException {
    	long nowTimestamp = new Date().getTime();
	    this.pathForAnalysis = new File(new File(pathForAnalysis), String.valueOf(nowTimestamp));
        this.prismAnalysis = new File(this.pathForAnalysis, "prism");
        this.maxSeconds4Analysis = maxSeconds4Analysis;
        this.prismExecutablePath = prismExecutablePath;
        Logger.getRootLogger().setLevel(Level.ALL);    
        Logger.getRootLogger().addAppender(new ConsoleAppender(new SimpleLayout())); 

        System.out.println("Destination directory: "+this.pathForAnalysis.getAbsolutePath());
        System.out.println("Prism Executable: "+this.prismExecutablePath);
        System.out.println("Max analysis milliseconds: "+this.maxSeconds4Analysis);
        System.out.println("Analysis repetition: "+repetitions);
        System.out.println("Services: "+startingNumberOfServices+"+"+incrementSizeOfService+"*"+incrementTimesOfService);
        System.out.println("Activities: "+startingNumberOfActivities+"+"+incrementSizeOfActivity+"*"+incrementTimesOfActivity);
        System.out.println("LoopIterations: "+startingNumberOfLoopIteration+"+"+incrementSizeOfLoopIteration+"*"+incrementTimesOfLoopIteration);
        
        initializeEclipseModelingRegistry();
        initializeAnalysisLogFile();

        if(incrementTimesOfService<1) incrementSizeOfService=1;
        if(incrementTimesOfActivity<1) incrementSizeOfActivity=1;
        if(incrementTimesOfLoopIteration<1) incrementSizeOfLoopIteration=1;
        for(int servicesNumber=startingNumberOfServices; servicesNumber <= startingNumberOfServices+incrementSizeOfService*incrementTimesOfService; servicesNumber+=incrementSizeOfService) {
        	for(int loopIterationNumber=startingNumberOfLoopIteration; loopIterationNumber <= startingNumberOfLoopIteration+incrementSizeOfLoopIteration*incrementTimesOfLoopIteration; loopIterationNumber+=incrementSizeOfLoopIteration) {
        		for(int activityNumber=startingNumberOfActivities; activityNumber <= startingNumberOfActivities+incrementSizeOfActivity*incrementTimesOfActivity; activityNumber+=incrementSizeOfActivity) {
        			runRepeatedAnalysis(servicesNumber, activityNumber, loopIterationNumber, repetitions, nowTimestamp);
        		}
        	}
        }
    }
	private void initializeAnalysisLogFile() throws IOException {
		if(!this.pathForAnalysis.exists()) {
        	this.pathForAnalysis.mkdirs();
        }
        File logFile = new File(this.pathForAnalysis, "klaperModelAnalysis.txt");
        if(!logFile.exists()) {
        	logFile.createNewFile();
            BufferedWriter analysisData = new BufferedWriter(new FileWriter(new File(this.pathForAnalysis, "klaperModelAnalysis.txt"), true));
            analysisData.append("timestamp:repetition:minResource:maxResource:minService:maxService:minActivity4Service:maxActivity4Service:minLoopIterations4Service:maxLoopIterations4Service:minServiceCall:maxServiceCall:minPercentageOfTerminalService:maxPercentageOfTerminalService:percentageOfServiceWithABranch:RmcBaseResult:RmcBaseErrorMax:RmcBaseIterations:RmcBaseTime:RmcNewtResult:RmcNewtErrorMax:RmcNewtIterations:RmcNewtTime:PrismResult:ModelNodes:ModelTransitions:ModelVars:PrismTime");
            analysisData.newLine();
            analysisData.close();
        }
	}
	private void runRepeatedAnalysis(int servicesNumber, int activityNumber, int loopIteration, int repetitions, long nowTimestamp) {
		for(int repetition=0; repetition<repetitions; repetition++) {
		    	try {
		            System.out.println("Analysis with "+servicesNumber+" services, "+activityNumber+" activities and "+loopIteration+" loop iterations.");
		            KlaperModel klaperModel = new KlaperModelGeneratorFactory()
		            	.setResourceNumber(1, 1)
		            	.setServiceInResource(servicesNumber, servicesNumber)
		            	.setActivityInService(activityNumber, activityNumber)
		            	.setServiceCallInService(1, 3)
		            	.setPercentageTerminalService(0f, 0.05f)
		            	.setLoopService(1f, loopIteration, loopIteration)
		            	.setSimpleProbabilityNumber(true)
		            	.threeModel().generateModel();
		            	KlaperModelGeneratorFactory.threeModel(1,1,servicesNumber,servicesNumber,activityNumber,activityNumber,1,3,0f,0.05f,0.5f, true).generateModel();
		            String analysis = nowTimestamp+":"+repetition+":1:1:"+servicesNumber+":"+servicesNumber+":"+activityNumber+":"+activityNumber+":"+loopIteration+":"+loopIteration+"1:3:0:0.05:0.5";
		 
		            KlaperModelGenerator.saveModel(klaperModel, new File(this.pathForAnalysis.getAbsolutePath(),analysis.replace(":", "_")+".klaper").getAbsolutePath());

		            Dtmc dtmcModel = klaper2dtmc(klaperModel);
		            System.out.println("* RMC base analysis");
		            analysis += ":" + baseRmcAnalysis(dtmcModel);
		            System.out.println("* RMC Newtown analysis");
		            analysis += ":" + newtownRmcAnalysis(dtmcModel);
		            System.out.println("* Prism analysis");
		            analysis += ":" + primAnalysis(dtmcModel);

		            BufferedWriter analysisData = new BufferedWriter(new FileWriter(new File(this.pathForAnalysis, "klaperModelAnalysis.txt"), true));
		            analysisData.append(analysis);
		            analysisData.newLine();
		            analysisData.close();
		    	}catch(Exception e) {
		    		System.out.println("execution excetion");
		    	}
		}
	}
	private void initializeEclipseModelingRegistry() {
		// wiki.eclipse.org/EMF/FAQ - How do I use EMF in standalone applications (such as an ordinary main)?"
		EPackage.Registry.INSTANCE.put(DtmcPackage.eNS_URI, DtmcPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ProbabilityPackage.eNS_URI, ProbabilityPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ExprPackage.eNS_URI, ExprPackage.eINSTANCE);
		DtmcPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		ExprPackage.eINSTANCE.eClass();
		ProbabilityPackage.eINSTANCE.eClass();
	}
	public String baseRmcAnalysis(Dtmc dtmcModel) {
		ReliabilityAnalysisRMCBase analysis = new ReliabilityAnalysisRMCBase(dtmcModel);
		return analysis.getResult();
	}
	public String newtownRmcAnalysis(Dtmc dtmcModel) {
		ReliabilityAnalysisRMCNetwork analysis = new ReliabilityAnalysisRMCNetwork(dtmcModel);
		return analysis.getResult();
	}
	private String primAnalysis(Dtmc dtmcModel) {
		ReliabilityAnalysisPrism analysis = new ReliabilityAnalysisPrism(dtmcModel);
		return analysis.getResult();
	}
	private double getExecutionTime(long startingTime) {
		return new Date().getTime()-startingTime;
	}
	private Dtmc klaper2dtmc(KlaperModel klaperModel) throws IOException {
		return (Dtmc) new Klaper2DtmcTransformation().run(klaperModel).get(0);
	}
	class ReliabilityAnalysisRMCNetwork extends ReliabilityAnalysisThread {
		public ReliabilityAnalysisRMCNetwork(Dtmc dtmcModel) {
			super(dtmcModel, maxSeconds4Analysis);
			setResult("NaN:NaN:NaN:NaN:");
		}
		@Override
		public void run() {
			try {
				ReliabilityAnalysis analysis = new ReliabilityAnalysis(new DtmcModel(dtmcModel), 12);
				ReliabilityAnalysisResult result = analysis.executeRMCNewtonSolver();
				setResult(result.getReliability() +":"+ result.getMSV() +":"+ result.getIterations()+":"+analysis.getNumberEquations()+":");
			}catch (Exception e) {
			}
			synchronized (this) {
				notifyAll();	
			}
		}
	};
	class ReliabilityAnalysisRMCBase extends ReliabilityAnalysisThread {
		public ReliabilityAnalysisRMCBase(Dtmc dtmcModel) {
			super(dtmcModel, maxSeconds4Analysis);
			setResult("NaN:NaN:NaN:Nan:");
		}
		@Override
		public void run() {
			try {
				ReliabilityAnalysis analysis = new ReliabilityAnalysis(new DtmcModel(dtmcModel), 12);
				//System.out.println(analysis.getEquations());
				ReliabilityAnalysisResult result = analysis.executeRMCBaseSolver();
				setResult(result.getReliability() +":"+ result.getMSV() +":"+ result.getIterations()+":"+analysis.getNumberEquations()+":");
			}catch (Exception e) {
			}
			synchronized (this) {
				notifyAll();	
			}
		}
	}
	;
	class ReliabilityAnalysisPrism extends ReliabilityAnalysisThread {
		public ReliabilityAnalysisPrism(Dtmc dtmcModel) {
			super(dtmcModel,maxSeconds4Analysis);
			setResult("NaN:NaN:NaN:NaN:");
		}
		@Override
		public void run() {
			try {
				new Dtmc2PrismTransformation((dtmc.Dtmc) dtmcModel).run(BulkAnalysis.this.pathForAnalysis.getAbsolutePath());
				PrismAnalysisResult result = new PrismAnalysis(new File(BulkAnalysis.this.pathForAnalysis, "output.pm"), new File(BulkAnalysis.this.pathForAnalysis, "properties.pctl"), 12).execute(prismExecutablePath);
				setResult(Double.toString(result.getReliability().doubleValue())+":"+result.getModelNodes()+":"+result.getModelTransitions()+":"+result.getModelVariables()+":");
			}catch (Exception e) {
			}
			synchronized (this) {
				notifyAll();	
			}
		}
	};
	abstract class ReliabilityAnalysisThread implements Runnable {
		private long startingTime = new Date().getTime();
		protected Dtmc dtmcModel;
		private String result = "";
		private int waitTime4Analysis;
		public ReliabilityAnalysisThread(Dtmc dtmcModel, int waitTime4Analysis) {
			this.dtmcModel = dtmcModel;
			this.waitTime4Analysis = waitTime4Analysis;
		}
		protected synchronized void setResult(String result) {
			System.out.println("Setting result: "+ result);
			this.result = result;
		}
		public synchronized String getResult() {
			Thread analysisThread = new Thread(this);
			analysisThread.start();
			try {
				wait(waitTime4Analysis);
			} catch (InterruptedException e) {
			}
			System.out.println("Stopping analysis");
			analysisThread.stop();
				return result+getExecutionTime(startingTime);	
		}
	}
}