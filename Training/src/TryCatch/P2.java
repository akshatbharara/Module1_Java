package TryCatch;

public class P2 {
	public static void main(String[] args){
		try{
			try{
				int data = 100/0;
			}
			catch(ArithmeticException e){
				System.out.println("Error");
			}
			try{
				String s = null;
				System.out.println(s.length());
			}
			catch(NullPointerException e){
				System.out.println("Error2");
			}
		}
		catch(Exception e){
			System.out.println("Program running");
		}
	}

}
