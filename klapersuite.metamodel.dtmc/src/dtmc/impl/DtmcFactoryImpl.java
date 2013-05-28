/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc.impl;

import dtmc.*;

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
public class DtmcFactoryImpl extends EFactoryImpl implements DtmcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DtmcFactory init() {
		try {
			DtmcFactory theDtmcFactory = (DtmcFactory)EPackage.Registry.INSTANCE.getEFactory("http://klaper.sourceforge.net/metamodels/dtmc/1.0"); 
			if (theDtmcFactory != null) {
				return theDtmcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DtmcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtmcFactoryImpl() {
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
			case DtmcPackage.DTMC: return createDtmc();
			case DtmcPackage.NODE: return createNode();
			case DtmcPackage.SYNCHRONIZED_TRANSITION: return createSynchronizedTransition();
			case DtmcPackage.MODULE: return createModule();
			case DtmcPackage.CALL_TRANSITION: return createCallTransition();
			case DtmcPackage.INVOKED_TRANSITION: return createInvokedTransition();
			case DtmcPackage.STANDARD_TRANSITION: return createStandardTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dtmc createDtmc() {
		DtmcImpl dtmc = new DtmcImpl();
		return dtmc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizedTransition createSynchronizedTransition() {
		SynchronizedTransitionImpl synchronizedTransition = new SynchronizedTransitionImpl();
		return synchronizedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTransition createCallTransition() {
		CallTransitionImpl callTransition = new CallTransitionImpl();
		return callTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokedTransition createInvokedTransition() {
		InvokedTransitionImpl invokedTransition = new InvokedTransitionImpl();
		return invokedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardTransition createStandardTransition() {
		StandardTransitionImpl standardTransition = new StandardTransitionImpl();
		return standardTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtmcPackage getDtmcPackage() {
		return (DtmcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DtmcPackage getPackage() {
		return DtmcPackage.eINSTANCE;
	}

} //DtmcFactoryImpl
