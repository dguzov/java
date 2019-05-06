package ui;
import java.util.Scanner;

import util.Console;

public class BootCampCalculatorApp {

	public static void main(String[] args) {
//welcome message & user's manual		
		System.out.println("Welcome the Bootcamp Calculator!\n" + "You can use:\n" + "'+' - addition\n"
				+ "'-' - substraction\n" + "'*' - multiplication\n" + "'/' - division\n" + "'%' - percent\n"
				+ "to perform calculations with the integer numbers");	
		Scanner sc = new Scanner(System.in);
//loop until user wants to quit		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
//prompt for user input (with data validation - int data type)
			int a = Console.getInt("Enter the first number: ");
			String action = Console.getChoiceActionString("Enter action: ", "+", "-", "*", "/", "%");
			int b = Console.getInt("Enter the second number: ");
			int c = 0;
//check for division by "0". Warning message because division by 0 is not allowed		
			if (action.equals("/") && b == 0) {
				System.out.println("Dividing to 0 is not allowed. Start over again!");
				c = 0;
//addition			
			} else if (action.equals("+")) {
				c = a + b;
//subtraction
			} else if (action.equals("-")) {
				c = a - b;
//multiplication
			} else if (action.equals("*")) {
				c = a * b;
//module
			} else if (action.equals("%")) {
				c = a % b;
//division			
			} else {
				c = a / b;
			}
//display the results
			System.out.println("Result: " + c);
			System.out.println();
//user's prompt to continue
			choice = Console.getChoiceString("Continue? y/n", "y", "n");
		}
		System.out.println("Bye!");
	}
}