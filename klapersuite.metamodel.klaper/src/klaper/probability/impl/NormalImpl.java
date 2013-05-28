/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.impl;

import klaper.expr.Expression;

import klaper.probability.Normal;
import klaper.probability.ProbabilityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.probability.impl.NormalImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link klaper.probability.impl.NormalImpl#getStandDev <em>Stand Dev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormalImpl extends ProbabilityDistributionFunctionImpl implements Normal {
	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected Expression mean;

	/**
	 * The cached value of the '{@link #getStandDev() <em>Stand Dev</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandDev()
	 * @generated
	 * @ordered
	 */
	protected Expression standDev;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProbabilityPackage.Literals.NORMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMean(Expression newMean, NotificationChain msgs) {
		Expression oldMean = mean;
		mean = newMean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProbabilityPackage.NORMAL__MEAN, oldMean, newMean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(Expression newMean) {
		if (newMean != mean) {
			NotificationChain msgs = null;
			if (mean != null)
				msgs = ((InternalEObject)mean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProbabilityPackage.NORMAL__MEAN, null, msgs);
			if (newMean != null)
				msgs = ((InternalEObject)newMean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProbabilityPackage.NORMAL__MEAN, null, msgs);
			msgs = basicSetMean(newMean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProbabilityPackage.NORMAL__MEAN, newMean, newMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getStandDev() {
		return standDev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandDev(Expression newStandDev, NotificationChain msgs) {
		Expression oldStandDev = standDev;
		standDev = newStandDev;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProbabilityPackage.NORMAL__STAND_DEV, oldStandDev, newStandDev);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandDev(Expression newStandDev) {
		if (newStandDev != standDev) {
			NotificationChain msgs = null;
			if (standDev != null)
				msgs = ((InternalEObject)standDev).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProbabilityPackage.NORMAL__STAND_DEV, null, msgs);
			if (newStandDev != null)
				msgs = ((InternalEObject)newStandDev).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProbabilityPackage.NORMAL__STAND_DEV, null, msgs);
			msgs = basicSetStandDev(newStandDev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProbabilityPackage.NORMAL__STAND_DEV, newStandDev, newStandDev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProbabilityPackage.NORMAL__MEAN:
				return basicSetMean(null, msgs);
			case ProbabilityPackage.NORMAL__STAND_DEV:
				return basicSetStandDev(null, msgs);
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
			case ProbabilityPackage.NORMAL__MEAN:
				return getMean();
			case ProbabilityPackage.NORMAL__STAND_DEV:
				return getStandDev();
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
			case ProbabilityPackage.NORMAL__MEAN:
				setMean((Expression)newValue);
				return;
			case ProbabilityPackage.NORMAL__STAND_DEV:
				setStandDev((Expression)newValue);
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
			case ProbabilityPackage.NORMAL__MEAN:
				setMean((Expression)null);
				return;
			case ProbabilityPackage.NORMAL__STAND_DEV:
				setStandDev((Expression)null);
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
			case ProbabilityPackage.NORMAL__MEAN:
				return mean != null;
			case ProbabilityPackage.NORMAL__STAND_DEV:
				return standDev != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalImpl
