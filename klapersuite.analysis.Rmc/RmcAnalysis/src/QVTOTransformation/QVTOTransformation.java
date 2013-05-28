/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package QVTOTransformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import klaper.core.CorePackage;
import klaper.expr.ExprPackage;
import klaper.probability.ProbabilityPackage;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import dtmc.DtmcPackage;

/**
 * Performs a QVT Operational transformation.
 */
public class QVTOTransformation {
	private static final Logger logger = Logger.getLogger(QVTOTransformation.class);
	private final Map<String, Object> configurationParameter;
	private final List<EObject>[] inoutInitialModels;
	private final URI qvtoTransformationFile;

	public QVTOTransformation(
			Map<String, Object> opts,
			List<EObject>[] inoutModels,
			URI scriptFile
			) {
		this.configurationParameter = opts;
		this.inoutInitialModels = inoutModels;
		this.qvtoTransformationFile = scriptFile;
//		this.traceFile = traceFile;
	}
	public QVTOTransformationResult launch() throws RuntimeException {
		logger.info("Executing QVTO Transformation...");
		logger.debug("Script: "+qvtoTransformationFile);
		QVTOTransformationResult result = execute();
		if (!result.isSuccess()) {
			logger.error("Transformation job failed");
			logger.error(result.diagnosticResult.getMessage());
			result.logStackTrace(logger, Level.ERROR);
			throw new QVTOTransformationRunningException("Transformation execution failed", result);
		}
		logger.info("Transformation executed successfully");
		return result;
	}
	private QVTOTransformationResult execute() {
		TransformationExecutor executor = new TransformationExecutor(qvtoTransformationFile);
		ModelExtent[] inoutModelsExtent = createInoutModelsExtentWithInitialContent(inoutInitialModels);
		ExecutionContextImpl context = setupExecutionEnvironment();
		ExecutionDiagnostic result = executor.execute(context, inoutModelsExtent);
		List<EObject>[] inoutFinalModels = createInoutFinalModels(inoutModelsExtent);
		QVTOTransformationResult qvtResult = new QVTOTransformationResult(result, inoutFinalModels);
		return qvtResult;
	}
	private List<EObject>[] createInoutFinalModels(ModelExtent[] inoutModelsExtent) {
		List<EObject>[] inoutFinalModels = new List[inoutModelsExtent.length];
		for (int i = 0; i < inoutModelsExtent.length; i++) {
			inoutFinalModels[i] = inoutModelsExtent[i].getContents();
		}	
		return inoutFinalModels;
	}
	private ExecutionContextImpl setupExecutionEnvironment() {
		ExecutionContextImpl context = new ExecutionContextImpl();
		for (Map.Entry<String,Object> parameter : configurationParameter.entrySet()) {
			context.setConfigProperty(parameter.getKey(), parameter.getValue());
		}
		context.setLog(new QVTOTransformationLogger());
		return context;
	}
	private ModelExtent[] createInoutModelsExtentWithInitialContent(List<EObject>[] inoutModels) {
		ModelExtent[] inoutModelExtent = new ModelExtent[inoutModels.length];
		for (int i = 0; i < inoutModels.length; i++) {
			inoutModelExtent[i] = new BasicModelExtent();
			if (inoutModels[i] != null) {
				ArrayList<EObject> contents = new ArrayList<EObject>();
				contents.addAll(inoutModels[i]);
				inoutModelExtent[i].setContents(contents);
			}
		}
		return inoutModelExtent;
	}
}
