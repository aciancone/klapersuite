/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asynch Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.AsynchCall#getDest <em>Dest</em>}</li>
 *   <li>{@link lqn.AsynchCall#getFanin <em>Fanin</em>}</li>
 *   <li>{@link lqn.AsynchCall#getFanout <em>Fanout</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getAsynchCall()
 * @model
 * @generated
 */
public interface AsynchCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' attribute.
	 * @see #setDest(String)
	 * @see lqn.LqnPackage#getAsynchCall_Dest()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getDest();

	/**
	 * Sets the value of the '{@link lqn.AsynchCall#getDest <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' attribute.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(String value);

	/**
	 * Returns the value of the '<em><b>Fanin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fanin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fanin</em>' attribute.
	 * @see #setFanin(int)
	 * @see lqn.LqnPackage#getAsynchCall_Fanin()
	 * @model unique="false"
	 * @generated
	 */
	int getFanin();

	/**
	 * Sets the value of the '{@link lqn.AsynchCall#getFanin <em>Fanin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fanin</em>' attribute.
	 * @see #getFanin()
	 * @generated
	 */
	void setFanin(int value);

	/**
	 * Returns the value of the '<em><b>Fanout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fanout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fanout</em>' attribute.
	 * @see #setFanout(int)
	 * @see lqn.LqnPackage#getAsynchCall_Fanout()
	 * @model unique="false"
	 * @generated
	 */
	int getFanout();

	/**
	 * Sets the value of the '{@link lqn.AsynchCall#getFanout <em>Fanout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fanout</em>' attribute.
	 * @see #getFanout()
	 * @generated
	 */
	void setFanout(int value);

} // AsynchCall
