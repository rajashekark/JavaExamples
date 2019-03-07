package collections;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String args[]) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Hari");
		ts.add("Ramu");
		ts.add("Ramu");
		ts.add("Arjun");
		ts.add("");
		//ts.add(null);
		
		System.out.println(ts);
	}
}
