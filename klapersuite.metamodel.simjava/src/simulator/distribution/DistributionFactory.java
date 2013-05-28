/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.distribution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simulator.distribution.DistributionPackage
 * @generated
 */
public interface DistributionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DistributionFactory eINSTANCE = simulator.distribution.impl.DistributionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Probability Distribution Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probability Distribution Function</em>'.
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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DistributionPackage getDistributionPackage();

} //DistributionFactory
