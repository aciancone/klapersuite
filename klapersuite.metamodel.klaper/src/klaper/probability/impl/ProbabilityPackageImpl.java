/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.impl;

import klaper.core.CorePackage;

import klaper.core.impl.CorePackageImpl;

import klaper.expr.ExprPackage;

import klaper.expr.impl.ExprPackageImpl;

import klaper.probability.Constant;
import klaper.probability.Exponential;
import klaper.probability.Geometric;
import klaper.probability.Histogram;
import klaper.probability.HistogramSample;
import klaper.probability.Normal;
import klaper.probability.Poisson;
import klaper.probability.ProbabilityDistributionFunction;
import klaper.probability.ProbabilityFactory;
import klaper.probability.ProbabilityPackage;
import klaper.probability.Uniform;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbabilityPackageImpl extends EPackageImpl implements ProbabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilityDistributionFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poissonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass histogramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass histogramSampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometricEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see klaper.probability.ProbabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProbabilityPackageImpl() {
		super(eNS_URI, ProbabilityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProbabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProbabilityPackage init() {
		if (isInited) return (ProbabilityPackage)EPackage.Registry.INSTANCE.getEPackage(ProbabilityPackage.eNS_URI);

		// Obtain or create and register package
		ProbabilityPackageImpl theProbabilityPackage = (ProbabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProbabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProbabilityPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ExprPackageImpl theExprPackage = (ExprPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExprPackage.eNS_URI) instanceof ExprPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExprPackage.eNS_URI) : ExprPackage.eINSTANCE);

		// Create package meta-data objects
		theProbabilityPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExprPackage.createPackageContents();

		// Initialize created meta-data
		theProbabilityPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExprPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProbabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProbabilityPackage.eNS_URI, theProbabilityPackage);
		return theProbabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbabilityDistributionFunction() {
		return probabilityDistributionFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormal() {
		return normalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormal_Mean() {
		return (EReference)normalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNormal_StandDev() {
		return (EReference)normalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoisson() {
		return poissonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoisson_Mean() {
		return (EReference)poissonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniform() {
		return uniformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniform_Min() {
		return (EReference)uniformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniform_Max() {
		return (EReference)uniformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponential() {
		return exponentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExponential_Mean() {
		return (EReference)exponentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstant_Value() {
		return (EReference)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistogram() {
		return histogramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistogram_Samples() {
		return (EReference)histogramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistogramSample() {
		return histogramSampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramSample_Value() {
		return (EAttribute)histogramSampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistogramSample_Probability() {
		return (EAttribute)histogramSampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometric() {
		return geometricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometric_Mean() {
		return (EReference)geometricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityFactory getProbabilityFactory() {
		return (ProbabilityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		probabilityDistributionFunctionEClass = createEClass(PROBABILITY_DISTRIBUTION_FUNCTION);

		normalEClass = createEClass(NORMAL);
		createEReference(normalEClass, NORMAL__MEAN);
		createEReference(normalEClass, NORMAL__STAND_DEV);

		poissonEClass = createEClass(POISSON);
		createEReference(poissonEClass, POISSON__MEAN);

		uniformEClass = createEClass(UNIFORM);
		createEReference(uniformEClass, UNIFORM__MIN);
		createEReference(uniformEClass, UNIFORM__MAX);

		exponentialEClass = createEClass(EXPONENTIAL);
		createEReference(exponentialEClass, EXPONENTIAL__MEAN);

		constantEClass = createEClass(CONSTANT);
		createEReference(constantEClass, CONSTANT__VALUE);

		histogramEClass = createEClass(HISTOGRAM);
		createEReference(histogramEClass, HISTOGRAM__SAMPLES);

		histogramSampleEClass = createEClass(HISTOGRAM_SAMPLE);
		createEAttribute(histogramSampleEClass, HISTOGRAM_SAMPLE__VALUE);
		createEAttribute(histogramSampleEClass, HISTOGRAM_SAMPLE__PROBABILITY);

		geometricEClass = createEClass(GEOMETRIC);
		createEReference(geometricEClass, GEOMETRIC__MEAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExprPackage theExprPackage = (ExprPackage)EPackage.Registry.INSTANCE.getEPackage(ExprPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		normalEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());
		poissonEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());
		uniformEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());
		exponentialEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());
		constantEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());
		histogramEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());
		geometricEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());

		// Initialize classes and features; add operations and parameters
		initEClass(probabilityDistributionFunctionEClass, ProbabilityDistributionFunction.class, "ProbabilityDistributionFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalEClass, Normal.class, "Normal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormal_Mean(), theExprPackage.getExpression(), null, "mean", null, 1, 1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormal_StandDev(), theExprPackage.getExpression(), null, "standDev", null, 1, 1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poissonEClass, Poisson.class, "Poisson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoisson_Mean(), theExprPackage.getExpression(), null, "mean", null, 1, 1, Poisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniformEClass, Uniform.class, "Uniform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniform_Min(), theExprPackage.getExpression(), null, "min", null, 1, 1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniform_Max(), theExprPackage.getExpression(), null, "max", null, 1, 1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialEClass, Exponential.class, "Exponential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExponential_Mean(), theExprPackage.getExpression(), null, "mean", null, 1, 1, Exponential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstant_Value(), theExprPackage.getExpression(), null, "value", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramEClass, Histogram.class, "Histogram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistogram_Samples(), this.getHistogramSample(), null, "samples", null, 1, -1, Histogram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(histogramSampleEClass, HistogramSample.class, "HistogramSample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistogramSample_Value(), ecorePackage.getEInt(), "value", null, 1, 1, HistogramSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistogramSample_Probability(), ecorePackage.getEDouble(), "probability", null, 1, 1, HistogramSample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometricEClass, Geometric.class, "Geometric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeometric_Mean(), theExprPackage.getExpression(), null, "mean", null, 1, 1, Geometric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProbabilityPackageImpl
