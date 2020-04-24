package AssignmentLab6;

import java.util.Scanner;

public class Exercise5 {
public static int modifyNumber(int num) {
String s=Integer.toString(num);
int n=0;
StringBuffer sb=new StringBuffer();
for(int i=0;i<s.length()-1;i++) {
int j=i+1;
int c=(int)s.charAt(i);
int c1=(int)s.charAt(j);
int diff=Math.abs(c1-c);
sb.append(diff);
}
sb.append(s.charAt(s.length()-1));
String res=sb.toString();
n=Integer.parseInt(res);
return n;
}
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int num=sc.nextInt();
int res=modifyNumber(num);
System.out.println("Modified number: ");
System.out.println(res);

}}