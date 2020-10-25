package com.blz.moodanalyzer;

public class Mood {

	String message;

	public Mood(String message) {
		super();
		this.message = message;
	}

	public Mood() {
		super();
	}

	public String analyseAbility(String message) {
		if (message.contains("Happy"))
			return "Happy";
		return "Sad";
	}
}
