package AssignmentLab4;
import java.util.Scanner;
public class Exercise1 {
	public static int getCube(int n){
		int cube = 0;
		while(n>0){
			int dig = n%10;
			cube = cube + (dig*dig*dig);
			n = n/10;
			
		}
		return cube;
	}
	public static void main(String[] args){
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Sum of cube of each digit= "+getCube(n));
	}

}
