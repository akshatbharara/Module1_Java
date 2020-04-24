import java.util.Scanner;


public class demoString {
	
	public static void main(String[] args){
		String sc=new Scanner(System.in).nextLine();
		for(int i = 0; i<sc.length();i++){
			int a = (int)sc.charAt(i);
			System.out.print(a);
		}
		
	}

}
