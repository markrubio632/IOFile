package com.controller;

import java.io.IOException;
import java.util.Scanner;

import com.service.MainService;
import com.util.MainPrinter;

public class MainController {
	
	MainService service = new MainService();
	MainPrinter print = new MainPrinter();
	
	
	public void ProjectStarter() {
		
		int userInput;
		
		print.MainMenu();
		
		Scanner sc = new Scanner(System.in);
		
		userInput = sc.nextInt();
		
		if(userInput == 1) {
			service.Writer();
			sc.close();
		}
		else if(userInput == 2) {
			try {
				service.Reader();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}