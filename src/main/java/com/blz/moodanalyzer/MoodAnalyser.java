package com.blz.moodanalyzer;

public class MoodAnalyser {

	String message;

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public MoodAnalyser() {
		super();
	}

	public String analyseAbility(String message) {
		if (message.contains("Happy"))
			return "Happy";
		return "Sad";
	}
}
