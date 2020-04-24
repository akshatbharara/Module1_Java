package AssignmentLab6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Exercise9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date: ");
		String s=sc.next();
		int dd=Integer.parseInt(s.substring(0,2));
		int mm=Integer.parseInt(s.substring(3,5));
		int yy=Integer.parseInt(s.substring(6));
		LocalDate pdate=LocalDate.of(yy,mm,dd);
		LocalDate currentdate=LocalDate.now();
		
		Period diff=Period.between(pdate, currentdate);
		System.out.println("The difference in years: "+diff.getYears());
		System.out.println("The difference in months: "+diff.getMonths());
		System.out.println("The difference in days: "+diff.getDays());
		
	}
}