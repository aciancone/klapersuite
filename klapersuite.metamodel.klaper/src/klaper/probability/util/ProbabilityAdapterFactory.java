/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.util;

import klaper.probability.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see klaper.probability.ProbabilityPackage
 * @generated
 */
public class ProbabilityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProbabilityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProbabilityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilitySwitch<Adapter> modelSwitch =
		new ProbabilitySwitch<Adapter>() {
			@Override
			public Adapter caseProbabilityDistributionFunction(ProbabilityDistributionFunction object) {
				return createProbabilityDistributionFunctionAdapter();
			}
			@Override
			public Adapter caseNormal(Normal object) {
				return createNormalAdapter();
			}
			@Override
			public Adapter casePoisson(Poisson object) {
				return createPoissonAdapter();
			}
			@Override
			public Adapter caseUniform(Uniform object) {
				return createUniformAdapter();
			}
			@Override
			public Adapter caseExponential(Exponential object) {
				return createExponentialAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseHistogram(Histogram object) {
				return createHistogramAdapter();
			}
			@Override
			public Adapter caseHistogramSample(HistogramSample object) {
				return createHistogramSampleAdapter();
			}
			@Override
			public Adapter caseGeometric(Geometric object) {
				return createGeometricAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link klaper.probability.ProbabilityDistributionFunction <em>Distribution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klaper.probability.ProbabilityDistributionFunction
	 * @generated
	 */
	public Adapter createProbabilityDistributionFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klaper.probability.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klaper.probability.Normal
	 * @generated
	 */
	public Adapter createNormalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klaper.probability.Poisson <em>Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klaper.probability.Poisson
	 * @generated
	 */
	public Adapter createPoissonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klaper.probability.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klaper.probability.Uniform
	 * @generated
	 */
	public Adapter createUniformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klaper.probability.Exponential <em>Exponential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klaper.probability.Exponential
	 * @generated
	 */
	public Adapter createExponentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klaper.probability.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klaper.probability.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klaper.probability.Histogram <em>Histogram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klaper.probability.Histogram
	 * @generated
	 */
	public Adapter createHistogramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klaper.probability.HistogramSample <em>Histogram Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klaper.probability.HistogramSample
	 * @generated
	 */
	public Adapter createHistogramSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link klaper.probability.Geometric <em>Geometric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see klaper.probability.Geometric
	 * @generated
	 */
	public Adapter createGeometricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProbabilityAdapterFactory
