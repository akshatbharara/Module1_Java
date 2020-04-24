package AssignmentLab7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise2 {
	public static HashMap countCharacter(char a[]){
		HashMap hmap = new HashMap();
		for(int i = 0;i<a.length;i++){
			if(hmap.containsKey(a[i])){
				int b = (int) hmap.get(a[i]);
				hmap.put(a[i],b+1);
			}else{
				hmap.put(a[i], 1);
			}
		}return hmap;
	}
	public static void main(String[] args){
		char a[] = new char[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int num = sc.nextInt();
		System.out.println("Enter characters");
		for(int i=0;i<num;i++){
		a[i] = sc.next().charAt(0);
		
		}
		System.out.println(countCharacter(a));
	}
}
