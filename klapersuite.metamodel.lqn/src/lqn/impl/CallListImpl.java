/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import java.util.Collection;

import lqn.AsynchCall;
import lqn.CallList;
import lqn.LqnPackage;
import lqn.SynchCall;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.CallListImpl#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link lqn.impl.CallListImpl#getAsynchCall <em>Asynch Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallListImpl extends EObjectImpl implements CallList {
	/**
	 * The cached value of the '{@link #getSynchCall() <em>Synch Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchCall()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchCall> synchCall;

	/**
	 * The cached value of the '{@link #getAsynchCall() <em>Asynch Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsynchCall()
	 * @generated
	 * @ordered
	 */
	protected EList<AsynchCall> asynchCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.CALL_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SynchCall> getSynchCall() {
		if (synchCall == null) {
			synchCall = new EObjectContainmentEList<SynchCall>(SynchCall.class, this, LqnPackage.CALL_LIST__SYNCH_CALL);
		}
		return synchCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsynchCall> getAsynchCall() {
		if (asynchCall == null) {
			asynchCall = new EObjectContainmentEList<AsynchCall>(AsynchCall.class, this, LqnPackage.CALL_LIST__ASYNCH_CALL);
		}
		return asynchCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.CALL_LIST__SYNCH_CALL:
				return ((InternalEList<?>)getSynchCall()).basicRemove(otherEnd, msgs);
			case LqnPackage.CALL_LIST__ASYNCH_CALL:
				return ((InternalEList<?>)getAsynchCall()).basicRemove(otherEnd, msgs);
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
			case LqnPackage.CALL_LIST__SYNCH_CALL:
				return getSynchCall();
			case LqnPackage.CALL_LIST__ASYNCH_CALL:
				return getAsynchCall();
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
			case LqnPackage.CALL_LIST__SYNCH_CALL:
				getSynchCall().clear();
				getSynchCall().addAll((Collection<? extends SynchCall>)newValue);
				return;
			case LqnPackage.CALL_LIST__ASYNCH_CALL:
				getAsynchCall().clear();
				getAsynchCall().addAll((Collection<? extends AsynchCall>)newValue);
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
			case LqnPackage.CALL_LIST__SYNCH_CALL:
				getSynchCall().clear();
				return;
			case LqnPackage.CALL_LIST__ASYNCH_CALL:
				getAsynchCall().clear();
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
			case LqnPackage.CALL_LIST__SYNCH_CALL:
				return synchCall != null && !synchCall.isEmpty();
			case LqnPackage.CALL_LIST__ASYNCH_CALL:
				return asynchCall != null && !asynchCall.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallListImpl
