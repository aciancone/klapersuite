/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.Resource#getName <em>Name</em>}</li>
 *   <li>{@link klaper.core.Resource#getType <em>Type</em>}</li>
 *   <li>{@link klaper.core.Resource#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link klaper.core.Resource#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link klaper.core.Resource#getDescription <em>Description</em>}</li>
 *   <li>{@link klaper.core.Resource#getOfferedService <em>Offered Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
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
	 * @see klaper.core.CorePackage#getResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link klaper.core.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see klaper.core.CorePackage#getResource_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link klaper.core.Resource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(double)
	 * @see klaper.core.CorePackage#getResource_Capacity()
	 * @model default="1"
	 * @generated
	 */
	double getCapacity();

	/**
	 * Sets the value of the '{@link klaper.core.Resource#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(double value);

	/**
	 * Returns the value of the '<em><b>Scheduling Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link klaper.core.SchedulingPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Policy</em>' attribute.
	 * @see klaper.core.SchedulingPolicyKind
	 * @see #setSchedulingPolicy(SchedulingPolicyKind)
	 * @see klaper.core.CorePackage#getResource_SchedulingPolicy()
	 * @model
	 * @generated
	 */
	SchedulingPolicyKind getSchedulingPolicy();

	/**
	 * Sets the value of the '{@link klaper.core.Resource#getSchedulingPolicy <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Policy</em>' attribute.
	 * @see klaper.core.SchedulingPolicyKind
	 * @see #getSchedulingPolicy()
	 * @generated
	 */
	void setSchedulingPolicy(SchedulingPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see klaper.core.CorePackage#getResource_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link klaper.core.Resource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Offered Service</b></em>' containment reference list.
	 * The list contents are of type {@link klaper.core.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Service</em>' containment reference list.
	 * @see klaper.core.CorePackage#getResource_OfferedService()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getOfferedService();

} // Resource
