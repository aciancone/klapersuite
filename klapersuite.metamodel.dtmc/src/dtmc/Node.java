/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dtmc.Node#getModule <em>Module</em>}</li>
 *   <li>{@link dtmc.Node#getOutTransitions <em>Out Transitions</em>}</li>
 *   <li>{@link dtmc.Node#getInTransitions <em>In Transitions</em>}</li>
 *   <li>{@link dtmc.Node#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link dtmc.Node#isIsEnd <em>Is End</em>}</li>
 *   <li>{@link dtmc.Node#isIsFail <em>Is Fail</em>}</li>
 * </ul>
 * </p>
 *
 * @see dtmc.DtmcPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dtmc.Module#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see dtmc.DtmcPackage#getNode_Module()
	 * @see dtmc.Module#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link dtmc.Node#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Out Transitions</b></em>' reference list.
	 * The list contents are of type {@link dtmc.Transition}.
	 * It is bidirectional and its opposite is '{@link dtmc.Transition#get_from <em>from</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Transitions</em>' reference list.
	 * @see dtmc.DtmcPackage#getNode_OutTransitions()
	 * @see dtmc.Transition#get_from
	 * @model opposite="_from"
	 * @generated
	 */
	EList<Transition> getOutTransitions();

	/**
	 * Returns the value of the '<em><b>In Transitions</b></em>' reference list.
	 * The list contents are of type {@link dtmc.Transition}.
	 * It is bidirectional and its opposite is '{@link dtmc.Transition#get_to <em>to</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Transitions</em>' reference list.
	 * @see dtmc.DtmcPackage#getNode_InTransitions()
	 * @see dtmc.Transition#get_to
	 * @model opposite="_to"
	 * @generated
	 */
	EList<Transition> getInTransitions();

	/**
	 * Returns the value of the '<em><b>Is Start</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start</em>' attribute.
	 * @see #setIsStart(boolean)
	 * @see dtmc.DtmcPackage#getNode_IsStart()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsStart();

	/**
	 * Sets the value of the '{@link dtmc.Node#isIsStart <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start</em>' attribute.
	 * @see #isIsStart()
	 * @generated
	 */
	void setIsStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Is End</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is End</em>' attribute.
	 * @see #setIsEnd(boolean)
	 * @see dtmc.DtmcPackage#getNode_IsEnd()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsEnd();

	/**
	 * Sets the value of the '{@link dtmc.Node#isIsEnd <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is End</em>' attribute.
	 * @see #isIsEnd()
	 * @generated
	 */
	void setIsEnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Fail</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fail</em>' attribute.
	 * @see #setIsFail(boolean)
	 * @see dtmc.DtmcPackage#getNode_IsFail()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsFail();

	/**
	 * Sets the value of the '{@link dtmc.Node#isIsFail <em>Is Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fail</em>' attribute.
	 * @see #isIsFail()
	 * @generated
	 */
	void setIsFail(boolean value);

} // Node
