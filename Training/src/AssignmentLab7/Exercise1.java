package AssignmentLab7;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
	public static ArrayList getValues(HashMap hm){
		ArrayList l1 = new ArrayList(hm.values());
		return l1;
		
	}
	public static void main(String args[]){
		HashMap hm = new HashMap();
		System.out.println("Enter number of elements to enter: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		for(int i = 0; i<n;i++)
		{
			System.out.println("Enter Key Value");
			int a = input1.nextInt();
			System.out.println("Enter value");
			String b = input2.nextLine();
			hm.put(a,b);	
		}
		
		System.out.println(getValues(hm));
	}

}
