/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Making Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.EntryMakingCall#getProb <em>Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getEntryMakingCall()
 * @model
 * @generated
 */
public interface EntryMakingCall extends MakingCall {
	/**
	 * Returns the value of the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob</em>' attribute.
	 * @see #setProb(double)
	 * @see lqn.LqnPackage#getEntryMakingCall_Prob()
	 * @model unique="false" required="true"
	 * @generated
	 */
	double getProb();

	/**
	 * Sets the value of the '{@link lqn.EntryMakingCall#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' attribute.
	 * @see #getProb()
	 * @generated
	 */
	void setProb(double value);

} // EntryMakingCall
