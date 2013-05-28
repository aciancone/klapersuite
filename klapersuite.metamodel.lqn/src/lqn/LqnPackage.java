/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

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
 * @see lqn.LqnFactory
 * @model kind="package"
 * @generated
 */
public interface LqnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lqn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://klaper.sourceforge.net/metamodels/lqn/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lqn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LqnPackage eINSTANCE = lqn.impl.LqnPackageImpl.init();

	/**
	 * The meta object id for the '{@link lqn.impl.LqnModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.LqnModelImpl
	 * @see lqn.impl.LqnPackageImpl#getLqnModel()
	 * @generated
	 */
	int LQN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Lqn Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL__LQN_SCHEMA_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Lqncore Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL__LQNCORE_SCHEMA_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL__PROCESSOR = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LQN_MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link lqn.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ProcessorImpl
	 * @see lqn.impl.LqnPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__MULTIPLICITY = 1;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SPEED_FACTOR = 2;

	/**
	 * The feature id for the '<em><b>Scheduling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__SCHEDULING = 3;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__REPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Quantum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__QUANTUM = 5;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TASK = 6;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link lqn.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.TaskImpl
	 * @see lqn.impl.LqnPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MULTIPLICITY = 1;

	/**
	 * The feature id for the '<em><b>Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__QUEUE_LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Scheduling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCHEDULING = 4;

	/**
	 * The feature id for the '<em><b>Activity Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ACTIVITY_GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__THINK_TIME = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = 7;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Task Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASK_ACTIVITY = 9;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link lqn.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.EntryImpl
	 * @see lqn.impl.LqnPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Open Arrival Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__OPEN_ARRIVAL_RATE = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Semaphore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__SEMAPHORE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Entry Activity Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ENTRY_ACTIVITY_GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Entry Phase Activities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ENTRY_PHASE_ACTIVITIES = 6;

	/**
	 * The feature id for the '<em><b>Forwarding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__FORWARDING = 7;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link lqn.impl.ActivityGraphImpl <em>Activity Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ActivityGraphImpl
	 * @see lqn.impl.LqnPackageImpl#getActivityGraph()
	 * @generated
	 */
	int ACTIVITY_GRAPH = 17;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH__PRECEDENCE = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH__ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Activity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lqn.impl.TaskActivityGraphImpl <em>Task Activity Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.TaskActivityGraphImpl
	 * @see lqn.impl.LqnPackageImpl#getTaskActivityGraph()
	 * @generated
	 */
	int TASK_ACTIVITY_GRAPH = 4;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH__PRECEDENCE = ACTIVITY_GRAPH__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH__ACTIVITY = ACTIVITY_GRAPH__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Reply Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH__REPLY_ENTRY = ACTIVITY_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Activity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ACTIVITY_GRAPH_FEATURE_COUNT = ACTIVITY_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lqn.impl.EntryActivityGraphImpl <em>Entry Activity Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.EntryActivityGraphImpl
	 * @see lqn.impl.LqnPackageImpl#getEntryActivityGraph()
	 * @generated
	 */
	int ENTRY_ACTIVITY_GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH__PRECEDENCE = ACTIVITY_GRAPH__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH__ACTIVITY = ACTIVITY_GRAPH__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Reply Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY = ACTIVITY_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Activity Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_GRAPH_FEATURE_COUNT = ACTIVITY_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lqn.impl.PhaseActivitiesImpl <em>Phase Activities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.PhaseActivitiesImpl
	 * @see lqn.impl.LqnPackageImpl#getPhaseActivities()
	 * @generated
	 */
	int PHASE_ACTIVITIES = 6;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_ACTIVITIES__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Phase Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_ACTIVITIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lqn.impl.MakingCallImpl <em>Making Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.MakingCallImpl
	 * @see lqn.impl.LqnPackageImpl#getMakingCall()
	 * @generated
	 */
	int MAKING_CALL = 8;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL__DEST = 0;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL__FANIN = 1;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL__FANOUT = 2;

	/**
	 * The number of structural features of the '<em>Making Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKING_CALL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lqn.impl.EntryMakingCallImpl <em>Entry Making Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.EntryMakingCallImpl
	 * @see lqn.impl.LqnPackageImpl#getEntryMakingCall()
	 * @generated
	 */
	int ENTRY_MAKING_CALL = 7;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL__DEST = MAKING_CALL__DEST;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL__FANIN = MAKING_CALL__FANIN;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL__FANOUT = MAKING_CALL__FANOUT;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL__PROB = MAKING_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Making Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_MAKING_CALL_FEATURE_COUNT = MAKING_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lqn.impl.ActivityMakingCallImpl <em>Activity Making Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ActivityMakingCallImpl
	 * @see lqn.impl.LqnPackageImpl#getActivityMakingCall()
	 * @generated
	 */
	int ACTIVITY_MAKING_CALL = 9;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL__DEST = MAKING_CALL__DEST;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL__FANIN = MAKING_CALL__FANIN;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL__FANOUT = MAKING_CALL__FANOUT;

	/**
	 * The feature id for the '<em><b>Calls Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL__CALLS_MEAN = MAKING_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Making Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_MAKING_CALL_FEATURE_COUNT = MAKING_CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lqn.impl.ActivityDefBaseImpl <em>Activity Def Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ActivityDefBaseImpl
	 * @see lqn.impl.LqnPackageImpl#getActivityDefBase()
	 * @generated
	 */
	int ACTIVITY_DEF_BASE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN = 1;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ = 2;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__THINK_TIME = 3;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__MAX_SERVICE_TIME = 4;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE__CALL_ORDER = 5;

	/**
	 * The number of structural features of the '<em>Activity Def Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_BASE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link lqn.impl.ActivityPhaseImpl <em>Activity Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ActivityPhaseImpl
	 * @see lqn.impl.LqnPackageImpl#getActivityPhase()
	 * @generated
	 */
	int ACTIVITY_PHASE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE__NAME = ACTIVITY_DEF_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE__HOST_DEMAND_MEAN = ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE__HOST_DEMAND_CVSQ = ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE__THINK_TIME = ACTIVITY_DEF_BASE__THINK_TIME;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE__MAX_SERVICE_TIME = ACTIVITY_DEF_BASE__MAX_SERVICE_TIME;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE__CALL_ORDER = ACTIVITY_DEF_BASE__CALL_ORDER;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE__PHASE = ACTIVITY_DEF_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE__SYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE__ASYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Call List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE__CALL_LIST = ACTIVITY_DEF_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PHASE_FEATURE_COUNT = ACTIVITY_DEF_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lqn.impl.ActivityDefImpl <em>Activity Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ActivityDefImpl
	 * @see lqn.impl.LqnPackageImpl#getActivityDef()
	 * @generated
	 */
	int ACTIVITY_DEF = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__NAME = ACTIVITY_DEF_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__HOST_DEMAND_MEAN = ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__HOST_DEMAND_CVSQ = ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__THINK_TIME = ACTIVITY_DEF_BASE__THINK_TIME;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__MAX_SERVICE_TIME = ACTIVITY_DEF_BASE__MAX_SERVICE_TIME;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__CALL_ORDER = ACTIVITY_DEF_BASE__CALL_ORDER;

	/**
	 * The feature id for the '<em><b>Bound To Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__BOUND_TO_ENTRY = ACTIVITY_DEF_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__SYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__ASYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Call List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__CALL_LIST = ACTIVITY_DEF_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_FEATURE_COUNT = ACTIVITY_DEF_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lqn.impl.CallListImpl <em>Call List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.CallListImpl
	 * @see lqn.impl.LqnPackageImpl#getCallList()
	 * @generated
	 */
	int CALL_LIST = 13;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_LIST__SYNCH_CALL = 0;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_LIST__ASYNCH_CALL = 1;

	/**
	 * The number of structural features of the '<em>Call List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lqn.impl.EntryActivityDefImpl <em>Entry Activity Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.EntryActivityDefImpl
	 * @see lqn.impl.LqnPackageImpl#getEntryActivityDef()
	 * @generated
	 */
	int ENTRY_ACTIVITY_DEF = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF__NAME = ACTIVITY_DEF_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF__HOST_DEMAND_MEAN = ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN;

	/**
	 * The feature id for the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF__HOST_DEMAND_CVSQ = ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ;

	/**
	 * The feature id for the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF__THINK_TIME = ACTIVITY_DEF_BASE__THINK_TIME;

	/**
	 * The feature id for the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF__MAX_SERVICE_TIME = ACTIVITY_DEF_BASE__MAX_SERVICE_TIME;

	/**
	 * The feature id for the '<em><b>Call Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF__CALL_ORDER = ACTIVITY_DEF_BASE__CALL_ORDER;

	/**
	 * The feature id for the '<em><b>First Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF__FIRST_ACTIVITY = ACTIVITY_DEF_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF__SYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asynch Call</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF__ASYNCH_CALL = ACTIVITY_DEF_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Call List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF__CALL_LIST = ACTIVITY_DEF_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Entry Activity Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_ACTIVITY_DEF_FEATURE_COUNT = ACTIVITY_DEF_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lqn.impl.SynchCallImpl <em>Synch Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.SynchCallImpl
	 * @see lqn.impl.LqnPackageImpl#getSynchCall()
	 * @generated
	 */
	int SYNCH_CALL = 15;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL__DEST = 0;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL__FANIN = 1;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL__FANOUT = 2;

	/**
	 * The number of structural features of the '<em>Synch Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCH_CALL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lqn.impl.AsynchCallImpl <em>Asynch Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.AsynchCallImpl
	 * @see lqn.impl.LqnPackageImpl#getAsynchCall()
	 * @generated
	 */
	int ASYNCH_CALL = 16;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL__DEST = 0;

	/**
	 * The feature id for the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL__FANIN = 1;

	/**
	 * The feature id for the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL__FANOUT = 2;

	/**
	 * The number of structural features of the '<em>Asynch Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCH_CALL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lqn.impl.PrecedenceImpl <em>Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.PrecedenceImpl
	 * @see lqn.impl.LqnPackageImpl#getPrecedence()
	 * @generated
	 */
	int PRECEDENCE = 18;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__PRE = 0;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__POST = 1;

	/**
	 * The feature id for the '<em><b>Pre AND</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__PRE_AND = 2;

	/**
	 * The feature id for the '<em><b>Post AND</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__POST_AND = 3;

	/**
	 * The feature id for the '<em><b>Pre OR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__PRE_OR = 4;

	/**
	 * The feature id for the '<em><b>Post OR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__POST_OR = 5;

	/**
	 * The feature id for the '<em><b>Post LOOP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__POST_LOOP = 6;

	/**
	 * The number of structural features of the '<em>Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link lqn.impl.ReplyActivityImpl <em>Reply Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ReplyActivityImpl
	 * @see lqn.impl.LqnPackageImpl#getReplyActivity()
	 * @generated
	 */
	int REPLY_ACTIVITY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTIVITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Reply Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lqn.impl.ReplyEntryImpl <em>Reply Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ReplyEntryImpl
	 * @see lqn.impl.LqnPackageImpl#getReplyEntry()
	 * @generated
	 */
	int REPLY_ENTRY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reply Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY__REPLY_ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Reply Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lqn.impl.SingleActivityListImpl <em>Single Activity List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.SingleActivityListImpl
	 * @see lqn.impl.LqnPackageImpl#getSingleActivityList()
	 * @generated
	 */
	int SINGLE_ACTIVITY_LIST = 21;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVITY_LIST__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Single Activity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ACTIVITY_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lqn.impl.ActivityLoopListImpl <em>Activity Loop List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ActivityLoopListImpl
	 * @see lqn.impl.LqnPackageImpl#getActivityLoopList()
	 * @generated
	 */
	int ACTIVITY_LOOP_LIST = 22;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST__END = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST__ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Activity Loop List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lqn.impl.AndJoinListImpl <em>And Join List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.AndJoinListImpl
	 * @see lqn.impl.LqnPackageImpl#getAndJoinList()
	 * @generated
	 */
	int AND_JOIN_LIST = 23;

	/**
	 * The feature id for the '<em><b>Quorum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST__QUORUM = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST__ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>And Join List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JOIN_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lqn.impl.ActivityListImpl <em>Activity List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ActivityListImpl
	 * @see lqn.impl.LqnPackageImpl#getActivityList()
	 * @generated
	 */
	int ACTIVITY_LIST = 24;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LIST__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Activity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lqn.impl.OrListImpl <em>Or List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.OrListImpl
	 * @see lqn.impl.LqnPackageImpl#getOrList()
	 * @generated
	 */
	int OR_LIST = 25;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_LIST__ACTIVITY = 0;

	/**
	 * The number of structural features of the '<em>Or List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lqn.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ActivityImpl
	 * @see lqn.impl.LqnPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link lqn.impl.ActivityOrImpl <em>Activity Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ActivityOrImpl
	 * @see lqn.impl.LqnPackageImpl#getActivityOr()
	 * @generated
	 */
	int ACTIVITY_OR = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR__PROB = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OR_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lqn.impl.ActivityLoopImpl <em>Activity Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.impl.ActivityLoopImpl
	 * @see lqn.impl.LqnPackageImpl#getActivityLoop()
	 * @generated
	 */
	int ACTIVITY_LOOP = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP__COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOOP_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lqn.SchedulingType <em>Scheduling Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.SchedulingType
	 * @see lqn.impl.LqnPackageImpl#getSchedulingType()
	 * @generated
	 */
	int SCHEDULING_TYPE = 29;

	/**
	 * The meta object id for the '{@link lqn.TaskSchedulingType <em>Task Scheduling Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.TaskSchedulingType
	 * @see lqn.impl.LqnPackageImpl#getTaskSchedulingType()
	 * @generated
	 */
	int TASK_SCHEDULING_TYPE = 30;

	/**
	 * The meta object id for the '{@link lqn.TaskOptionType <em>Task Option Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.TaskOptionType
	 * @see lqn.impl.LqnPackageImpl#getTaskOptionType()
	 * @generated
	 */
	int TASK_OPTION_TYPE = 31;

	/**
	 * The meta object id for the '{@link lqn.Semaphore <em>Semaphore</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.Semaphore
	 * @see lqn.impl.LqnPackageImpl#getSemaphore()
	 * @generated
	 */
	int SEMAPHORE = 32;

	/**
	 * The meta object id for the '{@link lqn.EntryType <em>Entry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.EntryType
	 * @see lqn.impl.LqnPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 33;

	/**
	 * The meta object id for the '{@link lqn.CallOrder <em>Call Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lqn.CallOrder
	 * @see lqn.impl.LqnPackageImpl#getCallOrder()
	 * @generated
	 */
	int CALL_ORDER = 34;


	/**
	 * Returns the meta object for class '{@link lqn.LqnModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see lqn.LqnModel
	 * @generated
	 */
	EClass getLqnModel();

	/**
	 * Returns the meta object for the attribute '{@link lqn.LqnModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lqn.LqnModel#getName()
	 * @see #getLqnModel()
	 * @generated
	 */
	EAttribute getLqnModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link lqn.LqnModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see lqn.LqnModel#getDescription()
	 * @see #getLqnModel()
	 * @generated
	 */
	EAttribute getLqnModel_Description();

	/**
	 * Returns the meta object for the attribute '{@link lqn.LqnModel#getLqnSchemaVersion <em>Lqn Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lqn Schema Version</em>'.
	 * @see lqn.LqnModel#getLqnSchemaVersion()
	 * @see #getLqnModel()
	 * @generated
	 */
	EAttribute getLqnModel_LqnSchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link lqn.LqnModel#getLqncoreSchemaVersion <em>Lqncore Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lqncore Schema Version</em>'.
	 * @see lqn.LqnModel#getLqncoreSchemaVersion()
	 * @see #getLqnModel()
	 * @generated
	 */
	EAttribute getLqnModel_LqncoreSchemaVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.LqnModel#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see lqn.LqnModel#getProcessor()
	 * @see #getLqnModel()
	 * @generated
	 */
	EReference getLqnModel_Processor();

	/**
	 * Returns the meta object for class '{@link lqn.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see lqn.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lqn.Processor#getName()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Name();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Processor#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see lqn.Processor#getMultiplicity()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Processor#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see lqn.Processor#getSpeedFactor()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_SpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Processor#getScheduling <em>Scheduling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling</em>'.
	 * @see lqn.Processor#getScheduling()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Scheduling();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Processor#getReplication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see lqn.Processor#getReplication()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Replication();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Processor#getQuantum <em>Quantum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantum</em>'.
	 * @see lqn.Processor#getQuantum()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Quantum();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.Processor#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see lqn.Processor#getTask()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_Task();

	/**
	 * Returns the meta object for class '{@link lqn.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see lqn.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lqn.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Task#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see lqn.Task#getMultiplicity()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Task#getQueueLength <em>Queue Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Length</em>'.
	 * @see lqn.Task#getQueueLength()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_QueueLength();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Task#getReplication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication</em>'.
	 * @see lqn.Task#getReplication()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Replication();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Task#getScheduling <em>Scheduling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling</em>'.
	 * @see lqn.Task#getScheduling()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Scheduling();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Task#getActivityGraph <em>Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Graph</em>'.
	 * @see lqn.Task#getActivityGraph()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ActivityGraph();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Task#getThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Think Time</em>'.
	 * @see lqn.Task#getThinkTime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ThinkTime();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see lqn.Task#getPriority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.Task#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see lqn.Task#getEntry()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.Task#getTaskActivity <em>Task Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Activity</em>'.
	 * @see lqn.Task#getTaskActivity()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_TaskActivity();

	/**
	 * Returns the meta object for class '{@link lqn.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see lqn.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Entry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lqn.Entry#getName()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Entry#getOpenArrivalRate <em>Open Arrival Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Arrival Rate</em>'.
	 * @see lqn.Entry#getOpenArrivalRate()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_OpenArrivalRate();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Entry#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see lqn.Entry#getPriority()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Priority();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Entry#getSemaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semaphore</em>'.
	 * @see lqn.Entry#getSemaphore()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Semaphore();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Entry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lqn.Entry#getType()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Type();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.Entry#getEntryActivityGraph <em>Entry Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Activity Graph</em>'.
	 * @see lqn.Entry#getEntryActivityGraph()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_EntryActivityGraph();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.Entry#getEntryPhaseActivities <em>Entry Phase Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Phase Activities</em>'.
	 * @see lqn.Entry#getEntryPhaseActivities()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_EntryPhaseActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.Entry#getForwarding <em>Forwarding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forwarding</em>'.
	 * @see lqn.Entry#getForwarding()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Forwarding();

	/**
	 * Returns the meta object for class '{@link lqn.TaskActivityGraph <em>Task Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Activity Graph</em>'.
	 * @see lqn.TaskActivityGraph
	 * @generated
	 */
	EClass getTaskActivityGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.TaskActivityGraph#getReplyEntry <em>Reply Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Entry</em>'.
	 * @see lqn.TaskActivityGraph#getReplyEntry()
	 * @see #getTaskActivityGraph()
	 * @generated
	 */
	EReference getTaskActivityGraph_ReplyEntry();

	/**
	 * Returns the meta object for class '{@link lqn.EntryActivityGraph <em>Entry Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Activity Graph</em>'.
	 * @see lqn.EntryActivityGraph
	 * @generated
	 */
	EClass getEntryActivityGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.EntryActivityGraph#getReplyActivity <em>Reply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Activity</em>'.
	 * @see lqn.EntryActivityGraph#getReplyActivity()
	 * @see #getEntryActivityGraph()
	 * @generated
	 */
	EReference getEntryActivityGraph_ReplyActivity();

	/**
	 * Returns the meta object for class '{@link lqn.PhaseActivities <em>Phase Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Activities</em>'.
	 * @see lqn.PhaseActivities
	 * @generated
	 */
	EClass getPhaseActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.PhaseActivities#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see lqn.PhaseActivities#getActivity()
	 * @see #getPhaseActivities()
	 * @generated
	 */
	EReference getPhaseActivities_Activity();

	/**
	 * Returns the meta object for class '{@link lqn.EntryMakingCall <em>Entry Making Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Making Call</em>'.
	 * @see lqn.EntryMakingCall
	 * @generated
	 */
	EClass getEntryMakingCall();

	/**
	 * Returns the meta object for the attribute '{@link lqn.EntryMakingCall#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see lqn.EntryMakingCall#getProb()
	 * @see #getEntryMakingCall()
	 * @generated
	 */
	EAttribute getEntryMakingCall_Prob();

	/**
	 * Returns the meta object for class '{@link lqn.MakingCall <em>Making Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Making Call</em>'.
	 * @see lqn.MakingCall
	 * @generated
	 */
	EClass getMakingCall();

	/**
	 * Returns the meta object for the attribute '{@link lqn.MakingCall#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see lqn.MakingCall#getDest()
	 * @see #getMakingCall()
	 * @generated
	 */
	EAttribute getMakingCall_Dest();

	/**
	 * Returns the meta object for the attribute '{@link lqn.MakingCall#getFanin <em>Fanin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fanin</em>'.
	 * @see lqn.MakingCall#getFanin()
	 * @see #getMakingCall()
	 * @generated
	 */
	EAttribute getMakingCall_Fanin();

	/**
	 * Returns the meta object for the attribute '{@link lqn.MakingCall#getFanout <em>Fanout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fanout</em>'.
	 * @see lqn.MakingCall#getFanout()
	 * @see #getMakingCall()
	 * @generated
	 */
	EAttribute getMakingCall_Fanout();

	/**
	 * Returns the meta object for class '{@link lqn.ActivityMakingCall <em>Activity Making Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Making Call</em>'.
	 * @see lqn.ActivityMakingCall
	 * @generated
	 */
	EClass getActivityMakingCall();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityMakingCall#getCallsMean <em>Calls Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calls Mean</em>'.
	 * @see lqn.ActivityMakingCall#getCallsMean()
	 * @see #getActivityMakingCall()
	 * @generated
	 */
	EAttribute getActivityMakingCall_CallsMean();

	/**
	 * Returns the meta object for class '{@link lqn.ActivityPhase <em>Activity Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Phase</em>'.
	 * @see lqn.ActivityPhase
	 * @generated
	 */
	EClass getActivityPhase();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityPhase#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see lqn.ActivityPhase#getPhase()
	 * @see #getActivityPhase()
	 * @generated
	 */
	EAttribute getActivityPhase_Phase();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ActivityPhase#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see lqn.ActivityPhase#getSynchCall()
	 * @see #getActivityPhase()
	 * @generated
	 */
	EReference getActivityPhase_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ActivityPhase#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see lqn.ActivityPhase#getAsynchCall()
	 * @see #getActivityPhase()
	 * @generated
	 */
	EReference getActivityPhase_AsynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ActivityPhase#getCallList <em>Call List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call List</em>'.
	 * @see lqn.ActivityPhase#getCallList()
	 * @see #getActivityPhase()
	 * @generated
	 */
	EReference getActivityPhase_CallList();

	/**
	 * Returns the meta object for class '{@link lqn.ActivityDefBase <em>Activity Def Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Def Base</em>'.
	 * @see lqn.ActivityDefBase
	 * @generated
	 */
	EClass getActivityDefBase();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityDefBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lqn.ActivityDefBase#getName()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityDefBase#getHostDemandMean <em>Host Demand Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Demand Mean</em>'.
	 * @see lqn.ActivityDefBase#getHostDemandMean()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_HostDemandMean();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityDefBase#getHostDemandCvsq <em>Host Demand Cvsq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Demand Cvsq</em>'.
	 * @see lqn.ActivityDefBase#getHostDemandCvsq()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_HostDemandCvsq();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityDefBase#getThinkTime <em>Think Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Think Time</em>'.
	 * @see lqn.ActivityDefBase#getThinkTime()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_ThinkTime();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityDefBase#getMaxServiceTime <em>Max Service Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Service Time</em>'.
	 * @see lqn.ActivityDefBase#getMaxServiceTime()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_MaxServiceTime();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityDefBase#getCallOrder <em>Call Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Order</em>'.
	 * @see lqn.ActivityDefBase#getCallOrder()
	 * @see #getActivityDefBase()
	 * @generated
	 */
	EAttribute getActivityDefBase_CallOrder();

	/**
	 * Returns the meta object for class '{@link lqn.ActivityDef <em>Activity Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Def</em>'.
	 * @see lqn.ActivityDef
	 * @generated
	 */
	EClass getActivityDef();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityDef#getBoundToEntry <em>Bound To Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound To Entry</em>'.
	 * @see lqn.ActivityDef#getBoundToEntry()
	 * @see #getActivityDef()
	 * @generated
	 */
	EAttribute getActivityDef_BoundToEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ActivityDef#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see lqn.ActivityDef#getSynchCall()
	 * @see #getActivityDef()
	 * @generated
	 */
	EReference getActivityDef_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ActivityDef#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see lqn.ActivityDef#getAsynchCall()
	 * @see #getActivityDef()
	 * @generated
	 */
	EReference getActivityDef_AsynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ActivityDef#getCallList <em>Call List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call List</em>'.
	 * @see lqn.ActivityDef#getCallList()
	 * @see #getActivityDef()
	 * @generated
	 */
	EReference getActivityDef_CallList();

	/**
	 * Returns the meta object for class '{@link lqn.CallList <em>Call List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call List</em>'.
	 * @see lqn.CallList
	 * @generated
	 */
	EClass getCallList();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.CallList#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see lqn.CallList#getSynchCall()
	 * @see #getCallList()
	 * @generated
	 */
	EReference getCallList_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.CallList#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see lqn.CallList#getAsynchCall()
	 * @see #getCallList()
	 * @generated
	 */
	EReference getCallList_AsynchCall();

	/**
	 * Returns the meta object for class '{@link lqn.EntryActivityDef <em>Entry Activity Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Activity Def</em>'.
	 * @see lqn.EntryActivityDef
	 * @generated
	 */
	EClass getEntryActivityDef();

	/**
	 * Returns the meta object for the attribute '{@link lqn.EntryActivityDef#getFirstActivity <em>First Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Activity</em>'.
	 * @see lqn.EntryActivityDef#getFirstActivity()
	 * @see #getEntryActivityDef()
	 * @generated
	 */
	EAttribute getEntryActivityDef_FirstActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.EntryActivityDef#getSynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synch Call</em>'.
	 * @see lqn.EntryActivityDef#getSynchCall()
	 * @see #getEntryActivityDef()
	 * @generated
	 */
	EReference getEntryActivityDef_SynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.EntryActivityDef#getAsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynch Call</em>'.
	 * @see lqn.EntryActivityDef#getAsynchCall()
	 * @see #getEntryActivityDef()
	 * @generated
	 */
	EReference getEntryActivityDef_AsynchCall();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.EntryActivityDef#getCallList <em>Call List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Call List</em>'.
	 * @see lqn.EntryActivityDef#getCallList()
	 * @see #getEntryActivityDef()
	 * @generated
	 */
	EReference getEntryActivityDef_CallList();

	/**
	 * Returns the meta object for class '{@link lqn.SynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synch Call</em>'.
	 * @see lqn.SynchCall
	 * @generated
	 */
	EClass getSynchCall();

	/**
	 * Returns the meta object for the attribute '{@link lqn.SynchCall#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see lqn.SynchCall#getDest()
	 * @see #getSynchCall()
	 * @generated
	 */
	EAttribute getSynchCall_Dest();

	/**
	 * Returns the meta object for the attribute '{@link lqn.SynchCall#getFanin <em>Fanin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fanin</em>'.
	 * @see lqn.SynchCall#getFanin()
	 * @see #getSynchCall()
	 * @generated
	 */
	EAttribute getSynchCall_Fanin();

	/**
	 * Returns the meta object for the attribute '{@link lqn.SynchCall#getFanout <em>Fanout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fanout</em>'.
	 * @see lqn.SynchCall#getFanout()
	 * @see #getSynchCall()
	 * @generated
	 */
	EAttribute getSynchCall_Fanout();

	/**
	 * Returns the meta object for class '{@link lqn.AsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynch Call</em>'.
	 * @see lqn.AsynchCall
	 * @generated
	 */
	EClass getAsynchCall();

	/**
	 * Returns the meta object for the attribute '{@link lqn.AsynchCall#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see lqn.AsynchCall#getDest()
	 * @see #getAsynchCall()
	 * @generated
	 */
	EAttribute getAsynchCall_Dest();

	/**
	 * Returns the meta object for the attribute '{@link lqn.AsynchCall#getFanin <em>Fanin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fanin</em>'.
	 * @see lqn.AsynchCall#getFanin()
	 * @see #getAsynchCall()
	 * @generated
	 */
	EAttribute getAsynchCall_Fanin();

	/**
	 * Returns the meta object for the attribute '{@link lqn.AsynchCall#getFanout <em>Fanout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fanout</em>'.
	 * @see lqn.AsynchCall#getFanout()
	 * @see #getAsynchCall()
	 * @generated
	 */
	EAttribute getAsynchCall_Fanout();

	/**
	 * Returns the meta object for class '{@link lqn.ActivityGraph <em>Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Graph</em>'.
	 * @see lqn.ActivityGraph
	 * @generated
	 */
	EClass getActivityGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ActivityGraph#getPrecedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precedence</em>'.
	 * @see lqn.ActivityGraph#getPrecedence()
	 * @see #getActivityGraph()
	 * @generated
	 */
	EReference getActivityGraph_Precedence();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ActivityGraph#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see lqn.ActivityGraph#getActivity()
	 * @see #getActivityGraph()
	 * @generated
	 */
	EReference getActivityGraph_Activity();

	/**
	 * Returns the meta object for class '{@link lqn.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence</em>'.
	 * @see lqn.Precedence
	 * @generated
	 */
	EClass getPrecedence();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.Precedence#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see lqn.Precedence#getPre()
	 * @see #getPrecedence()
	 * @generated
	 */
	EReference getPrecedence_Pre();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.Precedence#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see lqn.Precedence#getPost()
	 * @see #getPrecedence()
	 * @generated
	 */
	EReference getPrecedence_Post();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.Precedence#getPreAND <em>Pre AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre AND</em>'.
	 * @see lqn.Precedence#getPreAND()
	 * @see #getPrecedence()
	 * @generated
	 */
	EReference getPrecedence_PreAND();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.Precedence#getPostAND <em>Post AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post AND</em>'.
	 * @see lqn.Precedence#getPostAND()
	 * @see #getPrecedence()
	 * @generated
	 */
	EReference getPrecedence_PostAND();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.Precedence#getPreOR <em>Pre OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre OR</em>'.
	 * @see lqn.Precedence#getPreOR()
	 * @see #getPrecedence()
	 * @generated
	 */
	EReference getPrecedence_PreOR();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.Precedence#getPostOR <em>Post OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post OR</em>'.
	 * @see lqn.Precedence#getPostOR()
	 * @see #getPrecedence()
	 * @generated
	 */
	EReference getPrecedence_PostOR();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.Precedence#getPostLOOP <em>Post LOOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post LOOP</em>'.
	 * @see lqn.Precedence#getPostLOOP()
	 * @see #getPrecedence()
	 * @generated
	 */
	EReference getPrecedence_PostLOOP();

	/**
	 * Returns the meta object for class '{@link lqn.ReplyActivity <em>Reply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply Activity</em>'.
	 * @see lqn.ReplyActivity
	 * @generated
	 */
	EClass getReplyActivity();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ReplyActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lqn.ReplyActivity#getName()
	 * @see #getReplyActivity()
	 * @generated
	 */
	EAttribute getReplyActivity_Name();

	/**
	 * Returns the meta object for class '{@link lqn.ReplyEntry <em>Reply Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply Entry</em>'.
	 * @see lqn.ReplyEntry
	 * @generated
	 */
	EClass getReplyEntry();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ReplyEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lqn.ReplyEntry#getName()
	 * @see #getReplyEntry()
	 * @generated
	 */
	EAttribute getReplyEntry_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ReplyEntry#getReplyActivity <em>Reply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Activity</em>'.
	 * @see lqn.ReplyEntry#getReplyActivity()
	 * @see #getReplyEntry()
	 * @generated
	 */
	EReference getReplyEntry_ReplyActivity();

	/**
	 * Returns the meta object for class '{@link lqn.SingleActivityList <em>Single Activity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Activity List</em>'.
	 * @see lqn.SingleActivityList
	 * @generated
	 */
	EClass getSingleActivityList();

	/**
	 * Returns the meta object for the containment reference '{@link lqn.SingleActivityList#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see lqn.SingleActivityList#getActivity()
	 * @see #getSingleActivityList()
	 * @generated
	 */
	EReference getSingleActivityList_Activity();

	/**
	 * Returns the meta object for class '{@link lqn.ActivityLoopList <em>Activity Loop List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Loop List</em>'.
	 * @see lqn.ActivityLoopList
	 * @generated
	 */
	EClass getActivityLoopList();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityLoopList#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see lqn.ActivityLoopList#getEnd()
	 * @see #getActivityLoopList()
	 * @generated
	 */
	EAttribute getActivityLoopList_End();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ActivityLoopList#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see lqn.ActivityLoopList#getActivity()
	 * @see #getActivityLoopList()
	 * @generated
	 */
	EReference getActivityLoopList_Activity();

	/**
	 * Returns the meta object for class '{@link lqn.AndJoinList <em>And Join List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Join List</em>'.
	 * @see lqn.AndJoinList
	 * @generated
	 */
	EClass getAndJoinList();

	/**
	 * Returns the meta object for the attribute '{@link lqn.AndJoinList#getQuorum <em>Quorum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quorum</em>'.
	 * @see lqn.AndJoinList#getQuorum()
	 * @see #getAndJoinList()
	 * @generated
	 */
	EAttribute getAndJoinList_Quorum();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.AndJoinList#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see lqn.AndJoinList#getActivity()
	 * @see #getAndJoinList()
	 * @generated
	 */
	EReference getAndJoinList_Activity();

	/**
	 * Returns the meta object for class '{@link lqn.ActivityList <em>Activity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity List</em>'.
	 * @see lqn.ActivityList
	 * @generated
	 */
	EClass getActivityList();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.ActivityList#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see lqn.ActivityList#getActivity()
	 * @see #getActivityList()
	 * @generated
	 */
	EReference getActivityList_Activity();

	/**
	 * Returns the meta object for class '{@link lqn.OrList <em>Or List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or List</em>'.
	 * @see lqn.OrList
	 * @generated
	 */
	EClass getOrList();

	/**
	 * Returns the meta object for the containment reference list '{@link lqn.OrList#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see lqn.OrList#getActivity()
	 * @see #getOrList()
	 * @generated
	 */
	EReference getOrList_Activity();

	/**
	 * Returns the meta object for class '{@link lqn.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see lqn.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link lqn.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lqn.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for class '{@link lqn.ActivityOr <em>Activity Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Or</em>'.
	 * @see lqn.ActivityOr
	 * @generated
	 */
	EClass getActivityOr();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityOr#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see lqn.ActivityOr#getProb()
	 * @see #getActivityOr()
	 * @generated
	 */
	EAttribute getActivityOr_Prob();

	/**
	 * Returns the meta object for class '{@link lqn.ActivityLoop <em>Activity Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Loop</em>'.
	 * @see lqn.ActivityLoop
	 * @generated
	 */
	EClass getActivityLoop();

	/**
	 * Returns the meta object for the attribute '{@link lqn.ActivityLoop#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see lqn.ActivityLoop#getCount()
	 * @see #getActivityLoop()
	 * @generated
	 */
	EAttribute getActivityLoop_Count();

	/**
	 * Returns the meta object for enum '{@link lqn.SchedulingType <em>Scheduling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Type</em>'.
	 * @see lqn.SchedulingType
	 * @generated
	 */
	EEnum getSchedulingType();

	/**
	 * Returns the meta object for enum '{@link lqn.TaskSchedulingType <em>Task Scheduling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Scheduling Type</em>'.
	 * @see lqn.TaskSchedulingType
	 * @generated
	 */
	EEnum getTaskSchedulingType();

	/**
	 * Returns the meta object for enum '{@link lqn.TaskOptionType <em>Task Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Option Type</em>'.
	 * @see lqn.TaskOptionType
	 * @generated
	 */
	EEnum getTaskOptionType();

	/**
	 * Returns the meta object for enum '{@link lqn.Semaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semaphore</em>'.
	 * @see lqn.Semaphore
	 * @generated
	 */
	EEnum getSemaphore();

	/**
	 * Returns the meta object for enum '{@link lqn.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entry Type</em>'.
	 * @see lqn.EntryType
	 * @generated
	 */
	EEnum getEntryType();

	/**
	 * Returns the meta object for enum '{@link lqn.CallOrder <em>Call Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Call Order</em>'.
	 * @see lqn.CallOrder
	 * @generated
	 */
	EEnum getCallOrder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LqnFactory getLqnFactory();

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
		 * The meta object literal for the '{@link lqn.impl.LqnModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.LqnModelImpl
		 * @see lqn.impl.LqnPackageImpl#getLqnModel()
		 * @generated
		 */
		EClass LQN_MODEL = eINSTANCE.getLqnModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL__NAME = eINSTANCE.getLqnModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL__DESCRIPTION = eINSTANCE.getLqnModel_Description();

		/**
		 * The meta object literal for the '<em><b>Lqn Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL__LQN_SCHEMA_VERSION = eINSTANCE.getLqnModel_LqnSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Lqncore Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LQN_MODEL__LQNCORE_SCHEMA_VERSION = eINSTANCE.getLqnModel_LqncoreSchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LQN_MODEL__PROCESSOR = eINSTANCE.getLqnModel_Processor();

		/**
		 * The meta object literal for the '{@link lqn.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ProcessorImpl
		 * @see lqn.impl.LqnPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getProcessor_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__MULTIPLICITY = eINSTANCE.getProcessor_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__SPEED_FACTOR = eINSTANCE.getProcessor_SpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Scheduling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__SCHEDULING = eINSTANCE.getProcessor_Scheduling();

		/**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__REPLICATION = eINSTANCE.getProcessor_Replication();

		/**
		 * The meta object literal for the '<em><b>Quantum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__QUANTUM = eINSTANCE.getProcessor_Quantum();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__TASK = eINSTANCE.getProcessor_Task();

		/**
		 * The meta object literal for the '{@link lqn.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.TaskImpl
		 * @see lqn.impl.LqnPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MULTIPLICITY = eINSTANCE.getTask_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Queue Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__QUEUE_LENGTH = eINSTANCE.getTask_QueueLength();

		/**
		 * The meta object literal for the '<em><b>Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__REPLICATION = eINSTANCE.getTask_Replication();

		/**
		 * The meta object literal for the '<em><b>Scheduling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SCHEDULING = eINSTANCE.getTask_Scheduling();

		/**
		 * The meta object literal for the '<em><b>Activity Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ACTIVITY_GRAPH = eINSTANCE.getTask_ActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Think Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__THINK_TIME = eINSTANCE.getTask_ThinkTime();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIORITY = eINSTANCE.getTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ENTRY = eINSTANCE.getTask_Entry();

		/**
		 * The meta object literal for the '<em><b>Task Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TASK_ACTIVITY = eINSTANCE.getTask_TaskActivity();

		/**
		 * The meta object literal for the '{@link lqn.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.EntryImpl
		 * @see lqn.impl.LqnPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__NAME = eINSTANCE.getEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Open Arrival Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__OPEN_ARRIVAL_RATE = eINSTANCE.getEntry_OpenArrivalRate();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__PRIORITY = eINSTANCE.getEntry_Priority();

		/**
		 * The meta object literal for the '<em><b>Semaphore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__SEMAPHORE = eINSTANCE.getEntry_Semaphore();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__TYPE = eINSTANCE.getEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Entry Activity Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__ENTRY_ACTIVITY_GRAPH = eINSTANCE.getEntry_EntryActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Entry Phase Activities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__ENTRY_PHASE_ACTIVITIES = eINSTANCE.getEntry_EntryPhaseActivities();

		/**
		 * The meta object literal for the '<em><b>Forwarding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__FORWARDING = eINSTANCE.getEntry_Forwarding();

		/**
		 * The meta object literal for the '{@link lqn.impl.TaskActivityGraphImpl <em>Task Activity Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.TaskActivityGraphImpl
		 * @see lqn.impl.LqnPackageImpl#getTaskActivityGraph()
		 * @generated
		 */
		EClass TASK_ACTIVITY_GRAPH = eINSTANCE.getTaskActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Reply Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_ACTIVITY_GRAPH__REPLY_ENTRY = eINSTANCE.getTaskActivityGraph_ReplyEntry();

		/**
		 * The meta object literal for the '{@link lqn.impl.EntryActivityGraphImpl <em>Entry Activity Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.EntryActivityGraphImpl
		 * @see lqn.impl.LqnPackageImpl#getEntryActivityGraph()
		 * @generated
		 */
		EClass ENTRY_ACTIVITY_GRAPH = eINSTANCE.getEntryActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Reply Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY = eINSTANCE.getEntryActivityGraph_ReplyActivity();

		/**
		 * The meta object literal for the '{@link lqn.impl.PhaseActivitiesImpl <em>Phase Activities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.PhaseActivitiesImpl
		 * @see lqn.impl.LqnPackageImpl#getPhaseActivities()
		 * @generated
		 */
		EClass PHASE_ACTIVITIES = eINSTANCE.getPhaseActivities();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_ACTIVITIES__ACTIVITY = eINSTANCE.getPhaseActivities_Activity();

		/**
		 * The meta object literal for the '{@link lqn.impl.EntryMakingCallImpl <em>Entry Making Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.EntryMakingCallImpl
		 * @see lqn.impl.LqnPackageImpl#getEntryMakingCall()
		 * @generated
		 */
		EClass ENTRY_MAKING_CALL = eINSTANCE.getEntryMakingCall();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_MAKING_CALL__PROB = eINSTANCE.getEntryMakingCall_Prob();

		/**
		 * The meta object literal for the '{@link lqn.impl.MakingCallImpl <em>Making Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.MakingCallImpl
		 * @see lqn.impl.LqnPackageImpl#getMakingCall()
		 * @generated
		 */
		EClass MAKING_CALL = eINSTANCE.getMakingCall();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAKING_CALL__DEST = eINSTANCE.getMakingCall_Dest();

		/**
		 * The meta object literal for the '<em><b>Fanin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAKING_CALL__FANIN = eINSTANCE.getMakingCall_Fanin();

		/**
		 * The meta object literal for the '<em><b>Fanout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAKING_CALL__FANOUT = eINSTANCE.getMakingCall_Fanout();

		/**
		 * The meta object literal for the '{@link lqn.impl.ActivityMakingCallImpl <em>Activity Making Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ActivityMakingCallImpl
		 * @see lqn.impl.LqnPackageImpl#getActivityMakingCall()
		 * @generated
		 */
		EClass ACTIVITY_MAKING_CALL = eINSTANCE.getActivityMakingCall();

		/**
		 * The meta object literal for the '<em><b>Calls Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_MAKING_CALL__CALLS_MEAN = eINSTANCE.getActivityMakingCall_CallsMean();

		/**
		 * The meta object literal for the '{@link lqn.impl.ActivityPhaseImpl <em>Activity Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ActivityPhaseImpl
		 * @see lqn.impl.LqnPackageImpl#getActivityPhase()
		 * @generated
		 */
		EClass ACTIVITY_PHASE = eINSTANCE.getActivityPhase();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PHASE__PHASE = eINSTANCE.getActivityPhase_Phase();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PHASE__SYNCH_CALL = eINSTANCE.getActivityPhase_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PHASE__ASYNCH_CALL = eINSTANCE.getActivityPhase_AsynchCall();

		/**
		 * The meta object literal for the '<em><b>Call List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PHASE__CALL_LIST = eINSTANCE.getActivityPhase_CallList();

		/**
		 * The meta object literal for the '{@link lqn.impl.ActivityDefBaseImpl <em>Activity Def Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ActivityDefBaseImpl
		 * @see lqn.impl.LqnPackageImpl#getActivityDefBase()
		 * @generated
		 */
		EClass ACTIVITY_DEF_BASE = eINSTANCE.getActivityDefBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__NAME = eINSTANCE.getActivityDefBase_Name();

		/**
		 * The meta object literal for the '<em><b>Host Demand Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN = eINSTANCE.getActivityDefBase_HostDemandMean();

		/**
		 * The meta object literal for the '<em><b>Host Demand Cvsq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ = eINSTANCE.getActivityDefBase_HostDemandCvsq();

		/**
		 * The meta object literal for the '<em><b>Think Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__THINK_TIME = eINSTANCE.getActivityDefBase_ThinkTime();

		/**
		 * The meta object literal for the '<em><b>Max Service Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__MAX_SERVICE_TIME = eINSTANCE.getActivityDefBase_MaxServiceTime();

		/**
		 * The meta object literal for the '<em><b>Call Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF_BASE__CALL_ORDER = eINSTANCE.getActivityDefBase_CallOrder();

		/**
		 * The meta object literal for the '{@link lqn.impl.ActivityDefImpl <em>Activity Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ActivityDefImpl
		 * @see lqn.impl.LqnPackageImpl#getActivityDef()
		 * @generated
		 */
		EClass ACTIVITY_DEF = eINSTANCE.getActivityDef();

		/**
		 * The meta object literal for the '<em><b>Bound To Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DEF__BOUND_TO_ENTRY = eINSTANCE.getActivityDef_BoundToEntry();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF__SYNCH_CALL = eINSTANCE.getActivityDef_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF__ASYNCH_CALL = eINSTANCE.getActivityDef_AsynchCall();

		/**
		 * The meta object literal for the '<em><b>Call List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF__CALL_LIST = eINSTANCE.getActivityDef_CallList();

		/**
		 * The meta object literal for the '{@link lqn.impl.CallListImpl <em>Call List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.CallListImpl
		 * @see lqn.impl.LqnPackageImpl#getCallList()
		 * @generated
		 */
		EClass CALL_LIST = eINSTANCE.getCallList();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_LIST__SYNCH_CALL = eINSTANCE.getCallList_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_LIST__ASYNCH_CALL = eINSTANCE.getCallList_AsynchCall();

		/**
		 * The meta object literal for the '{@link lqn.impl.EntryActivityDefImpl <em>Entry Activity Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.EntryActivityDefImpl
		 * @see lqn.impl.LqnPackageImpl#getEntryActivityDef()
		 * @generated
		 */
		EClass ENTRY_ACTIVITY_DEF = eINSTANCE.getEntryActivityDef();

		/**
		 * The meta object literal for the '<em><b>First Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_ACTIVITY_DEF__FIRST_ACTIVITY = eINSTANCE.getEntryActivityDef_FirstActivity();

		/**
		 * The meta object literal for the '<em><b>Synch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_DEF__SYNCH_CALL = eINSTANCE.getEntryActivityDef_SynchCall();

		/**
		 * The meta object literal for the '<em><b>Asynch Call</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_DEF__ASYNCH_CALL = eINSTANCE.getEntryActivityDef_AsynchCall();

		/**
		 * The meta object literal for the '<em><b>Call List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_ACTIVITY_DEF__CALL_LIST = eINSTANCE.getEntryActivityDef_CallList();

		/**
		 * The meta object literal for the '{@link lqn.impl.SynchCallImpl <em>Synch Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.SynchCallImpl
		 * @see lqn.impl.LqnPackageImpl#getSynchCall()
		 * @generated
		 */
		EClass SYNCH_CALL = eINSTANCE.getSynchCall();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCH_CALL__DEST = eINSTANCE.getSynchCall_Dest();

		/**
		 * The meta object literal for the '<em><b>Fanin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCH_CALL__FANIN = eINSTANCE.getSynchCall_Fanin();

		/**
		 * The meta object literal for the '<em><b>Fanout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCH_CALL__FANOUT = eINSTANCE.getSynchCall_Fanout();

		/**
		 * The meta object literal for the '{@link lqn.impl.AsynchCallImpl <em>Asynch Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.AsynchCallImpl
		 * @see lqn.impl.LqnPackageImpl#getAsynchCall()
		 * @generated
		 */
		EClass ASYNCH_CALL = eINSTANCE.getAsynchCall();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNCH_CALL__DEST = eINSTANCE.getAsynchCall_Dest();

		/**
		 * The meta object literal for the '<em><b>Fanin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNCH_CALL__FANIN = eINSTANCE.getAsynchCall_Fanin();

		/**
		 * The meta object literal for the '<em><b>Fanout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNCH_CALL__FANOUT = eINSTANCE.getAsynchCall_Fanout();

		/**
		 * The meta object literal for the '{@link lqn.impl.ActivityGraphImpl <em>Activity Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ActivityGraphImpl
		 * @see lqn.impl.LqnPackageImpl#getActivityGraph()
		 * @generated
		 */
		EClass ACTIVITY_GRAPH = eINSTANCE.getActivityGraph();

		/**
		 * The meta object literal for the '<em><b>Precedence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GRAPH__PRECEDENCE = eINSTANCE.getActivityGraph_Precedence();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GRAPH__ACTIVITY = eINSTANCE.getActivityGraph_Activity();

		/**
		 * The meta object literal for the '{@link lqn.impl.PrecedenceImpl <em>Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.PrecedenceImpl
		 * @see lqn.impl.LqnPackageImpl#getPrecedence()
		 * @generated
		 */
		EClass PRECEDENCE = eINSTANCE.getPrecedence();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__PRE = eINSTANCE.getPrecedence_Pre();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__POST = eINSTANCE.getPrecedence_Post();

		/**
		 * The meta object literal for the '<em><b>Pre AND</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__PRE_AND = eINSTANCE.getPrecedence_PreAND();

		/**
		 * The meta object literal for the '<em><b>Post AND</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__POST_AND = eINSTANCE.getPrecedence_PostAND();

		/**
		 * The meta object literal for the '<em><b>Pre OR</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__PRE_OR = eINSTANCE.getPrecedence_PreOR();

		/**
		 * The meta object literal for the '<em><b>Post OR</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__POST_OR = eINSTANCE.getPrecedence_PostOR();

		/**
		 * The meta object literal for the '<em><b>Post LOOP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE__POST_LOOP = eINSTANCE.getPrecedence_PostLOOP();

		/**
		 * The meta object literal for the '{@link lqn.impl.ReplyActivityImpl <em>Reply Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ReplyActivityImpl
		 * @see lqn.impl.LqnPackageImpl#getReplyActivity()
		 * @generated
		 */
		EClass REPLY_ACTIVITY = eINSTANCE.getReplyActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY_ACTIVITY__NAME = eINSTANCE.getReplyActivity_Name();

		/**
		 * The meta object literal for the '{@link lqn.impl.ReplyEntryImpl <em>Reply Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ReplyEntryImpl
		 * @see lqn.impl.LqnPackageImpl#getReplyEntry()
		 * @generated
		 */
		EClass REPLY_ENTRY = eINSTANCE.getReplyEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY_ENTRY__NAME = eINSTANCE.getReplyEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Reply Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_ENTRY__REPLY_ACTIVITY = eINSTANCE.getReplyEntry_ReplyActivity();

		/**
		 * The meta object literal for the '{@link lqn.impl.SingleActivityListImpl <em>Single Activity List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.SingleActivityListImpl
		 * @see lqn.impl.LqnPackageImpl#getSingleActivityList()
		 * @generated
		 */
		EClass SINGLE_ACTIVITY_LIST = eINSTANCE.getSingleActivityList();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_ACTIVITY_LIST__ACTIVITY = eINSTANCE.getSingleActivityList_Activity();

		/**
		 * The meta object literal for the '{@link lqn.impl.ActivityLoopListImpl <em>Activity Loop List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ActivityLoopListImpl
		 * @see lqn.impl.LqnPackageImpl#getActivityLoopList()
		 * @generated
		 */
		EClass ACTIVITY_LOOP_LIST = eINSTANCE.getActivityLoopList();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_LOOP_LIST__END = eINSTANCE.getActivityLoopList_End();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOOP_LIST__ACTIVITY = eINSTANCE.getActivityLoopList_Activity();

		/**
		 * The meta object literal for the '{@link lqn.impl.AndJoinListImpl <em>And Join List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.AndJoinListImpl
		 * @see lqn.impl.LqnPackageImpl#getAndJoinList()
		 * @generated
		 */
		EClass AND_JOIN_LIST = eINSTANCE.getAndJoinList();

		/**
		 * The meta object literal for the '<em><b>Quorum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AND_JOIN_LIST__QUORUM = eINSTANCE.getAndJoinList_Quorum();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_JOIN_LIST__ACTIVITY = eINSTANCE.getAndJoinList_Activity();

		/**
		 * The meta object literal for the '{@link lqn.impl.ActivityListImpl <em>Activity List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ActivityListImpl
		 * @see lqn.impl.LqnPackageImpl#getActivityList()
		 * @generated
		 */
		EClass ACTIVITY_LIST = eINSTANCE.getActivityList();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LIST__ACTIVITY = eINSTANCE.getActivityList_Activity();

		/**
		 * The meta object literal for the '{@link lqn.impl.OrListImpl <em>Or List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.OrListImpl
		 * @see lqn.impl.LqnPackageImpl#getOrList()
		 * @generated
		 */
		EClass OR_LIST = eINSTANCE.getOrList();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_LIST__ACTIVITY = eINSTANCE.getOrList_Activity();

		/**
		 * The meta object literal for the '{@link lqn.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ActivityImpl
		 * @see lqn.impl.LqnPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '{@link lqn.impl.ActivityOrImpl <em>Activity Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ActivityOrImpl
		 * @see lqn.impl.LqnPackageImpl#getActivityOr()
		 * @generated
		 */
		EClass ACTIVITY_OR = eINSTANCE.getActivityOr();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_OR__PROB = eINSTANCE.getActivityOr_Prob();

		/**
		 * The meta object literal for the '{@link lqn.impl.ActivityLoopImpl <em>Activity Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.impl.ActivityLoopImpl
		 * @see lqn.impl.LqnPackageImpl#getActivityLoop()
		 * @generated
		 */
		EClass ACTIVITY_LOOP = eINSTANCE.getActivityLoop();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_LOOP__COUNT = eINSTANCE.getActivityLoop_Count();

		/**
		 * The meta object literal for the '{@link lqn.SchedulingType <em>Scheduling Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.SchedulingType
		 * @see lqn.impl.LqnPackageImpl#getSchedulingType()
		 * @generated
		 */
		EEnum SCHEDULING_TYPE = eINSTANCE.getSchedulingType();

		/**
		 * The meta object literal for the '{@link lqn.TaskSchedulingType <em>Task Scheduling Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.TaskSchedulingType
		 * @see lqn.impl.LqnPackageImpl#getTaskSchedulingType()
		 * @generated
		 */
		EEnum TASK_SCHEDULING_TYPE = eINSTANCE.getTaskSchedulingType();

		/**
		 * The meta object literal for the '{@link lqn.TaskOptionType <em>Task Option Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.TaskOptionType
		 * @see lqn.impl.LqnPackageImpl#getTaskOptionType()
		 * @generated
		 */
		EEnum TASK_OPTION_TYPE = eINSTANCE.getTaskOptionType();

		/**
		 * The meta object literal for the '{@link lqn.Semaphore <em>Semaphore</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.Semaphore
		 * @see lqn.impl.LqnPackageImpl#getSemaphore()
		 * @generated
		 */
		EEnum SEMAPHORE = eINSTANCE.getSemaphore();

		/**
		 * The meta object literal for the '{@link lqn.EntryType <em>Entry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.EntryType
		 * @see lqn.impl.LqnPackageImpl#getEntryType()
		 * @generated
		 */
		EEnum ENTRY_TYPE = eINSTANCE.getEntryType();

		/**
		 * The meta object literal for the '{@link lqn.CallOrder <em>Call Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lqn.CallOrder
		 * @see lqn.impl.LqnPackageImpl#getCallOrder()
		 * @generated
		 */
		EEnum CALL_ORDER = eINSTANCE.getCallOrder();

	}

} //LqnPackage
