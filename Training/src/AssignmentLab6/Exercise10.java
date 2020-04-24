package AssignmentLab6;
import java.util.Scanner;

public class Exercise10 {
	public static boolean checkName(String user) {
		boolean flag=false;
		int count=0;
		for(int i=0;i<user.length();i++) {
			if((user.charAt(i))!='_') {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);
		if(count>=8) {
			int len=user.length();
			String s1=user.substring(len-4);
			if(s1.equalsIgnoreCase("_job")) {
				flag=true;
			}
			else {
				flag=false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username: ");
		String user=sc.next();
		
		boolean res=checkName(user);
		if(res==true) {
			System.out.println("validated user");
		}
		else {
			System.out.println("not validated");
		}

	}
}
