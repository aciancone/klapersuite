/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simulator.base.Join#getNTransition <em>NTransition</em>}</li>
 *   <li>{@link simulator.base.Join#getInTransition <em>In Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see simulator.base.BasePackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends Step {
	/**
	 * Returns the value of the '<em><b>NTransition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NTransition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NTransition</em>' attribute.
	 * @see #setNTransition(int)
	 * @see simulator.base.BasePackage#getJoin_NTransition()
	 * @model required="true"
	 * @generated
	 */
	int getNTransition();

	/**
	 * Sets the value of the '{@link simulator.base.Join#getNTransition <em>NTransition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NTransition</em>' attribute.
	 * @see #getNTransition()
	 * @generated
	 */
	void setNTransition(int value);

	/**
	 * Returns the value of the '<em><b>In Transition</b></em>' reference list.
	 * The list contents are of type {@link simulator.base.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Transition</em>' reference list.
	 * @see simulator.base.BasePackage#getJoin_InTransition()
	 * @model required="true"
	 * @generated
	 */
	EList<Transition> getInTransition();

} // Join
