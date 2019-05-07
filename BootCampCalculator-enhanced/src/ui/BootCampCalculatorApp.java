package ui;

import business.Actions;
import business.UserManual;
import util.Console;

public class BootCampCalculatorApp {

	public static void main(String[] args) {

		// welcome message & user's manual using getUserManual method
		UserManual.getUserManual();
		// loop until user wants to quit
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			// actions; display the result
			new Actions();

			// user's prompt to continue
			choice = Console.getChoiceString("Continue? y/n", "y", "n");
		}
		System.out.println("Bye!");
	}
}
