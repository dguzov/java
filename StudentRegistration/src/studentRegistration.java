import java.util.Scanner;

public class studentRegistration {

	public static void main(String[] args) {
		// welcome the user to the program
        System.out.println("Student Registration Form");
        System.out.println();  // print a blank line
        
     // create a Scanner object named sc
        
       		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Name:");
        String firstName = sc.next();
        
        System.out.print("Enter Last Name:");
        String lastName = sc.next();
        
        System.out.print("Enter Year of Birth:");
        int year = sc.nextInt();
        
        System.out.println("Welcome " + firstName +" " + lastName + "!");
        System.out.println("Your registration is complete.");
        	
       
        System.out.println(" Your temporary password is:" +firstName +"*"+year);
       
        	}
      }
