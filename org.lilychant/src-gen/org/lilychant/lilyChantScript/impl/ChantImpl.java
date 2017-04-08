/**
 * generated by Xtext 2.11.0
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

import org.lilychant.lilyChantScript.Chant;
import org.lilychant.lilyChantScript.LilyChantScriptPackage;
import org.lilychant.lilyChantScript.LyricPhrase;
import org.lilychant.lilyChantScript.Tone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lilychant.lilyChantScript.impl.ChantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lilychant.lilyChantScript.impl.ChantImpl#getTone <em>Tone</em>}</li>
 *   <li>{@link org.lilychant.lilyChantScript.impl.ChantImpl#getPhrases <em>Phrases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChantImpl extends MinimalEObjectImpl.Container implements Chant
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTone() <em>Tone</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTone()
   * @generated
   * @ordered
   */
  protected Tone tone;

  /**
   * The cached value of the '{@link #getPhrases() <em>Phrases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhrases()
   * @generated
   * @ordered
   */
  protected EList<LyricPhrase> phrases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChantImpl()
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
    return LilyChantScriptPackage.Literals.CHANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyChantScriptPackage.CHANT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tone getTone()
  {
    if (tone != null && tone.eIsProxy())
    {
      InternalEObject oldTone = (InternalEObject)tone;
      tone = (Tone)eResolveProxy(oldTone);
      if (tone != oldTone)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilyChantScriptPackage.CHANT__TONE, oldTone, tone));
      }
    }
    return tone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tone basicGetTone()
  {
    return tone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTone(Tone newTone)
  {
    Tone oldTone = tone;
    tone = newTone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyChantScriptPackage.CHANT__TONE, oldTone, tone));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LyricPhrase> getPhrases()
  {
    if (phrases == null)
    {
      phrases = new EObjectContainmentEList<LyricPhrase>(LyricPhrase.class, this, LilyChantScriptPackage.CHANT__PHRASES);
    }
    return phrases;
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
      case LilyChantScriptPackage.CHANT__PHRASES:
        return ((InternalEList<?>)getPhrases()).basicRemove(otherEnd, msgs);
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
      case LilyChantScriptPackage.CHANT__NAME:
        return getName();
      case LilyChantScriptPackage.CHANT__TONE:
        if (resolve) return getTone();
        return basicGetTone();
      case LilyChantScriptPackage.CHANT__PHRASES:
        return getPhrases();
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
      case LilyChantScriptPackage.CHANT__NAME:
        setName((String)newValue);
        return;
      case LilyChantScriptPackage.CHANT__TONE:
        setTone((Tone)newValue);
        return;
      case LilyChantScriptPackage.CHANT__PHRASES:
        getPhrases().clear();
        getPhrases().addAll((Collection<? extends LyricPhrase>)newValue);
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
      case LilyChantScriptPackage.CHANT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LilyChantScriptPackage.CHANT__TONE:
        setTone((Tone)null);
        return;
      case LilyChantScriptPackage.CHANT__PHRASES:
        getPhrases().clear();
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
      case LilyChantScriptPackage.CHANT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LilyChantScriptPackage.CHANT__TONE:
        return tone != null;
      case LilyChantScriptPackage.CHANT__PHRASES:
        return phrases != null && !phrases.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ChantImpl
