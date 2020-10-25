package com.blz.moodanalyzer;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateMoodCondition {

	static Mood md;
	
	// Sad mood situation
	@Test
	public void testAnalyseMoodCondition_thenAssertionSad() throws Exception {
		md = new Mood();
		String mood = md.analyseAbility("I am in Sad Mood");
		assertEquals("Sad", mood);
		System.out.println("Sad");
	}
}
