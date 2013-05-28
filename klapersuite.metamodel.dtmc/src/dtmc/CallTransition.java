/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dtmc.CallTransition#getInvokedTransition <em>Invoked Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see dtmc.DtmcPackage#getCallTransition()
 * @model
 * @generated
 */
public interface CallTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Invoked Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dtmc.InvokedTransition#getCallTransition <em>Call Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoked Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoked Transition</em>' reference.
	 * @see #setInvokedTransition(InvokedTransition)
	 * @see dtmc.DtmcPackage#getCallTransition_InvokedTransition()
	 * @see dtmc.InvokedTransition#getCallTransition
	 * @model opposite="callTransition" required="true"
	 * @generated
	 */
	InvokedTransition getInvokedTransition();

	/**
	 * Sets the value of the '{@link dtmc.CallTransition#getInvokedTransition <em>Invoked Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoked Transition</em>' reference.
	 * @see #getInvokedTransition()
	 * @generated
	 */
	void setInvokedTransition(InvokedTransition value);

} // CallTransition
