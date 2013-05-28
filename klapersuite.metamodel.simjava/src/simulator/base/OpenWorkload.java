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
 * A representation of the model object '<em><b>Open Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.base.OpenWorkload#getArrivalProcess <em>Arrival Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.base.BasePackage#getOpenWorkload()
 * @model
 * @generated
 */
public interface OpenWorkload extends Workload {
	/**
	 * Returns the value of the '<em><b>Arrival Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Process</em>' containment reference.
	 * @see #setArrivalProcess(ProbabilityDistributionFunction)
	 * @see simulator.base.BasePackage#getOpenWorkload_ArrivalProcess()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProbabilityDistributionFunction getArrivalProcess();

	/**
	 * Sets the value of the '{@link simulator.base.OpenWorkload#getArrivalProcess <em>Arrival Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Process</em>' containment reference.
	 * @see #getArrivalProcess()
	 * @generated
	 */
	void setArrivalProcess(ProbabilityDistributionFunction value);

} // OpenWorkload
