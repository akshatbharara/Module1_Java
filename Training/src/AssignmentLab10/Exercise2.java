package AssignmentLab10;
import java.util.Scanner;

public class Exercise2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String input=scan.nextLine();
		InsertSpaceBetweenString obj=new InsertSpaceBetweenString();
		System.out.println(obj.getFormattedString(input));
		scan.close();
	}

}
