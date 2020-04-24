package AssignmentLab5;

import java.util.Scanner;

public class EmployeeException extends Exception{
	EmployeeException(int sal){
		if (sal<3000){
			System.out.println("Salary is below 3000");
		}
	}
	public static void main(String[] args){
		System.out.println("Enter salary");
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		try {
			if(sal<3000){
				throw new EmployeeException(sal);
				
			}
			else{
				System.out.println("Salary odf employee is above 3000");
			}
		}catch(EmployeeException e){
			System.out.println(e);
			
		}
	}

}
