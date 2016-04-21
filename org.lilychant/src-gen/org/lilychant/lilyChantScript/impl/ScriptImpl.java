/**
 * generated by Xtext 2.9.1
 */
package org.lilychant.lilyChantScript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lilychant.lilyChantScript.Chant;
import org.lilychant.lilyChantScript.LilyChantScriptPackage;
import org.lilychant.lilyChantScript.Script;
import org.lilychant.lilyChantScript.Tone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lilychant.lilyChantScript.impl.ScriptImpl#getTones <em>Tones</em>}</li>
 *   <li>{@link org.lilychant.lilyChantScript.impl.ScriptImpl#getChants <em>Chants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script
{
  /**
   * The cached value of the '{@link #getTones() <em>Tones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTones()
   * @generated
   * @ordered
   */
  protected EList<Tone> tones;

  /**
   * The cached value of the '{@link #getChants() <em>Chants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChants()
   * @generated
   * @ordered
   */
  protected EList<Chant> chants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptImpl()
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
    return LilyChantScriptPackage.Literals.SCRIPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tone> getTones()
  {
    if (tones == null)
    {
      tones = new EObjectContainmentEList<Tone>(Tone.class, this, LilyChantScriptPackage.SCRIPT__TONES);
    }
    return tones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Chant> getChants()
  {
    if (chants == null)
    {
      chants = new EObjectContainmentEList<Chant>(Chant.class, this, LilyChantScriptPackage.SCRIPT__CHANTS);
    }
    return chants;
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
      case LilyChantScriptPackage.SCRIPT__TONES:
        return ((InternalEList<?>)getTones()).basicRemove(otherEnd, msgs);
      case LilyChantScriptPackage.SCRIPT__CHANTS:
        return ((InternalEList<?>)getChants()).basicRemove(otherEnd, msgs);
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
      case LilyChantScriptPackage.SCRIPT__TONES:
        return getTones();
      case LilyChantScriptPackage.SCRIPT__CHANTS:
        return getChants();
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
      case LilyChantScriptPackage.SCRIPT__TONES:
        getTones().clear();
        getTones().addAll((Collection<? extends Tone>)newValue);
        return;
      case LilyChantScriptPackage.SCRIPT__CHANTS:
        getChants().clear();
        getChants().addAll((Collection<? extends Chant>)newValue);
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
      case LilyChantScriptPackage.SCRIPT__TONES:
        getTones().clear();
        return;
      case LilyChantScriptPackage.SCRIPT__CHANTS:
        getChants().clear();
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
      case LilyChantScriptPackage.SCRIPT__TONES:
        return tones != null && !tones.isEmpty();
      case LilyChantScriptPackage.SCRIPT__CHANTS:
        return chants != null && !chants.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScriptImpl
