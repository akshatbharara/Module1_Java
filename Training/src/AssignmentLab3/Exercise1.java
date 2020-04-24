package AssignmentLab3;
import java.util.Scanner;
public class Exercise1 {
	public static int getSecondSmallest(int a[]){
		int temp;
		for(int i = 0; i<a.length;i++){
			for(int j = i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				
			}
		}
		System.out.print("Second Smallest number is ");
		return a[1];
	}
	public static void main(String[] args){
		
		
		System.out.println("Enter range of array");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a[] = new int[num];
		System.out.println("Enter elements in array");
		for(int k = 0;k<num;k++){
			Scanner sc1 = new Scanner(System.in);
			a[k] = sc1.nextInt();
			
		}
		System.out.println(getSecondSmallest(a));
	}

}
