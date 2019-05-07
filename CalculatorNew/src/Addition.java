
public class Addition {

	public int a;
	public int b;
	public String action;
	public int c;
	public Addition() {
		super();
	}
	public Addition(int a, int b, String action, int c) {
		super();
		this.a = a;
		this.b = b;
		this.action = action;
		this.c = c;
	}
	
	public int getAddition(int a, int b) {
		int c = a + b;
		return c;
	
}
}