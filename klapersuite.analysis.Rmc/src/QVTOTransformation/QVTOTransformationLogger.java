/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package QVTOTransformation;

import org.apache.log4j.Logger;
import org.eclipse.m2m.qvt.oml.util.Log;

public class QVTOTransformationLogger implements Log {
	private static final Logger logger = Logger.getLogger(QVTOTransformationLogger.class);

	public void log(String message) {
		this.log(1, message, null);
	}

	public void log(int level, String message) {
		this.log(level, message, null);
	}

	public void log(String message, Object param) {
		this.log(1, message, param);
	}

	public void log(int level, String message, Object param) {
		String paramToString = param == null ? "" : " <"+param+">";
		logger.info(message+paramToString);
	}

}