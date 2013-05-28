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
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.Transition#getTo <em>To</em>}</li>
 *   <li>{@link klaper.core.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link klaper.core.Transition#getProb <em>Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link klaper.core.Step#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Step)
	 * @see klaper.core.CorePackage#getTransition_To()
	 * @see klaper.core.Step#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	Step getTo();

	/**
	 * Sets the value of the '{@link klaper.core.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Step value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link klaper.core.Step#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Step)
	 * @see klaper.core.CorePackage#getTransition_From()
	 * @see klaper.core.Step#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	Step getFrom();

	/**
	 * Sets the value of the '{@link klaper.core.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Step value);

	/**
	 * Returns the value of the '<em><b>Prob</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob</em>' attribute.
	 * @see #setProb(double)
	 * @see klaper.core.CorePackage#getTransition_Prob()
	 * @model default="1.0"
	 * @generated
	 */
	double getProb();

	/**
	 * Sets the value of the '{@link klaper.core.Transition#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' attribute.
	 * @see #getProb()
	 * @generated
	 */
	void setProb(double value);

} // Transition
