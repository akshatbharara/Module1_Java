package LambdaExpressions;
import java.util.Scanner;
public class LeapYearCheck {
	public static void main(String[] args){
		
		LeapYear lp = (year) -> (year%100 == 0) ? (year%400 == 0) : (year%4 == 0);
		System.out.println("Enter year to check leap year");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		boolean result = lp.leapyear(num);
		System.out.println(result);
	}

}
