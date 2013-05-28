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
 * A representation of the model object '<em><b>Call List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.CallList#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link lqn.CallList#getAsynchCall <em>Asynch Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getCallList()
 * @model
 * @generated
 */
public interface CallList extends EObject {
	/**
	 * Returns the value of the '<em><b>Synch Call</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.SynchCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synch Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synch Call</em>' containment reference list.
	 * @see lqn.LqnPackage#getCallList_SynchCall()
	 * @model containment="true"
	 * @generated
	 */
	EList<SynchCall> getSynchCall();

	/**
	 * Returns the value of the '<em><b>Asynch Call</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.AsynchCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asynch Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynch Call</em>' containment reference list.
	 * @see lqn.LqnPackage#getCallList_AsynchCall()
	 * @model containment="true"
	 * @generated
	 */
	EList<AsynchCall> getAsynchCall();

} // CallList
