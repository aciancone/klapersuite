/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.prismanalysis.linux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.tools.ant.util.StringUtils;

public class PrismAnalysisResult {
	public final int exitValue;
	private String output=null;
	private BigDecimal reliability = new BigDecimal(-1);
	private int nodes;
	private int transitions;
	private int variables;
	private static final Logger logger = Logger.getLogger(PrismAnalysisResult.class);
	private PrismAnalysisResult(int exitValue, String output, BigDecimal reliability, int nodes, int transitions, int variables) {
		this.exitValue = exitValue;
		this.output = output;
		this.nodes = nodes;
		this.transitions = transitions;
		this.reliability = reliability;
		this.variables = variables;
	}
	public BigDecimal getReliability() {
		return reliability;
	}
	public int getModelNodes() {
		return nodes;
	}
	public int getModelTransitions() {		
		return transitions;
	}
	public String getExecutionOutput() {		
		return output;
	}
	public int getModelVariables() {
		return variables;
	}
	static final Pattern modelCharacteristics = Pattern.compile(": ([0-9\\.]+)\\snodes?\\s.*,\\s([0-9\\.]+)\\sminterms?.*:\\s([0-9\\.]+)");
	protected static PrismAnalysisResult factory(Process prismProcess, IOException executionException, IOException installAndExecutionException) {
		InputStreamReader reader = new InputStreamReader(prismProcess.getInputStream());
		BufferedReader br = new BufferedReader(reader);
		String line = null;
		int nodes = 0, transitions = 0, variables = 0;
		BigDecimal reliability = null;
		String output="";
		int exitValue = prismProcess.exitValue(); 
		try {
			while ((line = br.readLine()) != null) {
				output += line+System.getProperty("line.separator");
				logger.debug(line);
				if(line.startsWith("Transition matrix:")) {
					Matcher matcher = modelCharacteristics.matcher(line);
					matcher.find();
					nodes = Integer.valueOf(matcher.group(1));
					transitions = Integer.valueOf(matcher.group(2));
					variables = Integer.valueOf(matcher.group(3));
				}
				if(line.startsWith("Result")) {
					Matcher matcher = Pattern.compile("^Result( \\(probability\\))?: ([0-9\\.]+)").matcher(line);
					matcher.find();
					reliability = (new BigDecimal(matcher.group(2)));
				}
				line = null;
			}
			return new PrismAnalysisResult(exitValue, output+getStacktraces(executionException)+getStacktraces(installAndExecutionException), reliability, nodes, transitions, variables);
		} catch (IOException e) {
			return new PrismAnalysisResult(exitValue, output+getStacktraces(executionException)+getStacktraces(installAndExecutionException)+getStacktraces(e), reliability, nodes, transitions, variables);
		}
	}
	private static String getStacktraces(IOException exceptions) {
		if(exceptions==null) return "";
		StringBuilder traces = new StringBuilder();
		for(StackTraceElement trace: exceptions.getStackTrace()) {
			traces.append("\n");
			traces.append(trace.toString());
		}
		return traces.toString();
	}
}
