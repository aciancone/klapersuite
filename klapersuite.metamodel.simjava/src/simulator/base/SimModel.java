/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sim Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.base.SimModel#getWorkload <em>Workload</em>}</li>
 *   <li>{@link simulator.base.SimModel#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.base.BasePackage#getSimModel()
 * @model
 * @generated
 */
public interface SimModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Workload</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.base.Workload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload</em>' containment reference list.
	 * @see simulator.base.BasePackage#getSimModel_Workload()
	 * @model containment="true"
	 * @generated
	 */
	EList<Workload> getWorkload();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link simulator.base.ResourceQueue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see simulator.base.BasePackage#getSimModel_Resource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceQueue> getResource();

} // SimModel
