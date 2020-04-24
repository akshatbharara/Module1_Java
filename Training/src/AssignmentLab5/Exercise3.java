package AssignmentLab5;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args){
		System.out.println("Enter a number to print prime numbers upto that number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		prime(num);
		
	}
	public static void prime(int num){
		for(int i = 1;i<=num;i++){
			int p = 0;
			for(int j = 1;j<=i;j++){
				if(i%j==0)
					p++;
				}
				if(p==2)
					System.out.print(" "+i);
		}
		
		
		
		
	}

}
