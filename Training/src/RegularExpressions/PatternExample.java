package RegularExpressions;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args){
		boolean b1 = Pattern.compile(".s").matcher("as").matches();
		boolean b2 = Pattern.matches(".a","sa");
		System.out.println(" "+b1+" "+b2);
	}

}
