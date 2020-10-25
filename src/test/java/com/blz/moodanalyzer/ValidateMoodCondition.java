package com.blz.moodanalyzer;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateMoodCondition {

	static Mood md;

	// Happy mood situation
	@Test
	public void testAnalyseMoodCondition_thenAssertionHappy() throws Exception {
		md = new Mood();
		String mood = md.analyseAbility("I am in Happy Mood");
		assertEquals("Happy", mood);
		System.out.println("Happy");
	}

	// Sad mood situation
	@Test
	public void testAnalyseMoodCondition_thenAssertionSad() throws Exception {
		md = new Mood();
		String mood = md.analyseAbility("I am in Sad Mood");
		assertEquals("Sad", mood);
		System.out.println("Sad");
	}
}
