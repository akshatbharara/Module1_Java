package RegularExpressions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	static void EmailValidationExample(String str1){
		List<String> emails = new ArrayList();
		
//		emails.add("user@domain.com");
//		emails.add("user@domain.co.in");
//		emails.add("user1@domain.com");
//		emails.add("user.name@domain.co.in");
//		emails.add("user#@domain.co.in");
//		emails.add("user@domaincom");
//	
//		//invalid emails
//		emails.add("user#domain.com");
//		emails.add("@yahoo.com");
		emails.add(str1);
		String regex = "^(.+)@(.+)$";
		
		Pattern pattern = Pattern.compile(regex);
		for(String email : emails){
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : "+matcher.matches());
			
			
		}

	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 1;i<=n;i++){
		System.out.println("Enter email id to check");
		Scanner sc1 = new Scanner(System.in);
		String str1 = sc1.nextLine();
		EmailValidationExample(str1);
		}
	}
}
