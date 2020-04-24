
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> lstName = new ArrayList<String>();

		if(args.length > 0)
		{
			for (int i = 0; i < args.length; i++) {
				lstName.add(args[i]);
	
			}
		}
		else{
			lstName.add("first");
			lstName.add("second");
		}
		
		
		System.out.println("Original List" + lstName);
		lstName.add(1, "dig");
		System.out.println("Original List" + lstName);
		System.out.println("Size::" + lstName.size());
		System.out.println("Element at 2:: " + lstName.get(2));
		lstName.set(2, "pent");
		System.out.println("Original List" + lstName);
		System.out.println("Original List" + lstName);

		System.out.println("Index of vijay::" + lstName.indexOf("vijay"));

		System.out.println("Index of dig::" + lstName.indexOf("dig"));

		System.out.println("Index of dig::" + lstName.lastIndexOf("dig"));

		
		Iterator<String> iter = lstName.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
