import java.util.Scanner;

public class rectangularCalculator {

	public static void main(String[] args) {
		//welcome
		System.out.println("Welcome to rectangle calculator!");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
		//prompt for user logic
			
			System.out.print("Enter Lenght: ");
			
		double length = sc.nextDouble();
		System.out.print("Enter Width: ");
		double width = sc.nextDouble();
		//business logic
		double area = width * length;
		double perimeter = 2 * width + 2 * length;
		
		//display results
		
		System.out.println("area = "+area);
		System.out.println("perimeter = "+perimeter);
		
		System.out.println("Continue? (y/n) ");	
		choice = sc.next();
		}
		//bye
		System.out.println("Bye!");
	

	}

}
