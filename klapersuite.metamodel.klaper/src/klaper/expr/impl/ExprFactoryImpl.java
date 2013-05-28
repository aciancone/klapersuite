/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.expr.impl;

import klaper.expr.Atom;
import klaper.expr.Binary;
import klaper.expr.Div;
import klaper.expr.Exp;
import klaper.expr.ExprFactory;
import klaper.expr.ExprPackage;
import klaper.expr.Expression;
import klaper.expr.Minus;
import klaper.expr.Mult;
import klaper.expr.Operator;
import klaper.expr.Plus;
import klaper.expr.Unary;
import klaper.expr.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExprFactoryImpl extends EFactoryImpl implements ExprFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExprFactory init() {
		try {
			ExprFactory theExprFactory = (ExprFactory)EPackage.Registry.INSTANCE.getEFactory("http://klaper.sourceforge.net/metamodels/klaper/1.0/expression"); 
			if (theExprFactory != null) {
				return theExprFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExprFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExprFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExprPackage.EXPRESSION: return createExpression();
			case ExprPackage.ATOM: return createAtom();
			case ExprPackage.NUMBER: return createNumber();
			case ExprPackage.VARIABLE: return createVariable();
			case ExprPackage.INTEGER: return createInteger();
			case ExprPackage.DOUBLE: return createDouble();
			case ExprPackage.UNARY: return createUnary();
			case ExprPackage.BINARY: return createBinary();
			case ExprPackage.OPERATOR: return createOperator();
			case ExprPackage.PLUS: return createPlus();
			case ExprPackage.MINUS: return createMinus();
			case ExprPackage.MULT: return createMult();
			case ExprPackage.DIV: return createDiv();
			case ExprPackage.EXP: return createExp();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public klaper.expr.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public klaper.expr.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public klaper.expr.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unary createUnary() {
		UnaryImpl unary = new UnaryImpl();
		return unary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mult createMult() {
		MultImpl mult = new MultImpl();
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exp createExp() {
		ExpImpl exp = new ExpImpl();
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExprPackage getExprPackage() {
		return (ExprPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExprPackage getPackage() {
		return ExprPackage.eINSTANCE;
	}

} //ExprFactoryImpl
