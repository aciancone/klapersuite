/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package q4bpmn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see q4bpmn.Q4bpmnFactory
 * @model kind="package"
 * @generated
 */
public interface Q4bpmnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "q4bpmn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://klaper.sourceforge.net/metamodels/q4bpmn/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "q4bpmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Q4bpmnPackage eINSTANCE = q4bpmn.impl.Q4bpmnPackageImpl.init();

	/**
	 * The meta object id for the '{@link q4bpmn.impl.NamedEntityImpl <em>Named Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see q4bpmn.impl.NamedEntityImpl
	 * @see q4bpmn.impl.Q4bpmnPackageImpl#getNamedEntity()
	 * @generated
	 */
	int NAMED_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link q4bpmn.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see q4bpmn.impl.PropertyImpl
	 * @see q4bpmn.impl.Q4bpmnPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UNIT = NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NATURE = NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPERATOR = NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_CLASS = NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Hard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_HARD = NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__METRICS = NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Related To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__RELATED_TO = NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link q4bpmn.impl.PropertyModelImpl <em>Property Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see q4bpmn.impl.PropertyModelImpl
	 * @see q4bpmn.impl.Q4bpmnPackageImpl#getPropertyModel()
	 * @generated
	 */
	int PROPERTY_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Property Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link q4bpmn.PropertyNature <em>Property Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see q4bpmn.PropertyNature
	 * @see q4bpmn.impl.Q4bpmnPackageImpl#getPropertyNature()
	 * @generated
	 */
	int PROPERTY_NATURE = 3;

	/**
	 * The meta object id for the '{@link q4bpmn.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see q4bpmn.OperatorType
	 * @see q4bpmn.impl.Q4bpmnPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 4;

	/**
	 * The meta object id for the '{@link q4bpmn.ClassType <em>Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see q4bpmn.ClassType
	 * @see q4bpmn.impl.Q4bpmnPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link q4bpmn.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see q4bpmn.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link q4bpmn.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see q4bpmn.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link q4bpmn.Property#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see q4bpmn.Property#getUnit()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Unit();

	/**
	 * Returns the meta object for the attribute '{@link q4bpmn.Property#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see q4bpmn.Property#getNature()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Nature();

	/**
	 * Returns the meta object for the attribute '{@link q4bpmn.Property#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see q4bpmn.Property#getOperator()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Operator();

	/**
	 * Returns the meta object for the attribute '{@link q4bpmn.Property#getPropertyClass <em>Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Class</em>'.
	 * @see q4bpmn.Property#getPropertyClass()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PropertyClass();

	/**
	 * Returns the meta object for the attribute '{@link q4bpmn.Property#isIsHard <em>Is Hard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hard</em>'.
	 * @see q4bpmn.Property#isIsHard()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsHard();

	/**
	 * Returns the meta object for the attribute '{@link q4bpmn.Property#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrics</em>'.
	 * @see q4bpmn.Property#getMetrics()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Metrics();

	/**
	 * Returns the meta object for the reference '{@link q4bpmn.Property#getRelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related To</em>'.
	 * @see q4bpmn.Property#getRelatedTo()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_RelatedTo();

	/**
	 * Returns the meta object for class '{@link q4bpmn.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Entity</em>'.
	 * @see q4bpmn.NamedEntity
	 * @generated
	 */
	EClass getNamedEntity();

	/**
	 * Returns the meta object for the attribute '{@link q4bpmn.NamedEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see q4bpmn.NamedEntity#getName()
	 * @see #getNamedEntity()
	 * @generated
	 */
	EAttribute getNamedEntity_Name();

	/**
	 * Returns the meta object for class '{@link q4bpmn.PropertyModel <em>Property Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Model</em>'.
	 * @see q4bpmn.PropertyModel
	 * @generated
	 */
	EClass getPropertyModel();

	/**
	 * Returns the meta object for the containment reference list '{@link q4bpmn.PropertyModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see q4bpmn.PropertyModel#getProperties()
	 * @see #getPropertyModel()
	 * @generated
	 */
	EReference getPropertyModel_Properties();

	/**
	 * Returns the meta object for enum '{@link q4bpmn.PropertyNature <em>Property Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Nature</em>'.
	 * @see q4bpmn.PropertyNature
	 * @generated
	 */
	EEnum getPropertyNature();

	/**
	 * Returns the meta object for enum '{@link q4bpmn.OperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see q4bpmn.OperatorType
	 * @generated
	 */
	EEnum getOperatorType();

	/**
	 * Returns the meta object for enum '{@link q4bpmn.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Type</em>'.
	 * @see q4bpmn.ClassType
	 * @generated
	 */
	EEnum getClassType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Q4bpmnFactory getQ4bpmnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link q4bpmn.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see q4bpmn.impl.PropertyImpl
		 * @see q4bpmn.impl.Q4bpmnPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UNIT = eINSTANCE.getProperty_Unit();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NATURE = eINSTANCE.getProperty_Nature();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__OPERATOR = eINSTANCE.getProperty_Operator();

		/**
		 * The meta object literal for the '<em><b>Property Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PROPERTY_CLASS = eINSTANCE.getProperty_PropertyClass();

		/**
		 * The meta object literal for the '<em><b>Is Hard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_HARD = eINSTANCE.getProperty_IsHard();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__METRICS = eINSTANCE.getProperty_Metrics();

		/**
		 * The meta object literal for the '<em><b>Related To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__RELATED_TO = eINSTANCE.getProperty_RelatedTo();

		/**
		 * The meta object literal for the '{@link q4bpmn.impl.NamedEntityImpl <em>Named Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see q4bpmn.impl.NamedEntityImpl
		 * @see q4bpmn.impl.Q4bpmnPackageImpl#getNamedEntity()
		 * @generated
		 */
		EClass NAMED_ENTITY = eINSTANCE.getNamedEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ENTITY__NAME = eINSTANCE.getNamedEntity_Name();

		/**
		 * The meta object literal for the '{@link q4bpmn.impl.PropertyModelImpl <em>Property Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see q4bpmn.impl.PropertyModelImpl
		 * @see q4bpmn.impl.Q4bpmnPackageImpl#getPropertyModel()
		 * @generated
		 */
		EClass PROPERTY_MODEL = eINSTANCE.getPropertyModel();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MODEL__PROPERTIES = eINSTANCE.getPropertyModel_Properties();

		/**
		 * The meta object literal for the '{@link q4bpmn.PropertyNature <em>Property Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see q4bpmn.PropertyNature
		 * @see q4bpmn.impl.Q4bpmnPackageImpl#getPropertyNature()
		 * @generated
		 */
		EEnum PROPERTY_NATURE = eINSTANCE.getPropertyNature();

		/**
		 * The meta object literal for the '{@link q4bpmn.OperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see q4bpmn.OperatorType
		 * @see q4bpmn.impl.Q4bpmnPackageImpl#getOperatorType()
		 * @generated
		 */
		EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

		/**
		 * The meta object literal for the '{@link q4bpmn.ClassType <em>Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see q4bpmn.ClassType
		 * @see q4bpmn.impl.Q4bpmnPackageImpl#getClassType()
		 * @generated
		 */
		EEnum CLASS_TYPE = eINSTANCE.getClassType();

	}

} //Q4bpmnPackage
