/**
 * generated by Xtext 2.9.2
 */
package org.lilychant.lilyChantScript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lilychant.lilyChantScript.LilyChantScriptPackage;
import org.lilychant.lilyChantScript.LyricPhrase;
import org.lilychant.lilyChantScript.NoteGroup;
import org.lilychant.lilyChantScript.TonePhrase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lyric Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lilychant.lilyChantScript.impl.LyricPhraseImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.lilychant.lilyChantScript.impl.LyricPhraseImpl#getNoteGroups <em>Note Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LyricPhraseImpl extends MinimalEObjectImpl.Container implements LyricPhrase
{
  /**
   * The cached value of the '{@link #getNotes() <em>Notes</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotes()
   * @generated
   * @ordered
   */
  protected TonePhrase notes;

  /**
   * The cached value of the '{@link #getNoteGroups() <em>Note Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoteGroups()
   * @generated
   * @ordered
   */
  protected EList<NoteGroup> noteGroups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LyricPhraseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LilyChantScriptPackage.Literals.LYRIC_PHRASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TonePhrase getNotes()
  {
    if (notes != null && notes.eIsProxy())
    {
      InternalEObject oldNotes = (InternalEObject)notes;
      notes = (TonePhrase)eResolveProxy(oldNotes);
      if (notes != oldNotes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilyChantScriptPackage.LYRIC_PHRASE__NOTES, oldNotes, notes));
      }
    }
    return notes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TonePhrase basicGetNotes()
  {
    return notes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotes(TonePhrase newNotes)
  {
    TonePhrase oldNotes = notes;
    notes = newNotes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyChantScriptPackage.LYRIC_PHRASE__NOTES, oldNotes, notes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NoteGroup> getNoteGroups()
  {
    if (noteGroups == null)
    {
      noteGroups = new EObjectContainmentEList<NoteGroup>(NoteGroup.class, this, LilyChantScriptPackage.LYRIC_PHRASE__NOTE_GROUPS);
    }
    return noteGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LilyChantScriptPackage.LYRIC_PHRASE__NOTE_GROUPS:
        return ((InternalEList<?>)getNoteGroups()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LilyChantScriptPackage.LYRIC_PHRASE__NOTES:
        if (resolve) return getNotes();
        return basicGetNotes();
      case LilyChantScriptPackage.LYRIC_PHRASE__NOTE_GROUPS:
        return getNoteGroups();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LilyChantScriptPackage.LYRIC_PHRASE__NOTES:
        setNotes((TonePhrase)newValue);
        return;
      case LilyChantScriptPackage.LYRIC_PHRASE__NOTE_GROUPS:
        getNoteGroups().clear();
        getNoteGroups().addAll((Collection<? extends NoteGroup>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LilyChantScriptPackage.LYRIC_PHRASE__NOTES:
        setNotes((TonePhrase)null);
        return;
      case LilyChantScriptPackage.LYRIC_PHRASE__NOTE_GROUPS:
        getNoteGroups().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LilyChantScriptPackage.LYRIC_PHRASE__NOTES:
        return notes != null;
      case LilyChantScriptPackage.LYRIC_PHRASE__NOTE_GROUPS:
        return noteGroups != null && !noteGroups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LyricPhraseImpl