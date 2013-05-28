package klapersuite.ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IPlatformRunnable;

import klapersuite.ui.BulkAnalysis;

public class ApplicationBulkAnalysis implements IPlatformRunnable {

        @Override
        public Object run(Object args) throws Exception {
                String [] cmdArgs = (String []) args;
                if(cmdArgs.length<6) {
                        printHelp();
                        return null;
                }   
                System.out.println("Starting klaper models generation and analysis");
                
                String destinationDirectory = cmdArgs[0];

            	Pattern modelIncrementCharacteristic = Pattern.compile("([0-9]+)\\+([0-9]+)\\*([0-9]+)");
                Matcher matcher = modelIncrementCharacteristic.matcher(cmdArgs[1]);
                if(!matcher.find()) {
                    printHelp();
                    return null;                	
                }
                int startingNumberOfServices = Integer.valueOf(matcher.group(1));
                int incrementSizeOfService = Integer.valueOf(matcher.group(2));
                int incrementTimesOfService = Integer.valueOf(matcher.group(3));

                matcher = modelIncrementCharacteristic.matcher(cmdArgs[2]);
                if(!matcher.find()) {
                    printHelp();
                    return null;                	
                }
                int startingNumberOfActivity = Integer.valueOf(matcher.group(1));
                int incrementSizeOfActivity = Integer.valueOf(matcher.group(2));
                int incrementTimesOfActivity = Integer.valueOf(matcher.group(3));

                matcher = modelIncrementCharacteristic.matcher(cmdArgs[3]);
                if(!matcher.find()) {
                    printHelp();
                    return null;                	
                }
                int startingNumberOfLoopIterations = Integer.valueOf(matcher.group(1));
                int incrementSizeOfLoopIterations = Integer.valueOf(matcher.group(2));
                int incrementTimesOfLoopIterations = Integer.valueOf(matcher.group(3));

                int experimentRepetitions = Integer.parseInt(cmdArgs[4]);
                int maxSeconds4Analysis = Integer.parseInt(cmdArgs[5])*1000;
                
                String prismExecutablePath = null;
                if(cmdArgs.length>6) {
                	prismExecutablePath = cmdArgs[6];
        		}
                
                new BulkAnalysis().run(destinationDirectory, startingNumberOfServices, incrementSizeOfService, incrementTimesOfService, startingNumberOfActivity, incrementSizeOfActivity, incrementTimesOfActivity, startingNumberOfLoopIterations, incrementSizeOfLoopIterations, incrementTimesOfLoopIterations, experimentRepetitions, maxSeconds4Analysis, prismExecutablePath);
                return null;
        }   
	private void printHelp() {
		System.out.println("Usage: command destinationDirectory startingNumberOfServices+increment*numberOfTimes startingNumberOfActivity+increment*numberOfTimes  startingNumberOfLoopIterations+increment*numberOfTimes analysisRepetitions maxSeconds4Analysis [prismSoftwarePath]");
		System.out.println("Example: java -Dorg.apache.commons.logging.Log=1 -jar plugins/org.eclipse.equinox.launcher_*.jar -application klapersuite.ui.bulkAnalysis /tmp/ 2+2*9 5+1*5 3+1*2 2 60");
	}
}