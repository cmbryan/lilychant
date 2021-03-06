/**
 * generated by Xtext 2.11.0
 */
package org.lilychant.lilyChantScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lilychant.lilyChantScript.Chant#getName <em>Name</em>}</li>
 *   <li>{@link org.lilychant.lilyChantScript.Chant#getTone <em>Tone</em>}</li>
 *   <li>{@link org.lilychant.lilyChantScript.Chant#getPhrases <em>Phrases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lilychant.lilyChantScript.LilyChantScriptPackage#getChant()
 * @model
 * @generated
 */
public interface Chant extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.lilychant.lilyChantScript.LilyChantScriptPackage#getChant_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.lilychant.lilyChantScript.Chant#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tone</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tone</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tone</em>' reference.
   * @see #setTone(Tone)
   * @see org.lilychant.lilyChantScript.LilyChantScriptPackage#getChant_Tone()
   * @model
   * @generated
   */
  Tone getTone();

  /**
   * Sets the value of the '{@link org.lilychant.lilyChantScript.Chant#getTone <em>Tone</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tone</em>' reference.
   * @see #getTone()
   * @generated
   */
  void setTone(Tone value);

  /**
   * Returns the value of the '<em><b>Phrases</b></em>' containment reference list.
   * The list contents are of type {@link org.lilychant.lilyChantScript.LyricPhrase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phrases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phrases</em>' containment reference list.
   * @see org.lilychant.lilyChantScript.LilyChantScriptPackage#getChant_Phrases()
   * @model containment="true"
   * @generated
   */
  EList<LyricPhrase> getPhrases();

} // Chant
