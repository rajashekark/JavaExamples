package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class SetInterfaceEx {
	
	public static void main(String args[]) {
		Set<String> set = new HashSet<String>();
		set.add("Hari");
		set.add("Ramu");
		set.add("Hari");
		set.add("Hari");
		set.add(null);
		set.add("");
		set.add("");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		//System.out.println(set);
		
		System.out.println(set.contains("Hari"));
		
		System.out.println(set.size());
		
		
		//equals() method is to compare two objects
		//System.out.println(set.equals(set1));
		
//		Object[] arr = set.toArray();
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//	
		/*
		Spliterator<String> sp = set.spliterator();
	
		sp.forEachRemaining((n->System.out.println(n)));
		
		System.out.println(set.getClass());
		
		set.removeIf(n->n.charAt(0) == 'H');
		
		System.out.println(set);
		
		ArrayList<String> list  = new ArrayList<String>();
		list.add("Hari");
		list.add("Krishna");
		list.add("Ramu");
		
		set.addAll(list);
		
		System.out.println(set);
		
		*/
	}

}
