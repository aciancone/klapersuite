/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.distribution.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simulator.base.BasePackage;

import simulator.base.impl.BasePackageImpl;

import simulator.distribution.DistributionFactory;
import simulator.distribution.DistributionPackage;
import simulator.distribution.Exponential;
import simulator.distribution.Normal;
import simulator.distribution.Poisson;
import simulator.distribution.ProbabilityDistributionFunction;
import simulator.distribution.Uniform;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DistributionPackageImpl extends EPackageImpl implements DistributionPackage {
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
	 * @see simulator.distribution.DistributionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DistributionPackageImpl() {
		super(eNS_URI, DistributionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DistributionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DistributionPackage init() {
		if (isInited) return (DistributionPackage)EPackage.Registry.INSTANCE.getEPackage(DistributionPackage.eNS_URI);

		// Obtain or create and register package
		DistributionPackageImpl theDistributionPackage = (DistributionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DistributionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DistributionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);

		// Create package meta-data objects
		theDistributionPackage.createPackageContents();
		theBasePackage.createPackageContents();

		// Initialize created meta-data
		theDistributionPackage.initializePackageContents();
		theBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDistributionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DistributionPackage.eNS_URI, theDistributionPackage);
		return theDistributionPackage;
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
	public EAttribute getNormal_Mean() {
		return (EAttribute)normalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormal_Variance() {
		return (EAttribute)normalEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getPoisson_Mean() {
		return (EAttribute)poissonEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getUniform_Min() {
		return (EAttribute)uniformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniform_Max() {
		return (EAttribute)uniformEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getExponential_Mean() {
		return (EAttribute)exponentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionFactory getDistributionFactory() {
		return (DistributionFactory)getEFactoryInstance();
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
		createEAttribute(normalEClass, NORMAL__MEAN);
		createEAttribute(normalEClass, NORMAL__VARIANCE);

		poissonEClass = createEClass(POISSON);
		createEAttribute(poissonEClass, POISSON__MEAN);

		uniformEClass = createEClass(UNIFORM);
		createEAttribute(uniformEClass, UNIFORM__MIN);
		createEAttribute(uniformEClass, UNIFORM__MAX);

		exponentialEClass = createEClass(EXPONENTIAL);
		createEAttribute(exponentialEClass, EXPONENTIAL__MEAN);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		normalEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());
		poissonEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());
		uniformEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());
		exponentialEClass.getESuperTypes().add(this.getProbabilityDistributionFunction());

		// Initialize classes and features; add operations and parameters
		initEClass(probabilityDistributionFunctionEClass, ProbabilityDistributionFunction.class, "ProbabilityDistributionFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalEClass, Normal.class, "Normal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormal_Mean(), ecorePackage.getEDouble(), "mean", null, 1, 1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormal_Variance(), ecorePackage.getEDouble(), "variance", null, 0, 1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poissonEClass, Poisson.class, "Poisson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoisson_Mean(), ecorePackage.getEDouble(), "mean", null, 0, 1, Poisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniformEClass, Uniform.class, "Uniform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniform_Min(), ecorePackage.getEDouble(), "min", null, 0, 1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniform_Max(), ecorePackage.getEDouble(), "max", null, 0, 1, Uniform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exponentialEClass, Exponential.class, "Exponential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExponential_Mean(), ecorePackage.getEDouble(), "mean", null, 0, 1, Exponential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DistributionPackageImpl
