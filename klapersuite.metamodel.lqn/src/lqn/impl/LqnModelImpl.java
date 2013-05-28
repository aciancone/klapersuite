/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn.impl;

import java.util.Collection;

import lqn.LqnModel;
import lqn.LqnPackage;
import lqn.Processor;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lqn.impl.LqnModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link lqn.impl.LqnModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link lqn.impl.LqnModelImpl#getLqnSchemaVersion <em>Lqn Schema Version</em>}</li>
 *   <li>{@link lqn.impl.LqnModelImpl#getLqncoreSchemaVersion <em>Lqncore Schema Version</em>}</li>
 *   <li>{@link lqn.impl.LqnModelImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LqnModelImpl extends EObjectImpl implements LqnModel {
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
	 * The default value of the '{@link #getLqnSchemaVersion() <em>Lqn Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLqnSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String LQN_SCHEMA_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLqnSchemaVersion() <em>Lqn Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLqnSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected String lqnSchemaVersion = LQN_SCHEMA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLqncoreSchemaVersion() <em>Lqncore Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLqncoreSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String LQNCORE_SCHEMA_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLqncoreSchemaVersion() <em>Lqncore Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLqncoreSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected String lqncoreSchemaVersion = LQNCORE_SCHEMA_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LqnModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LqnPackage.Literals.LQN_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLqnSchemaVersion() {
		return lqnSchemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLqnSchemaVersion(String newLqnSchemaVersion) {
		String oldLqnSchemaVersion = lqnSchemaVersion;
		lqnSchemaVersion = newLqnSchemaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL__LQN_SCHEMA_VERSION, oldLqnSchemaVersion, lqnSchemaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLqncoreSchemaVersion() {
		return lqncoreSchemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLqncoreSchemaVersion(String newLqncoreSchemaVersion) {
		String oldLqncoreSchemaVersion = lqncoreSchemaVersion;
		lqncoreSchemaVersion = newLqncoreSchemaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LqnPackage.LQN_MODEL__LQNCORE_SCHEMA_VERSION, oldLqncoreSchemaVersion, lqncoreSchemaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessor() {
		if (processor == null) {
			processor = new EObjectContainmentEList<Processor>(Processor.class, this, LqnPackage.LQN_MODEL__PROCESSOR);
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LqnPackage.LQN_MODEL__PROCESSOR:
				return ((InternalEList<?>)getProcessor()).basicRemove(otherEnd, msgs);
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
			case LqnPackage.LQN_MODEL__NAME:
				return getName();
			case LqnPackage.LQN_MODEL__DESCRIPTION:
				return getDescription();
			case LqnPackage.LQN_MODEL__LQN_SCHEMA_VERSION:
				return getLqnSchemaVersion();
			case LqnPackage.LQN_MODEL__LQNCORE_SCHEMA_VERSION:
				return getLqncoreSchemaVersion();
			case LqnPackage.LQN_MODEL__PROCESSOR:
				return getProcessor();
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
			case LqnPackage.LQN_MODEL__NAME:
				setName((String)newValue);
				return;
			case LqnPackage.LQN_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LqnPackage.LQN_MODEL__LQN_SCHEMA_VERSION:
				setLqnSchemaVersion((String)newValue);
				return;
			case LqnPackage.LQN_MODEL__LQNCORE_SCHEMA_VERSION:
				setLqncoreSchemaVersion((String)newValue);
				return;
			case LqnPackage.LQN_MODEL__PROCESSOR:
				getProcessor().clear();
				getProcessor().addAll((Collection<? extends Processor>)newValue);
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
			case LqnPackage.LQN_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LqnPackage.LQN_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LqnPackage.LQN_MODEL__LQN_SCHEMA_VERSION:
				setLqnSchemaVersion(LQN_SCHEMA_VERSION_EDEFAULT);
				return;
			case LqnPackage.LQN_MODEL__LQNCORE_SCHEMA_VERSION:
				setLqncoreSchemaVersion(LQNCORE_SCHEMA_VERSION_EDEFAULT);
				return;
			case LqnPackage.LQN_MODEL__PROCESSOR:
				getProcessor().clear();
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
			case LqnPackage.LQN_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LqnPackage.LQN_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LqnPackage.LQN_MODEL__LQN_SCHEMA_VERSION:
				return LQN_SCHEMA_VERSION_EDEFAULT == null ? lqnSchemaVersion != null : !LQN_SCHEMA_VERSION_EDEFAULT.equals(lqnSchemaVersion);
			case LqnPackage.LQN_MODEL__LQNCORE_SCHEMA_VERSION:
				return LQNCORE_SCHEMA_VERSION_EDEFAULT == null ? lqncoreSchemaVersion != null : !LQNCORE_SCHEMA_VERSION_EDEFAULT.equals(lqncoreSchemaVersion);
			case LqnPackage.LQN_MODEL__PROCESSOR:
				return processor != null && !processor.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", lqnSchemaVersion: ");
		result.append(lqnSchemaVersion);
		result.append(", lqncoreSchemaVersion: ");
		result.append(lqncoreSchemaVersion);
		result.append(')');
		return result.toString();
	}

} //LqnModelImpl
