/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability;

import klaper.expr.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.probability.Uniform#getMin <em>Min</em>}</li>
 *   <li>{@link klaper.probability.Uniform#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.probability.ProbabilityPackage#getUniform()
 * @model
 * @generated
 */
public interface Uniform extends ProbabilityDistributionFunction {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(Expression)
	 * @see klaper.probability.ProbabilityPackage#getUniform_Min()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMin();

	/**
	 * Sets the value of the '{@link klaper.probability.Uniform#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Expression value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(Expression)
	 * @see klaper.probability.ProbabilityPackage#getUniform_Max()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMax();

	/**
	 * Sets the value of the '{@link klaper.probability.Uniform#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Expression value);

} // Uniform
