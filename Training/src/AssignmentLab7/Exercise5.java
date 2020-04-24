package AssignmentLab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise5 {
	public static int getSecondSmallest(int[] a) {
		int res=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			al.add(a[i]);
		}
		Collections.sort(al);
		res=al.get(1);
		return res;
		
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
		int res=getSecondSmallest(a);
		System.out.println(res);
	}
}
