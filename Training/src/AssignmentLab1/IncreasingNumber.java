package AssignmentLab1;

import java.util.Scanner;

public class IncreasingNumber {
	public static boolean checkNumber(int num){
		int a=0,b=0,c=0;
		for(int i=0;i<num;i++){
			a = num%10;
			num = num/10;
			b = num%10;
			if(a<b){
				return false;
			}else
				c++;
		}if(c>0){
			return true;
		}
		return false;
		
		
	}
	public static void main(String[] args){
		System.out.println("Enter a number to check an increasing number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(checkNumber(num));
		
		
	}

}
