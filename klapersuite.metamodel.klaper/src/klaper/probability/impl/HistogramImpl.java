/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.probability.impl;

import java.util.Collection;

import klaper.probability.Histogram;
import klaper.probability.HistogramSample;
import klaper.probability.ProbabilityPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Histogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.probability.impl.HistogramImpl#getSamples <em>Samples</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistogramImpl extends ProbabilityDistributionFunctionImpl implements Histogram {
	/**
	 * The cached value of the '{@link #getSamples() <em>Samples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamples()
	 * @generated
	 * @ordered
	 */
	protected EList<HistogramSample> samples;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProbabilityPackage.Literals.HISTOGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HistogramSample> getSamples() {
		if (samples == null) {
			samples = new EObjectContainmentEList<HistogramSample>(HistogramSample.class, this, ProbabilityPackage.HISTOGRAM__SAMPLES);
		}
		return samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProbabilityPackage.HISTOGRAM__SAMPLES:
				return ((InternalEList<?>)getSamples()).basicRemove(otherEnd, msgs);
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
			case ProbabilityPackage.HISTOGRAM__SAMPLES:
				return getSamples();
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
			case ProbabilityPackage.HISTOGRAM__SAMPLES:
				getSamples().clear();
				getSamples().addAll((Collection<? extends HistogramSample>)newValue);
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
			case ProbabilityPackage.HISTOGRAM__SAMPLES:
				getSamples().clear();
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
			case ProbabilityPackage.HISTOGRAM__SAMPLES:
				return samples != null && !samples.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HistogramImpl
