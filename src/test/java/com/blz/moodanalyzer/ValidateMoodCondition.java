package com.blz.moodanalyzer;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateMoodCondition {

	static Mood md;

	// Validation for SadMood
	@Test
	public void testCallingAnalyseAbilityMethodWithNoParams_thenAssertionSad() throws MoodAnalysisException {
		md = new Mood();
		String mood = md.analyseAbility("I am in Sad Mood");
		assertEquals("Sad", mood);
	}

	// Validation for HappyMood
	@Test
	public void testCallingAnalyseAbilityMethodWithNoParams_thenAssertionHappy() throws MoodAnalysisException {
		md = new Mood();
		String mood = md.analyseAbility("I am in Happy Mood");
		assertEquals("Happy", mood);
	}

	// Validation for HappyMood(By Passing Null)
	@Test
	public void testCallingAnalyseAbilityMethodWithNull_thenAssertionHappy() {
		try {
			md = new Mood();
			String mood = md.analyseAbility(null);
		} catch (MoodAnalysisException e) {
			assertEquals("Invalid mood", e.getMessage());
		}
	}
}
