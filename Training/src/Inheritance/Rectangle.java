package Inheritance;
public class Rectangle implements shape, Drawable {
	double length;
	double breath;

	public Rectangle(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}

	public double area() {

		return length * breath;
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (length + breath);
	}

	public void draw() {
		System.out.println("Rectangle Drawn of l=" + length + " b=" + breath);

	}
}
