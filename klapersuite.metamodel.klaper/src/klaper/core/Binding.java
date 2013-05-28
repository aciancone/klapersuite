/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.Binding#getCall <em>Call</em>}</li>
 *   <li>{@link klaper.core.Binding#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call</em>' reference.
	 * @see #setCall(Service)
	 * @see klaper.core.CorePackage#getBinding_Call()
	 * @model
	 * @generated
	 */
	Service getCall();

	/**
	 * Sets the value of the '{@link klaper.core.Binding#getCall <em>Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call</em>' reference.
	 * @see #getCall()
	 * @generated
	 */
	void setCall(Service value);

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
	 * @see klaper.core.CorePackage#getBinding_Signal()
	 * @model
	 * @generated
	 */
	Wait getSignal();

	/**
	 * Sets the value of the '{@link klaper.core.Binding#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Wait value);

} // Binding
