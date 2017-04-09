/**
 * generated by Xtext 2.11.0
 */
package org.lilychant.lilyChantScript;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lilychant.lilyChantScript.LilyChantScriptPackage
 * @generated
 */
public interface LilyChantScriptFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LilyChantScriptFactory eINSTANCE = org.lilychant.lilyChantScript.impl.LilyChantScriptFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script</em>'.
   * @generated
   */
  Script createScript();

  /**
   * Returns a new object of class '<em>Tone</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tone</em>'.
   * @generated
   */
  Tone createTone();

  /**
   * Returns a new object of class '<em>Voice Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Voice Name</em>'.
   * @generated
   */
  VoiceName createVoiceName();

  /**
   * Returns a new object of class '<em>Tone Phrase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tone Phrase</em>'.
   * @generated
   */
  TonePhrase createTonePhrase();

  /**
   * Returns a new object of class '<em>Voice Phrase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Voice Phrase</em>'.
   * @generated
   */
  VoicePhrase createVoicePhrase();

  /**
   * Returns a new object of class '<em>Chant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chant</em>'.
   * @generated
   */
  Chant createChant();

  /**
   * Returns a new object of class '<em>Lyric Phrase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lyric Phrase</em>'.
   * @generated
   */
  LyricPhrase createLyricPhrase();

  /**
   * Returns a new object of class '<em>Note Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note Group</em>'.
   * @generated
   */
  NoteGroup createNoteGroup();

  /**
   * Returns a new object of class '<em>Syllable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Syllable</em>'.
   * @generated
   */
  Syllable createSyllable();

  /**
   * Returns a new object of class '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note</em>'.
   * @generated
   */
  Note createNote();

  /**
   * Returns a new object of class '<em>Hyphen Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hyphen Rule</em>'.
   * @generated
   */
  HyphenRule createHyphenRule();

  /**
   * Returns a new object of class '<em>Extender Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extender Rule</em>'.
   * @generated
   */
  ExtenderRule createExtenderRule();

  /**
   * Returns a new object of class '<em>Skip Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skip Rule</em>'.
   * @generated
   */
  SkipRule createSkipRule();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LilyChantScriptPackage getLilyChantScriptPackage();

} //LilyChantScriptFactory
