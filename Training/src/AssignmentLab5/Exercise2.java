package AssignmentLab5;

import java.util.Scanner;

public class Exercise2 {
	public static int fib(int n){
		int a = 1;int b = 1, c =0;
		if (n == 1){
			return 1;
		}
		if (n == 2){
			return 2;
		}
		else{
		for(int i = 0; i<=n;i++){
			c = a+b;
			a = b;
			b = c;
		}
		}
		return c;
	}
	public static int rec_fib(int n){
		if (n == 1){
			return 1;
		}
		if (n == 2){
			return 2;
		}
		else {
			return fib(n-1)+fib(n-2);
			
		}
	}
	public static void main(String[] args){
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Fibonacci nth value without recursion: "+fib(n));
		System.out.println("Fibonacci nth value with recursion: "+rec_fib(n));
	}

}
