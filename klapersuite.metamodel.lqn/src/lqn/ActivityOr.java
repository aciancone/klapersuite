/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.ActivityOr#getProb <em>Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getActivityOr()
 * @model
 * @generated
 */
public interface ActivityOr extends Activity {
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
	 * @see lqn.LqnPackage#getActivityOr_Prob()
	 * @model unique="false"
	 * @generated
	 */
	double getProb();

	/**
	 * Sets the value of the '{@link lqn.ActivityOr#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' attribute.
	 * @see #getProb()
	 * @generated
	 */
	void setProb(double value);

} // ActivityOr
