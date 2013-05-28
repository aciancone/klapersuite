/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import lqn.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class LqnFactoryImpl extends EFactoryImpl implements LqnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LqnFactory init() {
		try {
			LqnFactory theLqnFactory = (LqnFactory)EPackage.Registry.INSTANCE.getEFactory("http://klaper.sourceforge.net/metamodels/lqn/1.0"); 
			if (theLqnFactory != null) {
				return theLqnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LqnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnFactoryImpl() {
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
			case LqnPackage.LQN_MODEL: return createLqnModel();
			case LqnPackage.PROCESSOR: return createProcessor();
			case LqnPackage.TASK: return createTask();
			case LqnPackage.ENTRY: return createEntry();
			case LqnPackage.TASK_ACTIVITY_GRAPH: return createTaskActivityGraph();
			case LqnPackage.ENTRY_ACTIVITY_GRAPH: return createEntryActivityGraph();
			case LqnPackage.PHASE_ACTIVITIES: return createPhaseActivities();
			case LqnPackage.ENTRY_MAKING_CALL: return createEntryMakingCall();
			case LqnPackage.MAKING_CALL: return createMakingCall();
			case LqnPackage.ACTIVITY_MAKING_CALL: return createActivityMakingCall();
			case LqnPackage.ACTIVITY_PHASE: return createActivityPhase();
			case LqnPackage.ACTIVITY_DEF_BASE: return createActivityDefBase();
			case LqnPackage.ACTIVITY_DEF: return createActivityDef();
			case LqnPackage.CALL_LIST: return createCallList();
			case LqnPackage.ENTRY_ACTIVITY_DEF: return createEntryActivityDef();
			case LqnPackage.SYNCH_CALL: return createSynchCall();
			case LqnPackage.ASYNCH_CALL: return createAsynchCall();
			case LqnPackage.ACTIVITY_GRAPH: return createActivityGraph();
			case LqnPackage.PRECEDENCE: return createPrecedence();
			case LqnPackage.REPLY_ACTIVITY: return createReplyActivity();
			case LqnPackage.REPLY_ENTRY: return createReplyEntry();
			case LqnPackage.SINGLE_ACTIVITY_LIST: return createSingleActivityList();
			case LqnPackage.ACTIVITY_LOOP_LIST: return createActivityLoopList();
			case LqnPackage.AND_JOIN_LIST: return createAndJoinList();
			case LqnPackage.ACTIVITY_LIST: return createActivityList();
			case LqnPackage.OR_LIST: return createOrList();
			case LqnPackage.ACTIVITY: return createActivity();
			case LqnPackage.ACTIVITY_OR: return createActivityOr();
			case LqnPackage.ACTIVITY_LOOP: return createActivityLoop();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LqnPackage.SCHEDULING_TYPE:
				return createSchedulingTypeFromString(eDataType, initialValue);
			case LqnPackage.TASK_SCHEDULING_TYPE:
				return createTaskSchedulingTypeFromString(eDataType, initialValue);
			case LqnPackage.TASK_OPTION_TYPE:
				return createTaskOptionTypeFromString(eDataType, initialValue);
			case LqnPackage.SEMAPHORE:
				return createSemaphoreFromString(eDataType, initialValue);
			case LqnPackage.ENTRY_TYPE:
				return createEntryTypeFromString(eDataType, initialValue);
			case LqnPackage.CALL_ORDER:
				return createCallOrderFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LqnPackage.SCHEDULING_TYPE:
				return convertSchedulingTypeToString(eDataType, instanceValue);
			case LqnPackage.TASK_SCHEDULING_TYPE:
				return convertTaskSchedulingTypeToString(eDataType, instanceValue);
			case LqnPackage.TASK_OPTION_TYPE:
				return convertTaskOptionTypeToString(eDataType, instanceValue);
			case LqnPackage.SEMAPHORE:
				return convertSemaphoreToString(eDataType, instanceValue);
			case LqnPackage.ENTRY_TYPE:
				return convertEntryTypeToString(eDataType, instanceValue);
			case LqnPackage.CALL_ORDER:
				return convertCallOrderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnModel createLqnModel() {
		LqnModelImpl lqnModel = new LqnModelImpl();
		return lqnModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskActivityGraph createTaskActivityGraph() {
		TaskActivityGraphImpl taskActivityGraph = new TaskActivityGraphImpl();
		return taskActivityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryActivityGraph createEntryActivityGraph() {
		EntryActivityGraphImpl entryActivityGraph = new EntryActivityGraphImpl();
		return entryActivityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseActivities createPhaseActivities() {
		PhaseActivitiesImpl phaseActivities = new PhaseActivitiesImpl();
		return phaseActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryMakingCall createEntryMakingCall() {
		EntryMakingCallImpl entryMakingCall = new EntryMakingCallImpl();
		return entryMakingCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakingCall createMakingCall() {
		MakingCallImpl makingCall = new MakingCallImpl();
		return makingCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityMakingCall createActivityMakingCall() {
		ActivityMakingCallImpl activityMakingCall = new ActivityMakingCallImpl();
		return activityMakingCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPhase createActivityPhase() {
		ActivityPhaseImpl activityPhase = new ActivityPhaseImpl();
		return activityPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefBase createActivityDefBase() {
		ActivityDefBaseImpl activityDefBase = new ActivityDefBaseImpl();
		return activityDefBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDef createActivityDef() {
		ActivityDefImpl activityDef = new ActivityDefImpl();
		return activityDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallList createCallList() {
		CallListImpl callList = new CallListImpl();
		return callList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryActivityDef createEntryActivityDef() {
		EntryActivityDefImpl entryActivityDef = new EntryActivityDefImpl();
		return entryActivityDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchCall createSynchCall() {
		SynchCallImpl synchCall = new SynchCallImpl();
		return synchCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchCall createAsynchCall() {
		AsynchCallImpl asynchCall = new AsynchCallImpl();
		return asynchCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGraph createActivityGraph() {
		ActivityGraphImpl activityGraph = new ActivityGraphImpl();
		return activityGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precedence createPrecedence() {
		PrecedenceImpl precedence = new PrecedenceImpl();
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyActivity createReplyActivity() {
		ReplyActivityImpl replyActivity = new ReplyActivityImpl();
		return replyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyEntry createReplyEntry() {
		ReplyEntryImpl replyEntry = new ReplyEntryImpl();
		return replyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleActivityList createSingleActivityList() {
		SingleActivityListImpl singleActivityList = new SingleActivityListImpl();
		return singleActivityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLoopList createActivityLoopList() {
		ActivityLoopListImpl activityLoopList = new ActivityLoopListImpl();
		return activityLoopList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndJoinList createAndJoinList() {
		AndJoinListImpl andJoinList = new AndJoinListImpl();
		return andJoinList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityList createActivityList() {
		ActivityListImpl activityList = new ActivityListImpl();
		return activityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrList createOrList() {
		OrListImpl orList = new OrListImpl();
		return orList;
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
	public ActivityOr createActivityOr() {
		ActivityOrImpl activityOr = new ActivityOrImpl();
		return activityOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLoop createActivityLoop() {
		ActivityLoopImpl activityLoop = new ActivityLoopImpl();
		return activityLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingType createSchedulingTypeFromString(EDataType eDataType, String initialValue) {
		SchedulingType result = SchedulingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulingType createTaskSchedulingTypeFromString(EDataType eDataType, String initialValue) {
		TaskSchedulingType result = TaskSchedulingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskSchedulingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOptionType createTaskOptionTypeFromString(EDataType eDataType, String initialValue) {
		TaskOptionType result = TaskOptionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskOptionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore createSemaphoreFromString(EDataType eDataType, String initialValue) {
		Semaphore result = Semaphore.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemaphoreToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType createEntryTypeFromString(EDataType eDataType, String initialValue) {
		EntryType result = EntryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOrder createCallOrderFromString(EDataType eDataType, String initialValue) {
		CallOrder result = CallOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnPackage getLqnPackage() {
		return (LqnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LqnPackage getPackage() {
		return LqnPackage.eINSTANCE;
	}

} //LqnFactoryImpl
