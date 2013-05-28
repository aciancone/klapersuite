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
 * A representation of the model object '<em><b>Synchronized Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dtmc.SynchronizedTransition#getSyncWith <em>Sync With</em>}</li>
 *   <li>{@link dtmc.SynchronizedTransition#getSynchedWith <em>Synched With</em>}</li>
 * </ul>
 * </p>
 *
 * @see dtmc.DtmcPackage#getSynchronizedTransition()
 * @model
 * @generated
 */
public interface SynchronizedTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Sync With</b></em>' reference list.
	 * The list contents are of type {@link dtmc.SynchronizedTransition}.
	 * It is bidirectional and its opposite is '{@link dtmc.SynchronizedTransition#getSynchedWith <em>Synched With</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync With</em>' reference list.
	 * @see dtmc.DtmcPackage#getSynchronizedTransition_SyncWith()
	 * @see dtmc.SynchronizedTransition#getSynchedWith
	 * @model opposite="synchedWith" required="true"
	 * @generated
	 */
	EList<SynchronizedTransition> getSyncWith();

	/**
	 * Returns the value of the '<em><b>Synched With</b></em>' reference list.
	 * The list contents are of type {@link dtmc.SynchronizedTransition}.
	 * It is bidirectional and its opposite is '{@link dtmc.SynchronizedTransition#getSyncWith <em>Sync With</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synched With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synched With</em>' reference list.
	 * @see dtmc.DtmcPackage#getSynchronizedTransition_SynchedWith()
	 * @see dtmc.SynchronizedTransition#getSyncWith
	 * @model opposite="syncWith" required="true"
	 * @generated
	 */
	EList<SynchronizedTransition> getSynchedWith();

} // SynchronizedTransition
