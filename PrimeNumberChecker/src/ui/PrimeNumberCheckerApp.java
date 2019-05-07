package ui;

import java.util.Scanner;

import util.Console;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Prime Number Checker!");

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
//prompt for the user's input
			int x = Console.getIntWithinRange("Please enter an integer between 1 and 5000: ", 1, 5000);
			System.out.println("You entered: " + x);

		
			}

			choice = Console.getChoiceString("Continue?", "y", "n");
			System.out.println("Bye!");
		}
		
}
