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
 * A representation of the model object '<em><b>Discrete Fail Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.base.DiscreteFailMode#getInternalFailTime <em>Internal Fail Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.base.BasePackage#getDiscreteFailMode()
 * @model
 * @generated
 */
public interface DiscreteFailMode extends FailMode {
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
	 * @see simulator.base.BasePackage#getDiscreteFailMode_InternalFailTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProbabilityDistributionFunction getInternalFailTime();

	/**
	 * Sets the value of the '{@link simulator.base.DiscreteFailMode#getInternalFailTime <em>Internal Fail Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Fail Time</em>' containment reference.
	 * @see #getInternalFailTime()
	 * @generated
	 */
	void setInternalFailTime(ProbabilityDistributionFunction value);

} // DiscreteFailMode
