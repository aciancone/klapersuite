/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package klapersuite.RmcAnalysis;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Eclipse IDE interface handler. It is used by eclipse due to communicate an activation request from a user
 */
public class GuiHandler extends AbstractHandler {
	IWorkbenchWindow window;

	/**
	 * the command has been executed, so extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		this.window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		System.out.print("Execution start...");
		return null;
	}
	
	public void showInfo(String msg) {
//		MessageDialog.openInformation(window.getShell(), "M2M-TF", msg);
		System.out.println("M2M-TF: "+msg);
	}
	public void showError(String msg) {
//		MessageDialog.openError(window.getShell(), "M2M-TF", msg);
		System.err.println("M2M-TF: "+msg);
	}
}