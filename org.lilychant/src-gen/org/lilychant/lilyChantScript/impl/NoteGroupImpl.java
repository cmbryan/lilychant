/**
 * generated by Xtext 2.9.2
 */
package org.lilychant.lilyChantScript.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.lilychant.lilyChantScript.LilyChantScriptPackage;
import org.lilychant.lilyChantScript.NoteGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lilychant.lilyChantScript.impl.NoteGroupImpl#getSyllables <em>Syllables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoteGroupImpl extends MinimalEObjectImpl.Container implements NoteGroup
{
  /**
   * The cached value of the '{@link #getSyllables() <em>Syllables</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSyllables()
   * @generated
   * @ordered
   */
  protected EList<String> syllables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NoteGroupImpl()
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
    return LilyChantScriptPackage.Literals.NOTE_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSyllables()
  {
    if (syllables == null)
    {
      syllables = new EDataTypeEList<String>(String.class, this, LilyChantScriptPackage.NOTE_GROUP__SYLLABLES);
    }
    return syllables;
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
      case LilyChantScriptPackage.NOTE_GROUP__SYLLABLES:
        return getSyllables();
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
      case LilyChantScriptPackage.NOTE_GROUP__SYLLABLES:
        getSyllables().clear();
        getSyllables().addAll((Collection<? extends String>)newValue);
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
      case LilyChantScriptPackage.NOTE_GROUP__SYLLABLES:
        getSyllables().clear();
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
      case LilyChantScriptPackage.NOTE_GROUP__SYLLABLES:
        return syllables != null && !syllables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (syllables: ");
    result.append(syllables);
    result.append(')');
    return result.toString();
  }

} //NoteGroupImpl