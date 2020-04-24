import java.util.Scanner;

class Car{
	Car(){
		System.out.println("feature  1");
	}
	void displayFeatures(){
		System.out.println("Features of car");
	}

}
class Merc extends Car{
	//super.displayFeatures();
	Merc(){
		System.out.println("feature 2");}
  void displayFeatures(){
	System.out.println("Features of Mercedes car");
 
}
}
class BMW extends Car{
	//super.displayFeatures();
	BMW(){
		System.out.println("Feature 3");
	}
	void displayFeatures(){
	System.out.println("Features of BMW");
}}



public class Practice {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Car CarObj;
		if(input == 1)
			CarObj = new Merc();
		else
			CarObj = new BMW();
		CarObj.displayFeatures();
}
}
