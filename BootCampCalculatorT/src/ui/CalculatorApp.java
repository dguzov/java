package ui;

import business.Calculator;
import util.Console;

public class CalculatorApp {

	public static void main(String[] args) {
		// requirements:
		// basic calculation function + - * / %
		// prompt user for 2 numbers
		// perform calculation and display result

		System.out.println("Welcome to the Calculator App!");

		double result = 0.0;
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int a = Console.getIntWithinRange("Enter first number: ", 0, Integer.MAX_VALUE);
			String opr = Console.getRequiredString("Operation?  (+, -, *, /, %?");
			int b = Console.getIntWithinRange("Enter second number: ", 0, Integer.MAX_VALUE);

			Calculator calc = new Calculator(a, b);

			if (opr.equals("+")) {
				result = calc.add();
			}
			if (opr.equals("-")) {
				result = calc.subtract();
			}
			if (opr.equals("*")) {
				result = calc.multiply();
			}
			if (opr.equals("/")) {
				result = calc.division();
			}
			if (opr.equals("%")) {
				result = calc.module();
			}
			System.out.println("Results :" + result);

			choice = Console.getRequiredString("Continue? y/n");
		}

		System.out.println("Bye!");
	}

}
