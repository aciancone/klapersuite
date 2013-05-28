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
 * A representation of the model object '<em><b>And Join List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.AndJoinList#getQuorum <em>Quorum</em>}</li>
 *   <li>{@link lqn.AndJoinList#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getAndJoinList()
 * @model
 * @generated
 */
public interface AndJoinList extends EObject {
	/**
	 * Returns the value of the '<em><b>Quorum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quorum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quorum</em>' attribute.
	 * @see #setQuorum(int)
	 * @see lqn.LqnPackage#getAndJoinList_Quorum()
	 * @model unique="false"
	 * @generated
	 */
	int getQuorum();

	/**
	 * Sets the value of the '{@link lqn.AndJoinList#getQuorum <em>Quorum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quorum</em>' attribute.
	 * @see #getQuorum()
	 * @generated
	 */
	void setQuorum(int value);

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
	 * @see lqn.LqnPackage#getAndJoinList_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getActivity();

} // AndJoinList
