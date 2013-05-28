/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.distribution.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simulator.distribution.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DistributionFactoryImpl extends EFactoryImpl implements DistributionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DistributionFactory init() {
		try {
			DistributionFactory theDistributionFactory = (DistributionFactory)EPackage.Registry.INSTANCE.getEFactory("http://klaper.sourceforge.net/metamodels/simulator/1.0/distribution"); 
			if (theDistributionFactory != null) {
				return theDistributionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DistributionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionFactoryImpl() {
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
			case DistributionPackage.PROBABILITY_DISTRIBUTION_FUNCTION: return createProbabilityDistributionFunction();
			case DistributionPackage.NORMAL: return createNormal();
			case DistributionPackage.POISSON: return createPoisson();
			case DistributionPackage.UNIFORM: return createUniform();
			case DistributionPackage.EXPONENTIAL: return createExponential();
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
	public DistributionPackage getDistributionPackage() {
		return (DistributionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DistributionPackage getPackage() {
		return DistributionPackage.eINSTANCE;
	}

} //DistributionFactoryImpl
