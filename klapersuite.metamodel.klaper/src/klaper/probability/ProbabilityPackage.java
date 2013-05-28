/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see klaper.probability.ProbabilityFactory
 * @model kind="package"
 * @generated
 */
public interface ProbabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "probability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://klaper.sourceforge.net/metamodels/klaper/1.0/probability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "klaper.probability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProbabilityPackage eINSTANCE = klaper.probability.impl.ProbabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link klaper.probability.impl.ProbabilityDistributionFunctionImpl <em>Distribution Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.probability.impl.ProbabilityDistributionFunctionImpl
	 * @see klaper.probability.impl.ProbabilityPackageImpl#getProbabilityDistributionFunction()
	 * @generated
	 */
	int PROBABILITY_DISTRIBUTION_FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Distribution Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link klaper.probability.impl.NormalImpl <em>Normal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.probability.impl.NormalImpl
	 * @see klaper.probability.impl.ProbabilityPackageImpl#getNormal()
	 * @generated
	 */
	int NORMAL = 1;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__MEAN = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stand Dev</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL__STAND_DEV = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_FEATURE_COUNT = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link klaper.probability.impl.PoissonImpl <em>Poisson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.probability.impl.PoissonImpl
	 * @see klaper.probability.impl.ProbabilityPackageImpl#getPoisson()
	 * @generated
	 */
	int POISSON = 2;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' containment reference.
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
	 * The meta object id for the '{@link klaper.probability.impl.UniformImpl <em>Uniform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.probability.impl.UniformImpl
	 * @see klaper.probability.impl.ProbabilityPackageImpl#getUniform()
	 * @generated
	 */
	int UNIFORM = 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__MIN = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
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
	 * The meta object id for the '{@link klaper.probability.impl.ExponentialImpl <em>Exponential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.probability.impl.ExponentialImpl
	 * @see klaper.probability.impl.ProbabilityPackageImpl#getExponential()
	 * @generated
	 */
	int EXPONENTIAL = 4;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' containment reference.
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
	 * The meta object id for the '{@link klaper.probability.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.probability.impl.ConstantImpl
	 * @see klaper.probability.impl.ProbabilityPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link klaper.probability.impl.HistogramImpl <em>Histogram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.probability.impl.HistogramImpl
	 * @see klaper.probability.impl.ProbabilityPackageImpl#getHistogram()
	 * @generated
	 */
	int HISTOGRAM = 6;

	/**
	 * The feature id for the '<em><b>Samples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM__SAMPLES = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Histogram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_FEATURE_COUNT = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link klaper.probability.impl.HistogramSampleImpl <em>Histogram Sample</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.probability.impl.HistogramSampleImpl
	 * @see klaper.probability.impl.ProbabilityPackageImpl#getHistogramSample()
	 * @generated
	 */
	int HISTOGRAM_SAMPLE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_SAMPLE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_SAMPLE__PROBABILITY = 1;

	/**
	 * The number of structural features of the '<em>Histogram Sample</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTOGRAM_SAMPLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link klaper.probability.impl.GeometricImpl <em>Geometric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.probability.impl.GeometricImpl
	 * @see klaper.probability.impl.ProbabilityPackageImpl#getGeometric()
	 * @generated
	 */
	int GEOMETRIC = 8;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC__MEAN = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geometric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIC_FEATURE_COUNT = PROBABILITY_DISTRIBUTION_FUNCTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link klaper.probability.ProbabilityDistributionFunction <em>Distribution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Function</em>'.
	 * @see klaper.probability.ProbabilityDistributionFunction
	 * @generated
	 */
	EClass getProbabilityDistributionFunction();

	/**
	 * Returns the meta object for class '{@link klaper.probability.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal</em>'.
	 * @see klaper.probability.Normal
	 * @generated
	 */
	EClass getNormal();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.probability.Normal#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean</em>'.
	 * @see klaper.probability.Normal#getMean()
	 * @see #getNormal()
	 * @generated
	 */
	EReference getNormal_Mean();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.probability.Normal#getStandDev <em>Stand Dev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stand Dev</em>'.
	 * @see klaper.probability.Normal#getStandDev()
	 * @see #getNormal()
	 * @generated
	 */
	EReference getNormal_StandDev();

	/**
	 * Returns the meta object for class '{@link klaper.probability.Poisson <em>Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poisson</em>'.
	 * @see klaper.probability.Poisson
	 * @generated
	 */
	EClass getPoisson();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.probability.Poisson#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean</em>'.
	 * @see klaper.probability.Poisson#getMean()
	 * @see #getPoisson()
	 * @generated
	 */
	EReference getPoisson_Mean();

	/**
	 * Returns the meta object for class '{@link klaper.probability.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform</em>'.
	 * @see klaper.probability.Uniform
	 * @generated
	 */
	EClass getUniform();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.probability.Uniform#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see klaper.probability.Uniform#getMin()
	 * @see #getUniform()
	 * @generated
	 */
	EReference getUniform_Min();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.probability.Uniform#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see klaper.probability.Uniform#getMax()
	 * @see #getUniform()
	 * @generated
	 */
	EReference getUniform_Max();

	/**
	 * Returns the meta object for class '{@link klaper.probability.Exponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exponential</em>'.
	 * @see klaper.probability.Exponential
	 * @generated
	 */
	EClass getExponential();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.probability.Exponential#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean</em>'.
	 * @see klaper.probability.Exponential#getMean()
	 * @see #getExponential()
	 * @generated
	 */
	EReference getExponential_Mean();

	/**
	 * Returns the meta object for class '{@link klaper.probability.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see klaper.probability.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.probability.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see klaper.probability.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Value();

	/**
	 * Returns the meta object for class '{@link klaper.probability.Histogram <em>Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram</em>'.
	 * @see klaper.probability.Histogram
	 * @generated
	 */
	EClass getHistogram();

	/**
	 * Returns the meta object for the containment reference list '{@link klaper.probability.Histogram#getSamples <em>Samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samples</em>'.
	 * @see klaper.probability.Histogram#getSamples()
	 * @see #getHistogram()
	 * @generated
	 */
	EReference getHistogram_Samples();

	/**
	 * Returns the meta object for class '{@link klaper.probability.HistogramSample <em>Histogram Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Histogram Sample</em>'.
	 * @see klaper.probability.HistogramSample
	 * @generated
	 */
	EClass getHistogramSample();

	/**
	 * Returns the meta object for the attribute '{@link klaper.probability.HistogramSample#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see klaper.probability.HistogramSample#getValue()
	 * @see #getHistogramSample()
	 * @generated
	 */
	EAttribute getHistogramSample_Value();

	/**
	 * Returns the meta object for the attribute '{@link klaper.probability.HistogramSample#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see klaper.probability.HistogramSample#getProbability()
	 * @see #getHistogramSample()
	 * @generated
	 */
	EAttribute getHistogramSample_Probability();

	/**
	 * Returns the meta object for class '{@link klaper.probability.Geometric <em>Geometric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometric</em>'.
	 * @see klaper.probability.Geometric
	 * @generated
	 */
	EClass getGeometric();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.probability.Geometric#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mean</em>'.
	 * @see klaper.probability.Geometric#getMean()
	 * @see #getGeometric()
	 * @generated
	 */
	EReference getGeometric_Mean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProbabilityFactory getProbabilityFactory();

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
		 * The meta object literal for the '{@link klaper.probability.impl.ProbabilityDistributionFunctionImpl <em>Distribution Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.probability.impl.ProbabilityDistributionFunctionImpl
		 * @see klaper.probability.impl.ProbabilityPackageImpl#getProbabilityDistributionFunction()
		 * @generated
		 */
		EClass PROBABILITY_DISTRIBUTION_FUNCTION = eINSTANCE.getProbabilityDistributionFunction();

		/**
		 * The meta object literal for the '{@link klaper.probability.impl.NormalImpl <em>Normal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.probability.impl.NormalImpl
		 * @see klaper.probability.impl.ProbabilityPackageImpl#getNormal()
		 * @generated
		 */
		EClass NORMAL = eINSTANCE.getNormal();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL__MEAN = eINSTANCE.getNormal_Mean();

		/**
		 * The meta object literal for the '<em><b>Stand Dev</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL__STAND_DEV = eINSTANCE.getNormal_StandDev();

		/**
		 * The meta object literal for the '{@link klaper.probability.impl.PoissonImpl <em>Poisson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.probability.impl.PoissonImpl
		 * @see klaper.probability.impl.ProbabilityPackageImpl#getPoisson()
		 * @generated
		 */
		EClass POISSON = eINSTANCE.getPoisson();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POISSON__MEAN = eINSTANCE.getPoisson_Mean();

		/**
		 * The meta object literal for the '{@link klaper.probability.impl.UniformImpl <em>Uniform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.probability.impl.UniformImpl
		 * @see klaper.probability.impl.ProbabilityPackageImpl#getUniform()
		 * @generated
		 */
		EClass UNIFORM = eINSTANCE.getUniform();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFORM__MIN = eINSTANCE.getUniform_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFORM__MAX = eINSTANCE.getUniform_Max();

		/**
		 * The meta object literal for the '{@link klaper.probability.impl.ExponentialImpl <em>Exponential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.probability.impl.ExponentialImpl
		 * @see klaper.probability.impl.ProbabilityPackageImpl#getExponential()
		 * @generated
		 */
		EClass EXPONENTIAL = eINSTANCE.getExponential();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPONENTIAL__MEAN = eINSTANCE.getExponential_Mean();

		/**
		 * The meta object literal for the '{@link klaper.probability.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.probability.impl.ConstantImpl
		 * @see klaper.probability.impl.ProbabilityPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link klaper.probability.impl.HistogramImpl <em>Histogram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.probability.impl.HistogramImpl
		 * @see klaper.probability.impl.ProbabilityPackageImpl#getHistogram()
		 * @generated
		 */
		EClass HISTOGRAM = eINSTANCE.getHistogram();

		/**
		 * The meta object literal for the '<em><b>Samples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTOGRAM__SAMPLES = eINSTANCE.getHistogram_Samples();

		/**
		 * The meta object literal for the '{@link klaper.probability.impl.HistogramSampleImpl <em>Histogram Sample</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.probability.impl.HistogramSampleImpl
		 * @see klaper.probability.impl.ProbabilityPackageImpl#getHistogramSample()
		 * @generated
		 */
		EClass HISTOGRAM_SAMPLE = eINSTANCE.getHistogramSample();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_SAMPLE__VALUE = eINSTANCE.getHistogramSample_Value();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTOGRAM_SAMPLE__PROBABILITY = eINSTANCE.getHistogramSample_Probability();

		/**
		 * The meta object literal for the '{@link klaper.probability.impl.GeometricImpl <em>Geometric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.probability.impl.GeometricImpl
		 * @see klaper.probability.impl.ProbabilityPackageImpl#getGeometric()
		 * @generated
		 */
		EClass GEOMETRIC = eINSTANCE.getGeometric();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRIC__MEAN = eINSTANCE.getGeometric_Mean();

	}

} //ProbabilityPackage
