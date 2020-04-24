package AssignmentLab3;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
public class Exercise4 {
	public static TreeMap countCharacter(char a[]){
		Map mp= new TreeMap();
		for(int i = 0;i<a.length;i++){
			if(mp.containsKey(a[i])){
				int p = (int) mp.get(a[i]);
				mp.put(a[i], p+1);
				}
			else{
				mp.put(a[i],1);
			}
		}
		return (TreeMap) mp;
		
	}
	public static void main(String[] args){
		System.out.println("Enter characters to count occurences: ");
		Scanner sc = new Scanner(System.in);
		char b[] = sc.next().toCharArray();
		
		System.out.println(countCharacter(b));
	}


}
