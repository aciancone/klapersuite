/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.ActivityLoop#getCount <em>Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getActivityLoop()
 * @model
 * @generated
 */
public interface ActivityLoop extends Activity {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(double)
	 * @see lqn.LqnPackage#getActivityLoop_Count()
	 * @model unique="false" required="true"
	 * @generated
	 */
	double getCount();

	/**
	 * Sets the value of the '{@link lqn.ActivityLoop#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(double value);

} // ActivityLoop
