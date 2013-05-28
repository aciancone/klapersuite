/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.distribution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.distribution.Normal#getMean <em>Mean</em>}</li>
 *   <li>{@link simulator.distribution.Normal#getVariance <em>Variance</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.distribution.DistributionPackage#getNormal()
 * @model
 * @generated
 */
public interface Normal extends ProbabilityDistributionFunction {
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
	 * @see simulator.distribution.DistributionPackage#getNormal_Mean()
	 * @model required="true"
	 * @generated
	 */
	double getMean();

	/**
	 * Sets the value of the '{@link simulator.distribution.Normal#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(double value);

	/**
	 * Returns the value of the '<em><b>Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variance</em>' attribute.
	 * @see #setVariance(double)
	 * @see simulator.distribution.DistributionPackage#getNormal_Variance()
	 * @model
	 * @generated
	 */
	double getVariance();

	/**
	 * Sets the value of the '{@link simulator.distribution.Normal#getVariance <em>Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variance</em>' attribute.
	 * @see #getVariance()
	 * @generated
	 */
	void setVariance(double value);

} // Normal
