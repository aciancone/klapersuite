/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.util;

import java.util.List;

import lqn.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lqn.LqnPackage
 * @generated
 */
public class LqnSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LqnPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnSwitch() {
		if (modelPackage == null) {
			modelPackage = LqnPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LqnPackage.LQN_MODEL: {
				LqnModel lqnModel = (LqnModel)theEObject;
				T result = caseLqnModel(lqnModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.PROCESSOR: {
				Processor processor = (Processor)theEObject;
				T result = caseProcessor(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ENTRY: {
				Entry entry = (Entry)theEObject;
				T result = caseEntry(entry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.TASK_ACTIVITY_GRAPH: {
				TaskActivityGraph taskActivityGraph = (TaskActivityGraph)theEObject;
				T result = caseTaskActivityGraph(taskActivityGraph);
				if (result == null) result = caseActivityGraph(taskActivityGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ENTRY_ACTIVITY_GRAPH: {
				EntryActivityGraph entryActivityGraph = (EntryActivityGraph)theEObject;
				T result = caseEntryActivityGraph(entryActivityGraph);
				if (result == null) result = caseActivityGraph(entryActivityGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.PHASE_ACTIVITIES: {
				PhaseActivities phaseActivities = (PhaseActivities)theEObject;
				T result = casePhaseActivities(phaseActivities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ENTRY_MAKING_CALL: {
				EntryMakingCall entryMakingCall = (EntryMakingCall)theEObject;
				T result = caseEntryMakingCall(entryMakingCall);
				if (result == null) result = caseMakingCall(entryMakingCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.MAKING_CALL: {
				MakingCall makingCall = (MakingCall)theEObject;
				T result = caseMakingCall(makingCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ACTIVITY_MAKING_CALL: {
				ActivityMakingCall activityMakingCall = (ActivityMakingCall)theEObject;
				T result = caseActivityMakingCall(activityMakingCall);
				if (result == null) result = caseMakingCall(activityMakingCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ACTIVITY_PHASE: {
				ActivityPhase activityPhase = (ActivityPhase)theEObject;
				T result = caseActivityPhase(activityPhase);
				if (result == null) result = caseActivityDefBase(activityPhase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ACTIVITY_DEF_BASE: {
				ActivityDefBase activityDefBase = (ActivityDefBase)theEObject;
				T result = caseActivityDefBase(activityDefBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ACTIVITY_DEF: {
				ActivityDef activityDef = (ActivityDef)theEObject;
				T result = caseActivityDef(activityDef);
				if (result == null) result = caseActivityDefBase(activityDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.CALL_LIST: {
				CallList callList = (CallList)theEObject;
				T result = caseCallList(callList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ENTRY_ACTIVITY_DEF: {
				EntryActivityDef entryActivityDef = (EntryActivityDef)theEObject;
				T result = caseEntryActivityDef(entryActivityDef);
				if (result == null) result = caseActivityDefBase(entryActivityDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.SYNCH_CALL: {
				SynchCall synchCall = (SynchCall)theEObject;
				T result = caseSynchCall(synchCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ASYNCH_CALL: {
				AsynchCall asynchCall = (AsynchCall)theEObject;
				T result = caseAsynchCall(asynchCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ACTIVITY_GRAPH: {
				ActivityGraph activityGraph = (ActivityGraph)theEObject;
				T result = caseActivityGraph(activityGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.PRECEDENCE: {
				Precedence precedence = (Precedence)theEObject;
				T result = casePrecedence(precedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.REPLY_ACTIVITY: {
				ReplyActivity replyActivity = (ReplyActivity)theEObject;
				T result = caseReplyActivity(replyActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.REPLY_ENTRY: {
				ReplyEntry replyEntry = (ReplyEntry)theEObject;
				T result = caseReplyEntry(replyEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.SINGLE_ACTIVITY_LIST: {
				SingleActivityList singleActivityList = (SingleActivityList)theEObject;
				T result = caseSingleActivityList(singleActivityList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ACTIVITY_LOOP_LIST: {
				ActivityLoopList activityLoopList = (ActivityLoopList)theEObject;
				T result = caseActivityLoopList(activityLoopList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.AND_JOIN_LIST: {
				AndJoinList andJoinList = (AndJoinList)theEObject;
				T result = caseAndJoinList(andJoinList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ACTIVITY_LIST: {
				ActivityList activityList = (ActivityList)theEObject;
				T result = caseActivityList(activityList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.OR_LIST: {
				OrList orList = (OrList)theEObject;
				T result = caseOrList(orList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ACTIVITY_OR: {
				ActivityOr activityOr = (ActivityOr)theEObject;
				T result = caseActivityOr(activityOr);
				if (result == null) result = caseActivity(activityOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LqnPackage.ACTIVITY_LOOP: {
				ActivityLoop activityLoop = (ActivityLoop)theEObject;
				T result = caseActivityLoop(activityLoop);
				if (result == null) result = caseActivity(activityLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLqnModel(LqnModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessor(Processor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry(Entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Activity Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Activity Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskActivityGraph(TaskActivityGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Activity Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Activity Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryActivityGraph(EntryActivityGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase Activities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase Activities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhaseActivities(PhaseActivities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Making Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Making Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryMakingCall(EntryMakingCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Making Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Making Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMakingCall(MakingCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Making Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Making Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityMakingCall(ActivityMakingCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityPhase(ActivityPhase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Def Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Def Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDefBase(ActivityDefBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityDef(ActivityDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallList(CallList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Activity Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Activity Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryActivityDef(EntryActivityDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synch Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synch Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchCall(SynchCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asynch Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asynch Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsynchCall(AsynchCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityGraph(ActivityGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedence(Precedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplyActivity(ReplyActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplyEntry(ReplyEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Activity List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Activity List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleActivityList(SingleActivityList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Loop List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Loop List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityLoopList(ActivityLoopList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Join List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Join List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndJoinList(AndJoinList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityList(ActivityList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrList(OrList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityOr(ActivityOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityLoop(ActivityLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //LqnSwitch
