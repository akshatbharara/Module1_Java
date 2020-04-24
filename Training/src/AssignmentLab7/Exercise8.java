package AssignmentLab7;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise8 {
	public static int[] modifyArray(int[] num) {
		int l=num.length;
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for(int i=0;i<l;i++) {
			ts.add(num[i]);
		}
		int[] r=new int[ts.size()];
		Integer res[]=ts.toArray(new Integer[ts.size()]);
		int h=res.length;
		for(int j=h-1;j>=0;j--) {
			r[j]=res[j];
		}
		return r;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
	}
		int l[]=modifyArray(a);
		for(int i=0;i<l.length;i++) {
			System.out.println(l[i]);
	}
	}
	
}
