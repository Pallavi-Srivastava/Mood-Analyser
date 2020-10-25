package com.blz.moodanalyzer;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateMoodCondition {

	static Mood md;

	// Validation for SadMood
	@Test
	public void testCallingAnalyseAbilityMethodWithNoParams_thenAssertionSad() {
		md = new Mood();
		String mood = md.analyseAbility("I am in Sad Mood");
		assertEquals("Sad", mood);
	}

	// Validation for HappyMood
	@Test
	public void testCallingAnalyseAbilityMethodWithNoParams_thenAssertionHappy() {
		md = new Mood();
		String mood = md.analyseAbility("I am in Happy Mood");
		assertEquals("Happy", mood);
	}

	// Validation for HappyMood(By Passing Null)
	@Test
	public void testCallingAnalyseAbilityMethodWithNull_thenAssertionHappy() {
		md = new Mood();
		try {
			String mood = md.analyseAbility(null);
			assertEquals("Happy", null);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
