/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoked Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dtmc.InvokedTransition#getCallTransition <em>Call Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see dtmc.DtmcPackage#getInvokedTransition()
 * @model
 * @generated
 */
public interface InvokedTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Call Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dtmc.CallTransition#getInvokedTransition <em>Invoked Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Transition</em>' reference.
	 * @see #setCallTransition(CallTransition)
	 * @see dtmc.DtmcPackage#getInvokedTransition_CallTransition()
	 * @see dtmc.CallTransition#getInvokedTransition
	 * @model opposite="invokedTransition" required="true"
	 * @generated
	 */
	CallTransition getCallTransition();

	/**
	 * Sets the value of the '{@link dtmc.InvokedTransition#getCallTransition <em>Call Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Transition</em>' reference.
	 * @see #getCallTransition()
	 * @generated
	 */
	void setCallTransition(CallTransition value);

} // InvokedTransition
