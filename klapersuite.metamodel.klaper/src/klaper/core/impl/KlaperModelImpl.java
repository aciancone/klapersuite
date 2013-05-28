/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.impl;

import java.util.Collection;

import klaper.core.CorePackage;
import klaper.core.KlaperModel;
import klaper.core.Resource;
import klaper.core.Workload;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Klaper Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.core.impl.KlaperModelImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link klaper.core.impl.KlaperModelImpl#getWorkload <em>Workload</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KlaperModelImpl extends EObjectImpl implements KlaperModel {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * The cached value of the '{@link #getWorkload() <em>Workload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkload()
	 * @generated
	 * @ordered
	 */
	protected EList<Workload> workload;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KlaperModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.KLAPER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<Resource>(Resource.class, this, CorePackage.KLAPER_MODEL__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workload> getWorkload() {
		if (workload == null) {
			workload = new EObjectContainmentEList<Workload>(Workload.class, this, CorePackage.KLAPER_MODEL__WORKLOAD);
		}
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.KLAPER_MODEL__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case CorePackage.KLAPER_MODEL__WORKLOAD:
				return ((InternalEList<?>)getWorkload()).basicRemove(otherEnd, msgs);
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
			case CorePackage.KLAPER_MODEL__RESOURCE:
				return getResource();
			case CorePackage.KLAPER_MODEL__WORKLOAD:
				return getWorkload();
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
			case CorePackage.KLAPER_MODEL__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case CorePackage.KLAPER_MODEL__WORKLOAD:
				getWorkload().clear();
				getWorkload().addAll((Collection<? extends Workload>)newValue);
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
			case CorePackage.KLAPER_MODEL__RESOURCE:
				getResource().clear();
				return;
			case CorePackage.KLAPER_MODEL__WORKLOAD:
				getWorkload().clear();
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
			case CorePackage.KLAPER_MODEL__RESOURCE:
				return resource != null && !resource.isEmpty();
			case CorePackage.KLAPER_MODEL__WORKLOAD:
				return workload != null && !workload.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KlaperModelImpl
