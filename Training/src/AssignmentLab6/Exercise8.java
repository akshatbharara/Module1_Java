package AssignmentLab6;

import java.util.Scanner;

public class Exercise8 {
	public static boolean checkString(String st){
		int flag = 0;
		for (int i = 1;i<st.length();i++){
			if((int)st.charAt(i)<(int)st.charAt(i-1)){
				flag = 1;
				break;
			}
			
		}
		if (flag == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String st = sc.nextLine();
		System.out.println(checkString(st));
	}

}
