package com.blz.moodanalyzer;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateMoodCondition {

	static MoodAnalyser md;

	@Test
	public void testCallingAnalyseAbilityMethodWithSadParams() {
		md = new MoodAnalyser();
		String mood = md.analyseAbility("I am in Sad Mood");
		assertEquals("Sad", mood);
	}

	@Test
	public void testCallingAnalyseAbilityMethodWithHappyParams() {
		md = new MoodAnalyser();
		String mood = md.analyseAbility("I am in Happy Mood");
		assertEquals("Happy", mood);
	}
}
