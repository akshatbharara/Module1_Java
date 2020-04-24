package AssignmentLab6;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Exercise1 {
	public static void main(String[] args){
		int sum = 0;
		System.out.println("Enter integers");
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()){
			String b = st.nextToken();
			int a = Integer.parseInt(b);
			System.out.println(b);
			
			sum = sum + a;
			
			
		}
		System.out.println("Sum of integers: " +sum);
	}

}
