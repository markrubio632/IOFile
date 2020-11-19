package com.controller;

import java.io.IOException;
import java.util.Scanner;

import com.service.MainService;
import com.util.MainPrinter;

public class MainController {

	MainService service = new MainService();
	MainPrinter print = new MainPrinter();

	public void ProjectStarter() {

		print.MainMenu();

		Scanner sc = new Scanner(System.in);

		int userInput = sc.nextInt();

		if (userInput == 1) {
			service.FileCreator();
		} else if (userInput == 2) {
			try {
				service.Reader();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void QuestionInsert() {
		
		String input;
		
		print.QuestionPrompt();

		Scanner qc = new Scanner(System.in);

		int userInput = qc.nextInt();
		qc.nextLine();
		
		if(userInput==1) {
			input = qc.nextLine();
			service.Writer(input);
		}
		else if(userInput ==2) {
			//move on
		}

	}

}