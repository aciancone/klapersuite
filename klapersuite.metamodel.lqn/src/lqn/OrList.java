/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.OrList#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getOrList()
 * @model
 * @generated
 */
public interface OrList extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.ActivityOr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see lqn.LqnPackage#getOrList_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActivityOr> getActivity();

} // OrList
