/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import lqn.LqnPackage;
import lqn.SynchCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synch Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.SynchCallImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link lqn.impl.SynchCallImpl#getFanin <em>Fanin</em>}</li>
 *   <li>{@link lqn.impl.SynchCallImpl#getFanout <em>Fanout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SynchCallImpl extends EObjectImpl implements SynchCall {
	/**
	 * The default value of the '{@link #getDest() <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDest() <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected String dest = DEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getFanin() <em>Fanin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanin()
	 * @generated
	 * @ordered
	 */
	protected static final int FANIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFanin() <em>Fanin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanin()
	 * @generated
	 * @ordered
	 */
	protected int fanin = FANIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFanout() <em>Fanout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanout()
	 * @generated
	 * @ordered
	 */
	protected static final int FANOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFanout() <em>Fanout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanout()
	 * @generated
	 * @ordered
	 */
	protected int fanout = FANOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.SYNCH_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDest() {
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDest(String newDest) {
		String oldDest = dest;
		dest = newDest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SYNCH_CALL__DEST, oldDest, dest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFanin() {
		return fanin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanin(int newFanin) {
		int oldFanin = fanin;
		fanin = newFanin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SYNCH_CALL__FANIN, oldFanin, fanin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFanout() {
		return fanout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanout(int newFanout) {
		int oldFanout = fanout;
		fanout = newFanout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.SYNCH_CALL__FANOUT, oldFanout, fanout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnPackage.SYNCH_CALL__DEST:
				return getDest();
			case LqnPackage.SYNCH_CALL__FANIN:
				return getFanin();
			case LqnPackage.SYNCH_CALL__FANOUT:
				return getFanout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LqnPackage.SYNCH_CALL__DEST:
				setDest((String)newValue);
				return;
			case LqnPackage.SYNCH_CALL__FANIN:
				setFanin((Integer)newValue);
				return;
			case LqnPackage.SYNCH_CALL__FANOUT:
				setFanout((Integer)newValue);
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
			case LqnPackage.SYNCH_CALL__DEST:
				setDest(DEST_EDEFAULT);
				return;
			case LqnPackage.SYNCH_CALL__FANIN:
				setFanin(FANIN_EDEFAULT);
				return;
			case LqnPackage.SYNCH_CALL__FANOUT:
				setFanout(FANOUT_EDEFAULT);
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
			case LqnPackage.SYNCH_CALL__DEST:
				return DEST_EDEFAULT == null ? dest != null : !DEST_EDEFAULT.equals(dest);
			case LqnPackage.SYNCH_CALL__FANIN:
				return fanin != FANIN_EDEFAULT;
			case LqnPackage.SYNCH_CALL__FANOUT:
				return fanout != FANOUT_EDEFAULT;
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
		result.append(" (dest: ");
		result.append(dest);
		result.append(", fanin: ");
		result.append(fanin);
		result.append(", fanout: ");
		result.append(fanout);
		result.append(')');
		return result.toString();
	}

} //SynchCallImpl
