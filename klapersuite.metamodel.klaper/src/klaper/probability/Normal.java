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
 * A representation of the model object '<em><b>Normal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.probability.Normal#getMean <em>Mean</em>}</li>
 *   <li>{@link klaper.probability.Normal#getStandDev <em>Stand Dev</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.probability.ProbabilityPackage#getNormal()
 * @model
 * @generated
 */
public interface Normal extends ProbabilityDistributionFunction {
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
	 * @see klaper.probability.ProbabilityPackage#getNormal_Mean()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMean();

	/**
	 * Sets the value of the '{@link klaper.probability.Normal#getMean <em>Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' containment reference.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(Expression value);

	/**
	 * Returns the value of the '<em><b>Stand Dev</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stand Dev</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stand Dev</em>' containment reference.
	 * @see #setStandDev(Expression)
	 * @see klaper.probability.ProbabilityPackage#getNormal_StandDev()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getStandDev();

	/**
	 * Sets the value of the '{@link klaper.probability.Normal#getStandDev <em>Stand Dev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stand Dev</em>' containment reference.
	 * @see #getStandDev()
	 * @generated
	 */
	void setStandDev(Expression value);

} // Normal
