package ui;

import util.Console;

public class BootCampCalculatorApp {

	public static void main(String[] args) {

		// welcome message & user's manual using getUserManual method
		getUserManual();

		// loop until user wants to quit
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// prompt for user input (with data validation - int data type)
			int a = getFirstNumber();
			String action = getAction();
			int b = getSecondNumber();
			int c = 0;

			// check for division by "0". Warning message if true because division by 0 is
			// not allowed
			if (action.equals("/") && b == 0) {
				System.out.println("Dividing to 0 is not allowed. Start over again!");

				// addition
			} else if (action.equals("+")) {
				c = getAddition(a, b);

				// subtraction
			} else if (action.equals("-")) {
				c = getSubtraction(a, b);

				// multiplication
			} else if (action.equals("*")) {
				c = getMultiplication(a, b);

				// module
			} else if (action.equals("%")) {
				c = getModule(a, b);

				// division
			} else {
				c = getDivision(a, b);
			}

			// display the results
			System.out.println("Result: " + c);
			System.out.println();

			// user's prompt to continue
			choice = Console.getChoiceString("Continue? y/n", "y", "n");
		}

		System.out.println("Bye!");
	}

	// addition method
	public static int getAddition(int a, int b) {
		int c = a + b;
		return c;
	}

	// subtraction method
	public static int getSubtraction(int a, int b) {
		int c = a - b;
		return c;
	}

	// multiplication method
	public static int getMultiplication(int a, int b) {
		int c = a * b;
		return c;
	}

	// module method
	public static int getModule(int a, int b) {
		int c = a % b;
		return c;
	}

	// division method
	public static int getDivision(int a, int b) {
		int c = a / b;
		return c;
	}

	// method to display the Welcome message and user's manual
	public static void getUserManual() {
		System.out.println("Welcome the Bootcamp Calculator!\n" + "You can use:\n" + "'+' - addition\n"
				+ "'-' - substraction\n" + "'*' - multiplication\n" + "'/' - division\n" + "'%' - percent\n"
				+ "to perform calculations with the integer numbers");
		System.out.println();
	}

	//method to get the user prompt for first number
	public static int getFirstNumber() {
		int a = Console.getInt("Enter the first number: ");
		return a;
	}
	
	//method to get the user prompt for the action
	public static String getAction() {
		String action = Console.getChoiceActionString("Enter action: ", "+", "-", "*", "/", "%");
		return action;
	}
		
	//method to get the user prompt for second number
	public static int getSecondNumber() {
		int b = Console.getInt("Enter the second number: ");
		return b;
	}	
}
