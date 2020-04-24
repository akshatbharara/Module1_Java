package RegularExpressions;

import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String st = s.next();
		int i1 = st.length();
		int i = st.length()/2;
		char[] ch = new char[i];
		char[] ch1 = new char[i1];
		st.getChars(0, i, ch, 0);
		st.getChars(i,i1,ch1,0);
		String first = new String(ch);
		String second = new String(ch1);
		second.trim();
		String st2 = first.toLowerCase()+second.toUpperCase();
		System.out.println(st2.trim());
		
	}

}
