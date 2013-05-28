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
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dtmc.Module#getNodes <em>Nodes</em>}</li>
 *   <li>{@link dtmc.Module#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link dtmc.Module#isIsAutonomous <em>Is Autonomous</em>}</li>
 * </ul>
 * </p>
 *
 * @see dtmc.DtmcPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link dtmc.Node}.
	 * It is bidirectional and its opposite is '{@link dtmc.Node#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see dtmc.DtmcPackage#getModule_Nodes()
	 * @see dtmc.Node#getModule
	 * @model opposite="module" containment="true" required="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link dtmc.Transition}.
	 * It is bidirectional and its opposite is '{@link dtmc.Transition#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see dtmc.DtmcPackage#getModule_Transitions()
	 * @see dtmc.Transition#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Is Autonomous</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Autonomous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Autonomous</em>' attribute.
	 * @see #setIsAutonomous(boolean)
	 * @see dtmc.DtmcPackage#getModule_IsAutonomous()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsAutonomous();

	/**
	 * Sets the value of the '{@link dtmc.Module#isIsAutonomous <em>Is Autonomous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Autonomous</em>' attribute.
	 * @see #isIsAutonomous()
	 * @generated
	 */
	void setIsAutonomous(boolean value);

} // Module
