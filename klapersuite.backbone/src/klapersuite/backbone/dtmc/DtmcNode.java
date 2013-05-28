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

public class DtmcNode implements IDtmcNode {
	private Node node;
	private ModelMap map;
	private List<IDtmcTransition> outTransitions;
	private ArrayList<IDtmcTransition> inTransitions;
	public DtmcNode(ModelMap map, Node node) {
		this.map = map;
		this.node = node;
	}
	public String getName() {
		return node.getName();
	}
	public List<IDtmcTransition> getInTransitions() {
		if(inTransitions==null) initInTransitions();
		return inTransitions;
	}
	public List<IDtmcTransition> getOutTransitions() {
		if(outTransitions==null) initOutTransitions();
		return outTransitions;
	}
	private void initInTransitions() {
		inTransitions = new ArrayList<IDtmcTransition>();
		if(node.getInTransitions()!=null) {
			for(Transition transition: node.getInTransitions()) {
				inTransitions.add(map.dtmcTransition(transition));
			}
		}
	}
	private void initOutTransitions() {
		outTransitions = new ArrayList<IDtmcTransition>();
		if(node.getOutTransitions()!=null) {
			for(Transition transition: node.getOutTransitions()) {
				outTransitions.add(map.dtmcTransition(transition));
			}
		}
	}
	public boolean isEndNode() {
		return node.isIsEnd();
	}
	public boolean isFailNode() {
		return node.isIsFail();
	}
	public boolean isStartNode() {
		return node.isIsStart();
	}
}
