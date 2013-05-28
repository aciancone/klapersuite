/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dtmc.impl;

import dtmc.DtmcPackage;
import dtmc.SynchronizedTransition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronized Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dtmc.impl.SynchronizedTransitionImpl#getSyncWith <em>Sync With</em>}</li>
 *   <li>{@link dtmc.impl.SynchronizedTransitionImpl#getSynchedWith <em>Synched With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchronizedTransitionImpl extends TransitionImpl implements SynchronizedTransition {
	/**
	 * The cached value of the '{@link #getSyncWith() <em>Sync With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncWith()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronizedTransition> syncWith;

	/**
	 * The cached value of the '{@link #getSynchedWith() <em>Synched With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchedWith()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronizedTransition> synchedWith;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizedTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmcPackage.Literals.SYNCHRONIZED_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchronizedTransition> getSyncWith() {
		if (syncWith == null) {
			syncWith = new EObjectWithInverseResolvingEList.ManyInverse<SynchronizedTransition>(SynchronizedTransition.class, this, DtmcPackage.SYNCHRONIZED_TRANSITION__SYNC_WITH, DtmcPackage.SYNCHRONIZED_TRANSITION__SYNCHED_WITH);
		}
		return syncWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchronizedTransition> getSynchedWith() {
		if (synchedWith == null) {
			synchedWith = new EObjectWithInverseResolvingEList.ManyInverse<SynchronizedTransition>(SynchronizedTransition.class, this, DtmcPackage.SYNCHRONIZED_TRANSITION__SYNCHED_WITH, DtmcPackage.SYNCHRONIZED_TRANSITION__SYNC_WITH);
		}
		return synchedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNC_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSyncWith()).basicAdd(otherEnd, msgs);
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNCHED_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSynchedWith()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNC_WITH:
				return ((InternalEList<?>)getSyncWith()).basicRemove(otherEnd, msgs);
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNCHED_WITH:
				return ((InternalEList<?>)getSynchedWith()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNC_WITH:
				return getSyncWith();
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNCHED_WITH:
				return getSynchedWith();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNC_WITH:
				getSyncWith().clear();
				getSyncWith().addAll((Collection<? extends SynchronizedTransition>)newValue);
				return;
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNCHED_WITH:
				getSynchedWith().clear();
				getSynchedWith().addAll((Collection<? extends SynchronizedTransition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNC_WITH:
				getSyncWith().clear();
				return;
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNCHED_WITH:
				getSynchedWith().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNC_WITH:
				return syncWith != null && !syncWith.isEmpty();
			case DtmcPackage.SYNCHRONIZED_TRANSITION__SYNCHED_WITH:
				return synchedWith != null && !synchedWith.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SynchronizedTransitionImpl
