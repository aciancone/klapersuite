/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package q4bpmn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import q4bpmn.ClassType;
import q4bpmn.OperatorType;
import q4bpmn.Property;
import q4bpmn.PropertyNature;
import q4bpmn.Q4bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link q4bpmn.impl.PropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link q4bpmn.impl.PropertyImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link q4bpmn.impl.PropertyImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link q4bpmn.impl.PropertyImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link q4bpmn.impl.PropertyImpl#getPropertyClass <em>Property Class</em>}</li>
 *   <li>{@link q4bpmn.impl.PropertyImpl#isIsHard <em>Is Hard</em>}</li>
 *   <li>{@link q4bpmn.impl.PropertyImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link q4bpmn.impl.PropertyImpl#getRelatedTo <em>Related To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends NamedEntityImpl implements Property {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyNature NATURE_EDEFAULT = PropertyNature.ABSTRACT;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected PropertyNature nature = NATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final OperatorType OPERATOR_EDEFAULT = OperatorType.LOWER;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected OperatorType operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyClass() <em>Property Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyClass()
	 * @generated
	 * @ordered
	 */
	protected static final ClassType PROPERTY_CLASS_EDEFAULT = ClassType.PERFORMANCE;

	/**
	 * The cached value of the '{@link #getPropertyClass() <em>Property Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyClass()
	 * @generated
	 * @ordered
	 */
	protected ClassType propertyClass = PROPERTY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsHard() <em>Is Hard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHard() <em>Is Hard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHard()
	 * @generated
	 * @ordered
	 */
	protected boolean isHard = IS_HARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetrics() <em>Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected static final String METRICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected String metrics = METRICS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedTo() <em>Related To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected EObject relatedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Q4bpmnPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q4bpmnPackage.PROPERTY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q4bpmnPackage.PROPERTY__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyNature getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(PropertyNature newNature) {
		PropertyNature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q4bpmnPackage.PROPERTY__NATURE, oldNature, nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorType getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(OperatorType newOperator) {
		OperatorType oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q4bpmnPackage.PROPERTY__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType getPropertyClass() {
		return propertyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyClass(ClassType newPropertyClass) {
		ClassType oldPropertyClass = propertyClass;
		propertyClass = newPropertyClass == null ? PROPERTY_CLASS_EDEFAULT : newPropertyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q4bpmnPackage.PROPERTY__PROPERTY_CLASS, oldPropertyClass, propertyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHard() {
		return isHard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHard(boolean newIsHard) {
		boolean oldIsHard = isHard;
		isHard = newIsHard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q4bpmnPackage.PROPERTY__IS_HARD, oldIsHard, isHard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetrics() {
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrics(String newMetrics) {
		String oldMetrics = metrics;
		metrics = newMetrics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q4bpmnPackage.PROPERTY__METRICS, oldMetrics, metrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRelatedTo() {
		if (relatedTo != null && relatedTo.eIsProxy()) {
			InternalEObject oldRelatedTo = (InternalEObject)relatedTo;
			relatedTo = eResolveProxy(oldRelatedTo);
			if (relatedTo != oldRelatedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Q4bpmnPackage.PROPERTY__RELATED_TO, oldRelatedTo, relatedTo));
			}
		}
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRelatedTo() {
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedTo(EObject newRelatedTo) {
		EObject oldRelatedTo = relatedTo;
		relatedTo = newRelatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Q4bpmnPackage.PROPERTY__RELATED_TO, oldRelatedTo, relatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Q4bpmnPackage.PROPERTY__VALUE:
				return getValue();
			case Q4bpmnPackage.PROPERTY__UNIT:
				return getUnit();
			case Q4bpmnPackage.PROPERTY__NATURE:
				return getNature();
			case Q4bpmnPackage.PROPERTY__OPERATOR:
				return getOperator();
			case Q4bpmnPackage.PROPERTY__PROPERTY_CLASS:
				return getPropertyClass();
			case Q4bpmnPackage.PROPERTY__IS_HARD:
				return isIsHard();
			case Q4bpmnPackage.PROPERTY__METRICS:
				return getMetrics();
			case Q4bpmnPackage.PROPERTY__RELATED_TO:
				if (resolve) return getRelatedTo();
				return basicGetRelatedTo();
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
			case Q4bpmnPackage.PROPERTY__VALUE:
				setValue((String)newValue);
				return;
			case Q4bpmnPackage.PROPERTY__UNIT:
				setUnit((String)newValue);
				return;
			case Q4bpmnPackage.PROPERTY__NATURE:
				setNature((PropertyNature)newValue);
				return;
			case Q4bpmnPackage.PROPERTY__OPERATOR:
				setOperator((OperatorType)newValue);
				return;
			case Q4bpmnPackage.PROPERTY__PROPERTY_CLASS:
				setPropertyClass((ClassType)newValue);
				return;
			case Q4bpmnPackage.PROPERTY__IS_HARD:
				setIsHard((Boolean)newValue);
				return;
			case Q4bpmnPackage.PROPERTY__METRICS:
				setMetrics((String)newValue);
				return;
			case Q4bpmnPackage.PROPERTY__RELATED_TO:
				setRelatedTo((EObject)newValue);
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
			case Q4bpmnPackage.PROPERTY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Q4bpmnPackage.PROPERTY__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case Q4bpmnPackage.PROPERTY__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case Q4bpmnPackage.PROPERTY__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case Q4bpmnPackage.PROPERTY__PROPERTY_CLASS:
				setPropertyClass(PROPERTY_CLASS_EDEFAULT);
				return;
			case Q4bpmnPackage.PROPERTY__IS_HARD:
				setIsHard(IS_HARD_EDEFAULT);
				return;
			case Q4bpmnPackage.PROPERTY__METRICS:
				setMetrics(METRICS_EDEFAULT);
				return;
			case Q4bpmnPackage.PROPERTY__RELATED_TO:
				setRelatedTo((EObject)null);
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
			case Q4bpmnPackage.PROPERTY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Q4bpmnPackage.PROPERTY__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case Q4bpmnPackage.PROPERTY__NATURE:
				return nature != NATURE_EDEFAULT;
			case Q4bpmnPackage.PROPERTY__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case Q4bpmnPackage.PROPERTY__PROPERTY_CLASS:
				return propertyClass != PROPERTY_CLASS_EDEFAULT;
			case Q4bpmnPackage.PROPERTY__IS_HARD:
				return isHard != IS_HARD_EDEFAULT;
			case Q4bpmnPackage.PROPERTY__METRICS:
				return METRICS_EDEFAULT == null ? metrics != null : !METRICS_EDEFAULT.equals(metrics);
			case Q4bpmnPackage.PROPERTY__RELATED_TO:
				return relatedTo != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(", nature: ");
		result.append(nature);
		result.append(", operator: ");
		result.append(operator);
		result.append(", PropertyClass: ");
		result.append(propertyClass);
		result.append(", isHard: ");
		result.append(isHard);
		result.append(", metrics: ");
		result.append(metrics);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
