/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.impl;

import java.util.Collection;

import klaper.core.CorePackage;
import klaper.core.Resource;
import klaper.core.SchedulingPolicyKind;
import klaper.core.Service;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.core.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link klaper.core.impl.ResourceImpl#getType <em>Type</em>}</li>
 *   <li>{@link klaper.core.impl.ResourceImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link klaper.core.impl.ResourceImpl#getSchedulingPolicy <em>Scheduling Policy</em>}</li>
 *   <li>{@link klaper.core.impl.ResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link klaper.core.impl.ResourceImpl#getOfferedService <em>Offered Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends EObjectImpl implements Resource {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected double capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulingPolicyKind SCHEDULING_POLICY_EDEFAULT = SchedulingPolicyKind.NULL;

	/**
	 * The cached value of the '{@link #getSchedulingPolicy() <em>Scheduling Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedulingPolicyKind schedulingPolicy = SCHEDULING_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOfferedService() <em>Offered Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> offeredService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(double newCapacity) {
		double oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingPolicyKind getSchedulingPolicy() {
		return schedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingPolicy(SchedulingPolicyKind newSchedulingPolicy) {
		SchedulingPolicyKind oldSchedulingPolicy = schedulingPolicy;
		schedulingPolicy = newSchedulingPolicy == null ? SCHEDULING_POLICY_EDEFAULT : newSchedulingPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__SCHEDULING_POLICY, oldSchedulingPolicy, schedulingPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getOfferedService() {
		if (offeredService == null) {
			offeredService = new EObjectContainmentEList<Service>(Service.class, this, CorePackage.RESOURCE__OFFERED_SERVICE);
		}
		return offeredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RESOURCE__OFFERED_SERVICE:
				return ((InternalEList<?>)getOfferedService()).basicRemove(otherEnd, msgs);
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
			case CorePackage.RESOURCE__NAME:
				return getName();
			case CorePackage.RESOURCE__TYPE:
				return getType();
			case CorePackage.RESOURCE__CAPACITY:
				return getCapacity();
			case CorePackage.RESOURCE__SCHEDULING_POLICY:
				return getSchedulingPolicy();
			case CorePackage.RESOURCE__DESCRIPTION:
				return getDescription();
			case CorePackage.RESOURCE__OFFERED_SERVICE:
				return getOfferedService();
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
			case CorePackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.RESOURCE__TYPE:
				setType((String)newValue);
				return;
			case CorePackage.RESOURCE__CAPACITY:
				setCapacity((Double)newValue);
				return;
			case CorePackage.RESOURCE__SCHEDULING_POLICY:
				setSchedulingPolicy((SchedulingPolicyKind)newValue);
				return;
			case CorePackage.RESOURCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.RESOURCE__OFFERED_SERVICE:
				getOfferedService().clear();
				getOfferedService().addAll((Collection<? extends Service>)newValue);
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
			case CorePackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.RESOURCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorePackage.RESOURCE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case CorePackage.RESOURCE__SCHEDULING_POLICY:
				setSchedulingPolicy(SCHEDULING_POLICY_EDEFAULT);
				return;
			case CorePackage.RESOURCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.RESOURCE__OFFERED_SERVICE:
				getOfferedService().clear();
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
			case CorePackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.RESOURCE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CorePackage.RESOURCE__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case CorePackage.RESOURCE__SCHEDULING_POLICY:
				return schedulingPolicy != SCHEDULING_POLICY_EDEFAULT;
			case CorePackage.RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.RESOURCE__OFFERED_SERVICE:
				return offeredService != null && !offeredService.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", schedulingPolicy: ");
		result.append(schedulingPolicy);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
