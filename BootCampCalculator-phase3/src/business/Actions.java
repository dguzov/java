package business;

public class Actions {
	// the instance variables
	public int a;
	public int b;
	public int c;

	// the constructor with no parameters
	public Actions() {
	}

	// the constructor with three parameters
	public Actions(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// addition method
	public static int getAddition(int a, int b) {
		int c = a + b;
		return c;
	}

	// subtraction method
	public static int getSubtraction(int a, int b) {
		int c = a - b;
		return c;
	}

	// multiplication method
	public static int getMultiplication(int a, int b) {
		int c = a * b;
		return c;
	}

	// module method
	public static int getModule(int a, int b) {
		int c = a % b;
		return c;
	}

	// division method
	public static int getDivision(int a, int b) {
		int c = a / b;
		return c;
	}
}