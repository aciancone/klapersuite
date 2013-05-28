/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import klaper.probability.ProbabilityDistributionFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.Activity#getNestedBehavior <em>Nested Behavior</em>}</li>
 *   <li>{@link klaper.core.Activity#getInternalExecTime <em>Internal Exec Time</em>}</li>
 *   <li>{@link klaper.core.Activity#getInternalFailProb <em>Internal Fail Prob</em>}</li>
 *   <li>{@link klaper.core.Activity#getInternalFailTime <em>Internal Fail Time</em>}</li>
 *   <li>{@link klaper.core.Activity#getRepetitions <em>Repetitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Step {
	/**
	 * Returns the value of the '<em><b>Nested Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Behavior</em>' containment reference.
	 * @see #setNestedBehavior(Behavior)
	 * @see klaper.core.CorePackage#getActivity_NestedBehavior()
	 * @model containment="true"
	 * @generated
	 */
	Behavior getNestedBehavior();

	/**
	 * Sets the value of the '{@link klaper.core.Activity#getNestedBehavior <em>Nested Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Behavior</em>' containment reference.
	 * @see #getNestedBehavior()
	 * @generated
	 */
	void setNestedBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Internal Exec Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Exec Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Exec Time</em>' containment reference.
	 * @see #setInternalExecTime(ProbabilityDistributionFunction)
	 * @see klaper.core.CorePackage#getActivity_InternalExecTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProbabilityDistributionFunction getInternalExecTime();

	/**
	 * Sets the value of the '{@link klaper.core.Activity#getInternalExecTime <em>Internal Exec Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Exec Time</em>' containment reference.
	 * @see #getInternalExecTime()
	 * @generated
	 */
	void setInternalExecTime(ProbabilityDistributionFunction value);

	/**
	 * Returns the value of the '<em><b>Internal Fail Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Fail Prob</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Fail Prob</em>' containment reference.
	 * @see #setInternalFailProb(ProbabilityDistributionFunction)
	 * @see klaper.core.CorePackage#getActivity_InternalFailProb()
	 * @model containment="true"
	 * @generated
	 */
	ProbabilityDistributionFunction getInternalFailProb();

	/**
	 * Sets the value of the '{@link klaper.core.Activity#getInternalFailProb <em>Internal Fail Prob</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Fail Prob</em>' containment reference.
	 * @see #getInternalFailProb()
	 * @generated
	 */
	void setInternalFailProb(ProbabilityDistributionFunction value);

	/**
	 * Returns the value of the '<em><b>Internal Fail Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Fail Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Fail Time</em>' containment reference.
	 * @see #setInternalFailTime(ProbabilityDistributionFunction)
	 * @see klaper.core.CorePackage#getActivity_InternalFailTime()
	 * @model containment="true"
	 * @generated
	 */
	ProbabilityDistributionFunction getInternalFailTime();

	/**
	 * Sets the value of the '{@link klaper.core.Activity#getInternalFailTime <em>Internal Fail Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Fail Time</em>' containment reference.
	 * @see #getInternalFailTime()
	 * @generated
	 */
	void setInternalFailTime(ProbabilityDistributionFunction value);

	/**
	 * Returns the value of the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetitions</em>' containment reference.
	 * @see #setRepetitions(ProbabilityDistributionFunction)
	 * @see klaper.core.CorePackage#getActivity_Repetitions()
	 * @model containment="true"
	 * @generated
	 */
	ProbabilityDistributionFunction getRepetitions();

	/**
	 * Sets the value of the '{@link klaper.core.Activity#getRepetitions <em>Repetitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetitions</em>' containment reference.
	 * @see #getRepetitions()
	 * @generated
	 */
	void setRepetitions(ProbabilityDistributionFunction value);

} // Activity
