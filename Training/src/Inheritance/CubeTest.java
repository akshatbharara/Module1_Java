package Inheritance;
public class CubeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DrawableSolidShape cube=(DrawableSolidShape) new Cube(2);
		System.out.println("Area:"+cube.area());
		System.out.println("perimeter:"+cube.perimeter());
		cube.draw();
		shape shcube=cube;
		System.out.println("Area:"+shcube.area());
		System.out.println("perimeter:"+shcube.perimeter());
		Drawable drRect=cube;
		drRect.draw();
		

	}

}