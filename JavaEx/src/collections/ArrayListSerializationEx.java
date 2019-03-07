package collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerializationEx {
	
	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hari");
		list.add("Ramu");
		list.add("Krishna");
		
		try {
			FileOutputStream fos = new FileOutputStream("text");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			fos.close();
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
