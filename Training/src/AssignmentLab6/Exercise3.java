package AssignmentLab6;

import java.util.Scanner;

public class Exercise3 {
	public static String getImage(String str){
		StringBuffer s2 =new StringBuffer(str);
		StringBuffer s = new StringBuffer(str);
		s.append("|");
		//StringBuffer b = s.reverse();
		StringBuffer s1 = new StringBuffer(s);
		s1.append(s2.reverse());
		String s3 =s1.toString(); 
		
		return s3;
		
		
	}
	public static void main(String[] args){
		System.out.println("Enter String to get mirror image:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(getImage(str));
		
//		str+"|"+
	}

}
