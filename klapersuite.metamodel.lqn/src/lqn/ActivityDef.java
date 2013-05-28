/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.ActivityDef#getBoundToEntry <em>Bound To Entry</em>}</li>
 *   <li>{@link lqn.ActivityDef#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link lqn.ActivityDef#getAsynchCall <em>Asynch Call</em>}</li>
 *   <li>{@link lqn.ActivityDef#getCallList <em>Call List</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getActivityDef()
 * @model
 * @generated
 */
public interface ActivityDef extends ActivityDefBase {
	/**
	 * Returns the value of the '<em><b>Bound To Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound To Entry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound To Entry</em>' attribute.
	 * @see #setBoundToEntry(String)
	 * @see lqn.LqnPackage#getActivityDef_BoundToEntry()
	 * @model unique="false"
	 * @generated
	 */
	String getBoundToEntry();

	/**
	 * Sets the value of the '{@link lqn.ActivityDef#getBoundToEntry <em>Bound To Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound To Entry</em>' attribute.
	 * @see #getBoundToEntry()
	 * @generated
	 */
	void setBoundToEntry(String value);

	/**
	 * Returns the value of the '<em><b>Synch Call</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.ActivityMakingCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synch Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synch Call</em>' containment reference list.
	 * @see lqn.LqnPackage#getActivityDef_SynchCall()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityMakingCall> getSynchCall();

	/**
	 * Returns the value of the '<em><b>Asynch Call</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.ActivityMakingCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asynch Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynch Call</em>' containment reference list.
	 * @see lqn.LqnPackage#getActivityDef_AsynchCall()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityMakingCall> getAsynchCall();

	/**
	 * Returns the value of the '<em><b>Call List</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.CallList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call List</em>' containment reference list.
	 * @see lqn.LqnPackage#getActivityDef_CallList()
	 * @model containment="true"
	 * @generated
	 */
	EList<CallList> getCallList();

} // ActivityDef
