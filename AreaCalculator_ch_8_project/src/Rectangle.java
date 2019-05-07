
public class Rectangle extends Square {
//Variables
	public double height;

//Constructor
	public Rectangle(double width, double height) {
		super(width);
		this.height = height;
	}

//Getters and setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

//Misc. Methods	
	@Override
	public double getArea() {
		return getWidth() * height;
	}
}
