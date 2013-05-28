/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.dtmc;

import dtmc.*;

public class DtmcTransition implements IDtmcTransition {
	private Transition transition;
	private ModelMap map;

	public DtmcTransition(ModelMap map, Transition transition) {
		this.map = map;
		this.transition = transition;
	}
	public String getProbability() {
		return transition.getProbability();
	}
	public IDtmcNode get_to() {
		return map.dtmcNode(transition.get_to());
	}
	public IDtmcNode get_from() {
		return map.dtmcNode(transition.get_from());
	}
	public boolean callModule() {
		return transition instanceof CallTransition;
	}
	public IDtmcModule getCalleeModule() {
		return map.dtmcModule(((CallTransition)transition).getInvokedTransition().getModule());
	}
}
