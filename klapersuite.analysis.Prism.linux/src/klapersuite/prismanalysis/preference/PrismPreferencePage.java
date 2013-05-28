/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

 * A preference page to set the Prism Model checker properties.
 * @author Mauro Luigi Drago
 *
 */
public class PrismPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	/** The root directory of the Prism Model Checker */
	public static final String PRISM_EXECUTABLE = "prismExecutable";
	public static final String PRISM_EXECUTABLE_LABEL = "Prism Executable:";

	public PrismPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Prism Model Checker preferences.");
	}

	@Override
	protected void createFieldEditors() {
		addField(new FileFieldEditor(PRISM_EXECUTABLE, PRISM_EXECUTABLE_LABEL, getFieldEditorParent()));
	}

	@Override
	public void init(IWorkbench workbench) {
		// Nothing to do here
	}
	public String getPrismExecutablePath() {
		return Activator.getDefault().getPreferenceStore().getString(PRISM_EXECUTABLE);
	}
	public void setPrismExecutablePath(String value) {
		Activator.getDefault().getPreferenceStore().setValue(PRISM_EXECUTABLE, value);
	}
}
