package AssignmentLab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
	public static int[] getSorted(int[] a) {
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) 
		{
			al.add(a[i]);
		}
		String s1="";
		int n=al.size();
		int[] b=new int[n];
		
		for(int i=0;i<n;i++) 
		{
			String var=al.get(i).toString();
			int l=var.length();
			for(int j=l-1;j>=0;j--) 
			{
				s1=s1+var.charAt(j);
			}
			al.set(i, Integer.parseInt(s1));
			s1="";
		}
		Collections.sort(al);
		for (int i =0; i < al.size(); i++) {
            b[i] = al.get(i); 	
		}
        return b;
	}
	public static void main(String ags[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int l[]=getSorted(a);
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
		}
		}
		
	}

