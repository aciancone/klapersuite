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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import rmc.core.Module;
import rmc.core.NodeNotFoundException;
import rmc.mat.RmcEquation;
import rmc.mat.RmcVariables;

/**
 * @author anfi
 */
public class RMC {
	public String name;
	private Set<Module> modules;
	private Module initial;
	private Set<String> equations;
	
	public RMC(String name){
		this.name=""+name;
		this.modules=new TreeSet<Module>();
		this.equations=new TreeSet<String>();
	}
	
	public boolean validate(){
		for(Module m: this.modules){
			if(!m.validate())
				return false;
		}
		return true;
	}
	
	public Module getInitialModule(){
		return this.initial;
	}
	
	public Set<Module> getModules(){
		return this.modules;
	}
	
	public void addModule(Module m,boolean initial){
		this.modules.add(m);
		if(initial){
			this.initial=m;
		}
	}
	
	public Set<String> getEquations(){
		if(this.equations==null || this.equations.size()<1)
			try {
				computeEquations();
			} catch (NodeNotFoundException e) {
				e.printStackTrace();
			}
		return this.equations;
	}
	
	public void computeEquations() throws NodeNotFoundException{
		for(Module m : this.modules){
			m.computeEquations();
			boolean op=this.equations.addAll(m.getEquations());
			if(!op){
				System.err.println("Something went wrong with module "+m.getName()+" .");
			}
		}
	}
	public List<RmcEquation> getRmcEquations(RmcVariables inputVariables){
		ArrayList<RmcEquation> equations = new ArrayList<RmcEquation>();
		for(Module m: this.modules) {
			for(RmcEquation eq: m.getRmcEquations(inputVariables)) {
				equations.add(eq);
			}
		}
		return equations;
	}
}
