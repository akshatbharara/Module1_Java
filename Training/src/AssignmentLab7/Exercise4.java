package AssignmentLab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exercise4{
	public static HashMap<Integer,String> getStudents(HashMap hmap) {
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		ArrayList<Integer> almarks=new ArrayList<Integer>(hmap.values());
		ArrayList<Integer> alkey=new ArrayList<Integer>(hmap.keySet());
		String medal="";
		for(int i=0;i<almarks.size();i++) {
			if((almarks.get(i))>=90) {
				medal="Gold";
				hm.put(alkey.get(i),medal);
			}
			else if((almarks.get(i))>=80 && (almarks.get(i))<90) {
				medal="Silver";
				hm.put(alkey.get(i),medal);
			}
			
			else if((almarks.get(i))>=70 && (almarks.get(i))<80) {
				medal="Bronze";
				hm.put(alkey.get(i),medal);
			}
			
			
		}
		
		return hm;
		
		
	}
	public static void main(String args[]) {
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		//taking user input
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		System.out.println("Enter the key and marks of student:");
		int a=0,b=0;
		for(int i=0;i<n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			hmap.put(a, b);
			}
		//printing the output
		HashMap<Integer,String> res=getStudents(hmap);
		System.out.println(res);
	}
	}