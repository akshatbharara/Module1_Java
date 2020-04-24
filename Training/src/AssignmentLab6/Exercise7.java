package AssignmentLab6;

import java.io.File;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File f = null;
		boolean s1 = false,r=false,w=false;
		String name = null;
		System.out.println("Enter the file name:");
		f=new File(sc.next());
		if(f.exists()) {
			name=f.getName(); //name
			s1=true; //exists
			System.out.println("The name of the file is: "+name);
			System.out.println("The file exists: "+s1);
			r=f.canRead();
			System.out.println("The file is Readable: "+r);
			w=f.canWrite();
			System.out.println("The file is writeable: "+w);
			if(name.lastIndexOf(".")!=-1 && name.lastIndexOf(".")!=0) {
				String s=name.substring(name.lastIndexOf(".")+1);
				System.out.println("The type of the file is: "+s);
			}
			System.out.println("The length of the file is: "+f.length());
			
		}
		else {
			System.out.println("The file does not exist.");
		}
		
		
	}
}
