/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.dtmc;

import java.util.List;

import klapersuite.backbone.dtmc.IDtmcTransition;


public interface IDtmcNode {

	List<IDtmcTransition> getInTransitions();
	List<IDtmcTransition> getOutTransitions();
	String getName();
	boolean isStartNode();
	boolean isEndNode();
	boolean isFailNode();

}
