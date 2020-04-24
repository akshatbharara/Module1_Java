class a {
	public a(){
		//System.out.println("A constructor is called ");
	}
}
class Carr extends a{
	public Carr(String b, int p){
		String brand = b;
		int price = p;
		System.out.println("Brand= "+brand);
		System.out.println("Price= "+price);
		//System.out.println("Car constructor is called");
		
	}
}
public class ConstructorExample extends Carr{
	public ConstructorExample(String b , int p){
		super(b,p);
		 
		//System.out.println("Constructor Example");
	}
	public static void main(String args[]){
		ConstructorExample obj = new ConstructorExample("Maruti",10000);
		
		//Carr obj1 = new Carr("Maruti",100000);
		
		
	}
}
