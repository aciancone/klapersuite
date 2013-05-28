/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.impl;

import java.util.Collection;

import klaper.core.ActualParam;
import klaper.core.Binding;
import klaper.core.CorePackage;
import klaper.core.ServiceControl;

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
 * An implementation of the model object '<em><b>Service Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.core.impl.ServiceControlImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link klaper.core.impl.ServiceControlImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link klaper.core.impl.ServiceControlImpl#isIsSynch <em>Is Synch</em>}</li>
 *   <li>{@link klaper.core.impl.ServiceControlImpl#isDependsOn <em>Depends On</em>}</li>
 *   <li>{@link klaper.core.impl.ServiceControlImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link klaper.core.impl.ServiceControlImpl#getActualParam <em>Actual Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceControlImpl extends ActivityImpl implements ServiceControl {
	/**
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected String resourceType = RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = "false";

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSynch() <em>Is Synch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSynch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SYNCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSynch() <em>Is Synch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSynch()
	 * @generated
	 * @ordered
	 */
	protected boolean isSynch = IS_SYNCH_EDEFAULT;

	/**
	 * The default value of the '{@link #isDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDependsOn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPENDS_ON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDependsOn() <em>Depends On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDependsOn()
	 * @generated
	 * @ordered
	 */
	protected boolean dependsOn = DEPENDS_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected Binding binding;

	/**
	 * The cached value of the '{@link #getActualParam() <em>Actual Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualParam()
	 * @generated
	 * @ordered
	 */
	protected EList<ActualParam> actualParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SERVICE_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceType(String newResourceType) {
		String oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_CONTROL__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_CONTROL__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSynch() {
		return isSynch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynch(boolean newIsSynch) {
		boolean oldIsSynch = isSynch;
		isSynch = newIsSynch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_CONTROL__IS_SYNCH, oldIsSynch, isSynch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOn(boolean newDependsOn) {
		boolean oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_CONTROL__DEPENDS_ON, oldDependsOn, dependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(Binding newBinding, NotificationChain msgs) {
		Binding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_CONTROL__BINDING, oldBinding, newBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(Binding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject)binding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SERVICE_CONTROL__BINDING, null, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SERVICE_CONTROL__BINDING, null, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE_CONTROL__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualParam> getActualParam() {
		if (actualParam == null) {
			actualParam = new EObjectContainmentEList<ActualParam>(ActualParam.class, this, CorePackage.SERVICE_CONTROL__ACTUAL_PARAM);
		}
		return actualParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SERVICE_CONTROL__BINDING:
				return basicSetBinding(null, msgs);
			case CorePackage.SERVICE_CONTROL__ACTUAL_PARAM:
				return ((InternalEList<?>)getActualParam()).basicRemove(otherEnd, msgs);
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
			case CorePackage.SERVICE_CONTROL__RESOURCE_TYPE:
				return getResourceType();
			case CorePackage.SERVICE_CONTROL__SERVICE_NAME:
				return getServiceName();
			case CorePackage.SERVICE_CONTROL__IS_SYNCH:
				return isIsSynch();
			case CorePackage.SERVICE_CONTROL__DEPENDS_ON:
				return isDependsOn();
			case CorePackage.SERVICE_CONTROL__BINDING:
				return getBinding();
			case CorePackage.SERVICE_CONTROL__ACTUAL_PARAM:
				return getActualParam();
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
			case CorePackage.SERVICE_CONTROL__RESOURCE_TYPE:
				setResourceType((String)newValue);
				return;
			case CorePackage.SERVICE_CONTROL__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case CorePackage.SERVICE_CONTROL__IS_SYNCH:
				setIsSynch((Boolean)newValue);
				return;
			case CorePackage.SERVICE_CONTROL__DEPENDS_ON:
				setDependsOn((Boolean)newValue);
				return;
			case CorePackage.SERVICE_CONTROL__BINDING:
				setBinding((Binding)newValue);
				return;
			case CorePackage.SERVICE_CONTROL__ACTUAL_PARAM:
				getActualParam().clear();
				getActualParam().addAll((Collection<? extends ActualParam>)newValue);
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
			case CorePackage.SERVICE_CONTROL__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case CorePackage.SERVICE_CONTROL__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case CorePackage.SERVICE_CONTROL__IS_SYNCH:
				setIsSynch(IS_SYNCH_EDEFAULT);
				return;
			case CorePackage.SERVICE_CONTROL__DEPENDS_ON:
				setDependsOn(DEPENDS_ON_EDEFAULT);
				return;
			case CorePackage.SERVICE_CONTROL__BINDING:
				setBinding((Binding)null);
				return;
			case CorePackage.SERVICE_CONTROL__ACTUAL_PARAM:
				getActualParam().clear();
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
			case CorePackage.SERVICE_CONTROL__RESOURCE_TYPE:
				return RESOURCE_TYPE_EDEFAULT == null ? resourceType != null : !RESOURCE_TYPE_EDEFAULT.equals(resourceType);
			case CorePackage.SERVICE_CONTROL__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case CorePackage.SERVICE_CONTROL__IS_SYNCH:
				return isSynch != IS_SYNCH_EDEFAULT;
			case CorePackage.SERVICE_CONTROL__DEPENDS_ON:
				return dependsOn != DEPENDS_ON_EDEFAULT;
			case CorePackage.SERVICE_CONTROL__BINDING:
				return binding != null;
			case CorePackage.SERVICE_CONTROL__ACTUAL_PARAM:
				return actualParam != null && !actualParam.isEmpty();
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
		result.append(" (resourceType: ");
		result.append(resourceType);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(", isSynch: ");
		result.append(isSynch);
		result.append(", dependsOn: ");
		result.append(dependsOn);
		result.append(')');
		return result.toString();
	}

} //ServiceControlImpl
