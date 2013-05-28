/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package QVTOTransformation;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;

public class QVTOTransformationResult {
	public final ExecutionDiagnostic diagnosticResult;
	public final List<EObject>[] inoutModels;

	public QVTOTransformationResult(ExecutionDiagnostic result, List<EObject>[] inoutModels) {
		this.diagnosticResult = result;
		this.inoutModels = inoutModels;
	}

	public boolean isSuccess() {
		return this.diagnosticResult.getSeverity() == Diagnostic.OK;
	}
		
	public void logStackTrace(Logger logger, Level level) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		this.diagnosticResult.printStackTrace(pw);
		logger.log(level,sw.toString());
	}
	public String diagnosticMessage() {
		return this.diagnosticResult.getMessage();
	}
	public String diagnosticDetails() {
		String details = this.diagnosticResult.getMessage();
		for(Diagnostic diagnostic: this.diagnosticResult.getChildren()) {
			details += "\n* "+diagnostic.getMessage();
		}
		return details;
	}
}