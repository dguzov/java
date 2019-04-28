import java.util.Scanner;

public class tablePower {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter a number:  ");
			int n = sc.nextInt();
			
			String table = "";
			String row = "";
			String header = "Number\tSquared\tCubed\n";
			table += header;
			header = ("=====\t=====\t=====\n");
			table += header;

			for (int i = 1; i <= n; i++) {
				int s = i * i;
				int c = i * i * i;
				row = i + "\t" + s + "\t" + c + "\n";
				table += row;
			}
			System.out.println(table);

			System.out.println("Continue(y/n?   ");
			choice = sc.next();
		}
		System.out.println("Bye!");
	}

}

//1st iteration
//System.out.println("Number\tSquared\tCubed");
//System.out.println("=====\t=====\t=====");
//
//for (int i = 1; i <= n; i++) {
//	int s = i*i;
//	int c = i*i*i;
//	System.out.println(i + "\t" + s + "\t" + c);
//}
