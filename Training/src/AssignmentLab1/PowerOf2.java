package AssignmentLab1;

import java.util.Scanner;

public class PowerOf2 {
	public static boolean checkNumber(int num){
		while(num>1){
			if(num%2 != 0){
				return false;
			}
			else {
				num = num/2;
			}
		}
			return true;	
		}
		
		
public static void main(String[] args){
	System.out.println("Enter a Number to check: ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.println(checkNumber(num));

}

}