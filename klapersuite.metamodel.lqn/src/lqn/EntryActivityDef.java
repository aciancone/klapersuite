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
 * A representation of the model object '<em><b>Entry Activity Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.EntryActivityDef#getFirstActivity <em>First Activity</em>}</li>
 *   <li>{@link lqn.EntryActivityDef#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link lqn.EntryActivityDef#getAsynchCall <em>Asynch Call</em>}</li>
 *   <li>{@link lqn.EntryActivityDef#getCallList <em>Call List</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getEntryActivityDef()
 * @model
 * @generated
 */
public interface EntryActivityDef extends ActivityDefBase {
	/**
	 * Returns the value of the '<em><b>First Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Activity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Activity</em>' attribute.
	 * @see #setFirstActivity(String)
	 * @see lqn.LqnPackage#getEntryActivityDef_FirstActivity()
	 * @model unique="false"
	 * @generated
	 */
	String getFirstActivity();

	/**
	 * Sets the value of the '{@link lqn.EntryActivityDef#getFirstActivity <em>First Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Activity</em>' attribute.
	 * @see #getFirstActivity()
	 * @generated
	 */
	void setFirstActivity(String value);

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
	 * @see lqn.LqnPackage#getEntryActivityDef_SynchCall()
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
	 * @see lqn.LqnPackage#getEntryActivityDef_AsynchCall()
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
	 * @see lqn.LqnPackage#getEntryActivityDef_CallList()
	 * @model containment="true"
	 * @generated
	 */
	EList<CallList> getCallList();

} // EntryActivityDef
