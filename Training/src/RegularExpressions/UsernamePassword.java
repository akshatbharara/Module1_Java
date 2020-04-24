package RegularExpressions;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernamePassword {
	public static void UsernamePasswordExample(String str1, String str2){
	List<String> username = new	ArrayList();
	List<String> pswrds = new ArrayList();
//	username.add(str1);
	pswrds.add(str2);
	String regex = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{6,12})";
	Pattern p1 = Pattern.compile(regex);
	for(String pswrd : pswrds){
		Matcher matcher = p1.matcher(pswrd);
		System.out.println(pswrd + " : "+matcher.matches());
		
	}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String str1 = sc.nextLine();
		
		System.out.println("Enter valid password");
		String str2 = sc.nextLine();
		UsernamePasswordExample(str1,str2);
	}

}

