
public class AreaCalculatorApp {

	public static void main(String[] args) {
//welcome message		
		System.out.println("Welcome to the Area Calculator");
		System.out.println();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			String st = Console.getString("Calculate area of a circle, square, or rectangle? (c/s/r): ");

			if (st.equalsIgnoreCase("c")) {
				double radius = Console.getDouble("Enter radius: ");
				Circle c = new Circle(radius);
				System.out.println(c.getArea());
			} else if (st.equalsIgnoreCase("s")) {
				double width = Console.getDouble("Enter width: ");
				Square s = new Square(width);
				System.out.println(s.getArea());
			} else if (st.equalsIgnoreCase("r")) {
				double width = Console.getDouble("Enter width: ");
				double height = Console.getDouble("Enter height: ");
				Rectangle r = new Rectangle(width, height);
				System.out.println(r.getArea());
			}
			choice = Console.getString("Continue? (y/n): ", "y", "n");
		}
		System.out.println("Bye!");
	}
}
