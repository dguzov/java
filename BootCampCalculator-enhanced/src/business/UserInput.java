package business;

import util.Console;

public class UserInput {

	// declare the variables
	public double a;
	public double b;
	public String action;

	// constructors
	public UserInput() {
	}

	public UserInput(double a, double b, String action) {
		this.a = a;
		this.b = b;
		this.action = action;
	}

	// method to get the user prompt for first number
	public static double getFirstNumber() {
		double a = Console.getDouble("Enter the first number: ");
		return a;
	}

	// method to get the user prompt for the action
	public static String getAction() {
		String action = Console.getChoiceActionString("Enter action: ", "+", "-", "*", "/", "%");
		return action;
	}

	// method to get the user prompt for second number
	public static double getSecondNumber() {
		double b = Console.getDouble("Enter the second number: ");
		return b;
	}
}
