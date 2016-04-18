/*
 * generated by Xtext 2.9.2
 */
package org.lilychant.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.lilychant.lilyChantScript.Chant;
import org.lilychant.lilyChantScript.LilyChantScriptPackage;
import org.lilychant.lilyChantScript.LyricPhrase;
import org.lilychant.lilyChantScript.NoteGroup;
import org.lilychant.lilyChantScript.Script;
import org.lilychant.lilyChantScript.Tone;
import org.lilychant.lilyChantScript.TonePhrase;
import org.lilychant.lilyChantScript.VoiceName;
import org.lilychant.lilyChantScript.VoicePhrase;
import org.lilychant.services.LilyChantGrammarAccess;

@SuppressWarnings("all")
public class LilyChantSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LilyChantGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LilyChantScriptPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LilyChantScriptPackage.CHANT:
				sequence_Chant(context, (Chant) semanticObject); 
				return; 
			case LilyChantScriptPackage.LYRIC_PHRASE:
				sequence_LyricPhrase(context, (LyricPhrase) semanticObject); 
				return; 
			case LilyChantScriptPackage.NOTE_GROUP:
				sequence_NoteGroup(context, (NoteGroup) semanticObject); 
				return; 
			case LilyChantScriptPackage.SCRIPT:
				sequence_Script(context, (Script) semanticObject); 
				return; 
			case LilyChantScriptPackage.TONE:
				sequence_Tone(context, (Tone) semanticObject); 
				return; 
			case LilyChantScriptPackage.TONE_PHRASE:
				sequence_TonePhrase(context, (TonePhrase) semanticObject); 
				return; 
			case LilyChantScriptPackage.VOICE_NAME:
				sequence_VoiceName(context, (VoiceName) semanticObject); 
				return; 
			case LilyChantScriptPackage.VOICE_PHRASE:
				sequence_VoicePhrase(context, (VoicePhrase) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Chant returns Chant
	 *
	 * Constraint:
	 *     (tone=[Tone|ID] key=ID phrases+=LyricPhrase+)
	 */
	protected void sequence_Chant(ISerializationContext context, Chant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LyricPhrase returns LyricPhrase
	 *
	 * Constraint:
	 *     (notes=[TonePhrase|ID] noteGroups+=NoteGroup+)
	 */
	protected void sequence_LyricPhrase(ISerializationContext context, LyricPhrase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NoteGroup returns NoteGroup
	 *
	 * Constraint:
	 *     ((syllables+=ID (syllables+=HYPHEN | syllables+=EXTENDER+)?) | (syllables+=HYPHEN syllables+=ID) | (syllables+=ID | syllables+=HYPHEN)+)
	 */
	protected void sequence_NoteGroup(ISerializationContext context, NoteGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Script returns Script
	 *
	 * Constraint:
	 *     (tones+=Tone+ chants+=Chant*)
	 */
	protected void sequence_Script(ISerializationContext context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TonePhrase returns TonePhrase
	 *
	 * Constraint:
	 *     (name=ID voices+=VoicePhrase+)
	 */
	protected void sequence_TonePhrase(ISerializationContext context, TonePhrase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tone returns Tone
	 *
	 * Constraint:
	 *     (name=ID key=ID voiceNames+=VoiceName+ phrases+=TonePhrase+)
	 */
	protected void sequence_Tone(ISerializationContext context, Tone semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VoiceName returns VoiceName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_VoiceName(ISerializationContext context, VoiceName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LilyChantScriptPackage.Literals.VOICE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilyChantScriptPackage.Literals.VOICE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVoiceNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VoicePhrase returns VoicePhrase
	 *
	 * Constraint:
	 *     (name=[VoiceName|ID] notes+=Note+)
	 */
	protected void sequence_VoicePhrase(ISerializationContext context, VoicePhrase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
