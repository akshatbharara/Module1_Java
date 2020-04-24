package AssignmentLab7;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise3 {
	public static HashMap<Integer,Integer> getSquares(int[] a){
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		int sq=0;
		//calculating squares
		
		for(int i=0;i<a.length;i++) {
			sq=a[i]*a[i];
			hm.put(a[i],sq);	
	}
		return hm;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		//taking user input
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		//calling the method
		HashMap hm=getSquares(a);
		System.out.println(hm);
	}
}