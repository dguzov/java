package business;

public class Calculator {
	
	private int a;
	private int b;
	private double result;
	
	public Calculator() {
		super();
	}
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		this.result = 0.0;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public  double module() {	
		result = a % b;
		return result;
	}

	public  double division() {	
		result = a/b;
		return result;
	}

	public  double multiply() {
		result = a*b;
		return result;
	}

	public  double subtract() {	
		result = a-b;
		return result;
	}

	public  double add() {	
		result = a+b;
		return result;
	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", result=" + result + "]";
	}	
}