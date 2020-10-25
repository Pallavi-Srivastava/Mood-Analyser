package com.blz.moodanalyzer;

public class Mood {

	public String analyseAbility(String message) throws MoodAnalysisException {
		try {
			if (message.contains("Happy"))
				return "Happy";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("Invalid mood");
		}
		return "Sad";
	}
}
