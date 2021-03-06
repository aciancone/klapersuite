/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.prismanalysis.linux;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xpand2.output.Outlet;
import klapersuite.backbone.utility.LazyXpand;

import dtmc.Dtmc;

public class Dtmc2PrismTransformation {
	private static final String DTMC2PRISMPROPERTIES_XPANDTRANSFORMATION = "template::dtmc2prismProperties";
	private static final String DTMC2PRISMMODEL_XPANDTRANSFORMATION = "template::dtmc2prismModel";
	private final Dtmc dtmcModel;

	public Dtmc2PrismTransformation(Dtmc dtmcModel) {
		this.dtmcModel = dtmcModel;
	}
	public boolean run(String outputFolder) throws Exception {
		 createDtmc2PrismJob(DTMC2PRISMMODEL_XPANDTRANSFORMATION, outputFolder).run();
         createDtmc2PrismJob(DTMC2PRISMPROPERTIES_XPANDTRANSFORMATION, outputFolder).run();

		return true;
	}
    private LazyXpand createDtmc2PrismJob(String template, String outputFolder) {
        Outlet[] outlets = new Outlet[1];
        outlets[0] = new Outlet();
        outlets[0].setPath(outputFolder);

        EPackage[] ePackages = { dtmc.DtmcPackage.eINSTANCE };  

        HashMap<String,EObject> slots = new HashMap<String, EObject>();
        slots.put("model", dtmcModel);

        return LazyXpand.factory(
        		template + "::main FOR model",
        		outlets,
        		ePackages,
        		slots,
        		LazyXpand.UTF8_ENCODING);
    }  
}
