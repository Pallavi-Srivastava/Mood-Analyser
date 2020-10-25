package com.blz.moodanalyzer;

public class Mood {

	// Method for mood analysis
	public String analyseAbility(String msg) throws Exception {
		if (msg.contains("Happy"))
			return "Happy";
		return "Sad";
	}
}
