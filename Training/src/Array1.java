import java.util.Scanner;


public class Array1 {
	int pal(String str){
		int length = str.length();
		int flag = 0;
		for(int i = 0;i<length/2;i++){
			if(str.charAt(i)!=str.charAt(length-i-1))
				flag = 1;
		}
		return flag;
	}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("pls enter a string");
	String str = sc.nextLine();
	Array1 a1 = new Array1();
	int flag = a1.pal(str);
	if(flag == 0){
		System.out.println("string is pallindrome");
	}
	else
		System.out.println("string is not pallindrome");
}
}
