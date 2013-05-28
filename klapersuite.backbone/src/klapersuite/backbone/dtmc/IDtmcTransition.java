/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.dtmc;

import klapersuite.backbone.dtmc.IDtmcModule;

public interface IDtmcTransition {
	public String getProbability();
	public Object get_to();
	public Object get_from();
	public boolean callModule();
	public IDtmcModule getCalleeModule();

}