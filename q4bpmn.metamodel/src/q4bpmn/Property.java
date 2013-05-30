/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package q4bpmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link q4bpmn.Property#getValue <em>Value</em>}</li>
 *   <li>{@link q4bpmn.Property#getUnit <em>Unit</em>}</li>
 *   <li>{@link q4bpmn.Property#getNature <em>Nature</em>}</li>
 *   <li>{@link q4bpmn.Property#getOperator <em>Operator</em>}</li>
 *   <li>{@link q4bpmn.Property#getPropertyClass <em>Property Class</em>}</li>
 *   <li>{@link q4bpmn.Property#isIsHard <em>Is Hard</em>}</li>
 *   <li>{@link q4bpmn.Property#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link q4bpmn.Property#getRelatedTo <em>Related To</em>}</li>
 * </ul>
 * </p>
 *
 * @see q4bpmn.Q4bpmnPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see q4bpmn.Q4bpmnPackage#getProperty_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link q4bpmn.Property#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see q4bpmn.Q4bpmnPackage#getProperty_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link q4bpmn.Property#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link q4bpmn.PropertyNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see q4bpmn.PropertyNature
	 * @see #setNature(PropertyNature)
	 * @see q4bpmn.Q4bpmnPackage#getProperty_Nature()
	 * @model required="true"
	 * @generated
	 */
	PropertyNature getNature();

	/**
	 * Sets the value of the '{@link q4bpmn.Property#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see q4bpmn.PropertyNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(PropertyNature value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link q4bpmn.OperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see q4bpmn.OperatorType
	 * @see #setOperator(OperatorType)
	 * @see q4bpmn.Q4bpmnPackage#getProperty_Operator()
	 * @model
	 * @generated
	 */
	OperatorType getOperator();

	/**
	 * Sets the value of the '{@link q4bpmn.Property#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see q4bpmn.OperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(OperatorType value);

	/**
	 * Returns the value of the '<em><b>Property Class</b></em>' attribute.
	 * The literals are from the enumeration {@link q4bpmn.ClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Class</em>' attribute.
	 * @see q4bpmn.ClassType
	 * @see #setPropertyClass(ClassType)
	 * @see q4bpmn.Q4bpmnPackage#getProperty_PropertyClass()
	 * @model required="true"
	 * @generated
	 */
	ClassType getPropertyClass();

	/**
	 * Sets the value of the '{@link q4bpmn.Property#getPropertyClass <em>Property Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Class</em>' attribute.
	 * @see q4bpmn.ClassType
	 * @see #getPropertyClass()
	 * @generated
	 */
	void setPropertyClass(ClassType value);

	/**
	 * Returns the value of the '<em><b>Is Hard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Hard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Hard</em>' attribute.
	 * @see #setIsHard(boolean)
	 * @see q4bpmn.Q4bpmnPackage#getProperty_IsHard()
	 * @model
	 * @generated
	 */
	boolean isIsHard();

	/**
	 * Sets the value of the '{@link q4bpmn.Property#isIsHard <em>Is Hard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Hard</em>' attribute.
	 * @see #isIsHard()
	 * @generated
	 */
	void setIsHard(boolean value);

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' attribute.
	 * @see #setMetrics(String)
	 * @see q4bpmn.Q4bpmnPackage#getProperty_Metrics()
	 * @model
	 * @generated
	 */
	String getMetrics();

	/**
	 * Sets the value of the '{@link q4bpmn.Property#getMetrics <em>Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrics</em>' attribute.
	 * @see #getMetrics()
	 * @generated
	 */
	void setMetrics(String value);

	/**
	 * Returns the value of the '<em><b>Related To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related To</em>' reference.
	 * @see #setRelatedTo(EObject)
	 * @see q4bpmn.Q4bpmnPackage#getProperty_RelatedTo()
	 * @model required="true"
	 * @generated
	 */
	EObject getRelatedTo();

	/**
	 * Sets the value of the '{@link q4bpmn.Property#getRelatedTo <em>Related To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related To</em>' reference.
	 * @see #getRelatedTo()
	 * @generated
	 */
	void setRelatedTo(EObject value);

} // Property
