/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Wake</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.base.ServiceWake#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.base.BasePackage#getServiceWake()
 * @model
 * @generated
 */
public interface ServiceWake extends Step {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Wait)
	 * @see simulator.base.BasePackage#getServiceWake_Signal()
	 * @model required="true"
	 * @generated
	 */
	Wait getSignal();

	/**
	 * Sets the value of the '{@link simulator.base.ServiceWake#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Wait value);

} // ServiceWake
