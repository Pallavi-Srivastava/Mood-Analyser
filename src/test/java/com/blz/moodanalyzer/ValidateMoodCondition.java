package com.blz.moodanalyzer;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateMoodCondition {

	static Mood md;

	// SadMood
	@Test
	public void testCallingAnalyseAbilityMethodWithNoParams_thenAssertionHappy() {
		md = new Mood();
		String mood = md.analyseAbility("I am in Happy Mood");
		assertEquals("Happy", mood);
	}

	// HappyMood
	@Test
	public void testCallingAnalyseAbilityMethodWithNoParams_thenAssertionSad() {
		md = new Mood();
		String mood = md.analyseAbility("I am in Sad Mood");
		assertEquals("Sad", mood);
	}
}
