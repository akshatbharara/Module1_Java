package TryCatch;

public class Throw1 {
	public static void validate(int age) throws Exception{
		if (age<18){
			throw new Exception("not valid");
		
		}else{
			System.out.println("You can vote");
		}
	}
	public static void main(String[] args) throws Exception{
		validate(12);
	}
}
