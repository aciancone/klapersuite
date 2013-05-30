/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package q4bpmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link q4bpmn.PropertyModel#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see q4bpmn.Q4bpmnPackage#getPropertyModel()
 * @model
 * @generated
 */
public interface PropertyModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link q4bpmn.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see q4bpmn.Q4bpmnPackage#getPropertyModel_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // PropertyModel
