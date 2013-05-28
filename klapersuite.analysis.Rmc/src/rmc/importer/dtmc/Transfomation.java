/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.importer.dtmc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import klapersuite.backbone.dtmc.IDtmcModel;
import klapersuite.backbone.dtmc.IDtmcModule;
import klapersuite.backbone.dtmc.IDtmcNode;
import klapersuite.backbone.dtmc.IDtmcTransition;


import rmc.mat.Calculator;

import rmc.core.Module;
import rmc.core.ModuleInstantiationException;
import rmc.core.Node;
import rmc.core.NodeInstantiationException;
import rmc.core.NodeNotFoundException;
import rmc.core.NodeType;
import rmc.core.ProbabilityException;
import rmc.core.RMC;

public class Transfomation {
	public HashMap<IDtmcModule, Module> modules = new HashMap<IDtmcModule, Module>();
	public HashMap<IDtmcNode, Node> nodes = new HashMap<IDtmcNode, Node>();

	public RMC generateRMC(IDtmcModel dtmcModel) throws NodeInstantiationException, NumberFormatException, NodeNotFoundException, ProbabilityException, ModuleInstantiationException {
		RMC rmc=new RMC(dtmcModel.getName());
		for(IDtmcModule dtmcModule: dtmcModel.getModules()) {
			modules.put(dtmcModule, createModule(dtmcModule));
		}
		for(IDtmcModule dtmcModule: dtmcModel.getModules()) {
			mapModule(rmc, dtmcModule, modules.get(dtmcModule));
		}
		return rmc;
	}
	public void mapModule(RMC rmc, IDtmcModule dtmcModule, Module module) throws NodeInstantiationException, NumberFormatException, NodeNotFoundException, ProbabilityException, ModuleInstantiationException {
		for(IDtmcNode dtmcNode: dtmcModule.getNodes()) {
			Node node=createNode(dtmcNode);
			nodes.put(dtmcNode, node);
			module.addNode(node);
		}
		for(IDtmcTransition transition: dtmcModule.getTransitions()) {
			if(transition.get_from()==null)
				continue;
			if(transition.get_to()==null)
				continue;
			if(transition.getProbability().contentEquals("0")
			  || transition.getProbability().contentEquals("0.0")) {
				continue;
			}
			double probability = (new Calculator()).result(transition.getProbability());
			if(probability <= 0) continue;
			module.addTransition(nodes.get(transition.get_from()), nodes.get(transition.get_to()), probability);
		}
		rmc.addModule(module, dtmcModule.isAutonomous());
	}
	public Node createNode(IDtmcNode dtmcNode) throws NodeInstantiationException {
		List<NodeFactory> factories = getNodeFactories();
		for(NodeFactory factory: factories) {
			if(!factory.testPrecoditions(dtmcNode)) {
				continue;
			}
			return factory.createNode(dtmcNode);
		}
		throw new NodeInstantiationException("Invalid node type. Doesn't exist a factory for this dtmcNode.");
	}

	private List<NodeFactory> getNodeFactories() {
		List<NodeFactory> factories = new ArrayList<NodeFactory>();
		factories.add(new StartNodeFactory());
		factories.add(new EndNodeFactory());
		factories.add(new FailNodeFactory());
		factories.add(new CallNodeFactory());
		factories.add(new NormalNodeFactory());
		return factories;
	}
	private Module createModule(IDtmcModule module) {
		return new Module(module.getName());
	}
	class StartNodeFactory implements NodeFactory {
		public Node createNode(IDtmcNode node) throws NodeInstantiationException {
			return new Node(node.getName(), NodeType.START, null);
		}
		public boolean testPrecoditions(IDtmcNode node) {
			return node.isStartNode();
			//return node.getInTransitions().size() < 1;
		}
	}
	class EndNodeFactory implements NodeFactory {
		public Node createNode(IDtmcNode node) throws NodeInstantiationException {
			return new Node(node.getName(), NodeType.END, null);
		}
		public boolean testPrecoditions(IDtmcNode node) {
			return node.isEndNode();
			//return node.getOutTransitions().size() < 1;
		}
	}
	class NormalNodeFactory implements NodeFactory {
		public Node createNode(IDtmcNode node) throws NodeInstantiationException {
			return new Node(node.getName(), NodeType.NORMAL, null);
		}
		public boolean testPrecoditions(IDtmcNode node) {
			return true;
		}
	}
	class FailNodeFactory implements NodeFactory {
		public Node createNode(IDtmcNode node) throws NodeInstantiationException {
			return new Node(node.getName(), NodeType.FAILURE, null);
		}
		public boolean testPrecoditions(IDtmcNode node) {
			return node.isFailNode();
		}
	}
	class CallNodeFactory implements NodeFactory {
		public Node createNode(IDtmcNode node) throws NodeInstantiationException {
			return new Node(node.getName(), NodeType.CALL,
				modules.get(node.getOutTransitions().get(0).getCalleeModule()));
		}
		public boolean testPrecoditions(IDtmcNode node) {
			if(node.getOutTransitions()==null || node.getOutTransitions().size()<1) {
				return false;
			}
			return node.getOutTransitions().get(0).callModule();
		}
	}
	interface NodeFactory {
		boolean testPrecoditions(IDtmcNode node);
		Node createNode(IDtmcNode node) throws NodeInstantiationException;
	}
}