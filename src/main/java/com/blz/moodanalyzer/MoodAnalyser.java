package com.blz.moodanalyzer;

public class MoodAnalyser {

	public String analyseAbility(String message) {
		if (message.contains("Happy"))
			return "Happy";
		return "Sad";
	}
}