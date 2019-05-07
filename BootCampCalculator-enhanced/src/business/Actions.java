package business;

import java.text.NumberFormat;

public class Actions {

	public double a;
	public double b;
	public double c;
	public String action;{

		a = UserInput.getFirstNumber();
		action = UserInput.getAction();
		b = UserInput.getSecondNumber();

		// check for division by "0" - warning message if true because division by 0 is
		// not allowed
		if (action.equals("/") && b == 0) {
			System.out.println("Dividing to 0 is not allowed. Start over again!");

			// addition
		} else if (action.equals("+")) {
			c = a + b;

			// subtraction
		} else if (action.equals("-")) {
			c = a - b;

			// multiplication
		} else if (action.equals("*")) {
			c = a * b;

			// module
		} else if (action.equals("%")) {
			c = a/100*b;

			// division
		} else {
			c = a / b;
		}

		// format the result
		NumberFormat cf = NumberFormat.getNumberInstance();
		cf.setMaximumFractionDigits(12);
		String cString = cf.format(c);

		// display the results
		System.out.println("Result: " + cString);

	}
}