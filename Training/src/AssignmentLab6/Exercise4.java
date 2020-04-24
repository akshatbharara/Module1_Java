package AssignmentLab6;
import java.util.Scanner;
public class Exercise4 {
	public static String alterString(String s){
		String cons="bcdfghjklmnpqrstvwxyz";
		char[] ch= s.toCharArray();
	    for (int i = 0; i < ch.length; i++) {
	        char c = ch[i];
	        char lower = Character.toLowerCase(c);
	        int j = cons.indexOf(lower);
	        if (j != -1) {
	            char next = cons.charAt((j + 1) % cons.length());
	            ch[i] = (c == lower ? next : Character.toUpperCase(next));
	        }
	    }
	    return new String(ch);
		}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		System.out.println(alterString(s));
	}
	}


