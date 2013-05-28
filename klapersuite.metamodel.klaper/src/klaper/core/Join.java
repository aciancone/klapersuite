/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link klaper.core.Join#getTransitionsNeededToGo <em>Transitions Needed To Go</em>}</li>
 * </ul>
 * </p>
 *
 * @see klaper.core.CorePackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends Control {
	/**
	 * Returns the value of the '<em><b>Transitions Needed To Go</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions Needed To Go</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions Needed To Go</em>' attribute.
	 * @see #setTransitionsNeededToGo(int)
	 * @see klaper.core.CorePackage#getJoin_TransitionsNeededToGo()
	 * @model required="true"
	 * @generated
	 */
	int getTransitionsNeededToGo();

	/**
	 * Sets the value of the '{@link klaper.core.Join#getTransitionsNeededToGo <em>Transitions Needed To Go</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions Needed To Go</em>' attribute.
	 * @see #getTransitionsNeededToGo()
	 * @generated
	 */
	void setTransitionsNeededToGo(int value);

} // Join
