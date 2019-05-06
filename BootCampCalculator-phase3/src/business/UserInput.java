package business;

import util.Console;

public class UserInput {

	//declare the variables	
	public int a;
	public int b;
	public String action;

	//constructors
	public UserInput() {
	}

	public UserInput(int a, int b, String action) {
		this.a = a;
		this.b = b;
		this.action = action;
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

	// method to get the user prompt for second number
	public static int getSecondNumber() {
		int b = Console.getInt("Enter the second number: ");
		return b;
	}
}