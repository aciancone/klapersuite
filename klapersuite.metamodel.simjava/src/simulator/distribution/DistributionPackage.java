/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.distribution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see simulator.distribution.DistributionFactory
 * @model kind="package"
 * @generated
 */
public interface DistributionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "distribution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://klaper.sourceforge.net/metamodels/simulator/1.0/distribution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulator.distribution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DistributionPackage eINSTANCE = simulator.distribution.impl.DistributionPackageImpl.init();

	/**
	 * The meta object id for the '{@link simulator.distribution.impl.ProbabilityDistributionFunctionImpl <em>Probability Distribution Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.distribution.impl.ProbabilityDistributionFunctionImpl
	 * @see simulator.distribution.impl.DistributionPackageImpl#getProbabilityDistributionFunction()
	 * @generated
	 */
	int PROBABILITY_DISTRIBUTION_FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Probability Distribution Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulator.distribution.impl.NormalImpl <em>Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.distribution.impl.NormalImpl
	 * @see simulator.distribution.impl.DistributionPackageImpl#getNormal()
	 * @generated
	 */
	int NORMAL = 1;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__MEAN = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__VARIANCE = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FEATURE_COUNT = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simulator.distribution.impl.PoissonImpl <em>Poisson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.distribution.impl.PoissonImpl
	 * @see simulator.distribution.impl.DistributionPackageImpl#getPoisson()
	 * @generated
	 */
	int POISSON = 2;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON__MEAN = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Poisson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_FEATURE_COUNT = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.distribution.impl.UniformImpl <em>Uniform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.distribution.impl.UniformImpl
	 * @see simulator.distribution.impl.DistributionPackageImpl#getUniform()
	 * @generated
	 */
	int UNIFORM = 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__MIN = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__MAX = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uniform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_FEATURE_COUNT = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simulator.distribution.impl.ExponentialImpl <em>Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.distribution.impl.ExponentialImpl
	 * @see simulator.distribution.impl.DistributionPackageImpl#getExponential()
	 * @generated
	 */
	int EXPONENTIAL = 4;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL__MEAN = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exponential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPONENTIAL_FEATURE_COUNT = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link simulator.distribution.ProbabilityDistributionFunction <em>Probability Distribution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probability Distribution Function</em>'.
	 * @see simulator.distribution.ProbabilityDistributionFunction
	 * @generated
	 */
	EClass getProbabilityDistributionFunction();

	/**
	 * Returns the meta object for class '{@link simulator.distribution.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal</em>'.
	 * @see simulator.distribution.Normal
	 * @generated
	 */
	EClass getNormal();

	/**
	 * Returns the meta object for the attribute '{@link simulator.distribution.Normal#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see simulator.distribution.Normal#getMean()
	 * @see #getNormal()
	 * @generated
	 */
	EAttribute getNormal_Mean();

	/**
	 * Returns the meta object for the attribute '{@link simulator.distribution.Normal#getVariance <em>Variance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variance</em>'.
	 * @see simulator.distribution.Normal#getVariance()
	 * @see #getNormal()
	 * @generated
	 */
	EAttribute getNormal_Variance();

	/**
	 * Returns the meta object for class '{@link simulator.distribution.Poisson <em>Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poisson</em>'.
	 * @see simulator.distribution.Poisson
	 * @generated
	 */
	EClass getPoisson();

	/**
	 * Returns the meta object for the attribute '{@link simulator.distribution.Poisson#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see simulator.distribution.Poisson#getMean()
	 * @see #getPoisson()
	 * @generated
	 */
	EAttribute getPoisson_Mean();

	/**
	 * Returns the meta object for class '{@link simulator.distribution.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform</em>'.
	 * @see simulator.distribution.Uniform
	 * @generated
	 */
	EClass getUniform();

	/**
	 * Returns the meta object for the attribute '{@link simulator.distribution.Uniform#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see simulator.distribution.Uniform#getMin()
	 * @see #getUniform()
	 * @generated
	 */
	EAttribute getUniform_Min();

	/**
	 * Returns the meta object for the attribute '{@link simulator.distribution.Uniform#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see simulator.distribution.Uniform#getMax()
	 * @see #getUniform()
	 * @generated
	 */
	EAttribute getUniform_Max();

	/**
	 * Returns the meta object for class '{@link simulator.distribution.Exponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential</em>'.
	 * @see simulator.distribution.Exponential
	 * @generated
	 */
	EClass getExponential();

	/**
	 * Returns the meta object for the attribute '{@link simulator.distribution.Exponential#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see simulator.distribution.Exponential#getMean()
	 * @see #getExponential()
	 * @generated
	 */
	EAttribute getExponential_Mean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DistributionFactory getDistributionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link simulator.distribution.impl.ProbabilityDistributionFunctionImpl <em>Probability Distribution Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.distribution.impl.ProbabilityDistributionFunctionImpl
		 * @see simulator.distribution.impl.DistributionPackageImpl#getProbabilityDistributionFunction()
		 * @generated
		 */
		EClass PROBABILITY_DISTRIBUTION_FUNCTION = eINSTANCE.getProbabilityDistributionFunction();

		/**
		 * The meta object literal for the '{@link simulator.distribution.impl.NormalImpl <em>Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.distribution.impl.NormalImpl
		 * @see simulator.distribution.impl.DistributionPackageImpl#getNormal()
		 * @generated
		 */
		EClass NORMAL = eINSTANCE.getNormal();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL__MEAN = eINSTANCE.getNormal_Mean();

		/**
		 * The meta object literal for the '<em><b>Variance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NORMAL__VARIANCE = eINSTANCE.getNormal_Variance();

		/**
		 * The meta object literal for the '{@link simulator.distribution.impl.PoissonImpl <em>Poisson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.distribution.impl.PoissonImpl
		 * @see simulator.distribution.impl.DistributionPackageImpl#getPoisson()
		 * @generated
		 */
		EClass POISSON = eINSTANCE.getPoisson();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POISSON__MEAN = eINSTANCE.getPoisson_Mean();

		/**
		 * The meta object literal for the '{@link simulator.distribution.impl.UniformImpl <em>Uniform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.distribution.impl.UniformImpl
		 * @see simulator.distribution.impl.DistributionPackageImpl#getUniform()
		 * @generated
		 */
		EClass UNIFORM = eINSTANCE.getUniform();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM__MIN = eINSTANCE.getUniform_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM__MAX = eINSTANCE.getUniform_Max();

		/**
		 * The meta object literal for the '{@link simulator.distribution.impl.ExponentialImpl <em>Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.distribution.impl.ExponentialImpl
		 * @see simulator.distribution.impl.DistributionPackageImpl#getExponential()
		 * @generated
		 */
		EClass EXPONENTIAL = eINSTANCE.getExponential();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPONENTIAL__MEAN = eINSTANCE.getExponential_Mean();

	}

} //DistributionPackage
