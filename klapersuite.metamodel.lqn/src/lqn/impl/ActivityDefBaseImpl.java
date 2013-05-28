/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import lqn.ActivityDefBase;
import lqn.CallOrder;
import lqn.LqnPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Def Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.ActivityDefBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link lqn.impl.ActivityDefBaseImpl#getHostDemandMean <em>Host Demand Mean</em>}</li>
 *   <li>{@link lqn.impl.ActivityDefBaseImpl#getHostDemandCvsq <em>Host Demand Cvsq</em>}</li>
 *   <li>{@link lqn.impl.ActivityDefBaseImpl#getThinkTime <em>Think Time</em>}</li>
 *   <li>{@link lqn.impl.ActivityDefBaseImpl#getMaxServiceTime <em>Max Service Time</em>}</li>
 *   <li>{@link lqn.impl.ActivityDefBaseImpl#getCallOrder <em>Call Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityDefBaseImpl extends EObjectImpl implements ActivityDefBase {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostDemandMean() <em>Host Demand Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemandMean()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_DEMAND_MEAN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHostDemandMean() <em>Host Demand Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemandMean()
	 * @generated
	 * @ordered
	 */
	protected double hostDemandMean = HOST_DEMAND_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostDemandCvsq() <em>Host Demand Cvsq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemandCvsq()
	 * @generated
	 * @ordered
	 */
	protected static final double HOST_DEMAND_CVSQ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHostDemandCvsq() <em>Host Demand Cvsq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemandCvsq()
	 * @generated
	 * @ordered
	 */
	protected double hostDemandCvsq = HOST_DEMAND_CVSQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected static final double THINK_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected double thinkTime = THINK_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxServiceTime() <em>Max Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SERVICE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxServiceTime() <em>Max Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxServiceTime()
	 * @generated
	 * @ordered
	 */
	protected double maxServiceTime = MAX_SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallOrder() <em>Call Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallOrder()
	 * @generated
	 * @ordered
	 */
	protected static final CallOrder CALL_ORDER_EDEFAULT = CallOrder.NULL;

	/**
	 * The cached value of the '{@link #getCallOrder() <em>Call Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallOrder()
	 * @generated
	 * @ordered
	 */
	protected CallOrder callOrder = CALL_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDefBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.ACTIVITY_DEF_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostDemandMean() {
		return hostDemandMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostDemandMean(double newHostDemandMean) {
		double oldHostDemandMean = hostDemandMean;
		hostDemandMean = newHostDemandMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN, oldHostDemandMean, hostDemandMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHostDemandCvsq() {
		return hostDemandCvsq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostDemandCvsq(double newHostDemandCvsq) {
		double oldHostDemandCvsq = hostDemandCvsq;
		hostDemandCvsq = newHostDemandCvsq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ, oldHostDemandCvsq, hostDemandCvsq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThinkTime() {
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThinkTime(double newThinkTime) {
		double oldThinkTime = thinkTime;
		thinkTime = newThinkTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME, oldThinkTime, thinkTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxServiceTime() {
		return maxServiceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxServiceTime(double newMaxServiceTime) {
		double oldMaxServiceTime = maxServiceTime;
		maxServiceTime = newMaxServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME, oldMaxServiceTime, maxServiceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOrder getCallOrder() {
		return callOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallOrder(CallOrder newCallOrder) {
		CallOrder oldCallOrder = callOrder;
		callOrder = newCallOrder == null ? CALL_ORDER_EDEFAULT : newCallOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER, oldCallOrder, callOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LqnPackage.ACTIVITY_DEF_BASE__NAME:
				return getName();
			case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
				return getHostDemandMean();
			case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
				return getHostDemandCvsq();
			case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
				return getThinkTime();
			case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
				return getMaxServiceTime();
			case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
				return getCallOrder();
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
			case LqnPackage.ACTIVITY_DEF_BASE__NAME:
				setName((String)newValue);
				return;
			case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
				setHostDemandMean((Double)newValue);
				return;
			case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
				setHostDemandCvsq((Double)newValue);
				return;
			case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
				setThinkTime((Double)newValue);
				return;
			case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
				setMaxServiceTime((Double)newValue);
				return;
			case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
				setCallOrder((CallOrder)newValue);
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
			case LqnPackage.ACTIVITY_DEF_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
				setHostDemandMean(HOST_DEMAND_MEAN_EDEFAULT);
				return;
			case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
				setHostDemandCvsq(HOST_DEMAND_CVSQ_EDEFAULT);
				return;
			case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
				setThinkTime(THINK_TIME_EDEFAULT);
				return;
			case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
				setMaxServiceTime(MAX_SERVICE_TIME_EDEFAULT);
				return;
			case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
				setCallOrder(CALL_ORDER_EDEFAULT);
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
			case LqnPackage.ACTIVITY_DEF_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
				return hostDemandMean != HOST_DEMAND_MEAN_EDEFAULT;
			case LqnPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
				return hostDemandCvsq != HOST_DEMAND_CVSQ_EDEFAULT;
			case LqnPackage.ACTIVITY_DEF_BASE__THINK_TIME:
				return thinkTime != THINK_TIME_EDEFAULT;
			case LqnPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
				return maxServiceTime != MAX_SERVICE_TIME_EDEFAULT;
			case LqnPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
				return callOrder != CALL_ORDER_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", hostDemandMean: ");
		result.append(hostDemandMean);
		result.append(", hostDemandCvsq: ");
		result.append(hostDemandCvsq);
		result.append(", thinkTime: ");
		result.append(thinkTime);
		result.append(", maxServiceTime: ");
		result.append(maxServiceTime);
		result.append(", callOrder: ");
		result.append(callOrder);
		result.append(')');
		return result.toString();
	}

} //ActivityDefBaseImpl
