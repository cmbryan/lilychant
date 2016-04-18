/**
 * generated by Xtext 2.9.2
 */
package org.lilychant.lilyChantScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lilychant.lilyChantScript.NoteGroup#getSyllables <em>Syllables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lilychant.lilyChantScript.LilyChantScriptPackage#getNoteGroup()
 * @model
 * @generated
 */
public interface NoteGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Syllables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Syllables</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Syllables</em>' attribute list.
   * @see org.lilychant.lilyChantScript.LilyChantScriptPackage#getNoteGroup_Syllables()
   * @model unique="false"
   * @generated
   */
  EList<String> getSyllables();

} // NoteGroup
