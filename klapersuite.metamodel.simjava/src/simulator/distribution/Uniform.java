/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.distribution;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.distribution.Uniform#getMin <em>Min</em>}</li>
 *   <li>{@link simulator.distribution.Uniform#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.distribution.DistributionPackage#getUniform()
 * @model
 * @generated
 */
public interface Uniform extends ProbabilityDistributionFunction {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(double)
	 * @see simulator.distribution.DistributionPackage#getUniform_Min()
	 * @model
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link simulator.distribution.Uniform#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(double)
	 * @see simulator.distribution.DistributionPackage#getUniform_Max()
	 * @model
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link simulator.distribution.Uniform#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

} // Uniform
