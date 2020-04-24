

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArray {
public static void main(String args[])
{
	ArrayList<String> arr= new ArrayList<String>();
	arr.add("USER1");
	arr.add("USER2");
	Iterator<String> i= arr.iterator();
	System.out.println("TRAVERSAL THROUGH ITERATOR is");
	while(i.hasNext())
		System.out.println(i.next()+" ");
}
}