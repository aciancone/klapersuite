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
 * A representation of the model object '<em><b>Klaper Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.KlaperModel#getResource <em>Resource</em>}</li>
 *   <li>{@link klaper.core.KlaperModel#getWorkload <em>Workload</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getKlaperModel()
 * @model
 * @generated
 */
public interface KlaperModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link klaper.core.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see klaper.core.CorePackage#getKlaperModel_Resource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResource();

	/**
	 * Returns the value of the '<em><b>Workload</b></em>' containment reference list.
	 * The list contents are of type {@link klaper.core.Workload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' containment reference list.
	 * @see klaper.core.CorePackage#getKlaperModel_Workload()
	 * @model containment="true"
	 * @generated
	 */
	EList<Workload> getWorkload();

} // KlaperModel
