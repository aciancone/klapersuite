/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base;

import simulator.distribution.ProbabilityDistributionFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.base.Activity#getRepetitions <em>Repetitions</em>}</li>
 *   <li>{@link simulator.base.Activity#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link simulator.base.Activity#getFailMode <em>Fail Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.base.BasePackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Step {
	/**
	 * Returns the value of the '<em><b>Repetitions</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetitions</em>' attribute.
	 * @see #setRepetitions(int)
	 * @see simulator.base.BasePackage#getActivity_Repetitions()
	 * @model default="1"
	 * @generated
	 */
	int getRepetitions();

	/**
	 * Sets the value of the '{@link simulator.base.Activity#getRepetitions <em>Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetitions</em>' attribute.
	 * @see #getRepetitions()
	 * @generated
	 */
	void setRepetitions(int value);

	/**
	 * Returns the value of the '<em><b>Service Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Time</em>' containment reference.
	 * @see #setServiceTime(ProbabilityDistributionFunction)
	 * @see simulator.base.BasePackage#getActivity_ServiceTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProbabilityDistributionFunction getServiceTime();

	/**
	 * Sets the value of the '{@link simulator.base.Activity#getServiceTime <em>Service Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Time</em>' containment reference.
	 * @see #getServiceTime()
	 * @generated
	 */
	void setServiceTime(ProbabilityDistributionFunction value);

	/**
	 * Returns the value of the '<em><b>Fail Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Mode</em>' containment reference.
	 * @see #setFailMode(FailMode)
	 * @see simulator.base.BasePackage#getActivity_FailMode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FailMode getFailMode();

	/**
	 * Sets the value of the '{@link simulator.base.Activity#getFailMode <em>Fail Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Mode</em>' containment reference.
	 * @see #getFailMode()
	 * @generated
	 */
	void setFailMode(FailMode value);

} // Activity
