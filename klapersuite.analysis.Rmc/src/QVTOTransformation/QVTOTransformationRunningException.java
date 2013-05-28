/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package QVTOTransformation;

public class QVTOTransformationRunningException extends RuntimeException {
	private static final long serialVersionUID = 1512388564446967226L;
	public final QVTOTransformationResult result;
	public QVTOTransformationRunningException(String message, QVTOTransformationResult result) {
		super(message);
		this.result = result;
	}
}
