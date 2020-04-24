package AssignmentLab5;
import java.util.Scanner;

public class Exercise5 extends Exception {
	 Exercise5(int age){
	 if(age<15){
		 System.out.println("Age should be above 15");
	 }
	 }
	 public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter age:");
		 int a=sc.nextInt();
		 try{
			 if(a<15){
				 throw new Exercise5(a);
				 
			 }
			 else{
				 System.out.println("Age is above 15");
			 }
		 }
		 catch(Exception e){
			 System.out.println(e);
		 }
		 
	 }

}
