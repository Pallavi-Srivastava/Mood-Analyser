package com.blz.moodanalyzer;

public class MoodAnalyzer {

	public String analyseAbility(String message) {
		if (message.contains("Happy"))
			return "Happy";
		return "Sad";
	}
}
