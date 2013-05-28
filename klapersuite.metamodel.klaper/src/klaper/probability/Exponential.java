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
 * A representation of the model object '<em><b>Exponential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.probability.Exponential#getMean <em>Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.probability.ProbabilityPackage#getExponential()
 * @model
 * @generated
 */
public interface Exponential extends ProbabilityDistributionFunction {
	/**
	 * Returns the value of the '<em><b>Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' containment reference.
	 * @see #setMean(Expression)
	 * @see klaper.probability.ProbabilityPackage#getExponential_Mean()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMean();

	/**
	 * Sets the value of the '{@link klaper.probability.Exponential#getMean <em>Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' containment reference.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(Expression value);

} // Exponential
