import java.util.Scanner;

public class diceRoller {

	public static void main(String[] args) {
		System.out.println("Welcome to Dice Roller!"); 				// welcome message
		System.out.println();

		System.out.println("Roll the dice? : y/n"); 				// initial choice "Roll the dice?" y/n
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		
		switch (choice) {

		case "y":
		case "Y":

			choice = "y";
			while (choice.equalsIgnoreCase("y")) { 					// loop "Roll again" and the results
				double a = Math.random() * 6 + 1; 					// business logic, format the random
				double b = Math.random() * 6 + 1;
				int c = (int) a + (int) b;							//cast double to integer
				if (c == 2) {
					System.out.println("Die 1:  " + (int) a);		//output the results
					System.out.println("Die 2:  " + (int) b);
					System.out.println("Total:	" + c);
					System.out.println("Snake eyes!");
				} else if (c == 12) {
					System.out.println("Die 1:  " + (int) a);		//output the results
					System.out.println("Die 2:  " + (int) b);
					System.out.println("Total:	" + c);
					System.out.println("Boxcars!");
				} else {
					System.out.println("Die 1:  " + (int) a);		//output the results
					System.out.println("Die 2:  " + (int) b);
					System.out.println("Total:	" + c);
				}
				System.out.println();
				System.out.print("Roll again? (y/n): ");
				choice = sc.next();
				System.out.println();
			}
			default:
			System.out.println("Bye!");								
			break;
		}
	}
}

   
