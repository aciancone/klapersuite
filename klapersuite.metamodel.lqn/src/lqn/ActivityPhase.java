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
 * A representation of the model object '<em><b>Activity Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.ActivityPhase#getPhase <em>Phase</em>}</li>
 *   <li>{@link lqn.ActivityPhase#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link lqn.ActivityPhase#getAsynchCall <em>Asynch Call</em>}</li>
 *   <li>{@link lqn.ActivityPhase#getCallList <em>Call List</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getActivityPhase()
 * @model
 * @generated
 */
public interface ActivityPhase extends ActivityDefBase {
	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(int)
	 * @see lqn.LqnPackage#getActivityPhase_Phase()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getPhase();

	/**
	 * Sets the value of the '{@link lqn.ActivityPhase#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(int value);

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
	 * @see lqn.LqnPackage#getActivityPhase_SynchCall()
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
	 * @see lqn.LqnPackage#getActivityPhase_AsynchCall()
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
	 * @see lqn.LqnPackage#getActivityPhase_CallList()
	 * @model containment="true"
	 * @generated
	 */
	EList<CallList> getCallList();

} // ActivityPhase
