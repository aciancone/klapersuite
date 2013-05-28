/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


/**
 * Solver of the Least Fixed Point problem for an equation system x=P(x)
 */
package rmc.mat;

import java.util.HashMap;

import rmc.mat.TargetVariableNotFoundException;

/**
 * @author anfi
 *
 */
public interface Solver {
	
	/**
	 * @return Cumulative number of iterations performed. 
	 */
	public long getNumIterations();
	/**
	 * Print the current assignments on the standard output
	 */
	public void printCurrentAssign();
	/**
	 * @return An hash map variable->value
	 */
	public HashMap<String,Double> getCurrentAssignment();
	/**
	 * @param assigns New assignment
	 * @throws Exception
	 */
	public void setCurrentAssignment(HashMap<String,Double> assigns) throws Exception;
	/**
	 * Iterate until the mean squared variation in two successive assignments becomes
	 * less or equal than maxMSV, or the maximum number of iterations is reached.
	 * @param maxMSV Maximum variation to keep iterating
	 * @param maxIterations Upper bound to the number of iterations
	 * @throws Exception Depends on the specific solver implementation
	 */
	public void iterateUntilMSVlessThan(double maxMSV,long maxIterations) throws Exception;
	/**
	 * @param var Variable whose value is requested
	 * @return Current value of var
	 * @throws TargetVariableNotFoundException
	 */
	public double getValue(String var) throws TargetVariableNotFoundException;
	/**
	 * Keeps iterationg up to maxIterations or until variable var does not change by more
	 * than maxVariation
	 * @param var
	 * @param maxVariation
	 * @param maxIterations
	 * @throws Exception
	 */
	public void iterateUntilTargetDeltalessThan(String var,double maxVariation,long maxIterations) throws Exception;
	/**
	 * Keeps iterationg up to maxIterations or until the average change of variable
	 * over the last 10 iterations is lower than maxVariation
	 * @param var
	 * @param maxVariation
	 * @param maxIterations
	 * @throws Exception
	 */
	public void iterateUntilTargetAVG10DeltalessThan(String var,double maxVariation,long maxIterations) throws Exception;
	/**
	 * Execute exactly num iterations.
	 * @param num 
	 * @throws Exception
	 */
	public void doNIterations(long num) throws Exception;
	/**
	 * @return Mean Squared Variation of the last iteration. At iteration 0 MSV=0
	 */
	public double getMSV();
	
}
