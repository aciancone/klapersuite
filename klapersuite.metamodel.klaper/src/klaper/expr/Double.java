/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.expr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.expr.Double#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.expr.ExprPackage#getDouble()
 * @model
 * @generated
 */
public interface Double extends klaper.expr.Number {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see klaper.expr.ExprPackage#getDouble_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link klaper.expr.Double#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Double
