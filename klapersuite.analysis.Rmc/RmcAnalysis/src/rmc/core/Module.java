/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.jface.dialogs.InputDialog;

import rmc.core.*;
import rmc.mat.*;

/**
 * @author anfi
 *
 */
public class Module implements Comparable {
	public static final int EXPECTED_NUM_NODES=10; 
	private Set<Node> nodes;
	//For efficiency reasons. Start and End must be part of this.nodes
	private Node start;
	private Node end;
	private String name;
	private Set<String> equations;
	

	public Module(String name){
		this.name=""+name;
		this.nodes=new TreeSet<Node>();
		this.equations=new TreeSet<String>();
	}
	
	public void setName(String name){
		this.name=""+name;
	}
	
	public String getName(){
		return ""+this.name;
	}
	
	public Set<Node> getNodes(){
		return this.nodes;
	}
	
	public void addNode(Node n) throws ModuleInstantiationException{
		if(n.getType()==NodeType.START){
			if(this.start==null){
				this.start=n;
			}else{
				throw new ModuleInstantiationException("Duplicated START node.");
			}
		}
		if(n.getType()==NodeType.END){
			if(this.end==null){
				this.end=n;
			}else{
				throw new ModuleInstantiationException("Duplicated END node.");
			}
		}
		this.nodes.add(n);
	}
	
	public void addTransition(Node n1,Node n2,double prob) throws NodeNotFoundException, ProbabilityException, NodeInstantiationException{
		//To be fixed
		if(false && (!this.nodes.contains(n1) || !this.nodes.contains(n2))){
			throw new NodeNotFoundException("One of the requested nodes is unavailable: "+n1.getName()+"  "+n2.getName()+" .");
		}
		if(prob<0 || prob>1){
			throw new ProbabilityException("Incorrect probability value.");
		}
		if(prob==0){
			throw new ProbabilityException("Do not add 0 probability transitions.");
		}
		n1.addSuccessor(n2, prob);
	}
	
	public Node getStart(){
		return this.start;
	}
	
	public Node getEnd(){
		return this.end;
	}
	
	public Set<String> getEquations(){
		return this.equations;
	}
	
	public void computeEquations() throws NodeNotFoundException{
		for(Node tmp : this.nodes){
			String tmps="";
			if(tmp==this.end){
				tmps=this.name+tmp.getName()+"=1";
			}else if(tmp.getType()==NodeType.FAILURE){
				tmps=this.name+tmp.getName()+"=0";
			}else if(tmp.getType()==NodeType.CALL){
				tmps=this.name+tmp.getName()+"="+tmp.getModule().getName()+tmp.getModule().getStart().getName()+"*(";
				Iterator<Node> it=tmp.getSuccessors();
				while(it.hasNext()){
					Node tmp2=it.next();
					tmps=tmps+tmp.getProbSuccessor(tmp2)+"*"+this.name+tmp2.getName()+"+";
				}
				if(tmps.endsWith("+")){
					tmps=tmps.substring(0,tmps.length()-1);
				}
				tmps=tmps+")";
			}else{
				tmps=this.name+tmp.getName()+"=";
				Iterator<Node> it=tmp.getSuccessors();
				while(it.hasNext()){
					Node tmp2=it.next();
					tmps=tmps+tmp.getProbSuccessor(tmp2)+"*"+this.name+tmp2.getName()+"+";
				}
				if(tmps.endsWith("+")){
					tmps=tmps.substring(0,tmps.length()-1);
				}
			}
			this.equations.add(tmps);
			tmps="";
		}
	}
	public List<RmcEquation> getRmcEquations(RmcVariables inputVariables) {
		ArrayList<RmcEquation> rmcEquations = new ArrayList<RmcEquation>();
		for(Node tmp : this.nodes){
			if(tmp==this.end){
				rmcEquations.add(new RmcEquation(inputVariables, this.name+tmp.getName(), new RmcDecimal(new BigDecimal(1))));
			}else if(tmp.getType()==NodeType.FAILURE){
				rmcEquations.add(new RmcEquation(inputVariables, this.name+tmp.getName(), new RmcDecimal(new BigDecimal(0))));
			}else if(tmp.getType()==NodeType.CALL){
				Iterator<Node> it=tmp.getSuccessors();
				RmcValue lastCallValue = new RmcDecimal(new BigDecimal(0));
				while(it.hasNext()){
					Node tmp2=it.next();
					try {
						lastCallValue = new RmcSum(lastCallValue,
							new RmcMultiplication(
								new RmcDecimal(new BigDecimal(tmp.getProbSuccessor(tmp2))),
								new RmcVariable(inputVariables, inputVariables.getVariableIdFromName(this.name+tmp2.getName()))));
					} catch (NodeNotFoundException e) {
						e.printStackTrace();
					}
				}
				rmcEquations.add(new RmcEquation(inputVariables, this.name+tmp.getName(), 
					new RmcMultiplication(
						new RmcVariable(inputVariables, inputVariables.getVariableIdFromName(tmp.getModule().getName()+tmp.getModule().getStart().getName())),
						lastCallValue)));
			}else{
				Iterator<Node> it=tmp.getSuccessors();
				RmcValue lastCallValue = new RmcDecimal(new BigDecimal(0));
				while(it.hasNext()){
					Node tmp2=it.next();
					try {
						lastCallValue = new RmcSum(lastCallValue,
							new RmcMultiplication(
								new RmcDecimal(new BigDecimal(tmp.getProbSuccessor(tmp2))),
								new RmcVariable(inputVariables, inputVariables.getVariableIdFromName(this.name+tmp2.getName()))));
					} catch (NodeNotFoundException e) {
						e.printStackTrace();
					}
				}
				rmcEquations.add(new RmcEquation(inputVariables, this.name+tmp.getName(), 
					lastCallValue));
			}
		}
		return rmcEquations;
	}
	public boolean validate(){
		for(Node n : this.nodes){
			if(!n.validate()){
				return false;
			}
		}
		return true;
	}

	public int compareTo(Object o) {
		if(o.getClass()!=Module.class)
			return -10;
		if(o==this)
			return 0;
		return -1;
	}
}
