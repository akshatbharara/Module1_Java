package AssignmentLab5;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args){
		System.out.println("Enter red, yellow or green: ");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		switch(st){
		case "red":{
			System.out.println("Stop");
			break;
		}
		case "yellow":{
			System.out.println("Ready");
			break;
		}
		case "green":
			System.out.println("Go");
			break;
		}
		
	}

}
