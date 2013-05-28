/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core.impl;

import java.util.Collection;

import klaper.core.Behavior;
import klaper.core.CorePackage;
import klaper.core.FormalParam;
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
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link klaper.core.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link klaper.core.impl.ServiceImpl#getSpeedAttr <em>Speed Attr</em>}</li>
 *   <li>{@link klaper.core.impl.ServiceImpl#getFailAttr <em>Fail Attr</em>}</li>
 *   <li>{@link klaper.core.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link klaper.core.impl.ServiceImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link klaper.core.impl.ServiceImpl#getFormalParams <em>Formal Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
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
	 * The default value of the '{@link #getSpeedAttr() <em>Speed Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedAttr()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_ATTR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeedAttr() <em>Speed Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedAttr()
	 * @generated
	 * @ordered
	 */
	protected double speedAttr = SPEED_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailAttr() <em>Fail Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailAttr()
	 * @generated
	 * @ordered
	 */
	protected static final double FAIL_ATTR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFailAttr() <em>Fail Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailAttr()
	 * @generated
	 * @ordered
	 */
	protected double failAttr = FAIL_ATTR_EDEFAULT;

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
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

	/**
	 * The cached value of the '{@link #getFormalParams() <em>Formal Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParams()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalParam> formalParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpeedAttr() {
		return speedAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedAttr(double newSpeedAttr) {
		double oldSpeedAttr = speedAttr;
		speedAttr = newSpeedAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE__SPEED_ATTR, oldSpeedAttr, speedAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFailAttr() {
		return failAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailAttr(double newFailAttr) {
		double oldFailAttr = failAttr;
		failAttr = newFailAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE__FAIL_ATTR, oldFailAttr, failAttr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(Behavior newBehavior, NotificationChain msgs) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE__BEHAVIOR, oldBehavior, newBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = ((InternalEObject)behavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SERVICE__BEHAVIOR, null, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject)newBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SERVICE__BEHAVIOR, null, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SERVICE__BEHAVIOR, newBehavior, newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalParam> getFormalParams() {
		if (formalParams == null) {
			formalParams = new EObjectContainmentEList<FormalParam>(FormalParam.class, this, CorePackage.SERVICE__FORMAL_PARAMS);
		}
		return formalParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SERVICE__BEHAVIOR:
				return basicSetBehavior(null, msgs);
			case CorePackage.SERVICE__FORMAL_PARAMS:
				return ((InternalEList<?>)getFormalParams()).basicRemove(otherEnd, msgs);
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
			case CorePackage.SERVICE__NAME:
				return getName();
			case CorePackage.SERVICE__SPEED_ATTR:
				return getSpeedAttr();
			case CorePackage.SERVICE__FAIL_ATTR:
				return getFailAttr();
			case CorePackage.SERVICE__DESCRIPTION:
				return getDescription();
			case CorePackage.SERVICE__BEHAVIOR:
				return getBehavior();
			case CorePackage.SERVICE__FORMAL_PARAMS:
				return getFormalParams();
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
			case CorePackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.SERVICE__SPEED_ATTR:
				setSpeedAttr((Double)newValue);
				return;
			case CorePackage.SERVICE__FAIL_ATTR:
				setFailAttr((Double)newValue);
				return;
			case CorePackage.SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.SERVICE__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case CorePackage.SERVICE__FORMAL_PARAMS:
				getFormalParams().clear();
				getFormalParams().addAll((Collection<? extends FormalParam>)newValue);
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
			case CorePackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.SERVICE__SPEED_ATTR:
				setSpeedAttr(SPEED_ATTR_EDEFAULT);
				return;
			case CorePackage.SERVICE__FAIL_ATTR:
				setFailAttr(FAIL_ATTR_EDEFAULT);
				return;
			case CorePackage.SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.SERVICE__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case CorePackage.SERVICE__FORMAL_PARAMS:
				getFormalParams().clear();
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
			case CorePackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.SERVICE__SPEED_ATTR:
				return speedAttr != SPEED_ATTR_EDEFAULT;
			case CorePackage.SERVICE__FAIL_ATTR:
				return failAttr != FAIL_ATTR_EDEFAULT;
			case CorePackage.SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.SERVICE__BEHAVIOR:
				return behavior != null;
			case CorePackage.SERVICE__FORMAL_PARAMS:
				return formalParams != null && !formalParams.isEmpty();
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
		result.append(", speedAttr: ");
		result.append(speedAttr);
		result.append(", failAttr: ");
		result.append(failAttr);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
