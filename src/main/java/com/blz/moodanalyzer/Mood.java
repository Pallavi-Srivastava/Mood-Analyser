package com.blz.moodanalyzer;

public class Mood {

	public String analyseAbility(String message) {
		if (message.contains("Happy"))
			return "Happy";
		return "Sad";
	}
}
