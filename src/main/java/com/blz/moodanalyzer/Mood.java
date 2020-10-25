package com.blz.moodanalyzer;

import java.util.Scanner;

public class Mood {

	String message;

	public Mood(String message) {
		super();
		this.message = message;
	}

	public Mood() {
		super();
	}

	public String analyseAbility() {
		if (message.contains("Happy"))
			return "Happy";
		return "Sad";
	}

	public static void main(String[] args) {
		System.out.println("Enter your mood condition");
		Scanner sc = new Scanner(System.in);
		Mood m = new Mood();
		m.message = sc.nextLine();
		String res = m.analyseAbility();
		System.out.println(res);
	}
}
