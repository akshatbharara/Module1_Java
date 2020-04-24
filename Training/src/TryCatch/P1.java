package TryCatch;

public class P1 {
	public static void main(String[] args){
		try{
			int data = 100/0;
			String s= null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e){
		System.out.println("Arithmetic exception occurs");
	}
		catch(Exception e){
			System.out.println("");
		}
//		//finally{
//			System.out.println("This will run");
//		}
//		System.out.println("Rest of the code");
	}

}
