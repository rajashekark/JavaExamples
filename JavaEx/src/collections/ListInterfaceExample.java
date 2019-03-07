package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListInterfaceExample {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Ramu");
		list.add("Hari");
		Set<String> set = new HashSet<String>();
		set.add("Vishnu");
		set.add("shiva");
		set.add("Brahma");
		
	System.out.println(set);

		List<String> list2 = new ArrayList<String>();
		list2.add("Varaha");
		list2.add("Mathsya");
		//list2.addAll(set);
		
		List<String> list3 = new ArrayList<String>();
		list3.add("1");
		list3.add("2");
		list3.add("3");
		list3.add("");
		list3.add("");

		list.addAll(list2);

		list.addAll(list3);
		
		list.addAll(3,set);
//		System.out.println(list.isEmpty());
//
//		System.out.println(list.get(1));
//
//		list.add(0, "Hari");
//		System.out.println(list.set(1, "Parasuram"));

//		System.out.println("Printing as array:");
//		System.out.println(list);

		System.out.println("Printing as List using iteartor:");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		list.add("Vijay");
		list.add("Hari");
		System.out.println(list);
		
		//List<String> list4 = new ArrayList<String>();
		

		System.out.println(list.contains("hari"));

		System.out.println(list.containsAll(list2));

		System.out.println(list.lastIndexOf("Hari"));

		list.remove(5);
		
		System.out.println(list);
		
		
	
	
//		System.out.println(list.removeAll(list2));
//		System.out.println(list);
//		
//		String[] arr = (String[]) list.toArray();
//		System.out.println(arr);
//		list.clear();
//		System.out.println(list);

//		System.out.println("Printing using for loop:");
//		for (String names : list) {
//			System.out.println(names);
//		}
//
//		System.out.println("Printing using forEach method:");
//		list.forEach(a -> {
//			System.out.println(a);
//		});
//
//		System.out.println("Printing reversely using listIterator:");
//		ListIterator<String> itr1 = list.listIterator(list.size());
//		while (itr1.hasPrevious()) {
//			System.out.println(itr1.previous());
//		}
	}

}
