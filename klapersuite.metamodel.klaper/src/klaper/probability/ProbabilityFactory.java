/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see klaper.probability.ProbabilityPackage
 * @generated
 */
public interface ProbabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProbabilityFactory eINSTANCE = klaper.probability.impl.ProbabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Distribution Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distribution Function</em>'.
	 * @generated
	 */
	ProbabilityDistributionFunction createProbabilityDistributionFunction();

	/**
	 * Returns a new object of class '<em>Normal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal</em>'.
	 * @generated
	 */
	Normal createNormal();

	/**
	 * Returns a new object of class '<em>Poisson</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poisson</em>'.
	 * @generated
	 */
	Poisson createPoisson();

	/**
	 * Returns a new object of class '<em>Uniform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniform</em>'.
	 * @generated
	 */
	Uniform createUniform();

	/**
	 * Returns a new object of class '<em>Exponential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exponential</em>'.
	 * @generated
	 */
	Exponential createExponential();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>Histogram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Histogram</em>'.
	 * @generated
	 */
	Histogram createHistogram();

	/**
	 * Returns a new object of class '<em>Histogram Sample</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Histogram Sample</em>'.
	 * @generated
	 */
	HistogramSample createHistogramSample();

	/**
	 * Returns a new object of class '<em>Geometric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometric</em>'.
	 * @generated
	 */
	Geometric createGeometric();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProbabilityPackage getProbabilityPackage();

} //ProbabilityFactory
