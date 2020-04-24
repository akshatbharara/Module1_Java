package VectorPrograms;
import java.util.Collections;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args){
		
	Vector v  = new Vector();
	v.add("Akshat");
	v.add("Abhay");
	v.add("Ravi");
	v.add("D1");
	v.add("Ayush");
	v.add("Ravi");
	Collections.sort(v);
	System.out.println(v);
	System.out.println("Size of vector="+v.size());
	System.out.println(v.capacity());
	
	}

}
