/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import klaper.expr.ExprPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see klaper.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://klaper.sourceforge.net/metamodels/klaper/1.0/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "klaper.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = klaper.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link klaper.core.impl.KlaperModelImpl <em>Klaper Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.KlaperModelImpl
	 * @see klaper.core.impl.CorePackageImpl#getKlaperModel()
	 * @generated
	 */
	int KLAPER_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLAPER_MODEL__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Workload</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLAPER_MODEL__WORKLOAD = 1;

	/**
	 * The number of structural features of the '<em>Klaper Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLAPER_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link klaper.core.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.ResourceImpl
	 * @see klaper.core.impl.CorePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CAPACITY = 2;

	/**
	 * The feature id for the '<em><b>Scheduling Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SCHEDULING_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Offered Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OFFERED_SERVICE = 5;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link klaper.core.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.ServiceImpl
	 * @see klaper.core.impl.CorePackageImpl#getService()
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
	 * The feature id for the '<em><b>Speed Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SPEED_ATTR = 1;

	/**
	 * The feature id for the '<em><b>Fail Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__FAIL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BEHAVIOR = 4;

	/**
	 * The feature id for the '<em><b>Formal Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__FORMAL_PARAMS = 5;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link klaper.core.impl.WorkloadImpl <em>Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.WorkloadImpl
	 * @see klaper.core.impl.CorePackageImpl#getWorkload()
	 * @generated
	 */
	int WORKLOAD = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__POPULATION = 1;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Arrival Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__ARRIVAL_PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD__NAME = 4;

	/**
	 * The number of structural features of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link klaper.core.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.BehaviorImpl
	 * @see klaper.core.impl.CorePackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 4;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__STEP = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link klaper.core.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.StepImpl
	 * @see klaper.core.impl.CorePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IN = 1;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUT = 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link klaper.core.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.TransitionImpl
	 * @see klaper.core.impl.CorePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 1;

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
	 * The meta object id for the '{@link klaper.core.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.ControlImpl
	 * @see klaper.core.impl.CorePackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__IN = STEP__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__OUT = STEP__OUT;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.core.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.StartImpl
	 * @see klaper.core.impl.CorePackageImpl#getStart()
	 * @generated
	 */
	int START = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__IN = STEP__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OUT = STEP__OUT;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.core.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.WaitImpl
	 * @see klaper.core.impl.CorePackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__IN = STEP__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__OUT = STEP__OUT;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.core.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.EndImpl
	 * @see klaper.core.impl.CorePackageImpl#getEnd()
	 * @generated
	 */
	int END = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__IN = STEP__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__OUT = STEP__OUT;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.core.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.BranchImpl
	 * @see klaper.core.impl.CorePackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__IN = CONTROL__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__OUT = CONTROL__OUT;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.core.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.ForkImpl
	 * @see klaper.core.impl.CorePackageImpl#getFork()
	 * @generated
	 */
	int FORK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__IN = CONTROL__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__OUT = CONTROL__OUT;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.core.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.JoinImpl
	 * @see klaper.core.impl.CorePackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__IN = CONTROL__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__OUT = CONTROL__OUT;

	/**
	 * The feature id for the '<em><b>Transitions Needed To Go</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__TRANSITIONS_NEEDED_TO_GO = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link klaper.core.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.ActivityImpl
	 * @see klaper.core.impl.CorePackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IN = STEP__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUT = STEP__OUT;

	/**
	 * The feature id for the '<em><b>Nested Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NESTED_BEHAVIOR = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Exec Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INTERNAL_EXEC_TIME = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Internal Fail Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INTERNAL_FAIL_PROB = STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Internal Fail Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INTERNAL_FAIL_TIME = STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REPETITIONS = STEP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = STEP_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link klaper.core.impl.AcquireImpl <em>Acquire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.AcquireImpl
	 * @see klaper.core.impl.CorePackageImpl#getAcquire()
	 * @generated
	 */
	int ACQUIRE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE__IN = ACTIVITY__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE__OUT = ACTIVITY__OUT;

	/**
	 * The feature id for the '<em><b>Nested Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE__NESTED_BEHAVIOR = ACTIVITY__NESTED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Internal Exec Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE__INTERNAL_EXEC_TIME = ACTIVITY__INTERNAL_EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Internal Fail Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE__INTERNAL_FAIL_PROB = ACTIVITY__INTERNAL_FAIL_PROB;

	/**
	 * The feature id for the '<em><b>Internal Fail Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE__INTERNAL_FAIL_TIME = ACTIVITY__INTERNAL_FAIL_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE__REPETITIONS = ACTIVITY__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Resource Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE__RESOURCE_UNIT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE__RESOURCE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Acquire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link klaper.core.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.ReleaseImpl
	 * @see klaper.core.impl.CorePackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__IN = ACTIVITY__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__OUT = ACTIVITY__OUT;

	/**
	 * The feature id for the '<em><b>Nested Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NESTED_BEHAVIOR = ACTIVITY__NESTED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Internal Exec Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__INTERNAL_EXEC_TIME = ACTIVITY__INTERNAL_EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Internal Fail Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__INTERNAL_FAIL_PROB = ACTIVITY__INTERNAL_FAIL_PROB;

	/**
	 * The feature id for the '<em><b>Internal Fail Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__INTERNAL_FAIL_TIME = ACTIVITY__INTERNAL_FAIL_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__REPETITIONS = ACTIVITY__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Resource Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__RESOURCE_UNIT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__RESOURCE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link klaper.core.impl.ReconfigurationImpl <em>Reconfiguration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.ReconfigurationImpl
	 * @see klaper.core.impl.CorePackageImpl#getReconfiguration()
	 * @generated
	 */
	int RECONFIGURATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION__IN = ACTIVITY__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION__OUT = ACTIVITY__OUT;

	/**
	 * The feature id for the '<em><b>Nested Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION__NESTED_BEHAVIOR = ACTIVITY__NESTED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Internal Exec Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION__INTERNAL_EXEC_TIME = ACTIVITY__INTERNAL_EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Internal Fail Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION__INTERNAL_FAIL_PROB = ACTIVITY__INTERNAL_FAIL_PROB;

	/**
	 * The feature id for the '<em><b>Internal Fail Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION__INTERNAL_FAIL_TIME = ACTIVITY__INTERNAL_FAIL_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION__REPETITIONS = ACTIVITY__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Source Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION__SOURCE_STEP = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION__TARGET_SERVICE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reconfiguration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECONFIGURATION_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link klaper.core.impl.CreateBindingImpl <em>Create Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.CreateBindingImpl
	 * @see klaper.core.impl.CorePackageImpl#getCreateBinding()
	 * @generated
	 */
	int CREATE_BINDING = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING__NAME = RECONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING__IN = RECONFIGURATION__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING__OUT = RECONFIGURATION__OUT;

	/**
	 * The feature id for the '<em><b>Nested Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING__NESTED_BEHAVIOR = RECONFIGURATION__NESTED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Internal Exec Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING__INTERNAL_EXEC_TIME = RECONFIGURATION__INTERNAL_EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Internal Fail Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING__INTERNAL_FAIL_PROB = RECONFIGURATION__INTERNAL_FAIL_PROB;

	/**
	 * The feature id for the '<em><b>Internal Fail Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING__INTERNAL_FAIL_TIME = RECONFIGURATION__INTERNAL_FAIL_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING__REPETITIONS = RECONFIGURATION__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Source Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING__SOURCE_STEP = RECONFIGURATION__SOURCE_STEP;

	/**
	 * The feature id for the '<em><b>Target Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING__TARGET_SERVICE = RECONFIGURATION__TARGET_SERVICE;

	/**
	 * The number of structural features of the '<em>Create Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_BINDING_FEATURE_COUNT = RECONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.core.impl.DeleteBindingImpl <em>Delete Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.DeleteBindingImpl
	 * @see klaper.core.impl.CorePackageImpl#getDeleteBinding()
	 * @generated
	 */
	int DELETE_BINDING = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING__NAME = RECONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING__IN = RECONFIGURATION__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING__OUT = RECONFIGURATION__OUT;

	/**
	 * The feature id for the '<em><b>Nested Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING__NESTED_BEHAVIOR = RECONFIGURATION__NESTED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Internal Exec Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING__INTERNAL_EXEC_TIME = RECONFIGURATION__INTERNAL_EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Internal Fail Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING__INTERNAL_FAIL_PROB = RECONFIGURATION__INTERNAL_FAIL_PROB;

	/**
	 * The feature id for the '<em><b>Internal Fail Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING__INTERNAL_FAIL_TIME = RECONFIGURATION__INTERNAL_FAIL_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING__REPETITIONS = RECONFIGURATION__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Source Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING__SOURCE_STEP = RECONFIGURATION__SOURCE_STEP;

	/**
	 * The feature id for the '<em><b>Target Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING__TARGET_SERVICE = RECONFIGURATION__TARGET_SERVICE;

	/**
	 * The number of structural features of the '<em>Delete Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BINDING_FEATURE_COUNT = RECONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.core.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.BindingImpl
	 * @see klaper.core.impl.CorePackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 20;

	/**
	 * The feature id for the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__CALL = 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SIGNAL = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link klaper.core.impl.FormalParamImpl <em>Formal Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.FormalParamImpl
	 * @see klaper.core.impl.CorePackageImpl#getFormalParam()
	 * @generated
	 */
	int FORMAL_PARAM = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAM__RETURN = 1;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAM__ACTUAL = 2;

	/**
	 * The number of structural features of the '<em>Formal Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link klaper.core.impl.ActualParamImpl <em>Actual Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.ActualParamImpl
	 * @see klaper.core.impl.CorePackageImpl#getActualParam()
	 * @generated
	 */
	int ACTUAL_PARAM = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAM__FORMAL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAM__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Actual Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUAL_PARAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link klaper.core.impl.ServiceControlImpl <em>Service Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.ServiceControlImpl
	 * @see klaper.core.impl.CorePackageImpl#getServiceControl()
	 * @generated
	 */
	int SERVICE_CONTROL = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__IN = ACTIVITY__IN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__OUT = ACTIVITY__OUT;

	/**
	 * The feature id for the '<em><b>Nested Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__NESTED_BEHAVIOR = ACTIVITY__NESTED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Internal Exec Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__INTERNAL_EXEC_TIME = ACTIVITY__INTERNAL_EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Internal Fail Prob</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__INTERNAL_FAIL_PROB = ACTIVITY__INTERNAL_FAIL_PROB;

	/**
	 * The feature id for the '<em><b>Internal Fail Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__INTERNAL_FAIL_TIME = ACTIVITY__INTERNAL_FAIL_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__REPETITIONS = ACTIVITY__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__RESOURCE_TYPE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__SERVICE_NAME = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Synch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__IS_SYNCH = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__DEPENDS_ON = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__BINDING = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL__ACTUAL_PARAM = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Service Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONTROL_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link klaper.core.impl.ParamVariableImpl <em>Param Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.impl.ParamVariableImpl
	 * @see klaper.core.impl.CorePackageImpl#getParamVariable()
	 * @generated
	 */
	int PARAM_VARIABLE = 24;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VARIABLE__PARAM = ExprPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Param Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VARIABLE_FEATURE_COUNT = ExprPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link klaper.core.WorkloadType <em>Workload Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.WorkloadType
	 * @see klaper.core.impl.CorePackageImpl#getWorkloadType()
	 * @generated
	 */
	int WORKLOAD_TYPE = 25;

	/**
	 * The meta object id for the '{@link klaper.core.SchedulingPolicyKind <em>Scheduling Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.core.SchedulingPolicyKind
	 * @see klaper.core.impl.CorePackageImpl#getSchedulingPolicyKind()
	 * @generated
	 */
	int SCHEDULING_POLICY_KIND = 26;


	/**
	 * Returns the meta object for class '{@link klaper.core.KlaperModel <em>Klaper Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Klaper Model</em>'.
	 * @see klaper.core.KlaperModel
	 * @generated
	 */
	EClass getKlaperModel();

	/**
	 * Returns the meta object for the containment reference list '{@link klaper.core.KlaperModel#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see klaper.core.KlaperModel#getResource()
	 * @see #getKlaperModel()
	 * @generated
	 */
	EReference getKlaperModel_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link klaper.core.KlaperModel#getWorkload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workload</em>'.
	 * @see klaper.core.KlaperModel#getWorkload()
	 * @see #getKlaperModel()
	 * @generated
	 */
	EReference getKlaperModel_Workload();

	/**
	 * Returns the meta object for class '{@link klaper.core.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see klaper.core.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klaper.core.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Resource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see klaper.core.Resource#getType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Type();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Resource#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see klaper.core.Resource#getCapacity()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Resource#getSchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Policy</em>'.
	 * @see klaper.core.Resource#getSchedulingPolicy()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_SchedulingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Resource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see klaper.core.Resource#getDescription()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link klaper.core.Resource#getOfferedService <em>Offered Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Service</em>'.
	 * @see klaper.core.Resource#getOfferedService()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_OfferedService();

	/**
	 * Returns the meta object for class '{@link klaper.core.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see klaper.core.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klaper.core.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Service#getSpeedAttr <em>Speed Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Attr</em>'.
	 * @see klaper.core.Service#getSpeedAttr()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_SpeedAttr();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Service#getFailAttr <em>Fail Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail Attr</em>'.
	 * @see klaper.core.Service#getFailAttr()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_FailAttr();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Service#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see klaper.core.Service#getDescription()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Description();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.core.Service#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see klaper.core.Service#getBehavior()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Behavior();

	/**
	 * Returns the meta object for the containment reference list '{@link klaper.core.Service#getFormalParams <em>Formal Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Params</em>'.
	 * @see klaper.core.Service#getFormalParams()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_FormalParams();

	/**
	 * Returns the meta object for class '{@link klaper.core.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload</em>'.
	 * @see klaper.core.Workload
	 * @generated
	 */
	EClass getWorkload();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Workload#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see klaper.core.Workload#getType()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Type();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Workload#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see klaper.core.Workload#getPopulation()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Population();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.core.Workload#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see klaper.core.Workload#getBehavior()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_Behavior();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.core.Workload#getArrivalProcess <em>Arrival Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arrival Process</em>'.
	 * @see klaper.core.Workload#getArrivalProcess()
	 * @see #getWorkload()
	 * @generated
	 */
	EReference getWorkload_ArrivalProcess();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Workload#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klaper.core.Workload#getName()
	 * @see #getWorkload()
	 * @generated
	 */
	EAttribute getWorkload_Name();

	/**
	 * Returns the meta object for class '{@link klaper.core.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see klaper.core.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link klaper.core.Behavior#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see klaper.core.Behavior#getStep()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Step();

	/**
	 * Returns the meta object for the containment reference list '{@link klaper.core.Behavior#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see klaper.core.Behavior#getTransition()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Transition();

	/**
	 * Returns the meta object for class '{@link klaper.core.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see klaper.core.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klaper.core.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the reference list '{@link klaper.core.Step#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see klaper.core.Step#getIn()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_In();

	/**
	 * Returns the meta object for the reference list '{@link klaper.core.Step#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see klaper.core.Step#getOut()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Out();

	/**
	 * Returns the meta object for class '{@link klaper.core.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see klaper.core.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link klaper.core.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see klaper.core.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for the reference '{@link klaper.core.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see klaper.core.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Transition#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see klaper.core.Transition#getProb()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Prob();

	/**
	 * Returns the meta object for class '{@link klaper.core.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see klaper.core.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for class '{@link klaper.core.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see klaper.core.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link klaper.core.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see klaper.core.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for class '{@link klaper.core.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see klaper.core.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link klaper.core.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see klaper.core.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for class '{@link klaper.core.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see klaper.core.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link klaper.core.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see klaper.core.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Join#getTransitionsNeededToGo <em>Transitions Needed To Go</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitions Needed To Go</em>'.
	 * @see klaper.core.Join#getTransitionsNeededToGo()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_TransitionsNeededToGo();

	/**
	 * Returns the meta object for class '{@link klaper.core.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see klaper.core.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.core.Activity#getNestedBehavior <em>Nested Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nested Behavior</em>'.
	 * @see klaper.core.Activity#getNestedBehavior()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_NestedBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.core.Activity#getInternalExecTime <em>Internal Exec Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal Exec Time</em>'.
	 * @see klaper.core.Activity#getInternalExecTime()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_InternalExecTime();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.core.Activity#getInternalFailProb <em>Internal Fail Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal Fail Prob</em>'.
	 * @see klaper.core.Activity#getInternalFailProb()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_InternalFailProb();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.core.Activity#getInternalFailTime <em>Internal Fail Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal Fail Time</em>'.
	 * @see klaper.core.Activity#getInternalFailTime()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_InternalFailTime();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.core.Activity#getRepetitions <em>Repetitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repetitions</em>'.
	 * @see klaper.core.Activity#getRepetitions()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Repetitions();

	/**
	 * Returns the meta object for class '{@link klaper.core.Acquire <em>Acquire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acquire</em>'.
	 * @see klaper.core.Acquire
	 * @generated
	 */
	EClass getAcquire();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Acquire#getResourceUnit <em>Resource Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Unit</em>'.
	 * @see klaper.core.Acquire#getResourceUnit()
	 * @see #getAcquire()
	 * @generated
	 */
	EAttribute getAcquire_ResourceUnit();

	/**
	 * Returns the meta object for the reference '{@link klaper.core.Acquire#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see klaper.core.Acquire#getResource()
	 * @see #getAcquire()
	 * @generated
	 */
	EReference getAcquire_Resource();

	/**
	 * Returns the meta object for class '{@link klaper.core.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see klaper.core.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Release#getResourceUnit <em>Resource Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Unit</em>'.
	 * @see klaper.core.Release#getResourceUnit()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_ResourceUnit();

	/**
	 * Returns the meta object for the reference '{@link klaper.core.Release#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see klaper.core.Release#getResource()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Resource();

	/**
	 * Returns the meta object for class '{@link klaper.core.Reconfiguration <em>Reconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reconfiguration</em>'.
	 * @see klaper.core.Reconfiguration
	 * @generated
	 */
	EClass getReconfiguration();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Reconfiguration#getSourceStep <em>Source Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Step</em>'.
	 * @see klaper.core.Reconfiguration#getSourceStep()
	 * @see #getReconfiguration()
	 * @generated
	 */
	EAttribute getReconfiguration_SourceStep();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.Reconfiguration#getTargetService <em>Target Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Service</em>'.
	 * @see klaper.core.Reconfiguration#getTargetService()
	 * @see #getReconfiguration()
	 * @generated
	 */
	EAttribute getReconfiguration_TargetService();

	/**
	 * Returns the meta object for class '{@link klaper.core.CreateBinding <em>Create Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Binding</em>'.
	 * @see klaper.core.CreateBinding
	 * @generated
	 */
	EClass getCreateBinding();

	/**
	 * Returns the meta object for class '{@link klaper.core.DeleteBinding <em>Delete Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Binding</em>'.
	 * @see klaper.core.DeleteBinding
	 * @generated
	 */
	EClass getDeleteBinding();

	/**
	 * Returns the meta object for class '{@link klaper.core.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see klaper.core.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link klaper.core.Binding#getCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call</em>'.
	 * @see klaper.core.Binding#getCall()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Call();

	/**
	 * Returns the meta object for the reference '{@link klaper.core.Binding#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see klaper.core.Binding#getSignal()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Signal();

	/**
	 * Returns the meta object for class '{@link klaper.core.FormalParam <em>Formal Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Param</em>'.
	 * @see klaper.core.FormalParam
	 * @generated
	 */
	EClass getFormalParam();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.FormalParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klaper.core.FormalParam#getName()
	 * @see #getFormalParam()
	 * @generated
	 */
	EAttribute getFormalParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.FormalParam#isReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see klaper.core.FormalParam#isReturn()
	 * @see #getFormalParam()
	 * @generated
	 */
	EAttribute getFormalParam_Return();

	/**
	 * Returns the meta object for the reference '{@link klaper.core.FormalParam#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual</em>'.
	 * @see klaper.core.FormalParam#getActual()
	 * @see #getFormalParam()
	 * @generated
	 */
	EReference getFormalParam_Actual();

	/**
	 * Returns the meta object for class '{@link klaper.core.ActualParam <em>Actual Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actual Param</em>'.
	 * @see klaper.core.ActualParam
	 * @generated
	 */
	EClass getActualParam();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.ActualParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see klaper.core.ActualParam#getName()
	 * @see #getActualParam()
	 * @generated
	 */
	EAttribute getActualParam_Name();

	/**
	 * Returns the meta object for the reference '{@link klaper.core.ActualParam#getFormal <em>Formal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal</em>'.
	 * @see klaper.core.ActualParam#getFormal()
	 * @see #getActualParam()
	 * @generated
	 */
	EReference getActualParam_Formal();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.core.ActualParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see klaper.core.ActualParam#getValue()
	 * @see #getActualParam()
	 * @generated
	 */
	EReference getActualParam_Value();

	/**
	 * Returns the meta object for class '{@link klaper.core.ServiceControl <em>Service Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Control</em>'.
	 * @see klaper.core.ServiceControl
	 * @generated
	 */
	EClass getServiceControl();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.ServiceControl#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see klaper.core.ServiceControl#getResourceType()
	 * @see #getServiceControl()
	 * @generated
	 */
	EAttribute getServiceControl_ResourceType();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.ServiceControl#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see klaper.core.ServiceControl#getServiceName()
	 * @see #getServiceControl()
	 * @generated
	 */
	EAttribute getServiceControl_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.ServiceControl#isIsSynch <em>Is Synch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synch</em>'.
	 * @see klaper.core.ServiceControl#isIsSynch()
	 * @see #getServiceControl()
	 * @generated
	 */
	EAttribute getServiceControl_IsSynch();

	/**
	 * Returns the meta object for the attribute '{@link klaper.core.ServiceControl#isDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depends On</em>'.
	 * @see klaper.core.ServiceControl#isDependsOn()
	 * @see #getServiceControl()
	 * @generated
	 */
	EAttribute getServiceControl_DependsOn();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.core.ServiceControl#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see klaper.core.ServiceControl#getBinding()
	 * @see #getServiceControl()
	 * @generated
	 */
	EReference getServiceControl_Binding();

	/**
	 * Returns the meta object for the containment reference list '{@link klaper.core.ServiceControl#getActualParam <em>Actual Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Param</em>'.
	 * @see klaper.core.ServiceControl#getActualParam()
	 * @see #getServiceControl()
	 * @generated
	 */
	EReference getServiceControl_ActualParam();

	/**
	 * Returns the meta object for class '{@link klaper.core.ParamVariable <em>Param Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Variable</em>'.
	 * @see klaper.core.ParamVariable
	 * @generated
	 */
	EClass getParamVariable();

	/**
	 * Returns the meta object for the reference '{@link klaper.core.ParamVariable#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param</em>'.
	 * @see klaper.core.ParamVariable#getParam()
	 * @see #getParamVariable()
	 * @generated
	 */
	EReference getParamVariable_Param();

	/**
	 * Returns the meta object for enum '{@link klaper.core.WorkloadType <em>Workload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Workload Type</em>'.
	 * @see klaper.core.WorkloadType
	 * @generated
	 */
	EEnum getWorkloadType();

	/**
	 * Returns the meta object for enum '{@link klaper.core.SchedulingPolicyKind <em>Scheduling Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Policy Kind</em>'.
	 * @see klaper.core.SchedulingPolicyKind
	 * @generated
	 */
	EEnum getSchedulingPolicyKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link klaper.core.impl.KlaperModelImpl <em>Klaper Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.KlaperModelImpl
		 * @see klaper.core.impl.CorePackageImpl#getKlaperModel()
		 * @generated
		 */
		EClass KLAPER_MODEL = eINSTANCE.getKlaperModel();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KLAPER_MODEL__RESOURCE = eINSTANCE.getKlaperModel_Resource();

		/**
		 * The meta object literal for the '<em><b>Workload</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KLAPER_MODEL__WORKLOAD = eINSTANCE.getKlaperModel_Workload();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.ResourceImpl
		 * @see klaper.core.impl.CorePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TYPE = eINSTANCE.getResource_Type();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__CAPACITY = eINSTANCE.getResource_Capacity();

		/**
		 * The meta object literal for the '<em><b>Scheduling Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__SCHEDULING_POLICY = eINSTANCE.getResource_SchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

		/**
		 * The meta object literal for the '<em><b>Offered Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__OFFERED_SERVICE = eINSTANCE.getResource_OfferedService();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.ServiceImpl
		 * @see klaper.core.impl.CorePackageImpl#getService()
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
		 * The meta object literal for the '<em><b>Speed Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SPEED_ATTR = eINSTANCE.getService_SpeedAttr();

		/**
		 * The meta object literal for the '<em><b>Fail Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__FAIL_ATTR = eINSTANCE.getService_FailAttr();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESCRIPTION = eINSTANCE.getService_Description();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BEHAVIOR = eINSTANCE.getService_Behavior();

		/**
		 * The meta object literal for the '<em><b>Formal Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__FORMAL_PARAMS = eINSTANCE.getService_FormalParams();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.WorkloadImpl <em>Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.WorkloadImpl
		 * @see klaper.core.impl.CorePackageImpl#getWorkload()
		 * @generated
		 */
		EClass WORKLOAD = eINSTANCE.getWorkload();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__TYPE = eINSTANCE.getWorkload_Type();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__POPULATION = eINSTANCE.getWorkload_Population();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__BEHAVIOR = eINSTANCE.getWorkload_Behavior();

		/**
		 * The meta object literal for the '<em><b>Arrival Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD__ARRIVAL_PROCESS = eINSTANCE.getWorkload_ArrivalProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD__NAME = eINSTANCE.getWorkload_Name();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.BehaviorImpl
		 * @see klaper.core.impl.CorePackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__STEP = eINSTANCE.getBehavior_Step();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__TRANSITION = eINSTANCE.getBehavior_Transition();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.StepImpl
		 * @see klaper.core.impl.CorePackageImpl#getStep()
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
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__IN = eINSTANCE.getStep_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUT = eINSTANCE.getStep_Out();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.TransitionImpl
		 * @see klaper.core.impl.CorePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PROB = eINSTANCE.getTransition_Prob();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.ControlImpl
		 * @see klaper.core.impl.CorePackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.StartImpl
		 * @see klaper.core.impl.CorePackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.WaitImpl
		 * @see klaper.core.impl.CorePackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.EndImpl
		 * @see klaper.core.impl.CorePackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.BranchImpl
		 * @see klaper.core.impl.CorePackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.ForkImpl
		 * @see klaper.core.impl.CorePackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.JoinImpl
		 * @see klaper.core.impl.CorePackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Transitions Needed To Go</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__TRANSITIONS_NEEDED_TO_GO = eINSTANCE.getJoin_TransitionsNeededToGo();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.ActivityImpl
		 * @see klaper.core.impl.CorePackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Nested Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NESTED_BEHAVIOR = eINSTANCE.getActivity_NestedBehavior();

		/**
		 * The meta object literal for the '<em><b>Internal Exec Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INTERNAL_EXEC_TIME = eINSTANCE.getActivity_InternalExecTime();

		/**
		 * The meta object literal for the '<em><b>Internal Fail Prob</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INTERNAL_FAIL_PROB = eINSTANCE.getActivity_InternalFailProb();

		/**
		 * The meta object literal for the '<em><b>Internal Fail Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INTERNAL_FAIL_TIME = eINSTANCE.getActivity_InternalFailTime();

		/**
		 * The meta object literal for the '<em><b>Repetitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__REPETITIONS = eINSTANCE.getActivity_Repetitions();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.AcquireImpl <em>Acquire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.AcquireImpl
		 * @see klaper.core.impl.CorePackageImpl#getAcquire()
		 * @generated
		 */
		EClass ACQUIRE = eINSTANCE.getAcquire();

		/**
		 * The meta object literal for the '<em><b>Resource Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUIRE__RESOURCE_UNIT = eINSTANCE.getAcquire_ResourceUnit();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACQUIRE__RESOURCE = eINSTANCE.getAcquire_Resource();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.ReleaseImpl
		 * @see klaper.core.impl.CorePackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Resource Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__RESOURCE_UNIT = eINSTANCE.getRelease_ResourceUnit();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__RESOURCE = eINSTANCE.getRelease_Resource();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.ReconfigurationImpl <em>Reconfiguration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.ReconfigurationImpl
		 * @see klaper.core.impl.CorePackageImpl#getReconfiguration()
		 * @generated
		 */
		EClass RECONFIGURATION = eINSTANCE.getReconfiguration();

		/**
		 * The meta object literal for the '<em><b>Source Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION__SOURCE_STEP = eINSTANCE.getReconfiguration_SourceStep();

		/**
		 * The meta object literal for the '<em><b>Target Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECONFIGURATION__TARGET_SERVICE = eINSTANCE.getReconfiguration_TargetService();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.CreateBindingImpl <em>Create Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.CreateBindingImpl
		 * @see klaper.core.impl.CorePackageImpl#getCreateBinding()
		 * @generated
		 */
		EClass CREATE_BINDING = eINSTANCE.getCreateBinding();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.DeleteBindingImpl <em>Delete Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.DeleteBindingImpl
		 * @see klaper.core.impl.CorePackageImpl#getDeleteBinding()
		 * @generated
		 */
		EClass DELETE_BINDING = eINSTANCE.getDeleteBinding();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.BindingImpl
		 * @see klaper.core.impl.CorePackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__CALL = eINSTANCE.getBinding_Call();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__SIGNAL = eINSTANCE.getBinding_Signal();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.FormalParamImpl <em>Formal Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.FormalParamImpl
		 * @see klaper.core.impl.CorePackageImpl#getFormalParam()
		 * @generated
		 */
		EClass FORMAL_PARAM = eINSTANCE.getFormalParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAM__NAME = eINSTANCE.getFormalParam_Name();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAM__RETURN = eINSTANCE.getFormalParam_Return();

		/**
		 * The meta object literal for the '<em><b>Actual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAM__ACTUAL = eINSTANCE.getFormalParam_Actual();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.ActualParamImpl <em>Actual Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.ActualParamImpl
		 * @see klaper.core.impl.CorePackageImpl#getActualParam()
		 * @generated
		 */
		EClass ACTUAL_PARAM = eINSTANCE.getActualParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUAL_PARAM__NAME = eINSTANCE.getActualParam_Name();

		/**
		 * The meta object literal for the '<em><b>Formal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_PARAM__FORMAL = eINSTANCE.getActualParam_Formal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUAL_PARAM__VALUE = eINSTANCE.getActualParam_Value();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.ServiceControlImpl <em>Service Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.ServiceControlImpl
		 * @see klaper.core.impl.CorePackageImpl#getServiceControl()
		 * @generated
		 */
		EClass SERVICE_CONTROL = eINSTANCE.getServiceControl();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONTROL__RESOURCE_TYPE = eINSTANCE.getServiceControl_ResourceType();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONTROL__SERVICE_NAME = eINSTANCE.getServiceControl_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Is Synch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONTROL__IS_SYNCH = eINSTANCE.getServiceControl_IsSynch();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONTROL__DEPENDS_ON = eINSTANCE.getServiceControl_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONTROL__BINDING = eINSTANCE.getServiceControl_Binding();

		/**
		 * The meta object literal for the '<em><b>Actual Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONTROL__ACTUAL_PARAM = eINSTANCE.getServiceControl_ActualParam();

		/**
		 * The meta object literal for the '{@link klaper.core.impl.ParamVariableImpl <em>Param Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.impl.ParamVariableImpl
		 * @see klaper.core.impl.CorePackageImpl#getParamVariable()
		 * @generated
		 */
		EClass PARAM_VARIABLE = eINSTANCE.getParamVariable();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_VARIABLE__PARAM = eINSTANCE.getParamVariable_Param();

		/**
		 * The meta object literal for the '{@link klaper.core.WorkloadType <em>Workload Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.WorkloadType
		 * @see klaper.core.impl.CorePackageImpl#getWorkloadType()
		 * @generated
		 */
		EEnum WORKLOAD_TYPE = eINSTANCE.getWorkloadType();

		/**
		 * The meta object literal for the '{@link klaper.core.SchedulingPolicyKind <em>Scheduling Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.core.SchedulingPolicyKind
		 * @see klaper.core.impl.CorePackageImpl#getSchedulingPolicyKind()
		 * @generated
		 */
		EEnum SCHEDULING_POLICY_KIND = eINSTANCE.getSchedulingPolicyKind();

	}

} //CorePackage
