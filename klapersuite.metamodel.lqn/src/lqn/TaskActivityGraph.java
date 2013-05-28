/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lqn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lqn.TaskActivityGraph#getReplyEntry <em>Reply Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see lqn.LqnPackage#getTaskActivityGraph()
 * @model
 * @generated
 */
public interface TaskActivityGraph extends ActivityGraph {
	/**
	 * Returns the value of the '<em><b>Reply Entry</b></em>' containment reference list.
	 * The list contents are of type {@link lqn.ReplyEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Entry</em>' containment reference list.
	 * @see lqn.LqnPackage#getTaskActivityGraph_ReplyEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReplyEntry> getReplyEntry();

} // TaskActivityGraph
