/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package klaper.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scheduling Policy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see klaper.core.CorePackage#getSchedulingPolicyKind()
 * @model
 * @generated
 */
public enum SchedulingPolicyKind implements Enumerator {
	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(0, "NULL", "NULL"),

	/**
	 * The '<em><b>Earliest Deadline First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLIEST_DEADLINE_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	EARLIEST_DEADLINE_FIRST(1, "EarliestDeadlineFirst", "EarliestDeadlineFirst"),

	/**
	 * The '<em><b>FIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFO_VALUE
	 * @generated
	 * @ordered
	 */
	FIFO(2, "FIFO", "FIFO"),

	/**
	 * The '<em><b>Fixed Priority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_PRIORITY_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED_PRIORITY(3, "FixedPriority", "FixedPriority"),

	/**
	 * The '<em><b>Least Laxity First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAST_LAXITY_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	LEAST_LAXITY_FIRST(4, "LeastLaxityFirst", "LeastLaxityFirst"),

	/**
	 * The '<em><b>Round Robin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_ROBIN_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND_ROBIN(5, "RoundRobin", "RoundRobin"),

	/**
	 * The '<em><b>Time Table Driven</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_TABLE_DRIVEN_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_TABLE_DRIVEN(6, "TimeTableDriven", "TimeTableDriven");

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 0;

	/**
	 * The '<em><b>Earliest Deadline First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Earliest Deadline First</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EARLIEST_DEADLINE_FIRST
	 * @model name="EarliestDeadlineFirst"
	 * @generated
	 * @ordered
	 */
	public static final int EARLIEST_DEADLINE_FIRST_VALUE = 1;

	/**
	 * The '<em><b>FIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIFO_VALUE = 2;

	/**
	 * The '<em><b>Fixed Priority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fixed Priority</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXED_PRIORITY
	 * @model name="FixedPriority"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_PRIORITY_VALUE = 3;

	/**
	 * The '<em><b>Least Laxity First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Least Laxity First</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAST_LAXITY_FIRST
	 * @model name="LeastLaxityFirst"
	 * @generated
	 * @ordered
	 */
	public static final int LEAST_LAXITY_FIRST_VALUE = 4;

	/**
	 * The '<em><b>Round Robin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Round Robin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUND_ROBIN
	 * @model name="RoundRobin"
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_ROBIN_VALUE = 5;

	/**
	 * The '<em><b>Time Table Driven</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Table Driven</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_TABLE_DRIVEN
	 * @model name="TimeTableDriven"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_TABLE_DRIVEN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Scheduling Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchedulingPolicyKind[] VALUES_ARRAY =
		new SchedulingPolicyKind[] {
			NULL,
			EARLIEST_DEADLINE_FIRST,
			FIFO,
			FIXED_PRIORITY,
			LEAST_LAXITY_FIRST,
			ROUND_ROBIN,
			TIME_TABLE_DRIVEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Scheduling Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SchedulingPolicyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scheduling Policy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingPolicyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulingPolicyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling Policy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingPolicyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulingPolicyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling Policy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchedulingPolicyKind get(int value) {
		switch (value) {
			case NULL_VALUE: return NULL;
			case EARLIEST_DEADLINE_FIRST_VALUE: return EARLIEST_DEADLINE_FIRST;
			case FIFO_VALUE: return FIFO;
			case FIXED_PRIORITY_VALUE: return FIXED_PRIORITY;
			case LEAST_LAXITY_FIRST_VALUE: return LEAST_LAXITY_FIRST;
			case ROUND_ROBIN_VALUE: return ROUND_ROBIN;
			case TIME_TABLE_DRIVEN_VALUE: return TIME_TABLE_DRIVEN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SchedulingPolicyKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SchedulingPolicyKind
