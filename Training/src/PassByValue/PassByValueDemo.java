package PassByValue;
class Apple{
	public String color="red";
}

public class PassByValueDemo {
	
	public static void main(String args[]) {
		Apple apple = new Apple();
		System.out.println("Old color= "+ apple.color);
		
		changeColor(apple);
		System.out.println("New changed color= "+ apple.color);
	}
	public static void changeColor(Apple apple) {
		apple.color = "green";
	}
}
