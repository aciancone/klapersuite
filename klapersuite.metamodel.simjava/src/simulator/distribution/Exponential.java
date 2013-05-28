/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.distribution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.distribution.Exponential#getMean <em>Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.distribution.DistributionPackage#getExponential()
 * @model
 * @generated
 */
public interface Exponential extends ProbabilityDistributionFunction {
	/**
	 * Returns the value of the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' attribute.
	 * @see #setMean(double)
	 * @see simulator.distribution.DistributionPackage#getExponential_Mean()
	 * @model
	 * @generated
	 */
	double getMean();

	/**
	 * Sets the value of the '{@link simulator.distribution.Exponential#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(double value);

} // Exponential
