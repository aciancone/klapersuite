/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base;

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
 * @see simulator.base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://klaper.sourceforge.net/metamodels/simulator/1.0/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulator.base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = simulator.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link simulator.base.impl.SimModelImpl <em>Sim Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.SimModelImpl
	 * @see simulator.base.impl.BasePackageImpl#getSimModel()
	 * @generated
	 */
	int SIM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODEL__WORKLOAD = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODEL__RESOURCE = 1;

	/**
	 * The number of structural features of the '<em>Sim Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link simulator.base.impl.WorkloadImpl <em>Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.WorkloadImpl
	 * @see simulator.base.impl.BasePackageImpl#getWorkload()
	 * @generated
	 */
	int WORKLOAD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__STEP = 1;

	/**
	 * The number of structural features of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link simulator.base.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.ServiceImpl
	 * @see simulator.base.impl.BasePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__STEP = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link simulator.base.impl.ResourceQueueImpl <em>Resource Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.ResourceQueueImpl
	 * @see simulator.base.impl.BasePackageImpl#getResourceQueue()
	 * @generated
	 */
	int RESOURCE_QUEUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_QUEUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_QUEUE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_QUEUE__CAPACITY = 2;

	/**
	 * The feature id for the '<em><b>Offered Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_QUEUE__OFFERED_SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Resource Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_QUEUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link simulator.base.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.StepImpl
	 * @see simulator.base.impl.BasePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Out Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUT_TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link simulator.base.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.TransitionImpl
	 * @see simulator.base.impl.BasePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 1;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PROB = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link simulator.base.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.StartImpl
	 * @see simulator.base.impl.BasePackageImpl#getStart()
	 * @generated
	 */
	int START = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Out Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OUT_TRANSITION = STEP__OUT_TRANSITION;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.base.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.EndImpl
	 * @see simulator.base.impl.BasePackageImpl#getEnd()
	 * @generated
	 */
	int END = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Out Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__OUT_TRANSITION = STEP__OUT_TRANSITION;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.base.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.ActivityImpl
	 * @see simulator.base.impl.BasePackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Out Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUT_TRANSITION = STEP__OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REPETITIONS = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SERVICE_TIME = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fail Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FAIL_MODE = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = STEP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link simulator.base.impl.FailModeImpl <em>Fail Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.FailModeImpl
	 * @see simulator.base.impl.BasePackageImpl#getFailMode()
	 * @generated
	 */
	int FAIL_MODE = 11;

	/**
	 * The number of structural features of the '<em>Fail Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_MODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulator.base.impl.DiscreteFailModeImpl <em>Discrete Fail Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.DiscreteFailModeImpl
	 * @see simulator.base.impl.BasePackageImpl#getDiscreteFailMode()
	 * @generated
	 */
	int DISCRETE_FAIL_MODE = 9;

	/**
	 * The feature id for the '<em><b>Internal Fail Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME = FAIL_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Fail Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_FAIL_MODE_FEATURE_COUNT = FAIL_MODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.base.impl.ContinuousFailModeImpl <em>Continuous Fail Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.ContinuousFailModeImpl
	 * @see simulator.base.impl.BasePackageImpl#getContinuousFailMode()
	 * @generated
	 */
	int CONTINUOUS_FAIL_MODE = 10;

	/**
	 * The feature id for the '<em><b>Internal Fail Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_FAIL_MODE__INTERNAL_FAIL_PROB = FAIL_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continuous Fail Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_FAIL_MODE_FEATURE_COUNT = FAIL_MODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.base.impl.ServiceCallImpl <em>Service Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.ServiceCallImpl
	 * @see simulator.base.impl.BasePackageImpl#getServiceCall()
	 * @generated
	 */
	int SERVICE_CALL = 12;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL__SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CALL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link simulator.base.impl.SynchServiceCallImpl <em>Synch Service Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.SynchServiceCallImpl
	 * @see simulator.base.impl.BasePackageImpl#getSynchServiceCall()
	 * @generated
	 */
	int SYNCH_SERVICE_CALL = 13;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_SERVICE_CALL__SERVICE = SERVICE_CALL__SERVICE;

	/**
	 * The number of structural features of the '<em>Synch Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_SERVICE_CALL_FEATURE_COUNT = SERVICE_CALL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.base.impl.AsynchServiceCallImpl <em>Asynch Service Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.AsynchServiceCallImpl
	 * @see simulator.base.impl.BasePackageImpl#getAsynchServiceCall()
	 * @generated
	 */
	int ASYNCH_SERVICE_CALL = 14;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_SERVICE_CALL__SERVICE = SERVICE_CALL__SERVICE;

	/**
	 * The number of structural features of the '<em>Asynch Service Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_SERVICE_CALL_FEATURE_COUNT = SERVICE_CALL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.base.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.BranchImpl
	 * @see simulator.base.impl.BasePackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Out Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__OUT_TRANSITION = STEP__OUT_TRANSITION;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.base.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.JoinImpl
	 * @see simulator.base.impl.BasePackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Out Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OUT_TRANSITION = STEP__OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>NTransition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NTRANSITION = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__IN_TRANSITION = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simulator.base.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.ForkImpl
	 * @see simulator.base.impl.BasePackageImpl#getFork()
	 * @generated
	 */
	int FORK = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Out Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OUT_TRANSITION = STEP__OUT_TRANSITION;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.base.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.WaitImpl
	 * @see simulator.base.impl.BasePackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Out Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__OUT_TRANSITION = STEP__OUT_TRANSITION;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulator.base.impl.OpenWorkloadImpl <em>Open Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.OpenWorkloadImpl
	 * @see simulator.base.impl.BasePackageImpl#getOpenWorkload()
	 * @generated
	 */
	int OPEN_WORKLOAD = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__NAME = WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__STEP = WORKLOAD__STEP;

	/**
	 * The feature id for the '<em><b>Arrival Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD__ARRIVAL_PROCESS = WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_FEATURE_COUNT = WORKLOAD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.base.impl.ClosedWorkloadImpl <em>Closed Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.ClosedWorkloadImpl
	 * @see simulator.base.impl.BasePackageImpl#getClosedWorkload()
	 * @generated
	 */
	int CLOSED_WORKLOAD = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__NAME = WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__STEP = WORKLOAD__STEP;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD__POPULATION = WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Closed Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_FEATURE_COUNT = WORKLOAD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.base.impl.ExternalServiceImpl <em>External Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.ExternalServiceImpl
	 * @see simulator.base.impl.BasePackageImpl#getExternalService()
	 * @generated
	 */
	int EXTERNAL_SERVICE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Out Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__OUT_TRANSITION = STEP__OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Service Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__SERVICE_CALL = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fail Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE__FAIL_PROB = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SERVICE_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link simulator.base.impl.ServiceWakeImpl <em>Service Wake</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.ServiceWakeImpl
	 * @see simulator.base.impl.BasePackageImpl#getServiceWake()
	 * @generated
	 */
	int SERVICE_WAKE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_WAKE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Out Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_WAKE__OUT_TRANSITION = STEP__OUT_TRANSITION;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_WAKE__SIGNAL = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Wake</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_WAKE_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link simulator.base.impl.EClass0Impl <em>EClass0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulator.base.impl.EClass0Impl
	 * @see simulator.base.impl.BasePackageImpl#getEClass0()
	 * @generated
	 */
	int ECLASS0 = 23;

	/**
	 * The number of structural features of the '<em>EClass0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS0_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link simulator.base.SimModel <em>Sim Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Model</em>'.
	 * @see simulator.base.SimModel
	 * @generated
	 */
	EClass getSimModel();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.base.SimModel#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workload</em>'.
	 * @see simulator.base.SimModel#getWorkload()
	 * @see #getSimModel()
	 * @generated
	 */
	EReference getSimModel_Workload();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.base.SimModel#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see simulator.base.SimModel#getResource()
	 * @see #getSimModel()
	 * @generated
	 */
	EReference getSimModel_Resource();

	/**
	 * Returns the meta object for class '{@link simulator.base.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload</em>'.
	 * @see simulator.base.Workload
	 * @generated
	 */
	EClass getWorkload();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.Workload#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulator.base.Workload#getName()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.base.Workload#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see simulator.base.Workload#getStep()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_Step();

	/**
	 * Returns the meta object for class '{@link simulator.base.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see simulator.base.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulator.base.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see simulator.base.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.base.Service#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see simulator.base.Service#getStep()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Step();

	/**
	 * Returns the meta object for class '{@link simulator.base.ResourceQueue <em>Resource Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Queue</em>'.
	 * @see simulator.base.ResourceQueue
	 * @generated
	 */
	EClass getResourceQueue();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.ResourceQueue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulator.base.ResourceQueue#getName()
	 * @see #getResourceQueue()
	 * @generated
	 */
	EAttribute getResourceQueue_Name();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.ResourceQueue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see simulator.base.ResourceQueue#getDescription()
	 * @see #getResourceQueue()
	 * @generated
	 */
	EAttribute getResourceQueue_Description();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.ResourceQueue#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see simulator.base.ResourceQueue#getCapacity()
	 * @see #getResourceQueue()
	 * @generated
	 */
	EAttribute getResourceQueue_Capacity();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.base.ResourceQueue#getOfferedService <em>Offered Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Service</em>'.
	 * @see simulator.base.ResourceQueue#getOfferedService()
	 * @see #getResourceQueue()
	 * @generated
	 */
	EReference getResourceQueue_OfferedService();

	/**
	 * Returns the meta object for class '{@link simulator.base.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see simulator.base.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulator.base.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link simulator.base.Step#getOutTransition <em>Out Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Transition</em>'.
	 * @see simulator.base.Step#getOutTransition()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_OutTransition();

	/**
	 * Returns the meta object for class '{@link simulator.base.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see simulator.base.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link simulator.base.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see simulator.base.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the meta object for the reference '{@link simulator.base.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see simulator.base.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.Transition#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see simulator.base.Transition#getProb()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Prob();

	/**
	 * Returns the meta object for class '{@link simulator.base.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see simulator.base.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link simulator.base.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see simulator.base.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link simulator.base.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see simulator.base.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.Activity#getRepetitions <em>Repetitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetitions</em>'.
	 * @see simulator.base.Activity#getRepetitions()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Repetitions();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.base.Activity#getServiceTime <em>Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Time</em>'.
	 * @see simulator.base.Activity#getServiceTime()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_ServiceTime();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.base.Activity#getFailMode <em>Fail Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fail Mode</em>'.
	 * @see simulator.base.Activity#getFailMode()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_FailMode();

	/**
	 * Returns the meta object for class '{@link simulator.base.DiscreteFailMode <em>Discrete Fail Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Fail Mode</em>'.
	 * @see simulator.base.DiscreteFailMode
	 * @generated
	 */
	EClass getDiscreteFailMode();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.base.DiscreteFailMode#getInternalFailTime <em>Internal Fail Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal Fail Time</em>'.
	 * @see simulator.base.DiscreteFailMode#getInternalFailTime()
	 * @see #getDiscreteFailMode()
	 * @generated
	 */
	EReference getDiscreteFailMode_InternalFailTime();

	/**
	 * Returns the meta object for class '{@link simulator.base.ContinuousFailMode <em>Continuous Fail Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Fail Mode</em>'.
	 * @see simulator.base.ContinuousFailMode
	 * @generated
	 */
	EClass getContinuousFailMode();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.ContinuousFailMode#getInternalFailProb <em>Internal Fail Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Fail Prob</em>'.
	 * @see simulator.base.ContinuousFailMode#getInternalFailProb()
	 * @see #getContinuousFailMode()
	 * @generated
	 */
	EAttribute getContinuousFailMode_InternalFailProb();

	/**
	 * Returns the meta object for class '{@link simulator.base.FailMode <em>Fail Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fail Mode</em>'.
	 * @see simulator.base.FailMode
	 * @generated
	 */
	EClass getFailMode();

	/**
	 * Returns the meta object for class '{@link simulator.base.ServiceCall <em>Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Call</em>'.
	 * @see simulator.base.ServiceCall
	 * @generated
	 */
	EClass getServiceCall();

	/**
	 * Returns the meta object for the reference '{@link simulator.base.ServiceCall#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see simulator.base.ServiceCall#getService()
	 * @see #getServiceCall()
	 * @generated
	 */
	EReference getServiceCall_Service();

	/**
	 * Returns the meta object for class '{@link simulator.base.SynchServiceCall <em>Synch Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synch Service Call</em>'.
	 * @see simulator.base.SynchServiceCall
	 * @generated
	 */
	EClass getSynchServiceCall();

	/**
	 * Returns the meta object for class '{@link simulator.base.AsynchServiceCall <em>Asynch Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynch Service Call</em>'.
	 * @see simulator.base.AsynchServiceCall
	 * @generated
	 */
	EClass getAsynchServiceCall();

	/**
	 * Returns the meta object for class '{@link simulator.base.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see simulator.base.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for class '{@link simulator.base.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see simulator.base.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.Join#getNTransition <em>NTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NTransition</em>'.
	 * @see simulator.base.Join#getNTransition()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_NTransition();

	/**
	 * Returns the meta object for the reference list '{@link simulator.base.Join#getInTransition <em>In Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Transition</em>'.
	 * @see simulator.base.Join#getInTransition()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_InTransition();

	/**
	 * Returns the meta object for class '{@link simulator.base.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see simulator.base.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link simulator.base.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see simulator.base.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for class '{@link simulator.base.OpenWorkload <em>Open Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Workload</em>'.
	 * @see simulator.base.OpenWorkload
	 * @generated
	 */
	EClass getOpenWorkload();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.base.OpenWorkload#getArrivalProcess <em>Arrival Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Process</em>'.
	 * @see simulator.base.OpenWorkload#getArrivalProcess()
	 * @see #getOpenWorkload()
	 * @generated
	 */
	EReference getOpenWorkload_ArrivalProcess();

	/**
	 * Returns the meta object for class '{@link simulator.base.ClosedWorkload <em>Closed Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closed Workload</em>'.
	 * @see simulator.base.ClosedWorkload
	 * @generated
	 */
	EClass getClosedWorkload();

	/**
	 * Returns the meta object for the attribute '{@link simulator.base.ClosedWorkload#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see simulator.base.ClosedWorkload#getPopulation()
	 * @see #getClosedWorkload()
	 * @generated
	 */
	EAttribute getClosedWorkload_Population();

	/**
	 * Returns the meta object for class '{@link simulator.base.ExternalService <em>External Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Service</em>'.
	 * @see simulator.base.ExternalService
	 * @generated
	 */
	EClass getExternalService();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.base.ExternalService#getServiceCall <em>Service Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Call</em>'.
	 * @see simulator.base.ExternalService#getServiceCall()
	 * @see #getExternalService()
	 * @generated
	 */
	EReference getExternalService_ServiceCall();

	/**
	 * Returns the meta object for the containment reference '{@link simulator.base.ExternalService#getFailProb <em>Fail Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fail Prob</em>'.
	 * @see simulator.base.ExternalService#getFailProb()
	 * @see #getExternalService()
	 * @generated
	 */
	EReference getExternalService_FailProb();

	/**
	 * Returns the meta object for class '{@link simulator.base.ServiceWake <em>Service Wake</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Wake</em>'.
	 * @see simulator.base.ServiceWake
	 * @generated
	 */
	EClass getServiceWake();

	/**
	 * Returns the meta object for the reference '{@link simulator.base.ServiceWake#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see simulator.base.ServiceWake#getSignal()
	 * @see #getServiceWake()
	 * @generated
	 */
	EReference getServiceWake_Signal();

	/**
	 * Returns the meta object for class '{@link simulator.base.EClass0 <em>EClass0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass0</em>'.
	 * @see simulator.base.EClass0
	 * @generated
	 */
	EClass getEClass0();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link simulator.base.impl.SimModelImpl <em>Sim Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.SimModelImpl
		 * @see simulator.base.impl.BasePackageImpl#getSimModel()
		 * @generated
		 */
		EClass SIM_MODEL = eINSTANCE.getSimModel();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_MODEL__WORKLOAD = eINSTANCE.getSimModel_Workload();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIM_MODEL__RESOURCE = eINSTANCE.getSimModel_Resource();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.WorkloadImpl <em>Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.WorkloadImpl
		 * @see simulator.base.impl.BasePackageImpl#getWorkload()
		 * @generated
		 */
		EClass WORKLOAD = eINSTANCE.getWorkload();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__NAME = eINSTANCE.getWorkload_Name();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__STEP = eINSTANCE.getWorkload_Step();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.ServiceImpl
		 * @see simulator.base.impl.BasePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__STEP = eINSTANCE.getService_Step();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.ResourceQueueImpl <em>Resource Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.ResourceQueueImpl
		 * @see simulator.base.impl.BasePackageImpl#getResourceQueue()
		 * @generated
		 */
		EClass RESOURCE_QUEUE = eINSTANCE.getResourceQueue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_QUEUE__NAME = eINSTANCE.getResourceQueue_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_QUEUE__DESCRIPTION = eINSTANCE.getResourceQueue_Description();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_QUEUE__CAPACITY = eINSTANCE.getResourceQueue_Capacity();

		/**
		 * The meta object literal for the '<em><b>Offered Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_QUEUE__OFFERED_SERVICE = eINSTANCE.getResourceQueue_OfferedService();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.StepImpl
		 * @see simulator.base.impl.BasePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Out Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUT_TRANSITION = eINSTANCE.getStep_OutTransition();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.TransitionImpl
		 * @see simulator.base.impl.BasePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PROB = eINSTANCE.getTransition_Prob();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.StartImpl
		 * @see simulator.base.impl.BasePackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.EndImpl
		 * @see simulator.base.impl.BasePackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.ActivityImpl
		 * @see simulator.base.impl.BasePackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Repetitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__REPETITIONS = eINSTANCE.getActivity_Repetitions();

		/**
		 * The meta object literal for the '<em><b>Service Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SERVICE_TIME = eINSTANCE.getActivity_ServiceTime();

		/**
		 * The meta object literal for the '<em><b>Fail Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__FAIL_MODE = eINSTANCE.getActivity_FailMode();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.DiscreteFailModeImpl <em>Discrete Fail Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.DiscreteFailModeImpl
		 * @see simulator.base.impl.BasePackageImpl#getDiscreteFailMode()
		 * @generated
		 */
		EClass DISCRETE_FAIL_MODE = eINSTANCE.getDiscreteFailMode();

		/**
		 * The meta object literal for the '<em><b>Internal Fail Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_FAIL_MODE__INTERNAL_FAIL_TIME = eINSTANCE.getDiscreteFailMode_InternalFailTime();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.ContinuousFailModeImpl <em>Continuous Fail Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.ContinuousFailModeImpl
		 * @see simulator.base.impl.BasePackageImpl#getContinuousFailMode()
		 * @generated
		 */
		EClass CONTINUOUS_FAIL_MODE = eINSTANCE.getContinuousFailMode();

		/**
		 * The meta object literal for the '<em><b>Internal Fail Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_FAIL_MODE__INTERNAL_FAIL_PROB = eINSTANCE.getContinuousFailMode_InternalFailProb();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.FailModeImpl <em>Fail Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.FailModeImpl
		 * @see simulator.base.impl.BasePackageImpl#getFailMode()
		 * @generated
		 */
		EClass FAIL_MODE = eINSTANCE.getFailMode();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.ServiceCallImpl <em>Service Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.ServiceCallImpl
		 * @see simulator.base.impl.BasePackageImpl#getServiceCall()
		 * @generated
		 */
		EClass SERVICE_CALL = eINSTANCE.getServiceCall();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CALL__SERVICE = eINSTANCE.getServiceCall_Service();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.SynchServiceCallImpl <em>Synch Service Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.SynchServiceCallImpl
		 * @see simulator.base.impl.BasePackageImpl#getSynchServiceCall()
		 * @generated
		 */
		EClass SYNCH_SERVICE_CALL = eINSTANCE.getSynchServiceCall();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.AsynchServiceCallImpl <em>Asynch Service Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.AsynchServiceCallImpl
		 * @see simulator.base.impl.BasePackageImpl#getAsynchServiceCall()
		 * @generated
		 */
		EClass ASYNCH_SERVICE_CALL = eINSTANCE.getAsynchServiceCall();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.BranchImpl
		 * @see simulator.base.impl.BasePackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.JoinImpl
		 * @see simulator.base.impl.BasePackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>NTransition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__NTRANSITION = eINSTANCE.getJoin_NTransition();

		/**
		 * The meta object literal for the '<em><b>In Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__IN_TRANSITION = eINSTANCE.getJoin_InTransition();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.ForkImpl
		 * @see simulator.base.impl.BasePackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.WaitImpl
		 * @see simulator.base.impl.BasePackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.OpenWorkloadImpl <em>Open Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.OpenWorkloadImpl
		 * @see simulator.base.impl.BasePackageImpl#getOpenWorkload()
		 * @generated
		 */
		EClass OPEN_WORKLOAD = eINSTANCE.getOpenWorkload();

		/**
		 * The meta object literal for the '<em><b>Arrival Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_WORKLOAD__ARRIVAL_PROCESS = eINSTANCE.getOpenWorkload_ArrivalProcess();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.ClosedWorkloadImpl <em>Closed Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.ClosedWorkloadImpl
		 * @see simulator.base.impl.BasePackageImpl#getClosedWorkload()
		 * @generated
		 */
		EClass CLOSED_WORKLOAD = eINSTANCE.getClosedWorkload();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSED_WORKLOAD__POPULATION = eINSTANCE.getClosedWorkload_Population();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.ExternalServiceImpl <em>External Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.ExternalServiceImpl
		 * @see simulator.base.impl.BasePackageImpl#getExternalService()
		 * @generated
		 */
		EClass EXTERNAL_SERVICE = eINSTANCE.getExternalService();

		/**
		 * The meta object literal for the '<em><b>Service Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_SERVICE__SERVICE_CALL = eINSTANCE.getExternalService_ServiceCall();

		/**
		 * The meta object literal for the '<em><b>Fail Prob</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_SERVICE__FAIL_PROB = eINSTANCE.getExternalService_FailProb();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.ServiceWakeImpl <em>Service Wake</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.ServiceWakeImpl
		 * @see simulator.base.impl.BasePackageImpl#getServiceWake()
		 * @generated
		 */
		EClass SERVICE_WAKE = eINSTANCE.getServiceWake();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_WAKE__SIGNAL = eINSTANCE.getServiceWake_Signal();

		/**
		 * The meta object literal for the '{@link simulator.base.impl.EClass0Impl <em>EClass0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulator.base.impl.EClass0Impl
		 * @see simulator.base.impl.BasePackageImpl#getEClass0()
		 * @generated
		 */
		EClass ECLASS0 = eINSTANCE.getEClass0();

	}

} //BasePackage
