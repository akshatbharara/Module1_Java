package ArrayListPrograms;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Akshat");
		list.add("Ravi");
		list.add("Anmol");
		list.add("Abhay");
		list.add("Ayush");
		list.remove(1);
		System.out.println("Size of Array List= "+list.size());
		System.out.println(list.contains("Akshat"));
		Collections.sort(list);
		System.out.println(list);
		
	}

}
