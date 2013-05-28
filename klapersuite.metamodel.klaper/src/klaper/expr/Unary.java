/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.expr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.expr.Unary#getOperator <em>Operator</em>}</li>
 *   <li>{@link klaper.expr.Unary#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.expr.ExprPackage#getUnary()
 * @model
 * @generated
 */
public interface Unary extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Minus)
	 * @see klaper.expr.ExprPackage#getUnary_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Minus getOperator();

	/**
	 * Sets the value of the '{@link klaper.expr.Unary#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Minus value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Expression)
	 * @see klaper.expr.ExprPackage#getUnary_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getElement();

	/**
	 * Sets the value of the '{@link klaper.expr.Unary#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Expression value);

} // Unary
