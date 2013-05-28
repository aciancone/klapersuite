/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.dtmc;

import java.util.ArrayList;
import java.util.List;

import dtmc.*;

public class DtmcModule implements IDtmcModule {
	private Module module;
	private List<IDtmcNode> nodes = null;
	private List<IDtmcTransition> transitions = null;
	private ModelMap map;

	public DtmcModule(ModelMap map, Module module) {
		this.map = map;
		this.module = module;
	}
	public String getName() {
		return module.getName();
	}
	public List<IDtmcTransition> getTransitions() {
		if(transitions == null) initTransitions();
		return transitions;
	}
	public List<IDtmcNode> getNodes() {
		if(nodes == null) initNodes();
		return nodes;
	}
	private void initNodes() {
		nodes = new ArrayList<IDtmcNode>();
		if(module.getNodes()!=null) {
			for(Node node: module.getNodes()) {
				nodes.add(map.dtmcNode(node));
			}
		}
	}
	private void initTransitions() {
		transitions = new ArrayList<IDtmcTransition>();
		if(module.getTransitions()!=null) {
			for(Transition transition: module.getTransitions()) {
				transitions.add(map.dtmcTransition(transition));
			}
		}
	}
	public boolean isAutonomous() {
		return module.isIsAutonomous();
	}
}
