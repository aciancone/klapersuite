/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import klaper.expr.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.ParamVariable#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getParamVariable()
 * @model
 * @generated
 */
public interface ParamVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' reference.
	 * @see #setParam(FormalParam)
	 * @see klaper.core.CorePackage#getParamVariable_Param()
	 * @model required="true"
	 * @generated
	 */
	FormalParam getParam();

	/**
	 * Sets the value of the '{@link klaper.core.ParamVariable#getParam <em>Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(FormalParam value);

} // ParamVariable
