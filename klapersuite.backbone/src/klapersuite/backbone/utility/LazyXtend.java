/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

package klapersuite.backbone.utility;

import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.typesystem.Type;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

public class LazyXtend {
	private final Logger logger = Logger.getLogger(LazyXtend.class);

	private final EPackage[] metamodels;

	public final String xtendFile;
	public final String xtendFunction;

	private Object[] functionInputParameters;

	public LazyXtend(EPackage[] metamodels, 
			String xtendFile, 
			String xtendFunction, 
			Object[] functionInputParameters) {
		super();

		this.metamodels = metamodels;

		this.xtendFile = xtendFile;
		this.xtendFunction = xtendFunction;
		this.functionInputParameters = functionInputParameters; 
	}

	public Object run() {
		try {
			ExecutionContextImpl ctx = new ExecutionContextImpl();
			XtendFacade xtendFacade = XtendFacade.create(loadMetamodelsIntoXtend(ctx), xtendFile);
			//XtendFacade xtendFacade = XtendFacade.create(ctx, xtendFile);
			//Set<String> ns = ctx.getNamespaces();
			//new EmfMetaModel(klaper.core.CorePackage.eINSTANCE).getFullyQualifiedName(null);
			//ctx.registerMetaModel(null);
			Type a = ctx.getTypeForName("klaper::core::KlaperModels");
			
			logger.info("Running Xtend task....");
			return xtendFacade.call(xtendFunction, functionInputParameters);	
		} catch(Exception e) {
			throw new RuntimeException("Xtend Failed: "+e.getMessage(), e);
		}
	}

	private ExecutionContextImpl loadMetamodelsIntoXtend(ExecutionContextImpl ctx) {
		for(EPackage metamodel: metamodels) {
			ctx.registerMetaModel(new EmfMetaModel(metamodel));
		}
		return ctx;
	}
}
/*
 * Calling Extensions From Java The previous section showed how to implement
 * Extensions in Java. This section shows how to call Extensions from Java.
 * 
 * // setup XtendFacade f = XtendFacade.create("my::path::MyExtensionFile");
 * 
 * // use f.call("sayHello",new Object[]{"World"}); The called extension file
 * looks like this:
 * 
 * sayHello(String s) : "Hello " + s; This example uses only features of the
 * BuiltinMetaModel, in this case the "+" feature from the StringTypeImpl.
 * 
 * Here is another example, that uses the JavaBeansMetaModel strategy. This
 * strategy provides as additional feature: the access to properties using the
 * getter and setter methods.
 * 
 * For more information about type systems, see the Expressions reference
 * documentation.
 * 
 * We have one JavaBean-like metamodel class:
 * 
 * package mypackage; public class MyBeanMetaClass { private String myProp;
 * public String getMyProp() { return myProp; } public void setMyProp(String s)
 * { myProp = s;} } in addition to the built-in metamodel type system, we
 * register the JavaMetaModel with the JavaBeansStrategy for our facade. Now, we
 * can use also this strategy in our extension:
 * 
 * // setup facade
 * 
 * XtendFacade f = XtendFacade.create("myext::JavaBeanExtension");
 * 
 * // setup additional type system JavaMetaModel
 * jmm = new JavaMetaModel("JavaMM", new JavaBeansStrategy());
 * 
 * f.registerMetaModel(jmm);
 * 
 * // use the facade MyBeanMetaClass jb = MyBeanMetaClass();
 * jb.setMyProp("test"); f.call("readMyProp", new Object[]{jb})); The called
 * extension file looks like this:
 * 
 * import mypackage;
 * 
 * readMyProp(MyBeanMetaClass jb) : jb.myProp ;
 */