/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */

	private static final Logger logger = Logger.getLogger(PrismAnalysis.class);


	public PrismAnalysis(File pmFile, File pctlFile, int resultDecimalDigitsPrecision) {
		this.pmFile = pmFile;
		this.pctlFile = pctlFile;
		this.resultDecimalDigitsPrecision = resultDecimalDigitsPrecision;
	}
	public PrismAnalysisResult execute(String prismExecutablePath) {
		PrismRunner prismRunner = null;
		Process process = null;
		try {
			prismRunner = new PrismRunner(prismExecutablePath);
			process = prismRunner.launch(pmFile, pctlFile, resultDecimalDigitsPrecision);
			return PrismAnalysisResult.factory(process, null, null);
		} catch (IOException e) {
			logger.info("Prism analysis failed, try to install a bundled version of Prism");
			try {
				prismRunner=new PrismRunner();
				prismRunner.uninstall();
				prismRunner.install();
				process = prismRunner.launch(pmFile, pctlFile, resultDecimalDigitsPrecision);
				return PrismAnalysisResult.factory(process, null, null);
			} catch (IOException e1) {
				logger.debug(e.getMessage());
				logger.debug(e1.getMessage());
				logger.error("Prism analysis error");
				return PrismAnalysisResult.factory(process, e, e1);
			}
		}
	}
	public PrismAnalysisResult execute() {
		if(new PrismPreferencePage().getPrismExecutablePath()!=null
				&& new File(new PrismPreferencePage().getPrismExecutablePath()).canRead()) {
			logger.info("Launching the user declared version of the Prism installation");
			return execute(new PrismPreferencePage().getPrismExecutablePath());
		}else {
			logger.info("Launching the bundled version of the Prism installation");
			return execute(null);
		}
	}
}