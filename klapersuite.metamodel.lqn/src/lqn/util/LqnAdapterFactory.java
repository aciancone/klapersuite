/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.util;

import lqn.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lqn.LqnPackage
 * @generated
 */
public class LqnAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LqnPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LqnPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LqnSwitch<Adapter> modelSwitch =
		new LqnSwitch<Adapter>() {
			@Override
			public Adapter caseLqnModel(LqnModel object) {
				return createLqnModelAdapter();
			}
			@Override
			public Adapter caseProcessor(Processor object) {
				return createProcessorAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseEntry(Entry object) {
				return createEntryAdapter();
			}
			@Override
			public Adapter caseTaskActivityGraph(TaskActivityGraph object) {
				return createTaskActivityGraphAdapter();
			}
			@Override
			public Adapter caseEntryActivityGraph(EntryActivityGraph object) {
				return createEntryActivityGraphAdapter();
			}
			@Override
			public Adapter casePhaseActivities(PhaseActivities object) {
				return createPhaseActivitiesAdapter();
			}
			@Override
			public Adapter caseEntryMakingCall(EntryMakingCall object) {
				return createEntryMakingCallAdapter();
			}
			@Override
			public Adapter caseMakingCall(MakingCall object) {
				return createMakingCallAdapter();
			}
			@Override
			public Adapter caseActivityMakingCall(ActivityMakingCall object) {
				return createActivityMakingCallAdapter();
			}
			@Override
			public Adapter caseActivityPhase(ActivityPhase object) {
				return createActivityPhaseAdapter();
			}
			@Override
			public Adapter caseActivityDefBase(ActivityDefBase object) {
				return createActivityDefBaseAdapter();
			}
			@Override
			public Adapter caseActivityDef(ActivityDef object) {
				return createActivityDefAdapter();
			}
			@Override
			public Adapter caseCallList(CallList object) {
				return createCallListAdapter();
			}
			@Override
			public Adapter caseEntryActivityDef(EntryActivityDef object) {
				return createEntryActivityDefAdapter();
			}
			@Override
			public Adapter caseSynchCall(SynchCall object) {
				return createSynchCallAdapter();
			}
			@Override
			public Adapter caseAsynchCall(AsynchCall object) {
				return createAsynchCallAdapter();
			}
			@Override
			public Adapter caseActivityGraph(ActivityGraph object) {
				return createActivityGraphAdapter();
			}
			@Override
			public Adapter casePrecedence(Precedence object) {
				return createPrecedenceAdapter();
			}
			@Override
			public Adapter caseReplyActivity(ReplyActivity object) {
				return createReplyActivityAdapter();
			}
			@Override
			public Adapter caseReplyEntry(ReplyEntry object) {
				return createReplyEntryAdapter();
			}
			@Override
			public Adapter caseSingleActivityList(SingleActivityList object) {
				return createSingleActivityListAdapter();
			}
			@Override
			public Adapter caseActivityLoopList(ActivityLoopList object) {
				return createActivityLoopListAdapter();
			}
			@Override
			public Adapter caseAndJoinList(AndJoinList object) {
				return createAndJoinListAdapter();
			}
			@Override
			public Adapter caseActivityList(ActivityList object) {
				return createActivityListAdapter();
			}
			@Override
			public Adapter caseOrList(OrList object) {
				return createOrListAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseActivityOr(ActivityOr object) {
				return createActivityOrAdapter();
			}
			@Override
			public Adapter caseActivityLoop(ActivityLoop object) {
				return createActivityLoopAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link lqn.LqnModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.LqnModel
	 * @generated
	 */
	public Adapter createLqnModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.Entry
	 * @generated
	 */
	public Adapter createEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.TaskActivityGraph <em>Task Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.TaskActivityGraph
	 * @generated
	 */
	public Adapter createTaskActivityGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.EntryActivityGraph <em>Entry Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.EntryActivityGraph
	 * @generated
	 */
	public Adapter createEntryActivityGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.PhaseActivities <em>Phase Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.PhaseActivities
	 * @generated
	 */
	public Adapter createPhaseActivitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.EntryMakingCall <em>Entry Making Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.EntryMakingCall
	 * @generated
	 */
	public Adapter createEntryMakingCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.MakingCall <em>Making Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.MakingCall
	 * @generated
	 */
	public Adapter createMakingCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ActivityMakingCall <em>Activity Making Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ActivityMakingCall
	 * @generated
	 */
	public Adapter createActivityMakingCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ActivityPhase <em>Activity Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ActivityPhase
	 * @generated
	 */
	public Adapter createActivityPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ActivityDefBase <em>Activity Def Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ActivityDefBase
	 * @generated
	 */
	public Adapter createActivityDefBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ActivityDef <em>Activity Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ActivityDef
	 * @generated
	 */
	public Adapter createActivityDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.CallList <em>Call List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.CallList
	 * @generated
	 */
	public Adapter createCallListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.EntryActivityDef <em>Entry Activity Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.EntryActivityDef
	 * @generated
	 */
	public Adapter createEntryActivityDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.SynchCall <em>Synch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.SynchCall
	 * @generated
	 */
	public Adapter createSynchCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.AsynchCall <em>Asynch Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.AsynchCall
	 * @generated
	 */
	public Adapter createAsynchCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ActivityGraph <em>Activity Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ActivityGraph
	 * @generated
	 */
	public Adapter createActivityGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.Precedence
	 * @generated
	 */
	public Adapter createPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ReplyActivity <em>Reply Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ReplyActivity
	 * @generated
	 */
	public Adapter createReplyActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ReplyEntry <em>Reply Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ReplyEntry
	 * @generated
	 */
	public Adapter createReplyEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.SingleActivityList <em>Single Activity List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.SingleActivityList
	 * @generated
	 */
	public Adapter createSingleActivityListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ActivityLoopList <em>Activity Loop List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ActivityLoopList
	 * @generated
	 */
	public Adapter createActivityLoopListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.AndJoinList <em>And Join List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.AndJoinList
	 * @generated
	 */
	public Adapter createAndJoinListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ActivityList <em>Activity List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ActivityList
	 * @generated
	 */
	public Adapter createActivityListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.OrList <em>Or List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.OrList
	 * @generated
	 */
	public Adapter createOrListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ActivityOr <em>Activity Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ActivityOr
	 * @generated
	 */
	public Adapter createActivityOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lqn.ActivityLoop <em>Activity Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lqn.ActivityLoop
	 * @generated
	 */
	public Adapter createActivityLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LqnAdapterFactory
