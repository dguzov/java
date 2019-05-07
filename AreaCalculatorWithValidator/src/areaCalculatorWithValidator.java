import java.util.Scanner;

public class areaCalculatorWithValidator {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to rectangle calculator with Input Validator!");

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// prompt for user logic

			double length = getDoubleWithinRange(sc, "Enter Length: ", 0.0, 1000000.0);
			double width = getDoubleWithinRange(sc, "Enter Width: ", 0.0, 1000000.0);

			// business logic
			double area = width * length;
			double perimeter = 2 * width + 2 * length;

			// display results

			System.out.println("Area:       " + area);
			System.out.println("Perimeter:  " + perimeter);
			System.out.println();
			System.out.println("Continue? (y/n) ");
			choice = sc.next();
		}
		// bye
		System.out.println("Bye!");
	}

	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d <= min) {
				System.out.println("Error! Number must be greater than 0.0");
			} else if (d >= max) {
				System.out.println("Error! Number must be less than 1000000.0");
			} else {
				isValid = true;
			}
		
		}
		return d;
	}
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
		sc.nextLine(); // discard any other data entered on the line

		}
		return d;	
		
	}

}