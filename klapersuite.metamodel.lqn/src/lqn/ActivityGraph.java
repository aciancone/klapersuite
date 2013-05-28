/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.ActivityGraph#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link lqn.ActivityGraph#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getActivityGraph()
 * @model
 * @generated
 */
public interface ActivityGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.Precedence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence</em>' containment reference list.
	 * @see lqn.LqnPackage#getActivityGraph_Precedence()
	 * @model containment="true"
	 * @generated
	 */
	EList<Precedence> getPrecedence();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.ActivityDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see lqn.LqnPackage#getActivityGraph_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActivityDef> getActivity();

} // ActivityGraph
