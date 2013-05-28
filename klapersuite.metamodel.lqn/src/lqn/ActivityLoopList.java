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
 * A representation of the model object '<em><b>Activity Loop List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.ActivityLoopList#getEnd <em>End</em>}</li>
 *   <li>{@link lqn.ActivityLoopList#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getActivityLoopList()
 * @model
 * @generated
 */
public interface ActivityLoopList extends EObject {
	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see lqn.LqnPackage#getActivityLoopList_End()
	 * @model unique="false"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link lqn.ActivityLoopList#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.ActivityLoop}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see lqn.LqnPackage#getActivityLoopList_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActivityLoop> getActivity();

} // ActivityLoopList
