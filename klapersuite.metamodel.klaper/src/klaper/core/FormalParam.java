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
 * A representation of the model object '<em><b>Formal Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.FormalParam#getName <em>Name</em>}</li>
 *   <li>{@link klaper.core.FormalParam#isReturn <em>Return</em>}</li>
 *   <li>{@link klaper.core.FormalParam#getActual <em>Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getFormalParam()
 * @model
 * @generated
 */
public interface FormalParam extends EObject {
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
	 * @see klaper.core.CorePackage#getFormalParam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link klaper.core.FormalParam#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' attribute.
	 * @see #setReturn(boolean)
	 * @see klaper.core.CorePackage#getFormalParam_Return()
	 * @model
	 * @generated
	 */
	boolean isReturn();

	/**
	 * Sets the value of the '{@link klaper.core.FormalParam#isReturn <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' attribute.
	 * @see #isReturn()
	 * @generated
	 */
	void setReturn(boolean value);

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link klaper.core.ActualParam#getFormal <em>Formal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual</em>' reference.
	 * @see #setActual(ActualParam)
	 * @see klaper.core.CorePackage#getFormalParam_Actual()
	 * @see klaper.core.ActualParam#getFormal
	 * @model opposite="formal"
	 * @generated
	 */
	ActualParam getActual();

	/**
	 * Sets the value of the '{@link klaper.core.FormalParam#getActual <em>Actual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(ActualParam value);

} // FormalParam
