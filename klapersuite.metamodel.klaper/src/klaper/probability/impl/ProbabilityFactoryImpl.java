/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.impl;

import klaper.probability.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbabilityFactoryImpl extends EFactoryImpl implements ProbabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProbabilityFactory init() {
		try {
			ProbabilityFactory theProbabilityFactory = (ProbabilityFactory)EPackage.Registry.INSTANCE.getEFactory("http://klaper.sourceforge.net/metamodels/klaper/1.0/probability"); 
			if (theProbabilityFactory != null) {
				return theProbabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProbabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProbabilityPackage.PROBABILITY_DISTRIBUTION_FUNCTION: return createProbabilityDistributionFunction();
			case ProbabilityPackage.NORMAL: return createNormal();
			case ProbabilityPackage.POISSON: return createPoisson();
			case ProbabilityPackage.UNIFORM: return createUniform();
			case ProbabilityPackage.EXPONENTIAL: return createExponential();
			case ProbabilityPackage.CONSTANT: return createConstant();
			case ProbabilityPackage.HISTOGRAM: return createHistogram();
			case ProbabilityPackage.HISTOGRAM_SAMPLE: return createHistogramSample();
			case ProbabilityPackage.GEOMETRIC: return createGeometric();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistributionFunction createProbabilityDistributionFunction() {
		ProbabilityDistributionFunctionImpl probabilityDistributionFunction = new ProbabilityDistributionFunctionImpl();
		return probabilityDistributionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Normal createNormal() {
		NormalImpl normal = new NormalImpl();
		return normal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Poisson createPoisson() {
		PoissonImpl poisson = new PoissonImpl();
		return poisson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uniform createUniform() {
		UniformImpl uniform = new UniformImpl();
		return uniform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exponential createExponential() {
		ExponentialImpl exponential = new ExponentialImpl();
		return exponential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Histogram createHistogram() {
		HistogramImpl histogram = new HistogramImpl();
		return histogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramSample createHistogramSample() {
		HistogramSampleImpl histogramSample = new HistogramSampleImpl();
		return histogramSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometric createGeometric() {
		GeometricImpl geometric = new GeometricImpl();
		return geometric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityPackage getProbabilityPackage() {
		return (ProbabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProbabilityPackage getPackage() {
		return ProbabilityPackage.eINSTANCE;
	}

} //ProbabilityFactoryImpl
