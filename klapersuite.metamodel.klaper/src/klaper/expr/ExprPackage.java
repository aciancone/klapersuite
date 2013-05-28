/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.expr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see klaper.expr.ExprFactory
 * @model kind="package"
 * @generated
 */
public interface ExprPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://klaper.sourceforge.net/metamodels/klaper/1.0/expression";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "klaper.expr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExprPackage eINSTANCE = klaper.expr.impl.ExprPackageImpl.init();

	/**
	 * The meta object id for the '{@link klaper.expr.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.ExpressionImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.AtomImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 1;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.NumberImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.VariableImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.IntegerImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__VALUE = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.DoubleImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__VALUE = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.UnaryImpl <em>Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.UnaryImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getUnary()
	 * @generated
	 */
	int UNARY = 6;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__ELEMENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.BinaryImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 7;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.OperatorImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 8;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.PlusImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 9;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.MinusImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 10;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.MultImpl <em>Mult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.MultImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getMult()
	 * @generated
	 */
	int MULT = 11;

	/**
	 * The number of structural features of the '<em>Mult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.DivImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 12;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link klaper.expr.impl.ExpImpl <em>Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see klaper.expr.impl.ExpImpl
	 * @see klaper.expr.impl.ExprPackageImpl#getExp()
	 * @generated
	 */
	int EXP = 13;

	/**
	 * The number of structural features of the '<em>Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link klaper.expr.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see klaper.expr.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see klaper.expr.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see klaper.expr.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see klaper.expr.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see klaper.expr.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link klaper.expr.Integer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see klaper.expr.Integer#getValue()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Value();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see klaper.expr.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for the attribute '{@link klaper.expr.Double#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see klaper.expr.Double#getValue()
	 * @see #getDouble()
	 * @generated
	 */
	EAttribute getDouble_Value();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary</em>'.
	 * @see klaper.expr.Unary
	 * @generated
	 */
	EClass getUnary();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.expr.Unary#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see klaper.expr.Unary#getOperator()
	 * @see #getUnary()
	 * @generated
	 */
	EReference getUnary_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.expr.Unary#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see klaper.expr.Unary#getElement()
	 * @see #getUnary()
	 * @generated
	 */
	EReference getUnary_Element();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see klaper.expr.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.expr.Binary#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see klaper.expr.Binary#getOperator()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.expr.Binary#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see klaper.expr.Binary#getLeft()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Left();

	/**
	 * Returns the meta object for the containment reference '{@link klaper.expr.Binary#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see klaper.expr.Binary#getRight()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Right();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see klaper.expr.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see klaper.expr.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see klaper.expr.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Mult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mult</em>'.
	 * @see klaper.expr.Mult
	 * @generated
	 */
	EClass getMult();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see klaper.expr.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link klaper.expr.Exp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp</em>'.
	 * @see klaper.expr.Exp
	 * @generated
	 */
	EClass getExp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExprFactory getExprFactory();

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
		 * The meta object literal for the '{@link klaper.expr.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.ExpressionImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.AtomImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.NumberImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.VariableImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.IntegerImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__VALUE = eINSTANCE.getInteger_Value();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.DoubleImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE__VALUE = eINSTANCE.getDouble_Value();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.UnaryImpl <em>Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.UnaryImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getUnary()
		 * @generated
		 */
		EClass UNARY = eINSTANCE.getUnary();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY__OPERATOR = eINSTANCE.getUnary_Operator();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY__ELEMENT = eINSTANCE.getUnary_Element();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.BinaryImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__OPERATOR = eINSTANCE.getBinary_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__LEFT = eINSTANCE.getBinary_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__RIGHT = eINSTANCE.getBinary_Right();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.OperatorImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.PlusImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.MinusImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.MultImpl <em>Mult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.MultImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getMult()
		 * @generated
		 */
		EClass MULT = eINSTANCE.getMult();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.DivImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link klaper.expr.impl.ExpImpl <em>Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see klaper.expr.impl.ExpImpl
		 * @see klaper.expr.impl.ExprPackageImpl#getExp()
		 * @generated
		 */
		EClass EXP = eINSTANCE.getExp();

	}

} //ExprPackage
