package AssignmentLab5;

import java.util.Scanner;

public class Exercise4 extends Exception{
	Exercise4 (String firstname, String lastname){
		if(firstname.equals("")){
			System.out.println("First name is blank");}
			else if(lastname.equals("")) {
				System.out.println("Last name is blank");
			}
			
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstname = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastname = sc.nextLine();
		try{
			if (firstname.equals("")||lastname.equals("")){
				throw new Exercise4(firstname,lastname);
					
			}
			else{
				System.out.println("User name: "+firstname +lastname);
			}
		}
		catch(Exception e){
			System.out.println("Exception occured");
			
		}
	}
	
	}


