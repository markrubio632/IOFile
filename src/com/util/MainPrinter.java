package com.util;

public class MainPrinter {
	
	public void MainMenu() {
		System.out.println("Do you need the list of questions?\n"
				+ "1. Yes\n"
				+ "2. No");
	}
	
	public void TextBody(String body) {
		System.out.println(body);
	}
	
	public void QuestionPrompt() {
		System.out.println("Would you like to add in a question?\n"
				+ "1. Yes\n"
				+ "2. No");
	}

}
