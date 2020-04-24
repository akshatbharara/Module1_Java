package AssignmentLab1;
import java.util.Scanner;
public class DifferencePrgm2 {
	public static int calculateDifference(int n){
		int x=0;
		int y=0;
		int z = 0;
		for(int i=1;i<=n;i++){
			x=x+i;
			z = x * x ;
		}
		for(int i=1;i<=n;i++){
			int temp=i*i;
			y=y+temp;
		}
		return y-z;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int numb=sc.nextInt();
		int diff=calculateDifference(numb);
		System.out.println(diff);
	}}
