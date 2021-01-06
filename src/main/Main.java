package main;

import java.util.Scanner;

public class Main {
	private static Scanner input;
	private static Manager manager;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		manager = new Manager("BijanProgrammer", "1234",
				"Bijan", "Eisapour", 19, 100);
		
		login();
		
		System.out.println("Welcome!");
	}
	
	private static void login() {
		String username;
		String password;
		
		do {
			System.out.print("Username: ");
			username = input.nextLine();
			
			System.out.print("Password: ");
			password = input.nextLine();
			
			System.out.println("-".repeat(30));
		} while (!manager.isValidPassword(password));
	}
}
