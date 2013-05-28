/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc;

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
 * @see dtmc.DtmcFactory
 * @model kind="package"
 * @generated
 */
public interface DtmcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dtmc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://klaper.sourceforge.net/metamodels/dtmc/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dtmc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DtmcPackage eINSTANCE = dtmc.impl.DtmcPackageImpl.init();

	/**
	 * The meta object id for the '{@link dtmc.impl.NamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtmc.impl.NamedEntityImpl
	 * @see dtmc.impl.DtmcPackageImpl#getNamedEntity()
	 * @generated
	 */
	int NAMED_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dtmc.impl.DtmcImpl <em>Dtmc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtmc.impl.DtmcImpl
	 * @see dtmc.impl.DtmcPackageImpl#getDtmc()
	 * @generated
	 */
	int DTMC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__DESCRIPTION = NAMED_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__MODULES = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dtmc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dtmc.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtmc.impl.NodeImpl
	 * @see dtmc.impl.DtmcPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = NAMED_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MODULE = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUT_TRANSITIONS = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IN_TRANSITIONS = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_START = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_END = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Fail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IS_FAIL = NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link dtmc.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtmc.impl.TransitionImpl
	 * @see dtmc.impl.DtmcPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = NAMED_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PROBABILITY = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>from</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__MODULE = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dtmc.impl.SynchronizedTransitionImpl <em>Synchronized Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtmc.impl.SynchronizedTransitionImpl
	 * @see dtmc.impl.DtmcPackageImpl#getSynchronizedTransition()
	 * @generated
	 */
	int SYNCHRONIZED_TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_TRANSITION__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_TRANSITION__PROBABILITY = TRANSITION__PROBABILITY;

	/**
	 * The feature id for the '<em><b>from</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_TRANSITION__FROM = TRANSITION__FROM;

	/**
	 * The feature id for the '<em><b>to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_TRANSITION__TO = TRANSITION__TO;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_TRANSITION__MODULE = TRANSITION__MODULE;

	/**
	 * The feature id for the '<em><b>Sync With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_TRANSITION__SYNC_WITH = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synched With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_TRANSITION__SYNCHED_WITH = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronized Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dtmc.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtmc.impl.ModuleImpl
	 * @see dtmc.impl.DtmcPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = NAMED_ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NODES = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TRANSITIONS = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Autonomous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IS_AUTONOMOUS = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dtmc.impl.CallTransitionImpl <em>Call Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtmc.impl.CallTransitionImpl
	 * @see dtmc.impl.DtmcPackageImpl#getCallTransition()
	 * @generated
	 */
	int CALL_TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TRANSITION__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TRANSITION__PROBABILITY = TRANSITION__PROBABILITY;

	/**
	 * The feature id for the '<em><b>from</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TRANSITION__FROM = TRANSITION__FROM;

	/**
	 * The feature id for the '<em><b>to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TRANSITION__TO = TRANSITION__TO;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TRANSITION__MODULE = TRANSITION__MODULE;

	/**
	 * The feature id for the '<em><b>Invoked Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TRANSITION__INVOKED_TRANSITION = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dtmc.impl.InvokedTransitionImpl <em>Invoked Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtmc.impl.InvokedTransitionImpl
	 * @see dtmc.impl.DtmcPackageImpl#getInvokedTransition()
	 * @generated
	 */
	int INVOKED_TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKED_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKED_TRANSITION__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKED_TRANSITION__PROBABILITY = TRANSITION__PROBABILITY;

	/**
	 * The feature id for the '<em><b>from</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKED_TRANSITION__FROM = TRANSITION__FROM;

	/**
	 * The feature id for the '<em><b>to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKED_TRANSITION__TO = TRANSITION__TO;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKED_TRANSITION__MODULE = TRANSITION__MODULE;

	/**
	 * The feature id for the '<em><b>Call Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKED_TRANSITION__CALL_TRANSITION = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invoked Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKED_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dtmc.impl.StandardTransitionImpl <em>Standard Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtmc.impl.StandardTransitionImpl
	 * @see dtmc.impl.DtmcPackageImpl#getStandardTransition()
	 * @generated
	 */
	int STANDARD_TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TRANSITION__DESCRIPTION = TRANSITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TRANSITION__PROBABILITY = TRANSITION__PROBABILITY;

	/**
	 * The feature id for the '<em><b>from</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TRANSITION__FROM = TRANSITION__FROM;

	/**
	 * The feature id for the '<em><b>to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TRANSITION__TO = TRANSITION__TO;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TRANSITION__MODULE = TRANSITION__MODULE;

	/**
	 * The number of structural features of the '<em>Standard Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dtmc.Dtmc <em>Dtmc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dtmc</em>'.
	 * @see dtmc.Dtmc
	 * @generated
	 */
	EClass getDtmc();

	/**
	 * Returns the meta object for the containment reference list '{@link dtmc.Dtmc#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see dtmc.Dtmc#getModules()
	 * @see #getDtmc()
	 * @generated
	 */
	EReference getDtmc_Modules();

	/**
	 * Returns the meta object for class '{@link dtmc.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see dtmc.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the container reference '{@link dtmc.Node#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see dtmc.Node#getModule()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Module();

	/**
	 * Returns the meta object for the reference list '{@link dtmc.Node#getOutTransitions <em>Out Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Transitions</em>'.
	 * @see dtmc.Node#getOutTransitions()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutTransitions();

	/**
	 * Returns the meta object for the reference list '{@link dtmc.Node#getInTransitions <em>In Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Transitions</em>'.
	 * @see dtmc.Node#getInTransitions()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_InTransitions();

	/**
	 * Returns the meta object for the attribute '{@link dtmc.Node#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see dtmc.Node#isIsStart()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_IsStart();

	/**
	 * Returns the meta object for the attribute '{@link dtmc.Node#isIsEnd <em>Is End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is End</em>'.
	 * @see dtmc.Node#isIsEnd()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_IsEnd();

	/**
	 * Returns the meta object for the attribute '{@link dtmc.Node#isIsFail <em>Is Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fail</em>'.
	 * @see dtmc.Node#isIsFail()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_IsFail();

	/**
	 * Returns the meta object for class '{@link dtmc.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see dtmc.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link dtmc.Transition#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see dtmc.Transition#getProbability()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Probability();

	/**
	 * Returns the meta object for the reference '{@link dtmc.Transition#get_from <em>from</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>from</em>'.
	 * @see dtmc.Transition#get_from()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition__from();

	/**
	 * Returns the meta object for the reference '{@link dtmc.Transition#get_to <em>to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>to</em>'.
	 * @see dtmc.Transition#get_to()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition__to();

	/**
	 * Returns the meta object for the container reference '{@link dtmc.Transition#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see dtmc.Transition#getModule()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Module();

	/**
	 * Returns the meta object for class '{@link dtmc.SynchronizedTransition <em>Synchronized Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronized Transition</em>'.
	 * @see dtmc.SynchronizedTransition
	 * @generated
	 */
	EClass getSynchronizedTransition();

	/**
	 * Returns the meta object for the reference list '{@link dtmc.SynchronizedTransition#getSyncWith <em>Sync With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sync With</em>'.
	 * @see dtmc.SynchronizedTransition#getSyncWith()
	 * @see #getSynchronizedTransition()
	 * @generated
	 */
	EReference getSynchronizedTransition_SyncWith();

	/**
	 * Returns the meta object for the reference list '{@link dtmc.SynchronizedTransition#getSynchedWith <em>Synched With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synched With</em>'.
	 * @see dtmc.SynchronizedTransition#getSynchedWith()
	 * @see #getSynchronizedTransition()
	 * @generated
	 */
	EReference getSynchronizedTransition_SynchedWith();

	/**
	 * Returns the meta object for class '{@link dtmc.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see dtmc.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link dtmc.Module#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see dtmc.Module#getNodes()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link dtmc.Module#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see dtmc.Module#getTransitions()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Transitions();

	/**
	 * Returns the meta object for the attribute '{@link dtmc.Module#isIsAutonomous <em>Is Autonomous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Autonomous</em>'.
	 * @see dtmc.Module#isIsAutonomous()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_IsAutonomous();

	/**
	 * Returns the meta object for class '{@link dtmc.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see dtmc.NamedEntity
	 * @generated
	 */
	EClass getNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link dtmc.NamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dtmc.NamedEntity#getName()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link dtmc.NamedEntity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dtmc.NamedEntity#getDescription()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Description();

	/**
	 * Returns the meta object for class '{@link dtmc.CallTransition <em>Call Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Transition</em>'.
	 * @see dtmc.CallTransition
	 * @generated
	 */
	EClass getCallTransition();

	/**
	 * Returns the meta object for the reference '{@link dtmc.CallTransition#getInvokedTransition <em>Invoked Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoked Transition</em>'.
	 * @see dtmc.CallTransition#getInvokedTransition()
	 * @see #getCallTransition()
	 * @generated
	 */
	EReference getCallTransition_InvokedTransition();

	/**
	 * Returns the meta object for class '{@link dtmc.InvokedTransition <em>Invoked Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoked Transition</em>'.
	 * @see dtmc.InvokedTransition
	 * @generated
	 */
	EClass getInvokedTransition();

	/**
	 * Returns the meta object for the reference '{@link dtmc.InvokedTransition#getCallTransition <em>Call Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Call Transition</em>'.
	 * @see dtmc.InvokedTransition#getCallTransition()
	 * @see #getInvokedTransition()
	 * @generated
	 */
	EReference getInvokedTransition_CallTransition();

	/**
	 * Returns the meta object for class '{@link dtmc.StandardTransition <em>Standard Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Transition</em>'.
	 * @see dtmc.StandardTransition
	 * @generated
	 */
	EClass getStandardTransition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DtmcFactory getDtmcFactory();

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
		 * The meta object literal for the '{@link dtmc.impl.DtmcImpl <em>Dtmc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtmc.impl.DtmcImpl
		 * @see dtmc.impl.DtmcPackageImpl#getDtmc()
		 * @generated
		 */
		EClass DTMC = eINSTANCE.getDtmc();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTMC__MODULES = eINSTANCE.getDtmc_Modules();

		/**
		 * The meta object literal for the '{@link dtmc.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtmc.impl.NodeImpl
		 * @see dtmc.impl.DtmcPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MODULE = eINSTANCE.getNode_Module();

		/**
		 * The meta object literal for the '<em><b>Out Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUT_TRANSITIONS = eINSTANCE.getNode_OutTransitions();

		/**
		 * The meta object literal for the '<em><b>In Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__IN_TRANSITIONS = eINSTANCE.getNode_InTransitions();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__IS_START = eINSTANCE.getNode_IsStart();

		/**
		 * The meta object literal for the '<em><b>Is End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__IS_END = eINSTANCE.getNode_IsEnd();

		/**
		 * The meta object literal for the '<em><b>Is Fail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__IS_FAIL = eINSTANCE.getNode_IsFail();

		/**
		 * The meta object literal for the '{@link dtmc.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtmc.impl.TransitionImpl
		 * @see dtmc.impl.DtmcPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PROBABILITY = eINSTANCE.getTransition_Probability();

		/**
		 * The meta object literal for the '<em><b>from</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition__from();

		/**
		 * The meta object literal for the '<em><b>to</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition__to();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__MODULE = eINSTANCE.getTransition_Module();

		/**
		 * The meta object literal for the '{@link dtmc.impl.SynchronizedTransitionImpl <em>Synchronized Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtmc.impl.SynchronizedTransitionImpl
		 * @see dtmc.impl.DtmcPackageImpl#getSynchronizedTransition()
		 * @generated
		 */
		EClass SYNCHRONIZED_TRANSITION = eINSTANCE.getSynchronizedTransition();

		/**
		 * The meta object literal for the '<em><b>Sync With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZED_TRANSITION__SYNC_WITH = eINSTANCE.getSynchronizedTransition_SyncWith();

		/**
		 * The meta object literal for the '<em><b>Synched With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZED_TRANSITION__SYNCHED_WITH = eINSTANCE.getSynchronizedTransition_SynchedWith();

		/**
		 * The meta object literal for the '{@link dtmc.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtmc.impl.ModuleImpl
		 * @see dtmc.impl.DtmcPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__NODES = eINSTANCE.getModule_Nodes();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__TRANSITIONS = eINSTANCE.getModule_Transitions();

		/**
		 * The meta object literal for the '<em><b>Is Autonomous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__IS_AUTONOMOUS = eINSTANCE.getModule_IsAutonomous();

		/**
		 * The meta object literal for the '{@link dtmc.impl.NamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtmc.impl.NamedEntityImpl
		 * @see dtmc.impl.DtmcPackageImpl#getNamedEntity()
		 * @generated
		 */
		EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__DESCRIPTION = eINSTANCE.getNamedEntity_Description();

		/**
		 * The meta object literal for the '{@link dtmc.impl.CallTransitionImpl <em>Call Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtmc.impl.CallTransitionImpl
		 * @see dtmc.impl.DtmcPackageImpl#getCallTransition()
		 * @generated
		 */
		EClass CALL_TRANSITION = eINSTANCE.getCallTransition();

		/**
		 * The meta object literal for the '<em><b>Invoked Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_TRANSITION__INVOKED_TRANSITION = eINSTANCE.getCallTransition_InvokedTransition();

		/**
		 * The meta object literal for the '{@link dtmc.impl.InvokedTransitionImpl <em>Invoked Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtmc.impl.InvokedTransitionImpl
		 * @see dtmc.impl.DtmcPackageImpl#getInvokedTransition()
		 * @generated
		 */
		EClass INVOKED_TRANSITION = eINSTANCE.getInvokedTransition();

		/**
		 * The meta object literal for the '<em><b>Call Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKED_TRANSITION__CALL_TRANSITION = eINSTANCE.getInvokedTransition_CallTransition();

		/**
		 * The meta object literal for the '{@link dtmc.impl.StandardTransitionImpl <em>Standard Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtmc.impl.StandardTransitionImpl
		 * @see dtmc.impl.DtmcPackageImpl#getStandardTransition()
		 * @generated
		 */
		EClass STANDARD_TRANSITION = eINSTANCE.getStandardTransition();

	}

} //DtmcPackage
