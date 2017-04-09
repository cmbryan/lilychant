/**
 * generated by Xtext 2.11.0
 */
package org.lilychant.lilyChantScript.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lilychant.lilyChantScript.LilyChantScriptPackage;
import org.lilychant.lilyChantScript.Syllable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syllable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lilychant.lilyChantScript.impl.SyllableImpl#isEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.lilychant.lilyChantScript.impl.SyllableImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyllableImpl extends MinimalEObjectImpl.Container implements Syllable
{
  /**
   * The default value of the '{@link #isEmphasis() <em>Emphasis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmphasis()
   * @generated
   * @ordered
   */
  protected static final boolean EMPHASIS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEmphasis() <em>Emphasis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmphasis()
   * @generated
   * @ordered
   */
  protected boolean emphasis = EMPHASIS_EDEFAULT;

  /**
   * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected String literal = LITERAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SyllableImpl()
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
    return LilyChantScriptPackage.Literals.SYLLABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEmphasis()
  {
    return emphasis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmphasis(boolean newEmphasis)
  {
    boolean oldEmphasis = emphasis;
    emphasis = newEmphasis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyChantScriptPackage.SYLLABLE__EMPHASIS, oldEmphasis, emphasis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(String newLiteral)
  {
    String oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyChantScriptPackage.SYLLABLE__LITERAL, oldLiteral, literal));
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
      case LilyChantScriptPackage.SYLLABLE__EMPHASIS:
        return isEmphasis();
      case LilyChantScriptPackage.SYLLABLE__LITERAL:
        return getLiteral();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LilyChantScriptPackage.SYLLABLE__EMPHASIS:
        setEmphasis((Boolean)newValue);
        return;
      case LilyChantScriptPackage.SYLLABLE__LITERAL:
        setLiteral((String)newValue);
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
      case LilyChantScriptPackage.SYLLABLE__EMPHASIS:
        setEmphasis(EMPHASIS_EDEFAULT);
        return;
      case LilyChantScriptPackage.SYLLABLE__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
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
      case LilyChantScriptPackage.SYLLABLE__EMPHASIS:
        return emphasis != EMPHASIS_EDEFAULT;
      case LilyChantScriptPackage.SYLLABLE__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
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
    result.append(" (emphasis: ");
    result.append(emphasis);
    result.append(", literal: ");
    result.append(literal);
    result.append(')');
    return result.toString();
  }

} //SyllableImpl
