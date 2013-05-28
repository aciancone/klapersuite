/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import lqn.Activity;
import lqn.ActivityDef;
import lqn.ActivityDefBase;
import lqn.ActivityGraph;
import lqn.ActivityList;
import lqn.ActivityLoop;
import lqn.ActivityLoopList;
import lqn.ActivityMakingCall;
import lqn.ActivityOr;
import lqn.ActivityPhase;
import lqn.AndJoinList;
import lqn.AsynchCall;
import lqn.CallList;
import lqn.CallOrder;
import lqn.Entry;
import lqn.EntryActivityDef;
import lqn.EntryActivityGraph;
import lqn.EntryMakingCall;
import lqn.EntryType;
import lqn.LqnFactory;
import lqn.LqnModel;
import lqn.LqnPackage;
import lqn.MakingCall;
import lqn.OrList;
import lqn.PhaseActivities;
import lqn.Precedence;
import lqn.Processor;
import lqn.ReplyActivity;
import lqn.ReplyEntry;
import lqn.SchedulingType;
import lqn.Semaphore;
import lqn.SingleActivityList;
import lqn.SynchCall;
import lqn.Task;
import lqn.TaskActivityGraph;
import lqn.TaskOptionType;
import lqn.TaskSchedulingType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LqnPackageImpl extends EPackageImpl implements LqnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lqnModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskActivityGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryActivityGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseActivitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryMakingCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makingCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityMakingCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPhaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDefBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryActivityDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asynchCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleActivityListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityLoopListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andJoinListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskSchedulingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskOptionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semaphoreEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callOrderEEnum = null;

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
	 * @see lqn.LqnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LqnPackageImpl() {
		super(eNS_URI, LqnFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LqnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LqnPackage init() {
		if (isInited) return (LqnPackage)EPackage.Registry.INSTANCE.getEPackage(LqnPackage.eNS_URI);

		// Obtain or create and register package
		LqnPackageImpl theLqnPackage = (LqnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LqnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LqnPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLqnPackage.createPackageContents();

		// Initialize created meta-data
		theLqnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLqnPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LqnPackage.eNS_URI, theLqnPackage);
		return theLqnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLqnModel() {
		return lqnModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLqnModel_Name() {
		return (EAttribute)lqnModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLqnModel_Description() {
		return (EAttribute)lqnModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLqnModel_LqnSchemaVersion() {
		return (EAttribute)lqnModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLqnModel_LqncoreSchemaVersion() {
		return (EAttribute)lqnModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLqnModel_Processor() {
		return (EReference)lqnModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Name() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Multiplicity() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_SpeedFactor() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Scheduling() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Replication() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Quantum() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_Task() {
		return (EReference)processorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Multiplicity() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_QueueLength() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Replication() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Scheduling() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_ActivityGraph() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_ThinkTime() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Priority() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Entry() {
		return (EReference)taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_TaskActivity() {
		return (EReference)taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Name() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_OpenArrivalRate() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Priority() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Semaphore() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Type() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_EntryActivityGraph() {
		return (EReference)entryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_EntryPhaseActivities() {
		return (EReference)entryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntry_Forwarding() {
		return (EReference)entryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskActivityGraph() {
		return taskActivityGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskActivityGraph_ReplyEntry() {
		return (EReference)taskActivityGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryActivityGraph() {
		return entryActivityGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryActivityGraph_ReplyActivity() {
		return (EReference)entryActivityGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhaseActivities() {
		return phaseActivitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaseActivities_Activity() {
		return (EReference)phaseActivitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryMakingCall() {
		return entryMakingCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryMakingCall_Prob() {
		return (EAttribute)entryMakingCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMakingCall() {
		return makingCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMakingCall_Dest() {
		return (EAttribute)makingCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMakingCall_Fanin() {
		return (EAttribute)makingCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMakingCall_Fanout() {
		return (EAttribute)makingCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityMakingCall() {
		return activityMakingCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityMakingCall_CallsMean() {
		return (EAttribute)activityMakingCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPhase() {
		return activityPhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPhase_Phase() {
		return (EAttribute)activityPhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPhase_SynchCall() {
		return (EReference)activityPhaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPhase_AsynchCall() {
		return (EReference)activityPhaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPhase_CallList() {
		return (EReference)activityPhaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDefBase() {
		return activityDefBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_Name() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_HostDemandMean() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_HostDemandCvsq() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_ThinkTime() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_MaxServiceTime() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDefBase_CallOrder() {
		return (EAttribute)activityDefBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDef() {
		return activityDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityDef_BoundToEntry() {
		return (EAttribute)activityDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDef_SynchCall() {
		return (EReference)activityDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDef_AsynchCall() {
		return (EReference)activityDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDef_CallList() {
		return (EReference)activityDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallList() {
		return callListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallList_SynchCall() {
		return (EReference)callListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallList_AsynchCall() {
		return (EReference)callListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryActivityDef() {
		return entryActivityDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryActivityDef_FirstActivity() {
		return (EAttribute)entryActivityDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryActivityDef_SynchCall() {
		return (EReference)entryActivityDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryActivityDef_AsynchCall() {
		return (EReference)entryActivityDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryActivityDef_CallList() {
		return (EReference)entryActivityDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchCall() {
		return synchCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchCall_Dest() {
		return (EAttribute)synchCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchCall_Fanin() {
		return (EAttribute)synchCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchCall_Fanout() {
		return (EAttribute)synchCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsynchCall() {
		return asynchCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsynchCall_Dest() {
		return (EAttribute)asynchCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsynchCall_Fanin() {
		return (EAttribute)asynchCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsynchCall_Fanout() {
		return (EAttribute)asynchCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityGraph() {
		return activityGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGraph_Precedence() {
		return (EReference)activityGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGraph_Activity() {
		return (EReference)activityGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedence() {
		return precedenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedence_Pre() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedence_Post() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedence_PreAND() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedence_PostAND() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedence_PreOR() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedence_PostOR() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecedence_PostLOOP() {
		return (EReference)precedenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyActivity() {
		return replyActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplyActivity_Name() {
		return (EAttribute)replyActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyEntry() {
		return replyEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplyEntry_Name() {
		return (EAttribute)replyEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyEntry_ReplyActivity() {
		return (EReference)replyEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleActivityList() {
		return singleActivityListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleActivityList_Activity() {
		return (EReference)singleActivityListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityLoopList() {
		return activityLoopListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityLoopList_End() {
		return (EAttribute)activityLoopListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityLoopList_Activity() {
		return (EReference)activityLoopListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndJoinList() {
		return andJoinListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndJoinList_Quorum() {
		return (EAttribute)andJoinListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndJoinList_Activity() {
		return (EReference)andJoinListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityList() {
		return activityListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityList_Activity() {
		return (EReference)activityListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrList() {
		return orListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrList_Activity() {
		return (EReference)orListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Name() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityOr() {
		return activityOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityOr_Prob() {
		return (EAttribute)activityOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityLoop() {
		return activityLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityLoop_Count() {
		return (EAttribute)activityLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedulingType() {
		return schedulingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskSchedulingType() {
		return taskSchedulingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskOptionType() {
		return taskOptionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSemaphore() {
		return semaphoreEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntryType() {
		return entryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallOrder() {
		return callOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnFactory getLqnFactory() {
		return (LqnFactory)getEFactoryInstance();
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
		lqnModelEClass = createEClass(LQN_MODEL);
		createEAttribute(lqnModelEClass, LQN_MODEL__NAME);
		createEAttribute(lqnModelEClass, LQN_MODEL__DESCRIPTION);
		createEAttribute(lqnModelEClass, LQN_MODEL__LQN_SCHEMA_VERSION);
		createEAttribute(lqnModelEClass, LQN_MODEL__LQNCORE_SCHEMA_VERSION);
		createEReference(lqnModelEClass, LQN_MODEL__PROCESSOR);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__NAME);
		createEAttribute(processorEClass, PROCESSOR__MULTIPLICITY);
		createEAttribute(processorEClass, PROCESSOR__SPEED_FACTOR);
		createEAttribute(processorEClass, PROCESSOR__SCHEDULING);
		createEAttribute(processorEClass, PROCESSOR__REPLICATION);
		createEAttribute(processorEClass, PROCESSOR__QUANTUM);
		createEReference(processorEClass, PROCESSOR__TASK);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__MULTIPLICITY);
		createEAttribute(taskEClass, TASK__QUEUE_LENGTH);
		createEAttribute(taskEClass, TASK__REPLICATION);
		createEAttribute(taskEClass, TASK__SCHEDULING);
		createEAttribute(taskEClass, TASK__ACTIVITY_GRAPH);
		createEAttribute(taskEClass, TASK__THINK_TIME);
		createEAttribute(taskEClass, TASK__PRIORITY);
		createEReference(taskEClass, TASK__ENTRY);
		createEReference(taskEClass, TASK__TASK_ACTIVITY);

		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__NAME);
		createEAttribute(entryEClass, ENTRY__OPEN_ARRIVAL_RATE);
		createEAttribute(entryEClass, ENTRY__PRIORITY);
		createEAttribute(entryEClass, ENTRY__SEMAPHORE);
		createEAttribute(entryEClass, ENTRY__TYPE);
		createEReference(entryEClass, ENTRY__ENTRY_ACTIVITY_GRAPH);
		createEReference(entryEClass, ENTRY__ENTRY_PHASE_ACTIVITIES);
		createEReference(entryEClass, ENTRY__FORWARDING);

		taskActivityGraphEClass = createEClass(TASK_ACTIVITY_GRAPH);
		createEReference(taskActivityGraphEClass, TASK_ACTIVITY_GRAPH__REPLY_ENTRY);

		entryActivityGraphEClass = createEClass(ENTRY_ACTIVITY_GRAPH);
		createEReference(entryActivityGraphEClass, ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY);

		phaseActivitiesEClass = createEClass(PHASE_ACTIVITIES);
		createEReference(phaseActivitiesEClass, PHASE_ACTIVITIES__ACTIVITY);

		entryMakingCallEClass = createEClass(ENTRY_MAKING_CALL);
		createEAttribute(entryMakingCallEClass, ENTRY_MAKING_CALL__PROB);

		makingCallEClass = createEClass(MAKING_CALL);
		createEAttribute(makingCallEClass, MAKING_CALL__DEST);
		createEAttribute(makingCallEClass, MAKING_CALL__FANIN);
		createEAttribute(makingCallEClass, MAKING_CALL__FANOUT);

		activityMakingCallEClass = createEClass(ACTIVITY_MAKING_CALL);
		createEAttribute(activityMakingCallEClass, ACTIVITY_MAKING_CALL__CALLS_MEAN);

		activityPhaseEClass = createEClass(ACTIVITY_PHASE);
		createEAttribute(activityPhaseEClass, ACTIVITY_PHASE__PHASE);
		createEReference(activityPhaseEClass, ACTIVITY_PHASE__SYNCH_CALL);
		createEReference(activityPhaseEClass, ACTIVITY_PHASE__ASYNCH_CALL);
		createEReference(activityPhaseEClass, ACTIVITY_PHASE__CALL_LIST);

		activityDefBaseEClass = createEClass(ACTIVITY_DEF_BASE);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__NAME);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__THINK_TIME);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__MAX_SERVICE_TIME);
		createEAttribute(activityDefBaseEClass, ACTIVITY_DEF_BASE__CALL_ORDER);

		activityDefEClass = createEClass(ACTIVITY_DEF);
		createEAttribute(activityDefEClass, ACTIVITY_DEF__BOUND_TO_ENTRY);
		createEReference(activityDefEClass, ACTIVITY_DEF__SYNCH_CALL);
		createEReference(activityDefEClass, ACTIVITY_DEF__ASYNCH_CALL);
		createEReference(activityDefEClass, ACTIVITY_DEF__CALL_LIST);

		callListEClass = createEClass(CALL_LIST);
		createEReference(callListEClass, CALL_LIST__SYNCH_CALL);
		createEReference(callListEClass, CALL_LIST__ASYNCH_CALL);

		entryActivityDefEClass = createEClass(ENTRY_ACTIVITY_DEF);
		createEAttribute(entryActivityDefEClass, ENTRY_ACTIVITY_DEF__FIRST_ACTIVITY);
		createEReference(entryActivityDefEClass, ENTRY_ACTIVITY_DEF__SYNCH_CALL);
		createEReference(entryActivityDefEClass, ENTRY_ACTIVITY_DEF__ASYNCH_CALL);
		createEReference(entryActivityDefEClass, ENTRY_ACTIVITY_DEF__CALL_LIST);

		synchCallEClass = createEClass(SYNCH_CALL);
		createEAttribute(synchCallEClass, SYNCH_CALL__DEST);
		createEAttribute(synchCallEClass, SYNCH_CALL__FANIN);
		createEAttribute(synchCallEClass, SYNCH_CALL__FANOUT);

		asynchCallEClass = createEClass(ASYNCH_CALL);
		createEAttribute(asynchCallEClass, ASYNCH_CALL__DEST);
		createEAttribute(asynchCallEClass, ASYNCH_CALL__FANIN);
		createEAttribute(asynchCallEClass, ASYNCH_CALL__FANOUT);

		activityGraphEClass = createEClass(ACTIVITY_GRAPH);
		createEReference(activityGraphEClass, ACTIVITY_GRAPH__PRECEDENCE);
		createEReference(activityGraphEClass, ACTIVITY_GRAPH__ACTIVITY);

		precedenceEClass = createEClass(PRECEDENCE);
		createEReference(precedenceEClass, PRECEDENCE__PRE);
		createEReference(precedenceEClass, PRECEDENCE__POST);
		createEReference(precedenceEClass, PRECEDENCE__PRE_AND);
		createEReference(precedenceEClass, PRECEDENCE__POST_AND);
		createEReference(precedenceEClass, PRECEDENCE__PRE_OR);
		createEReference(precedenceEClass, PRECEDENCE__POST_OR);
		createEReference(precedenceEClass, PRECEDENCE__POST_LOOP);

		replyActivityEClass = createEClass(REPLY_ACTIVITY);
		createEAttribute(replyActivityEClass, REPLY_ACTIVITY__NAME);

		replyEntryEClass = createEClass(REPLY_ENTRY);
		createEAttribute(replyEntryEClass, REPLY_ENTRY__NAME);
		createEReference(replyEntryEClass, REPLY_ENTRY__REPLY_ACTIVITY);

		singleActivityListEClass = createEClass(SINGLE_ACTIVITY_LIST);
		createEReference(singleActivityListEClass, SINGLE_ACTIVITY_LIST__ACTIVITY);

		activityLoopListEClass = createEClass(ACTIVITY_LOOP_LIST);
		createEAttribute(activityLoopListEClass, ACTIVITY_LOOP_LIST__END);
		createEReference(activityLoopListEClass, ACTIVITY_LOOP_LIST__ACTIVITY);

		andJoinListEClass = createEClass(AND_JOIN_LIST);
		createEAttribute(andJoinListEClass, AND_JOIN_LIST__QUORUM);
		createEReference(andJoinListEClass, AND_JOIN_LIST__ACTIVITY);

		activityListEClass = createEClass(ACTIVITY_LIST);
		createEReference(activityListEClass, ACTIVITY_LIST__ACTIVITY);

		orListEClass = createEClass(OR_LIST);
		createEReference(orListEClass, OR_LIST__ACTIVITY);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);

		activityOrEClass = createEClass(ACTIVITY_OR);
		createEAttribute(activityOrEClass, ACTIVITY_OR__PROB);

		activityLoopEClass = createEClass(ACTIVITY_LOOP);
		createEAttribute(activityLoopEClass, ACTIVITY_LOOP__COUNT);

		// Create enums
		schedulingTypeEEnum = createEEnum(SCHEDULING_TYPE);
		taskSchedulingTypeEEnum = createEEnum(TASK_SCHEDULING_TYPE);
		taskOptionTypeEEnum = createEEnum(TASK_OPTION_TYPE);
		semaphoreEEnum = createEEnum(SEMAPHORE);
		entryTypeEEnum = createEEnum(ENTRY_TYPE);
		callOrderEEnum = createEEnum(CALL_ORDER);
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
		taskActivityGraphEClass.getESuperTypes().add(this.getActivityGraph());
		entryActivityGraphEClass.getESuperTypes().add(this.getActivityGraph());
		entryMakingCallEClass.getESuperTypes().add(this.getMakingCall());
		activityMakingCallEClass.getESuperTypes().add(this.getMakingCall());
		activityPhaseEClass.getESuperTypes().add(this.getActivityDefBase());
		activityDefEClass.getESuperTypes().add(this.getActivityDefBase());
		entryActivityDefEClass.getESuperTypes().add(this.getActivityDefBase());
		activityOrEClass.getESuperTypes().add(this.getActivity());
		activityLoopEClass.getESuperTypes().add(this.getActivity());

		// Initialize classes and features; add operations and parameters
		initEClass(lqnModelEClass, LqnModel.class, "LqnModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLqnModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, LqnModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLqnModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, LqnModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLqnModel_LqnSchemaVersion(), ecorePackage.getEString(), "lqnSchemaVersion", null, 0, 1, LqnModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLqnModel_LqncoreSchemaVersion(), ecorePackage.getEString(), "lqncoreSchemaVersion", null, 0, 1, LqnModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLqnModel_Processor(), this.getProcessor(), null, "processor", null, 1, -1, LqnModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Name(), ecorePackage.getEString(), "name", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Multiplicity(), ecorePackage.getEInt(), "multiplicity", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_SpeedFactor(), ecorePackage.getEDouble(), "speedFactor", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Scheduling(), this.getSchedulingType(), "scheduling", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Replication(), ecorePackage.getEInt(), "replication", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Quantum(), ecorePackage.getEDouble(), "quantum", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_Task(), this.getTask(), null, "task", null, 1, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Multiplicity(), ecorePackage.getEInt(), "multiplicity", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_QueueLength(), ecorePackage.getEInt(), "queueLength", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Replication(), ecorePackage.getEInt(), "replication", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Scheduling(), this.getTaskSchedulingType(), "scheduling", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ActivityGraph(), this.getTaskOptionType(), "activityGraph", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_ThinkTime(), ecorePackage.getEDouble(), "thinkTime", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Entry(), this.getEntry(), null, "entry", null, 1, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_TaskActivity(), this.getTaskActivityGraph(), null, "taskActivity", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_Name(), ecorePackage.getEString(), "name", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_OpenArrivalRate(), ecorePackage.getEDouble(), "openArrivalRate", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Semaphore(), this.getSemaphore(), "semaphore", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Type(), this.getEntryType(), "type", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntry_EntryActivityGraph(), this.getEntryActivityGraph(), null, "entryActivityGraph", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntry_EntryPhaseActivities(), this.getPhaseActivities(), null, "entryPhaseActivities", null, 0, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntry_Forwarding(), this.getEntryMakingCall(), null, "forwarding", null, 0, -1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskActivityGraphEClass, TaskActivityGraph.class, "TaskActivityGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskActivityGraph_ReplyEntry(), this.getReplyEntry(), null, "replyEntry", null, 0, -1, TaskActivityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryActivityGraphEClass, EntryActivityGraph.class, "EntryActivityGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryActivityGraph_ReplyActivity(), this.getReplyActivity(), null, "replyActivity", null, 1, -1, EntryActivityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phaseActivitiesEClass, PhaseActivities.class, "PhaseActivities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhaseActivities_Activity(), this.getActivityPhase(), null, "activity", null, 1, 3, PhaseActivities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryMakingCallEClass, EntryMakingCall.class, "EntryMakingCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryMakingCall_Prob(), ecorePackage.getEDouble(), "prob", null, 1, 1, EntryMakingCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(makingCallEClass, MakingCall.class, "MakingCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMakingCall_Dest(), ecorePackage.getEString(), "dest", null, 1, 1, MakingCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMakingCall_Fanin(), ecorePackage.getEInt(), "fanin", null, 0, 1, MakingCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMakingCall_Fanout(), ecorePackage.getEInt(), "fanout", null, 0, 1, MakingCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityMakingCallEClass, ActivityMakingCall.class, "ActivityMakingCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityMakingCall_CallsMean(), ecorePackage.getEDouble(), "callsMean", null, 1, 1, ActivityMakingCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityPhaseEClass, ActivityPhase.class, "ActivityPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityPhase_Phase(), ecorePackage.getEInt(), "phase", null, 1, 1, ActivityPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPhase_SynchCall(), this.getActivityMakingCall(), null, "synchCall", null, 0, -1, ActivityPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPhase_AsynchCall(), this.getActivityMakingCall(), null, "asynchCall", null, 0, -1, ActivityPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPhase_CallList(), this.getCallList(), null, "callList", null, 0, -1, ActivityPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityDefBaseEClass, ActivityDefBase.class, "ActivityDefBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityDefBase_Name(), ecorePackage.getEString(), "name", null, 1, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_HostDemandMean(), ecorePackage.getEDouble(), "hostDemandMean", null, 1, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_HostDemandCvsq(), ecorePackage.getEDouble(), "hostDemandCvsq", null, 0, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_ThinkTime(), ecorePackage.getEDouble(), "thinkTime", null, 0, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_MaxServiceTime(), ecorePackage.getEDouble(), "maxServiceTime", null, 0, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDefBase_CallOrder(), this.getCallOrder(), "callOrder", null, 0, 1, ActivityDefBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityDefEClass, ActivityDef.class, "ActivityDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityDef_BoundToEntry(), ecorePackage.getEString(), "boundToEntry", null, 0, 1, ActivityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDef_SynchCall(), this.getActivityMakingCall(), null, "synchCall", null, 0, -1, ActivityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDef_AsynchCall(), this.getActivityMakingCall(), null, "asynchCall", null, 0, -1, ActivityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDef_CallList(), this.getCallList(), null, "callList", null, 0, -1, ActivityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callListEClass, CallList.class, "CallList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallList_SynchCall(), this.getSynchCall(), null, "synchCall", null, 0, -1, CallList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallList_AsynchCall(), this.getAsynchCall(), null, "asynchCall", null, 0, -1, CallList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryActivityDefEClass, EntryActivityDef.class, "EntryActivityDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryActivityDef_FirstActivity(), ecorePackage.getEString(), "firstActivity", null, 0, 1, EntryActivityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryActivityDef_SynchCall(), this.getActivityMakingCall(), null, "synchCall", null, 0, -1, EntryActivityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryActivityDef_AsynchCall(), this.getActivityMakingCall(), null, "asynchCall", null, 0, -1, EntryActivityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryActivityDef_CallList(), this.getCallList(), null, "callList", null, 0, -1, EntryActivityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchCallEClass, SynchCall.class, "SynchCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchCall_Dest(), ecorePackage.getEString(), "dest", null, 1, 1, SynchCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchCall_Fanin(), ecorePackage.getEInt(), "fanin", null, 0, 1, SynchCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchCall_Fanout(), ecorePackage.getEInt(), "fanout", null, 0, 1, SynchCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asynchCallEClass, AsynchCall.class, "AsynchCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsynchCall_Dest(), ecorePackage.getEString(), "dest", null, 1, 1, AsynchCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsynchCall_Fanin(), ecorePackage.getEInt(), "fanin", null, 0, 1, AsynchCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsynchCall_Fanout(), ecorePackage.getEInt(), "fanout", null, 0, 1, AsynchCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityGraphEClass, ActivityGraph.class, "ActivityGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityGraph_Precedence(), this.getPrecedence(), null, "precedence", null, 0, -1, ActivityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityGraph_Activity(), this.getActivityDef(), null, "activity", null, 1, -1, ActivityGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceEClass, Precedence.class, "Precedence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrecedence_Pre(), this.getSingleActivityList(), null, "pre", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedence_Post(), this.getSingleActivityList(), null, "post", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedence_PreAND(), this.getAndJoinList(), null, "preAND", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedence_PostAND(), this.getActivityList(), null, "postAND", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedence_PreOR(), this.getActivityList(), null, "preOR", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedence_PostOR(), this.getOrList(), null, "postOR", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedence_PostLOOP(), this.getActivityLoopList(), null, "postLOOP", null, 0, 1, Precedence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replyActivityEClass, ReplyActivity.class, "ReplyActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplyActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, ReplyActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replyEntryEClass, ReplyEntry.class, "ReplyEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplyEntry_Name(), ecorePackage.getEString(), "name", null, 1, 1, ReplyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplyEntry_ReplyActivity(), this.getReplyActivity(), null, "replyActivity", null, 1, -1, ReplyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleActivityListEClass, SingleActivityList.class, "SingleActivityList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleActivityList_Activity(), this.getActivity(), null, "activity", null, 1, 1, SingleActivityList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityLoopListEClass, ActivityLoopList.class, "ActivityLoopList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityLoopList_End(), ecorePackage.getEString(), "end", null, 0, 1, ActivityLoopList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityLoopList_Activity(), this.getActivityLoop(), null, "activity", null, 1, -1, ActivityLoopList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andJoinListEClass, AndJoinList.class, "AndJoinList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAndJoinList_Quorum(), ecorePackage.getEInt(), "quorum", null, 0, 1, AndJoinList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndJoinList_Activity(), this.getActivity(), null, "activity", null, 1, -1, AndJoinList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityListEClass, ActivityList.class, "ActivityList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityList_Activity(), this.getActivity(), null, "activity", null, 1, -1, ActivityList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orListEClass, OrList.class, "OrList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrList_Activity(), this.getActivityOr(), null, "activity", null, 1, -1, OrList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityOrEClass, ActivityOr.class, "ActivityOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityOr_Prob(), ecorePackage.getEDouble(), "prob", null, 0, 1, ActivityOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityLoopEClass, ActivityLoop.class, "ActivityLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityLoop_Count(), ecorePackage.getEDouble(), "count", null, 1, 1, ActivityLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(schedulingTypeEEnum, SchedulingType.class, "SchedulingType");
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.NULL);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.FCFS);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.PS);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.PP);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.RAND);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.HOL);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.PS_HOL);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.PS_PP);

		initEEnum(taskSchedulingTypeEEnum, TaskSchedulingType.class, "TaskSchedulingType");
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.NULL);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.REF);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.FCFS);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.PRI);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.HOL);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.BURST);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.POLL);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.INF);
		addEEnumLiteral(taskSchedulingTypeEEnum, TaskSchedulingType.SEMAPHORE);

		initEEnum(taskOptionTypeEEnum, TaskOptionType.class, "TaskOptionType");
		addEEnumLiteral(taskOptionTypeEEnum, TaskOptionType.NULL);
		addEEnumLiteral(taskOptionTypeEEnum, TaskOptionType.YES);
		addEEnumLiteral(taskOptionTypeEEnum, TaskOptionType.NO);

		initEEnum(semaphoreEEnum, Semaphore.class, "Semaphore");
		addEEnumLiteral(semaphoreEEnum, Semaphore.NULL);
		addEEnumLiteral(semaphoreEEnum, Semaphore.SIGNAL);
		addEEnumLiteral(semaphoreEEnum, Semaphore.WAIT);

		initEEnum(entryTypeEEnum, EntryType.class, "EntryType");
		addEEnumLiteral(entryTypeEEnum, EntryType.NULL);
		addEEnumLiteral(entryTypeEEnum, EntryType.PH1PH2);
		addEEnumLiteral(entryTypeEEnum, EntryType.GRAPH);
		addEEnumLiteral(entryTypeEEnum, EntryType.NONE);

		initEEnum(callOrderEEnum, CallOrder.class, "CallOrder");
		addEEnumLiteral(callOrderEEnum, CallOrder.NULL);
		addEEnumLiteral(callOrderEEnum, CallOrder.STOCHASTIC);
		addEEnumLiteral(callOrderEEnum, CallOrder.DETERMINISTIC);
		addEEnumLiteral(callOrderEEnum, CallOrder.LIST);

		// Create resource
		createResource(eNS_URI);
	}

} //LqnPackageImpl
