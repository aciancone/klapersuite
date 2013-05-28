/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import java.util.Collection;

import lqn.ActivityMakingCall;
import lqn.ActivityPhase;
import lqn.CallList;
import lqn.LqnPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.ActivityPhaseImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link lqn.impl.ActivityPhaseImpl#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link lqn.impl.ActivityPhaseImpl#getAsynchCall <em>Asynch Call</em>}</li>
 *   <li>{@link lqn.impl.ActivityPhaseImpl#getCallList <em>Call List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPhaseImpl extends ActivityDefBaseImpl implements ActivityPhase {
	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected int phase = PHASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSynchCall() <em>Synch Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchCall()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityMakingCall> synchCall;

	/**
	 * The cached value of the '{@link #getAsynchCall() <em>Asynch Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsynchCall()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityMakingCall> asynchCall;

	/**
	 * The cached value of the '{@link #getCallList() <em>Call List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallList()
	 * @generated
	 * @ordered
	 */
	protected EList<CallList> callList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.ACTIVITY_PHASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(int newPhase) {
		int oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_PHASE__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityMakingCall> getSynchCall() {
		if (synchCall == null) {
			synchCall = new EObjectContainmentEList<ActivityMakingCall>(ActivityMakingCall.class, this, LqnPackage.ACTIVITY_PHASE__SYNCH_CALL);
		}
		return synchCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityMakingCall> getAsynchCall() {
		if (asynchCall == null) {
			asynchCall = new EObjectContainmentEList<ActivityMakingCall>(ActivityMakingCall.class, this, LqnPackage.ACTIVITY_PHASE__ASYNCH_CALL);
		}
		return asynchCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallList> getCallList() {
		if (callList == null) {
			callList = new EObjectContainmentEList<CallList>(CallList.class, this, LqnPackage.ACTIVITY_PHASE__CALL_LIST);
		}
		return callList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.ACTIVITY_PHASE__SYNCH_CALL:
				return ((InternalEList<?>)getSynchCall()).basicRemove(otherEnd, msgs);
			case LqnPackage.ACTIVITY_PHASE__ASYNCH_CALL:
				return ((InternalEList<?>)getAsynchCall()).basicRemove(otherEnd, msgs);
			case LqnPackage.ACTIVITY_PHASE__CALL_LIST:
				return ((InternalEList<?>)getCallList()).basicRemove(otherEnd, msgs);
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
			case LqnPackage.ACTIVITY_PHASE__PHASE:
				return getPhase();
			case LqnPackage.ACTIVITY_PHASE__SYNCH_CALL:
				return getSynchCall();
			case LqnPackage.ACTIVITY_PHASE__ASYNCH_CALL:
				return getAsynchCall();
			case LqnPackage.ACTIVITY_PHASE__CALL_LIST:
				return getCallList();
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
			case LqnPackage.ACTIVITY_PHASE__PHASE:
				setPhase((Integer)newValue);
				return;
			case LqnPackage.ACTIVITY_PHASE__SYNCH_CALL:
				getSynchCall().clear();
				getSynchCall().addAll((Collection<? extends ActivityMakingCall>)newValue);
				return;
			case LqnPackage.ACTIVITY_PHASE__ASYNCH_CALL:
				getAsynchCall().clear();
				getAsynchCall().addAll((Collection<? extends ActivityMakingCall>)newValue);
				return;
			case LqnPackage.ACTIVITY_PHASE__CALL_LIST:
				getCallList().clear();
				getCallList().addAll((Collection<? extends CallList>)newValue);
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
			case LqnPackage.ACTIVITY_PHASE__PHASE:
				setPhase(PHASE_EDEFAULT);
				return;
			case LqnPackage.ACTIVITY_PHASE__SYNCH_CALL:
				getSynchCall().clear();
				return;
			case LqnPackage.ACTIVITY_PHASE__ASYNCH_CALL:
				getAsynchCall().clear();
				return;
			case LqnPackage.ACTIVITY_PHASE__CALL_LIST:
				getCallList().clear();
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
			case LqnPackage.ACTIVITY_PHASE__PHASE:
				return phase != PHASE_EDEFAULT;
			case LqnPackage.ACTIVITY_PHASE__SYNCH_CALL:
				return synchCall != null && !synchCall.isEmpty();
			case LqnPackage.ACTIVITY_PHASE__ASYNCH_CALL:
				return asynchCall != null && !asynchCall.isEmpty();
			case LqnPackage.ACTIVITY_PHASE__CALL_LIST:
				return callList != null && !callList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (phase: ");
		result.append(phase);
		result.append(')');
		return result.toString();
	}

} //ActivityPhaseImpl
