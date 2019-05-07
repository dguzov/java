import java.util.Scanner;

public class temperatureConverter {

	public static void main(String[] args) {
		
		//welcome
				System.out.println("Welcome to the Temperature Converter!");
				
				Scanner sc = new Scanner(System.in);
				
				String choice = "y";
				while (choice.equalsIgnoreCase("y")) {
					
				//prompt for user logic
				System.out.print("Enter degrees in Fahrenheit: ");
				double f = sc.nextDouble();
				
				//business logic
				double c = (double) Math.round(((f-32)/9*5)*100)/100;
							
				//display results				
				System.out.println("Degrees in Celsius: "+c);
				
				System.out.println("Continue? (y/n) ");	
				choice = sc.next();
				}
				//bye
				System.out.println("Bye!");
			}
		}
