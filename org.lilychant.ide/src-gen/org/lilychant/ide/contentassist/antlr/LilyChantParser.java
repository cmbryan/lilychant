/*
 * generated by Xtext 2.11.0
 */
package org.lilychant.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.lilychant.ide.contentassist.antlr.internal.InternalLilyChantParser;
import org.lilychant.services.LilyChantGrammarAccess;

public class LilyChantParser extends AbstractContentAssistParser {

	@Inject
	private LilyChantGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalLilyChantParser createParser() {
		InternalLilyChantParser result = new InternalLilyChantParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new LilyChantTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNoteGroupAccess().getAlternatives(), "rule__NoteGroup__Alternatives");
					put(grammarAccess.getNoteGroupAccess().getAlternatives_0_0(), "rule__NoteGroup__Alternatives_0_0");
					put(grammarAccess.getNoteGroupAccess().getSyllablesAlternatives_2_2_0(), "rule__NoteGroup__SyllablesAlternatives_2_2_0");
					put(grammarAccess.getBarlineAccess().getAlternatives(), "rule__Barline__Alternatives");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getToneAccess().getGroup(), "rule__Tone__Group__0");
					put(grammarAccess.getTonePhraseAccess().getGroup(), "rule__TonePhrase__Group__0");
					put(grammarAccess.getVoicePhraseAccess().getGroup(), "rule__VoicePhrase__Group__0");
					put(grammarAccess.getChantAccess().getGroup(), "rule__Chant__Group__0");
					put(grammarAccess.getLyricPhraseAccess().getGroup(), "rule__LyricPhrase__Group__0");
					put(grammarAccess.getLyricPhraseAccess().getGroup_0(), "rule__LyricPhrase__Group_0__0");
					put(grammarAccess.getNoteGroupAccess().getGroup_0(), "rule__NoteGroup__Group_0__0");
					put(grammarAccess.getNoteGroupAccess().getGroup_0_0_0(), "rule__NoteGroup__Group_0_0_0__0");
					put(grammarAccess.getNoteGroupAccess().getGroup_0_0_0_1(), "rule__NoteGroup__Group_0_0_0_1__0");
					put(grammarAccess.getNoteGroupAccess().getGroup_0_0_1(), "rule__NoteGroup__Group_0_0_1__0");
					put(grammarAccess.getNoteGroupAccess().getGroup_2(), "rule__NoteGroup__Group_2__0");
					put(grammarAccess.getIdRuleAccess().getGroup(), "rule__IdRule__Group__0");
					put(grammarAccess.getHyphenRuleAccess().getGroup(), "rule__HyphenRule__Group__0");
					put(grammarAccess.getExtenderRuleAccess().getGroup(), "rule__ExtenderRule__Group__0");
					put(grammarAccess.getSkipRuleAccess().getGroup(), "rule__SkipRule__Group__0");
					put(grammarAccess.getNoteAccess().getGroup(), "rule__Note__Group__0");
					put(grammarAccess.getFormatAccess().getGroup(), "rule__Format__Group__0");
					put(grammarAccess.getScriptAccess().getTonesAssignment_0(), "rule__Script__TonesAssignment_0");
					put(grammarAccess.getScriptAccess().getChantsAssignment_1(), "rule__Script__ChantsAssignment_1");
					put(grammarAccess.getScriptAccess().getFormatAssignment_2(), "rule__Script__FormatAssignment_2");
					put(grammarAccess.getToneAccess().getNameAssignment_1(), "rule__Tone__NameAssignment_1");
					put(grammarAccess.getToneAccess().getVoiceNamesAssignment_5(), "rule__Tone__VoiceNamesAssignment_5");
					put(grammarAccess.getToneAccess().getPhrasesAssignment_7(), "rule__Tone__PhrasesAssignment_7");
					put(grammarAccess.getVoiceNameAccess().getNameAssignment(), "rule__VoiceName__NameAssignment");
					put(grammarAccess.getTonePhraseAccess().getNameAssignment_1(), "rule__TonePhrase__NameAssignment_1");
					put(grammarAccess.getTonePhraseAccess().getVoicesAssignment_3(), "rule__TonePhrase__VoicesAssignment_3");
					put(grammarAccess.getVoicePhraseAccess().getNameAssignment_1(), "rule__VoicePhrase__NameAssignment_1");
					put(grammarAccess.getVoicePhraseAccess().getNotesAssignment_3(), "rule__VoicePhrase__NotesAssignment_3");
					put(grammarAccess.getChantAccess().getNameAssignment_1(), "rule__Chant__NameAssignment_1");
					put(grammarAccess.getChantAccess().getToneAssignment_3(), "rule__Chant__ToneAssignment_3");
					put(grammarAccess.getChantAccess().getPhrasesAssignment_5(), "rule__Chant__PhrasesAssignment_5");
					put(grammarAccess.getLyricPhraseAccess().getExplicitPhraseAssignment_0_1(), "rule__LyricPhrase__ExplicitPhraseAssignment_0_1");
					put(grammarAccess.getLyricPhraseAccess().getNoteGroupsAssignment_1(), "rule__LyricPhrase__NoteGroupsAssignment_1");
					put(grammarAccess.getLyricPhraseAccess().getBarAssignment_2(), "rule__LyricPhrase__BarAssignment_2");
					put(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_0(), "rule__NoteGroup__SyllablesAssignment_0_0_0_0");
					put(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_0_1_0(), "rule__NoteGroup__SyllablesAssignment_0_0_0_1_0");
					put(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_0(), "rule__NoteGroup__SyllablesAssignment_0_0_1_0");
					put(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_0_1_1(), "rule__NoteGroup__SyllablesAssignment_0_0_1_1");
					put(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_0_1(), "rule__NoteGroup__SyllablesAssignment_0_1");
					put(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_1(), "rule__NoteGroup__SyllablesAssignment_1");
					put(grammarAccess.getNoteGroupAccess().getNoemphasisAssignment_2_1(), "rule__NoteGroup__NoemphasisAssignment_2_1");
					put(grammarAccess.getNoteGroupAccess().getSyllablesAssignment_2_2(), "rule__NoteGroup__SyllablesAssignment_2_2");
					put(grammarAccess.getIdRuleAccess().getEmphasisAssignment_0(), "rule__IdRule__EmphasisAssignment_0");
					put(grammarAccess.getIdRuleAccess().getLiteralAssignment_1(), "rule__IdRule__LiteralAssignment_1");
					put(grammarAccess.getHyphenRuleAccess().getLiteralAssignment_1(), "rule__HyphenRule__LiteralAssignment_1");
					put(grammarAccess.getExtenderRuleAccess().getLiteralAssignment_1(), "rule__ExtenderRule__LiteralAssignment_1");
					put(grammarAccess.getSkipRuleAccess().getLiteralAssignment_1(), "rule__SkipRule__LiteralAssignment_1");
					put(grammarAccess.getNoteAccess().getPitchAssignment_0(), "rule__Note__PitchAssignment_0");
					put(grammarAccess.getNoteAccess().getDurationAssignment_1(), "rule__Note__DurationAssignment_1");
					put(grammarAccess.getFormatAccess().getRaggedbottomAssignment_2_0(), "rule__Format__RaggedbottomAssignment_2_0");
					put(grammarAccess.getFormatAccess().getRaggedlastbottomAssignment_2_1(), "rule__Format__RaggedlastbottomAssignment_2_1");
					put(grammarAccess.getFormatAccess().getUnorderedGroup_2(), "rule__Format__UnorderedGroup_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LilyChantGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LilyChantGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
