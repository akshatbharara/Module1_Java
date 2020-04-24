package AssignmentLab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exercise6 {
	public static List votersList(HashMap hmap) {
		List<Integer> list=new ArrayList<Integer>();
		int currentyear=2020;
		ArrayList<String> alvalue=new ArrayList<String>(hmap.values());
		ArrayList<Integer> alkey=new ArrayList<Integer>(hmap.keySet());
		for(int i=0;i<alvalue.size();i++) {
			String var=alvalue.get(i);
			int var1=Integer.parseInt(var.substring(6));
			int age=currentyear-var1;
			if(age>18) {
				list.add(alkey.get(i));
			}
		}
		return list;
	}
	public static void main(String args[]) {
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		//taking user input
		System.out.println("Enter the number of voters:");
		int n=sc.nextInt();
		System.out.println("Enter the id and age of voter:");
		int a=0;
		String b="";
		for(int i=0;i<n;i++) {
			a=sc.nextInt();
			b=sc.next();
			hmap.put(a, b);
			}
		//printing the output
		List<Integer> res=votersList(hmap);
		System.out.println(res);
	}
}
