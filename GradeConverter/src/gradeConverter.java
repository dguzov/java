import java.util.Scanner;

public class gradeConverter {

	public static void main(String[] args) {
		//welcome
				System.out.println("Welcome to Grade Converter!");
				
				Scanner sc = new Scanner(System.in);
				
				String choice = "y";
				while (choice.equalsIgnoreCase("y")) {
					
				//prompt for user logic
					
					System.out.print("Enter numerical grade:");
					
				int grade = sc.nextInt();
			
				//business logic
				String letter = null;
				if (grade<60) {
				letter="F";
				}else if (grade>=60 && grade<67) {
					letter="D";
				}else if (grade>=67 && grade<=79) {
					letter="C";
	            }else if (grade>=80 && grade<87) {
					letter="B";
	            }else  {
					letter="A";
	            }
			
				//display results
				
				System.out.println("Letter grade: "+letter);
				
				System.out.println("Continue? (y/n) ");	
				choice = sc.next();
				}
				//bye
				System.out.println("Bye!");
			
			}
		}


