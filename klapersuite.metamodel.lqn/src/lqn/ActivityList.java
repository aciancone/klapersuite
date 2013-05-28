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
 * A representation of the model object '<em><b>Activity List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.ActivityList#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getActivityList()
 * @model
 * @generated
 */
public interface ActivityList extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see lqn.LqnPackage#getActivityList_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivity();

} // ActivityList
