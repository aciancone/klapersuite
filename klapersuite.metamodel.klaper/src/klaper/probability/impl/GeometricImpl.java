/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.impl;

import klaper.expr.Expression;

import klaper.probability.Geometric;
import klaper.probability.ProbabilityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.probability.impl.GeometricImpl#getMean <em>Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometricImpl extends ProbabilityDistributionFunctionImpl implements Geometric {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProbabilityPackage.Literals.GEOMETRIC;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProbabilityPackage.GEOMETRIC__MEAN, oldMean, newMean);
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
				msgs = ((InternalEObject)mean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProbabilityPackage.GEOMETRIC__MEAN, null, msgs);
			if (newMean != null)
				msgs = ((InternalEObject)newMean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProbabilityPackage.GEOMETRIC__MEAN, null, msgs);
			msgs = basicSetMean(newMean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProbabilityPackage.GEOMETRIC__MEAN, newMean, newMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProbabilityPackage.GEOMETRIC__MEAN:
				return basicSetMean(null, msgs);
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
			case ProbabilityPackage.GEOMETRIC__MEAN:
				return getMean();
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
			case ProbabilityPackage.GEOMETRIC__MEAN:
				setMean((Expression)newValue);
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
			case ProbabilityPackage.GEOMETRIC__MEAN:
				setMean((Expression)null);
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
			case ProbabilityPackage.GEOMETRIC__MEAN:
				return mean != null;
		}
		return super.eIsSet(featureID);
	}

} //GeometricImpl
