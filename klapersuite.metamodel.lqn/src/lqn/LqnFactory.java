/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lqn.LqnPackage
 * @generated
 */
public interface LqnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LqnFactory eINSTANCE = lqn.impl.LqnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	LqnModel createLqnModel();

	/**
	 * Returns a new object of class '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor</em>'.
	 * @generated
	 */
	Processor createProcessor();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns a new object of class '<em>Task Activity Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Activity Graph</em>'.
	 * @generated
	 */
	TaskActivityGraph createTaskActivityGraph();

	/**
	 * Returns a new object of class '<em>Entry Activity Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Activity Graph</em>'.
	 * @generated
	 */
	EntryActivityGraph createEntryActivityGraph();

	/**
	 * Returns a new object of class '<em>Phase Activities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase Activities</em>'.
	 * @generated
	 */
	PhaseActivities createPhaseActivities();

	/**
	 * Returns a new object of class '<em>Entry Making Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Making Call</em>'.
	 * @generated
	 */
	EntryMakingCall createEntryMakingCall();

	/**
	 * Returns a new object of class '<em>Making Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Making Call</em>'.
	 * @generated
	 */
	MakingCall createMakingCall();

	/**
	 * Returns a new object of class '<em>Activity Making Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Making Call</em>'.
	 * @generated
	 */
	ActivityMakingCall createActivityMakingCall();

	/**
	 * Returns a new object of class '<em>Activity Phase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Phase</em>'.
	 * @generated
	 */
	ActivityPhase createActivityPhase();

	/**
	 * Returns a new object of class '<em>Activity Def Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Def Base</em>'.
	 * @generated
	 */
	ActivityDefBase createActivityDefBase();

	/**
	 * Returns a new object of class '<em>Activity Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Def</em>'.
	 * @generated
	 */
	ActivityDef createActivityDef();

	/**
	 * Returns a new object of class '<em>Call List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call List</em>'.
	 * @generated
	 */
	CallList createCallList();

	/**
	 * Returns a new object of class '<em>Entry Activity Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Activity Def</em>'.
	 * @generated
	 */
	EntryActivityDef createEntryActivityDef();

	/**
	 * Returns a new object of class '<em>Synch Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synch Call</em>'.
	 * @generated
	 */
	SynchCall createSynchCall();

	/**
	 * Returns a new object of class '<em>Asynch Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asynch Call</em>'.
	 * @generated
	 */
	AsynchCall createAsynchCall();

	/**
	 * Returns a new object of class '<em>Activity Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Graph</em>'.
	 * @generated
	 */
	ActivityGraph createActivityGraph();

	/**
	 * Returns a new object of class '<em>Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence</em>'.
	 * @generated
	 */
	Precedence createPrecedence();

	/**
	 * Returns a new object of class '<em>Reply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reply Activity</em>'.
	 * @generated
	 */
	ReplyActivity createReplyActivity();

	/**
	 * Returns a new object of class '<em>Reply Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reply Entry</em>'.
	 * @generated
	 */
	ReplyEntry createReplyEntry();

	/**
	 * Returns a new object of class '<em>Single Activity List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Activity List</em>'.
	 * @generated
	 */
	SingleActivityList createSingleActivityList();

	/**
	 * Returns a new object of class '<em>Activity Loop List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Loop List</em>'.
	 * @generated
	 */
	ActivityLoopList createActivityLoopList();

	/**
	 * Returns a new object of class '<em>And Join List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Join List</em>'.
	 * @generated
	 */
	AndJoinList createAndJoinList();

	/**
	 * Returns a new object of class '<em>Activity List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity List</em>'.
	 * @generated
	 */
	ActivityList createActivityList();

	/**
	 * Returns a new object of class '<em>Or List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or List</em>'.
	 * @generated
	 */
	OrList createOrList();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Activity Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Or</em>'.
	 * @generated
	 */
	ActivityOr createActivityOr();

	/**
	 * Returns a new object of class '<em>Activity Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Loop</em>'.
	 * @generated
	 */
	ActivityLoop createActivityLoop();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LqnPackage getLqnPackage();

} //LqnFactory
