/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


/**
 * 
 */
package rmc.core;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;

import rmc.core.Module;
import rmc.core.Node;
import rmc.core.NodeInstantiationException;
import rmc.core.NodeNotFoundException;
import rmc.core.NodeType;
import rmc.core.ProbabilityException;

/**
 * @author anfi
 */
public class Node implements Comparable<Object> {
	public static final int EXPECTED_NUM_OF_SUCCS=5;
	private final NodeType type;
	private String name;
	private Module invok;
	private HashMap<Node,Double> successors;
	//Just for efficiency, instead of going through the entire map every time
	private BigDecimal outGoingProb=new BigDecimal(0);
	
	public Node(String name,NodeType type,Module m) throws NodeInstantiationException{
		this.name=""+name;
		this.type=type;
		if(type==NodeType.CALL && m==null){
			throw new NodeInstantiationException("A CALL node must have a not null module argument");
		}
		this.invok=m;
		if(type==NodeType.END || type==NodeType.FAILURE){
			this.successors=new HashMap<Node,Double>(0);
		}else{
			this.successors=new HashMap<Node,Double>(EXPECTED_NUM_OF_SUCCS);
		}
	}
	
	public HashMap<Node,Double> getSuccessorSet(){
		return this.successors;
	}
	
	public NodeType getType(){
		return this.type;
	}
	
	public void setName(String name){
		this.name=""+name;
	}
	
	public String getName(){
		return ""+this.name;
	}
	
	public Module getModule(){
		return this.invok;
	}
	
	public void addSuccessor(Node node,double prob) throws ProbabilityException, NodeInstantiationException{
		if(this.type==NodeType.END || this.type==NodeType.FAILURE){
			throw new NodeInstantiationException("Cannot add a successor to a final node.");
		}
		if(this.outGoingProb.add(new BigDecimal(prob)).doubleValue()>1){
			throw new ProbabilityException("Outgoing probability cannot exceed 1. (name: "+ node.getName() +" probability: "+ prob +")");
		}else{
			this.successors.put(node, prob);
			this.outGoingProb=this.outGoingProb.add(new BigDecimal(prob));
		}
	}
	
	public Iterator<Node> getSuccessors(){
		return this.successors.keySet().iterator();
	}
	
	public double getProbSuccessor(Node n) throws NodeNotFoundException{
		if(!this.successors.containsKey(n)){
			throw new NodeNotFoundException("Requested node is not in the successors set.");
		}
		return this.successors.get(n);
	}
	
	public boolean validate(){
		if(this.type!=NodeType.END && this.type!=NodeType.FAILURE){
			if(this.outGoingProb.doubleValue()!=1){
				System.out.println("The outgoing probability of node " + this.name + " is not 1");
				return false;				
			}
		}else{
			if(this.outGoingProb.doubleValue()!=0){
				return false;
			}
		}
		return true;
	}
	public int compareTo(Object o) {
		if(o.getClass()!=Node.class)
			return -10;
		if(o==this)
			return 0;
		return -1;
	}
}
