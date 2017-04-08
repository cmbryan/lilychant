/**
 * generated by Xtext 2.11.0
 */
package org.lilychant.lilyChantScript.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lilychant.lilyChantScript.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lilychant.lilyChantScript.LilyChantScriptPackage
 * @generated
 */
public class LilyChantScriptAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LilyChantScriptPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyChantScriptAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LilyChantScriptPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LilyChantScriptSwitch<Adapter> modelSwitch =
    new LilyChantScriptSwitch<Adapter>()
    {
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseTone(Tone object)
      {
        return createToneAdapter();
      }
      @Override
      public Adapter caseVoiceName(VoiceName object)
      {
        return createVoiceNameAdapter();
      }
      @Override
      public Adapter caseTonePhrase(TonePhrase object)
      {
        return createTonePhraseAdapter();
      }
      @Override
      public Adapter caseVoicePhrase(VoicePhrase object)
      {
        return createVoicePhraseAdapter();
      }
      @Override
      public Adapter caseChant(Chant object)
      {
        return createChantAdapter();
      }
      @Override
      public Adapter caseLyricPhrase(LyricPhrase object)
      {
        return createLyricPhraseAdapter();
      }
      @Override
      public Adapter caseNoteGroup(NoteGroup object)
      {
        return createNoteGroupAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.lilychant.lilyChantScript.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lilychant.lilyChantScript.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lilychant.lilyChantScript.Tone <em>Tone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lilychant.lilyChantScript.Tone
   * @generated
   */
  public Adapter createToneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lilychant.lilyChantScript.VoiceName <em>Voice Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lilychant.lilyChantScript.VoiceName
   * @generated
   */
  public Adapter createVoiceNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lilychant.lilyChantScript.TonePhrase <em>Tone Phrase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lilychant.lilyChantScript.TonePhrase
   * @generated
   */
  public Adapter createTonePhraseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lilychant.lilyChantScript.VoicePhrase <em>Voice Phrase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lilychant.lilyChantScript.VoicePhrase
   * @generated
   */
  public Adapter createVoicePhraseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lilychant.lilyChantScript.Chant <em>Chant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lilychant.lilyChantScript.Chant
   * @generated
   */
  public Adapter createChantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lilychant.lilyChantScript.LyricPhrase <em>Lyric Phrase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lilychant.lilyChantScript.LyricPhrase
   * @generated
   */
  public Adapter createLyricPhraseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.lilychant.lilyChantScript.NoteGroup <em>Note Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.lilychant.lilyChantScript.NoteGroup
   * @generated
   */
  public Adapter createNoteGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LilyChantScriptAdapterFactory
