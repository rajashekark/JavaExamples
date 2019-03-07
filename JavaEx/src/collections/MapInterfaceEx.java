package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceEx {
	
	public static void main(String args[]) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("Hari", 1);
		map.put("Ramu", 2);
		System.out.println(map);

		/*
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)itr.next();
			System.out.println(entry.getValue() + " "+ entry.getKey());
		}
		*/
		
		System.out.println(map.get("Hari"));
		System.out.println(map.containsKey("Ramu"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.replace("Hari", 3);
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getValue()+ " "+ m.getKey());
		}
	}

}
