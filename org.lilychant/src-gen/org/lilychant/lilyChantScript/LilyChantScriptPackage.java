/**
 * generated by Xtext 2.11.0
 */
package org.lilychant.lilyChantScript;

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
 * @see org.lilychant.lilyChantScript.LilyChantScriptFactory
 * @model kind="package"
 * @generated
 */
public interface LilyChantScriptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lilyChantScript";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lilychant.org/script/LilyChantScript";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lilyChantScript";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LilyChantScriptPackage eINSTANCE = org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl.init();

  /**
   * The meta object id for the '{@link org.lilychant.lilyChantScript.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lilychant.lilyChantScript.impl.ScriptImpl
   * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 0;

  /**
   * The feature id for the '<em><b>Tones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__TONES = 0;

  /**
   * The feature id for the '<em><b>Chants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__CHANTS = 1;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lilychant.lilyChantScript.impl.ToneImpl <em>Tone</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lilychant.lilyChantScript.impl.ToneImpl
   * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getTone()
   * @generated
   */
  int TONE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TONE__NAME = 0;

  /**
   * The feature id for the '<em><b>Voice Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TONE__VOICE_NAMES = 1;

  /**
   * The feature id for the '<em><b>Phrases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TONE__PHRASES = 2;

  /**
   * The number of structural features of the '<em>Tone</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TONE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lilychant.lilyChantScript.impl.VoiceNameImpl <em>Voice Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lilychant.lilyChantScript.impl.VoiceNameImpl
   * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getVoiceName()
   * @generated
   */
  int VOICE_NAME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOICE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Voice Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOICE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lilychant.lilyChantScript.impl.TonePhraseImpl <em>Tone Phrase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lilychant.lilyChantScript.impl.TonePhraseImpl
   * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getTonePhrase()
   * @generated
   */
  int TONE_PHRASE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TONE_PHRASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Voices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TONE_PHRASE__VOICES = 1;

  /**
   * The number of structural features of the '<em>Tone Phrase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TONE_PHRASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lilychant.lilyChantScript.impl.VoicePhraseImpl <em>Voice Phrase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lilychant.lilyChantScript.impl.VoicePhraseImpl
   * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getVoicePhrase()
   * @generated
   */
  int VOICE_PHRASE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOICE_PHRASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Notes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOICE_PHRASE__NOTES = 1;

  /**
   * The number of structural features of the '<em>Voice Phrase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOICE_PHRASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.lilychant.lilyChantScript.impl.ChantImpl <em>Chant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lilychant.lilyChantScript.impl.ChantImpl
   * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getChant()
   * @generated
   */
  int CHANT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANT__NAME = 0;

  /**
   * The feature id for the '<em><b>Tone</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANT__TONE = 1;

  /**
   * The feature id for the '<em><b>Phrases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANT__PHRASES = 2;

  /**
   * The number of structural features of the '<em>Chant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lilychant.lilyChantScript.impl.LyricPhraseImpl <em>Lyric Phrase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lilychant.lilyChantScript.impl.LyricPhraseImpl
   * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getLyricPhrase()
   * @generated
   */
  int LYRIC_PHRASE = 6;

  /**
   * The feature id for the '<em><b>Explicit Phrase</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LYRIC_PHRASE__EXPLICIT_PHRASE = 0;

  /**
   * The feature id for the '<em><b>Note Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LYRIC_PHRASE__NOTE_GROUPS = 1;

  /**
   * The feature id for the '<em><b>Bar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LYRIC_PHRASE__BAR = 2;

  /**
   * The number of structural features of the '<em>Lyric Phrase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LYRIC_PHRASE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.lilychant.lilyChantScript.impl.NoteGroupImpl <em>Note Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lilychant.lilyChantScript.impl.NoteGroupImpl
   * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getNoteGroup()
   * @generated
   */
  int NOTE_GROUP = 7;

  /**
   * The feature id for the '<em><b>Syllables</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_GROUP__SYLLABLES = 0;

  /**
   * The number of structural features of the '<em>Note Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.lilychant.lilyChantScript.Barline <em>Barline</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lilychant.lilyChantScript.Barline
   * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getBarline()
   * @generated
   */
  int BARLINE = 8;


  /**
   * Returns the meta object for class '{@link org.lilychant.lilyChantScript.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see org.lilychant.lilyChantScript.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the containment reference list '{@link org.lilychant.lilyChantScript.Script#getTones <em>Tones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tones</em>'.
   * @see org.lilychant.lilyChantScript.Script#getTones()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Tones();

  /**
   * Returns the meta object for the containment reference list '{@link org.lilychant.lilyChantScript.Script#getChants <em>Chants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Chants</em>'.
   * @see org.lilychant.lilyChantScript.Script#getChants()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Chants();

  /**
   * Returns the meta object for class '{@link org.lilychant.lilyChantScript.Tone <em>Tone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tone</em>'.
   * @see org.lilychant.lilyChantScript.Tone
   * @generated
   */
  EClass getTone();

  /**
   * Returns the meta object for the attribute '{@link org.lilychant.lilyChantScript.Tone#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lilychant.lilyChantScript.Tone#getName()
   * @see #getTone()
   * @generated
   */
  EAttribute getTone_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.lilychant.lilyChantScript.Tone#getVoiceNames <em>Voice Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Voice Names</em>'.
   * @see org.lilychant.lilyChantScript.Tone#getVoiceNames()
   * @see #getTone()
   * @generated
   */
  EReference getTone_VoiceNames();

  /**
   * Returns the meta object for the containment reference list '{@link org.lilychant.lilyChantScript.Tone#getPhrases <em>Phrases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Phrases</em>'.
   * @see org.lilychant.lilyChantScript.Tone#getPhrases()
   * @see #getTone()
   * @generated
   */
  EReference getTone_Phrases();

  /**
   * Returns the meta object for class '{@link org.lilychant.lilyChantScript.VoiceName <em>Voice Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Voice Name</em>'.
   * @see org.lilychant.lilyChantScript.VoiceName
   * @generated
   */
  EClass getVoiceName();

  /**
   * Returns the meta object for the attribute '{@link org.lilychant.lilyChantScript.VoiceName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lilychant.lilyChantScript.VoiceName#getName()
   * @see #getVoiceName()
   * @generated
   */
  EAttribute getVoiceName_Name();

  /**
   * Returns the meta object for class '{@link org.lilychant.lilyChantScript.TonePhrase <em>Tone Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tone Phrase</em>'.
   * @see org.lilychant.lilyChantScript.TonePhrase
   * @generated
   */
  EClass getTonePhrase();

  /**
   * Returns the meta object for the attribute '{@link org.lilychant.lilyChantScript.TonePhrase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lilychant.lilyChantScript.TonePhrase#getName()
   * @see #getTonePhrase()
   * @generated
   */
  EAttribute getTonePhrase_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.lilychant.lilyChantScript.TonePhrase#getVoices <em>Voices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Voices</em>'.
   * @see org.lilychant.lilyChantScript.TonePhrase#getVoices()
   * @see #getTonePhrase()
   * @generated
   */
  EReference getTonePhrase_Voices();

  /**
   * Returns the meta object for class '{@link org.lilychant.lilyChantScript.VoicePhrase <em>Voice Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Voice Phrase</em>'.
   * @see org.lilychant.lilyChantScript.VoicePhrase
   * @generated
   */
  EClass getVoicePhrase();

  /**
   * Returns the meta object for the reference '{@link org.lilychant.lilyChantScript.VoicePhrase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.lilychant.lilyChantScript.VoicePhrase#getName()
   * @see #getVoicePhrase()
   * @generated
   */
  EReference getVoicePhrase_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.lilychant.lilyChantScript.VoicePhrase#getNotes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Notes</em>'.
   * @see org.lilychant.lilyChantScript.VoicePhrase#getNotes()
   * @see #getVoicePhrase()
   * @generated
   */
  EAttribute getVoicePhrase_Notes();

  /**
   * Returns the meta object for class '{@link org.lilychant.lilyChantScript.Chant <em>Chant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chant</em>'.
   * @see org.lilychant.lilyChantScript.Chant
   * @generated
   */
  EClass getChant();

  /**
   * Returns the meta object for the attribute '{@link org.lilychant.lilyChantScript.Chant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.lilychant.lilyChantScript.Chant#getName()
   * @see #getChant()
   * @generated
   */
  EAttribute getChant_Name();

  /**
   * Returns the meta object for the reference '{@link org.lilychant.lilyChantScript.Chant#getTone <em>Tone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tone</em>'.
   * @see org.lilychant.lilyChantScript.Chant#getTone()
   * @see #getChant()
   * @generated
   */
  EReference getChant_Tone();

  /**
   * Returns the meta object for the containment reference list '{@link org.lilychant.lilyChantScript.Chant#getPhrases <em>Phrases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Phrases</em>'.
   * @see org.lilychant.lilyChantScript.Chant#getPhrases()
   * @see #getChant()
   * @generated
   */
  EReference getChant_Phrases();

  /**
   * Returns the meta object for class '{@link org.lilychant.lilyChantScript.LyricPhrase <em>Lyric Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lyric Phrase</em>'.
   * @see org.lilychant.lilyChantScript.LyricPhrase
   * @generated
   */
  EClass getLyricPhrase();

  /**
   * Returns the meta object for the reference '{@link org.lilychant.lilyChantScript.LyricPhrase#getExplicitPhrase <em>Explicit Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Explicit Phrase</em>'.
   * @see org.lilychant.lilyChantScript.LyricPhrase#getExplicitPhrase()
   * @see #getLyricPhrase()
   * @generated
   */
  EReference getLyricPhrase_ExplicitPhrase();

  /**
   * Returns the meta object for the containment reference list '{@link org.lilychant.lilyChantScript.LyricPhrase#getNoteGroups <em>Note Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Note Groups</em>'.
   * @see org.lilychant.lilyChantScript.LyricPhrase#getNoteGroups()
   * @see #getLyricPhrase()
   * @generated
   */
  EReference getLyricPhrase_NoteGroups();

  /**
   * Returns the meta object for the attribute '{@link org.lilychant.lilyChantScript.LyricPhrase#getBar <em>Bar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bar</em>'.
   * @see org.lilychant.lilyChantScript.LyricPhrase#getBar()
   * @see #getLyricPhrase()
   * @generated
   */
  EAttribute getLyricPhrase_Bar();

  /**
   * Returns the meta object for class '{@link org.lilychant.lilyChantScript.NoteGroup <em>Note Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note Group</em>'.
   * @see org.lilychant.lilyChantScript.NoteGroup
   * @generated
   */
  EClass getNoteGroup();

  /**
   * Returns the meta object for the attribute list '{@link org.lilychant.lilyChantScript.NoteGroup#getSyllables <em>Syllables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Syllables</em>'.
   * @see org.lilychant.lilyChantScript.NoteGroup#getSyllables()
   * @see #getNoteGroup()
   * @generated
   */
  EAttribute getNoteGroup_Syllables();

  /**
   * Returns the meta object for enum '{@link org.lilychant.lilyChantScript.Barline <em>Barline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Barline</em>'.
   * @see org.lilychant.lilyChantScript.Barline
   * @generated
   */
  EEnum getBarline();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LilyChantScriptFactory getLilyChantScriptFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.lilychant.lilyChantScript.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lilychant.lilyChantScript.impl.ScriptImpl
     * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Tones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__TONES = eINSTANCE.getScript_Tones();

    /**
     * The meta object literal for the '<em><b>Chants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__CHANTS = eINSTANCE.getScript_Chants();

    /**
     * The meta object literal for the '{@link org.lilychant.lilyChantScript.impl.ToneImpl <em>Tone</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lilychant.lilyChantScript.impl.ToneImpl
     * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getTone()
     * @generated
     */
    EClass TONE = eINSTANCE.getTone();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TONE__NAME = eINSTANCE.getTone_Name();

    /**
     * The meta object literal for the '<em><b>Voice Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TONE__VOICE_NAMES = eINSTANCE.getTone_VoiceNames();

    /**
     * The meta object literal for the '<em><b>Phrases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TONE__PHRASES = eINSTANCE.getTone_Phrases();

    /**
     * The meta object literal for the '{@link org.lilychant.lilyChantScript.impl.VoiceNameImpl <em>Voice Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lilychant.lilyChantScript.impl.VoiceNameImpl
     * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getVoiceName()
     * @generated
     */
    EClass VOICE_NAME = eINSTANCE.getVoiceName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOICE_NAME__NAME = eINSTANCE.getVoiceName_Name();

    /**
     * The meta object literal for the '{@link org.lilychant.lilyChantScript.impl.TonePhraseImpl <em>Tone Phrase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lilychant.lilyChantScript.impl.TonePhraseImpl
     * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getTonePhrase()
     * @generated
     */
    EClass TONE_PHRASE = eINSTANCE.getTonePhrase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TONE_PHRASE__NAME = eINSTANCE.getTonePhrase_Name();

    /**
     * The meta object literal for the '<em><b>Voices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TONE_PHRASE__VOICES = eINSTANCE.getTonePhrase_Voices();

    /**
     * The meta object literal for the '{@link org.lilychant.lilyChantScript.impl.VoicePhraseImpl <em>Voice Phrase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lilychant.lilyChantScript.impl.VoicePhraseImpl
     * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getVoicePhrase()
     * @generated
     */
    EClass VOICE_PHRASE = eINSTANCE.getVoicePhrase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VOICE_PHRASE__NAME = eINSTANCE.getVoicePhrase_Name();

    /**
     * The meta object literal for the '<em><b>Notes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOICE_PHRASE__NOTES = eINSTANCE.getVoicePhrase_Notes();

    /**
     * The meta object literal for the '{@link org.lilychant.lilyChantScript.impl.ChantImpl <em>Chant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lilychant.lilyChantScript.impl.ChantImpl
     * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getChant()
     * @generated
     */
    EClass CHANT = eINSTANCE.getChant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANT__NAME = eINSTANCE.getChant_Name();

    /**
     * The meta object literal for the '<em><b>Tone</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANT__TONE = eINSTANCE.getChant_Tone();

    /**
     * The meta object literal for the '<em><b>Phrases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANT__PHRASES = eINSTANCE.getChant_Phrases();

    /**
     * The meta object literal for the '{@link org.lilychant.lilyChantScript.impl.LyricPhraseImpl <em>Lyric Phrase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lilychant.lilyChantScript.impl.LyricPhraseImpl
     * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getLyricPhrase()
     * @generated
     */
    EClass LYRIC_PHRASE = eINSTANCE.getLyricPhrase();

    /**
     * The meta object literal for the '<em><b>Explicit Phrase</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LYRIC_PHRASE__EXPLICIT_PHRASE = eINSTANCE.getLyricPhrase_ExplicitPhrase();

    /**
     * The meta object literal for the '<em><b>Note Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LYRIC_PHRASE__NOTE_GROUPS = eINSTANCE.getLyricPhrase_NoteGroups();

    /**
     * The meta object literal for the '<em><b>Bar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LYRIC_PHRASE__BAR = eINSTANCE.getLyricPhrase_Bar();

    /**
     * The meta object literal for the '{@link org.lilychant.lilyChantScript.impl.NoteGroupImpl <em>Note Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lilychant.lilyChantScript.impl.NoteGroupImpl
     * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getNoteGroup()
     * @generated
     */
    EClass NOTE_GROUP = eINSTANCE.getNoteGroup();

    /**
     * The meta object literal for the '<em><b>Syllables</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE_GROUP__SYLLABLES = eINSTANCE.getNoteGroup_Syllables();

    /**
     * The meta object literal for the '{@link org.lilychant.lilyChantScript.Barline <em>Barline</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lilychant.lilyChantScript.Barline
     * @see org.lilychant.lilyChantScript.impl.LilyChantScriptPackageImpl#getBarline()
     * @generated
     */
    EEnum BARLINE = eINSTANCE.getBarline();

  }

} //LilyChantScriptPackage
