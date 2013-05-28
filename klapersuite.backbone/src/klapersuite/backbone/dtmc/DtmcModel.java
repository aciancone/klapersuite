/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.dtmc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dtmc.*;

public class DtmcModel implements IDtmcModel {
	private Dtmc dtmc;
	private ModelMap map = new ModelMap();
	
	private List<IDtmcModule> modules = null;
	public DtmcModel(dtmc.Dtmc dtmc) {
		this.dtmc=dtmc;
	}
	public String getName() {
		return dtmc.getName();
	}
	public List<IDtmcModule> getModules() {
		if(modules == null) initModule();
		return modules;
	}
	private void initModule() {
		modules = new ArrayList<IDtmcModule>();
		if(dtmc.getModules()!=null) {
			for(Module module: dtmc.getModules()) {
				modules.add(map.dtmcModule(module));
			}
		}
	}
}
class ModelMap {
	public HashMap<Module, IDtmcModule> mapModules=new HashMap<Module, IDtmcModule>();
	public HashMap<Node, IDtmcNode> mapNodes=new HashMap<Node, IDtmcNode>();
	public HashMap<Transition, IDtmcTransition> mapTransitions=new HashMap<Transition, IDtmcTransition>();

	public IDtmcModule dtmcModule(Module module) {
		if(module == null)
			return null;
		if(!mapModules.containsKey(module)) {
			mapModules.put(module, new DtmcModule(this, module)); 
		}
		return mapModules.get(module);
	}
	public IDtmcNode dtmcNode(Node node) {
		if(node == null)
			return null;
		if(!mapNodes.containsKey(node)) {
			mapNodes.put(node, new DtmcNode(this, node));
		}
		return mapNodes.get(node);
	}
	public IDtmcTransition dtmcTransition(Transition transition) {
		if(transition == null)
			return null;
		if(!mapTransitions.containsKey(transition)) {
			mapTransitions.put(transition, new DtmcTransition(this, transition));
		}
		return mapTransitions.get(transition);
	}
}