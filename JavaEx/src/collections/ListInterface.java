package collections;

import java.util.ArrayList;
import java.util.ListIterator;

//List interface is a sub interface of collection interface
//it contains methods to insert and delete elements on index basis 
//it is a factory of ListIterator
//ListIterator interface used to traverse the elements in Forward and Reverse direction

//public interface List<E> extends Collection<E>

public class ListInterface {
	public static void main(String args[]) {
		
		//List is an interface so we can't create object
		//so we use either ArrayList or LinkedList classes 
		
		ArrayList<String> al = new ArrayList<String>();
				al.add("Raj");
				al.add("Raju");
				al.add("Ramu");
				System.out.println("Element at second position:"+al.get(1));
				al.add(3, "Hari");
				al.add(1, "Krishna");
				
				al.remove(0);
				
				//Now we iterate using ListIterator
				
				ListIterator<String> itr = al.listIterator();
				System.out.println("Iterating in Forward direction");
				//condition to iterate 
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
		
				System.out.println("Iterating in reverse direction");
				//condition to iterate in reverse direction
				
				while(itr.hasPrevious()) {
					System.out.println(itr.previous());
				}
	}
	

}
