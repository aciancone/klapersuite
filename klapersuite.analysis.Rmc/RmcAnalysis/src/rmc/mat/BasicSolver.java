/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


/**
 * 
 */
package rmc.mat;

import java.util.HashMap;
import java.util.Set;

import org.nfunk.jep.JEP;

import rmc.mat.Solver;
import rmc.mat.TargetVariableNotFoundException;

/**
 * @author anfi
 *
 */
public class BasicSolver implements Solver{
	private Set<String> equations;
	private HashMap<String,Double> currentAssign;
	private long numIterations=0;
	private double msv=0;

	public BasicSolver(Set<String> equations){
		this.equations=equations;
		this.initialAssign();
	}

	private void initialAssign(){
		this.currentAssign=new HashMap<String, Double>(this.equations.size());
		for(String eq : this.equations){
			//convention: all the variables starts with a letter
			String var=eq.replaceAll(" ", "").substring(0,eq.indexOf("="));
			if(this.currentAssign.containsKey(var)){
				continue;
			}
			try{
				double val=Double.parseDouble(eq.replaceAll(" ", "").substring(eq.indexOf("=")+1));
				this.currentAssign.put(var, val);
			}catch(NumberFormatException e){
				double val=0;
				this.currentAssign.put(var, val);
			}
		}
		this.numIterations=0;
		this.msv=0;
	}

	/* 
	 * @see mat.Solver#getNumIterations()
	 */
	public long getNumIterations(){
		return this.numIterations;
	}

	/* 
	 * @see mat.Solver#printCurrentAssign()
	 */
	public void printCurrentAssign(){
		if(this.currentAssign==null || this.currentAssign.isEmpty()){
			System.out.println("No valid assignment present.");
		}else{
			System.out.println("Iterations so far: "+this.numIterations);
			for(String s : this.currentAssign.keySet()){
				System.out.println(s+"\t = "+this.currentAssign.get(s));
			}
		}
	}

	/*
	 * @see mat.Solver#getCurrentAssignment()
	 */
	public HashMap<String,Double> getCurrentAssignment(){
		return this.currentAssign;
	}

	/* 
	 * @see mat.Solver#iterateUntilMSVlessThan(double, long)
	 */
	public void iterateUntilMSVlessThan(double maxMSV,long maxIterations){
		for(long i=0;i<maxIterations;i++){
			if(this.numIterations>0 && this.msv<=maxMSV){
				break;
			}
			this.basicIterate();
		}
	}


	/*
	 * @see mat.Solver#getValue(java.lang.String)
	 */
	public double getValue(String var) throws TargetVariableNotFoundException{
		if(this.currentAssign==null || !this.currentAssign.containsKey(var)){
			throw new TargetVariableNotFoundException("Variable "+var+" not in current valid assignment");
		}
		return this.currentAssign.get(var);
	}

	/*
	 * @see mat.Solver#iterateUntilTargetDeltalessThan(java.lang.String, double, long)
	 */
	public void iterateUntilTargetDeltalessThan(String var,double maxVariation,long maxIterations) throws TargetVariableNotFoundException{
		if(this.currentAssign==null || !this.currentAssign.containsKey(var)){
			throw new TargetVariableNotFoundException("Variable "+var+" not in current valid assignment");
		}
		double pastValue=this.currentAssign.get(var);
		for(long i=0;i<maxIterations;i++){
			this.basicIterate();
			if(Math.abs(this.currentAssign.get(var)-pastValue)<=maxVariation){
				break;
			}
			pastValue=this.currentAssign.get(var);
		}
	}

	/* 
	 * @see mat.Solver#doNIterations(long)
	 */
	public void doNIterations(long num){
		for(long i=0;i<num;i++){
			this.basicIterate();
		}
	}

	/*
	 * @see mat.Solver#getMSV()
	 */
	public double getMSV(){
		return this.msv;
	}

	private void basicIterate(){
		JEP parser = new JEP();
		this.msv=0;
		for(String v:this.currentAssign.keySet()){
			parser.addVariable(v, this.currentAssign.get(v));
		}
		for(String eq : this.equations){
			//convention: all the variables starts with a letter
			String var=eq.replaceAll(" ", "").substring(0,eq.indexOf("="));
			if(!this.currentAssign.containsKey(var)){
				System.err.println("Wrong assignment disctioanry initialization. Missing variable: "+var);
			}
			try{
				double val=Double.parseDouble(eq.replaceAll(" ", "").substring(eq.indexOf("=")+1));
				this.msv+=Math.pow(this.currentAssign.get(var)-val, 2);
				this.currentAssign.put(var, val);
			}catch(NumberFormatException e){
				String expression=eq.replaceAll(" ", "").substring(eq.indexOf("=")+1);
				parser.parseExpression(expression);
				double val=parser.getValue();
				this.msv+=Math.pow(this.currentAssign.get(var)-val, 2);
				this.currentAssign.put(var, val);
			}
		}
		this.numIterations++;
		this.msv=Math.sqrt(this.msv);
	}

	/* 
	 * @see mat.Solver#iterateUntilTargetAVG10DeltalessThan(java.lang.String, double, long)
	 */
	public void iterateUntilTargetAVG10DeltalessThan(String var,
			double maxVariation, long maxIterations) throws Exception {
		if(this.currentAssign==null || !this.currentAssign.containsKey(var)){
			throw new TargetVariableNotFoundException("Variable "+var+" not in current valid assignment");
		}
		double pastValues[]=new double[10];
		int window=0;
		pastValues[(window%10)]=this.currentAssign.get(var);
		window++;
		for(long i=0;i<maxIterations;i++){
			this.basicIterate();
			pastValues[(window%10)]=this.currentAssign.get(var);
			window++;
			double avg=0;
			for(int k=0;k<9 && k<=this.numIterations;k++){
				avg+=Math.abs(pastValues[k]-pastValues[k+1]);
			}
			avg=avg/Math.max(Math.min(9, this.numIterations),1);
			if(avg<=maxVariation){
				break;
			}
		}
	}

	/*
	 * @see mat.Solver#setCurrentAssignment(java.util.HashMap)
	 */
	public void setCurrentAssignment(HashMap<String, Double> assigns)
			throws Exception {
		if(assigns==null || assigns.size()!=this.currentAssign.size()){
			throw new TargetVariableNotFoundException("Variables set not compatible.");
		}
		HashMap<String, Double>temp=(HashMap<String, Double>) assigns.clone();
		temp.keySet().removeAll(this.currentAssign.keySet());
		if(temp.size()!=0){
			throw new TargetVariableNotFoundException("Variables set not compatible.");
		}
		this.currentAssign=assigns;
	}
}