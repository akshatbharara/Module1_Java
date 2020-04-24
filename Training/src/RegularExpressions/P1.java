package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1 {
	public static void main(String[] args){
		String regx = "Akshat";
		String yen = "Akshat";
		Pattern p= Pattern.compile(regx);
		Matcher m = p.matcher(yen);
		System.out.println("Value 1= "+regx);
		System.out.println("Value 2= "+yen);
		System.out.println("looking at= "+m.lookingAt());
		System.out.println("matches method= "+m.matches());
	}

}
