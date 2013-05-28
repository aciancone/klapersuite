/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import klaper.probability.ProbabilityDistributionFunction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.Workload#getType <em>Type</em>}</li>
 *   <li>{@link klaper.core.Workload#getPopulation <em>Population</em>}</li>
 *   <li>{@link klaper.core.Workload#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link klaper.core.Workload#getArrivalProcess <em>Arrival Process</em>}</li>
 *   <li>{@link klaper.core.Workload#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getWorkload()
 * @model
 * @generated
 */
public interface Workload extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link klaper.core.WorkloadType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see klaper.core.WorkloadType
	 * @see #setType(WorkloadType)
	 * @see klaper.core.CorePackage#getWorkload_Type()
	 * @model
	 * @generated
	 */
	WorkloadType getType();

	/**
	 * Sets the value of the '{@link klaper.core.Workload#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see klaper.core.WorkloadType
	 * @see #getType()
	 * @generated
	 */
	void setType(WorkloadType value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' attribute.
	 * @see #setPopulation(int)
	 * @see klaper.core.CorePackage#getWorkload_Population()
	 * @model
	 * @generated
	 */
	int getPopulation();

	/**
	 * Sets the value of the '{@link klaper.core.Workload#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(int value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(Behavior)
	 * @see klaper.core.CorePackage#getWorkload_Behavior()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link klaper.core.Workload#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

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
	 * @see klaper.core.CorePackage#getWorkload_ArrivalProcess()
	 * @model containment="true"
	 * @generated
	 */
	ProbabilityDistributionFunction getArrivalProcess();

	/**
	 * Sets the value of the '{@link klaper.core.Workload#getArrivalProcess <em>Arrival Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Process</em>' containment reference.
	 * @see #getArrivalProcess()
	 * @generated
	 */
	void setArrivalProcess(ProbabilityDistributionFunction value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see klaper.core.CorePackage#getWorkload_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link klaper.core.Workload#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Workload
