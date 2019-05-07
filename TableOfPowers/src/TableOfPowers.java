import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table!");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Enter an integer:   ");
			int input = sc.nextInt();

			System.out.println();

			System.out.println("Number   Squared   Cubed");
			System.out.println("=======   =======  =======");

			for (int n = 1; n <= input; n++) {
				int squared = n * n;
				int cubed = n * n * n;
				
				System.out.println(n + "\t"+"  " + squared + "\t" +"   "+ cubed);
			}
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Bye!");
	}
}
