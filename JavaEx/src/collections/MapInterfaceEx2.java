package collections;

import java.util.HashMap;
import java.util.Map;

class Book {
	int id;
	String bookName;
	String author;

	public Book(int id, String bookName, String author) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}

}

public class MapInterfaceEx2 {

	public static void main(String args[]) {
	
	HashMap<Integer,Book> hm = new HashMap<Integer,Book>();
	
	Book b1 = new Book(1,"Geeta","Krishna");
	Book b2 = new Book(2, "Ramyana", "Valmiki");
	Book b3 = new Book(3,"mahabharath", "Vyasa");
	hm.put(1, b1);
	hm.put(2, b2);
	//hm.replace(2, b1);
	hm.putIfAbsent(3, b3);
	
	//hm.remove(1);
	
	for(Map.Entry<Integer,Book> m:hm.entrySet()) {
		//System.out.println(m.getKey() + " " m.getValue());
		int key = m.getKey();
		Book b = m.getValue();
		System.out.println(key+ " Details:");
		System.out.println(b.id+ " "+ b.bookName+" "+b.author);
	}
	
	}

}
