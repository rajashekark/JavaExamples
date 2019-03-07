package collections;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList uses Dynamic Array for sorting the elements
//can contain duplicate elements
//insertion order is maintained
//non synchronized
//allows random access because it works on Index basis
//Manipulation is slow because lot of shifting needs if a element is removed from arraylist

//public class ArrayList<E> extends AbstractList<E> implements List<E>,RandomAccess,Cloneable,Serializable

//Iterator interface iterates only in forward direction



public class ArrayList1 {
	
	public static void main(String args[]) {

		ArrayList<String> al= new ArrayList<>();
		al.add("Ramu");
		al.add("Hari");
		al.add(2, "Krishna");
		al.add("Hari");

		al.remove(0);
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
