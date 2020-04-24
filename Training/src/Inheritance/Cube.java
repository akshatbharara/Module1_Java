package Inheritance;

public class Cube implements DrawableSolidShape{
	int length;
	public Cube(int length)
	{
		this.length=length;
	}
	public double volume() {
		// TODO Auto-generated method stub
		return length*length*length;
	}

	public double area() {
		// TODO Auto-generated method stub
		return length*length*6;
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		return length*12;
	}

	public void draw() {
		System.out.println("cube drawn of length: "+length);
		
	}

}
