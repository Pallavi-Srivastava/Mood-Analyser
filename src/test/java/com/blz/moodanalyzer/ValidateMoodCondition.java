package com.blz.moodanalyzer;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateMoodCondition {

	static Mood md;

	// Validation for SadMood
	@Test
	public void testCallingAnalyseAbilityMethodWithNoParams_thenAssertionHappy() {
		md = new Mood();
		try {
			String mood = md.analyseAbility("Sad");
			assertEquals("Happy", mood);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	// Validation for HappyMood
	@Test
	public void testCallingAnalyseAbilityMethodWithNoParams_thenAssertionSad() {
		md = new Mood();
		try {
			String mood = md.analyseAbility("Happy");
			assertEquals("Happy", mood);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
