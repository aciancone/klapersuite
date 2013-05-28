/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Fail Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.base.ContinuousFailMode#getInternalFailProb <em>Internal Fail Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.base.BasePackage#getContinuousFailMode()
 * @model
 * @generated
 */
public interface ContinuousFailMode extends FailMode {
	/**
	 * Returns the value of the '<em><b>Internal Fail Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Fail Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Fail Prob</em>' attribute.
	 * @see #setInternalFailProb(double)
	 * @see simulator.base.BasePackage#getContinuousFailMode_InternalFailProb()
	 * @model required="true"
	 * @generated
	 */
	double getInternalFailProb();

	/**
	 * Sets the value of the '{@link simulator.base.ContinuousFailMode#getInternalFailProb <em>Internal Fail Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Fail Prob</em>' attribute.
	 * @see #getInternalFailProb()
	 * @generated
	 */
	void setInternalFailProb(double value);

} // ContinuousFailMode
