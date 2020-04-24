package AssignmentLab10;
import java.util.Scanner;

public class Exercise3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		EvaluateUserNameAndPassword obj=new EvaluateUserNameAndPassword();
		System.out.println("Enter User Name:");
		String user=scan.nextLine();
		System.out.println("Enter Password:");
		String password=scan.nextLine();
		if(obj.checkUserNamePassword(user, password))
			System.out.println("LogIn Success!!");
		else
			System.out.println("Username or password incorrect!!");
		scan.close();
	}

}
