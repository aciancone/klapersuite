/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import klaper.expr.Expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.ActualParam#getName <em>Name</em>}</li>
 *   <li>{@link klaper.core.ActualParam#getFormal <em>Formal</em>}</li>
 *   <li>{@link klaper.core.ActualParam#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getActualParam()
 * @model
 * @generated
 */
public interface ActualParam extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see klaper.core.CorePackage#getActualParam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link klaper.core.ActualParam#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link klaper.core.FormalParam#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal</em>' reference.
	 * @see #setFormal(FormalParam)
	 * @see klaper.core.CorePackage#getActualParam_Formal()
	 * @see klaper.core.FormalParam#getActual
	 * @model opposite="actual" required="true"
	 * @generated
	 */
	FormalParam getFormal();

	/**
	 * Sets the value of the '{@link klaper.core.ActualParam#getFormal <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' reference.
	 * @see #getFormal()
	 * @generated
	 */
	void setFormal(FormalParam value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see klaper.core.CorePackage#getActualParam_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link klaper.core.ActualParam#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // ActualParam
