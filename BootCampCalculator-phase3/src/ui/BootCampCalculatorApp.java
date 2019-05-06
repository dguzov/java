package ui;

import business.Actions;
import business.UserInput;
import business.UserManual;
import util.Console;

public class BootCampCalculatorApp {

	public static void main(String[] args) {

		// welcome message & user's manual using getUserManual method
		UserManual.getUserManual();

		// loop until user wants to quit
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// prompt for user input (with data validation, int data type)
			int a = UserInput.getFirstNumber();
			String action = UserInput.getAction();
			int b = UserInput.getSecondNumber();
			int c = 0;

			// check for division by "0" - warning message if true because division by 0 is
			// not allowed
			if (action.equals("/") && b == 0) {
				System.out.println("Dividing to 0 is not allowed. Start over again!");

				// addition
			} else if (action.equals("+")) {
				c = Actions.getAddition(a, b);

				// subtraction
			} else if (action.equals("-")) {
				c = Actions.getSubtraction(a, b);

				// multiplication
			} else if (action.equals("*")) {
				c = Actions.getMultiplication(a, b);

				// module
			} else if (action.equals("%")) {
				c = Actions.getModule(a, b);

				// division
			} else {
				c = Actions.getDivision(a, b);
			}

			// display the results
			System.out.println("Result: " + c);
			System.out.println();

			// user's prompt to continue
			choice = Console.getChoiceString("Continue? y/n", "y", "n");
		}
		System.out.println("Bye!");
	}
	}
