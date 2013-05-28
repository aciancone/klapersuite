/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simulator.base.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseFactoryImpl extends EFactoryImpl implements BaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaseFactory init() {
		try {
			BaseFactory theBaseFactory = (BaseFactory)EPackage.Registry.INSTANCE.getEFactory("http://klaper.sourceforge.net/metamodels/simulator/1.0/base"); 
			if (theBaseFactory != null) {
				return theBaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl() {
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
			case BasePackage.SIM_MODEL: return createSimModel();
			case BasePackage.WORKLOAD: return createWorkload();
			case BasePackage.SERVICE: return createService();
			case BasePackage.RESOURCE_QUEUE: return createResourceQueue();
			case BasePackage.STEP: return createStep();
			case BasePackage.TRANSITION: return createTransition();
			case BasePackage.START: return createStart();
			case BasePackage.END: return createEnd();
			case BasePackage.ACTIVITY: return createActivity();
			case BasePackage.DISCRETE_FAIL_MODE: return createDiscreteFailMode();
			case BasePackage.CONTINUOUS_FAIL_MODE: return createContinuousFailMode();
			case BasePackage.FAIL_MODE: return createFailMode();
			case BasePackage.SERVICE_CALL: return createServiceCall();
			case BasePackage.SYNCH_SERVICE_CALL: return createSynchServiceCall();
			case BasePackage.ASYNCH_SERVICE_CALL: return createAsynchServiceCall();
			case BasePackage.BRANCH: return createBranch();
			case BasePackage.JOIN: return createJoin();
			case BasePackage.FORK: return createFork();
			case BasePackage.WAIT: return createWait();
			case BasePackage.OPEN_WORKLOAD: return createOpenWorkload();
			case BasePackage.CLOSED_WORKLOAD: return createClosedWorkload();
			case BasePackage.EXTERNAL_SERVICE: return createExternalService();
			case BasePackage.SERVICE_WAKE: return createServiceWake();
			case BasePackage.ECLASS0: return createEClass0();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimModel createSimModel() {
		SimModelImpl simModel = new SimModelImpl();
		return simModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workload createWorkload() {
		WorkloadImpl workload = new WorkloadImpl();
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceQueue createResourceQueue() {
		ResourceQueueImpl resourceQueue = new ResourceQueueImpl();
		return resourceQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteFailMode createDiscreteFailMode() {
		DiscreteFailModeImpl discreteFailMode = new DiscreteFailModeImpl();
		return discreteFailMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousFailMode createContinuousFailMode() {
		ContinuousFailModeImpl continuousFailMode = new ContinuousFailModeImpl();
		return continuousFailMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailMode createFailMode() {
		FailModeImpl failMode = new FailModeImpl();
		return failMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCall createServiceCall() {
		ServiceCallImpl serviceCall = new ServiceCallImpl();
		return serviceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchServiceCall createSynchServiceCall() {
		SynchServiceCallImpl synchServiceCall = new SynchServiceCallImpl();
		return synchServiceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchServiceCall createAsynchServiceCall() {
		AsynchServiceCallImpl asynchServiceCall = new AsynchServiceCallImpl();
		return asynchServiceCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fork createFork() {
		ForkImpl fork = new ForkImpl();
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait createWait() {
		WaitImpl wait = new WaitImpl();
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenWorkload createOpenWorkload() {
		OpenWorkloadImpl openWorkload = new OpenWorkloadImpl();
		return openWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedWorkload createClosedWorkload() {
		ClosedWorkloadImpl closedWorkload = new ClosedWorkloadImpl();
		return closedWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalService createExternalService() {
		ExternalServiceImpl externalService = new ExternalServiceImpl();
		return externalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceWake createServiceWake() {
		ServiceWakeImpl serviceWake = new ServiceWakeImpl();
		return serviceWake;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass0 createEClass0() {
		EClass0Impl eClass0 = new EClass0Impl();
		return eClass0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePackage getBasePackage() {
		return (BasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasePackage getPackage() {
		return BasePackage.eINSTANCE;
	}

} //BaseFactoryImpl
