/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.Behavior#getStep <em>Step</em>}</li>
 *   <li>{@link klaper.core.Behavior#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link klaper.core.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see klaper.core.CorePackage#getBehavior_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link klaper.core.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see klaper.core.CorePackage#getBehavior_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

} // Behavior
