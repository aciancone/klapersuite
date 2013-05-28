/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Making Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.ActivityMakingCall#getCallsMean <em>Calls Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getActivityMakingCall()
 * @model
 * @generated
 */
public interface ActivityMakingCall extends MakingCall {
	/**
	 * Returns the value of the '<em><b>Calls Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Mean</em>' attribute.
	 * @see #setCallsMean(double)
	 * @see lqn.LqnPackage#getActivityMakingCall_CallsMean()
	 * @model required="true"
	 * @generated
	 */
	double getCallsMean();

	/**
	 * Sets the value of the '{@link lqn.ActivityMakingCall#getCallsMean <em>Calls Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls Mean</em>' attribute.
	 * @see #getCallsMean()
	 * @generated
	 */
	void setCallsMean(double value);

} // ActivityMakingCall
