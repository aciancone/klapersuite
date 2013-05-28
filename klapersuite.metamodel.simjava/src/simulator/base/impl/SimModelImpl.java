/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simulator.base.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simulator.base.BasePackage;
import simulator.base.ResourceQueue;
import simulator.base.SimModel;
import simulator.base.Workload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sim Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simulator.base.impl.SimModelImpl#getWorkload <em>Workload</em>}</li>
 *   <li>{@link simulator.base.impl.SimModelImpl#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimModelImpl extends EObjectImpl implements SimModel {
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
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceQueue> resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.SIM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workload> getWorkload() {
		if (workload == null) {
			workload = new EObjectContainmentEList<Workload>(Workload.class, this, BasePackage.SIM_MODEL__WORKLOAD);
		}
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceQueue> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<ResourceQueue>(ResourceQueue.class, this, BasePackage.SIM_MODEL__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.SIM_MODEL__WORKLOAD:
				return ((InternalEList<?>)getWorkload()).basicRemove(otherEnd, msgs);
			case BasePackage.SIM_MODEL__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
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
			case BasePackage.SIM_MODEL__WORKLOAD:
				return getWorkload();
			case BasePackage.SIM_MODEL__RESOURCE:
				return getResource();
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
			case BasePackage.SIM_MODEL__WORKLOAD:
				getWorkload().clear();
				getWorkload().addAll((Collection<? extends Workload>)newValue);
				return;
			case BasePackage.SIM_MODEL__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends ResourceQueue>)newValue);
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
			case BasePackage.SIM_MODEL__WORKLOAD:
				getWorkload().clear();
				return;
			case BasePackage.SIM_MODEL__RESOURCE:
				getResource().clear();
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
			case BasePackage.SIM_MODEL__WORKLOAD:
				return workload != null && !workload.isEmpty();
			case BasePackage.SIM_MODEL__RESOURCE:
				return resource != null && !resource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimModelImpl
