package CollectionsConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept11 {

	public static void main(String[] args) {

		HashMap<Integer, String> hppp=new HashMap<Integer, String>();
		hppp.put(111, "Delhi");
		hppp.put(222, "Mumbai");
		hppp.put(3333, "Kolkata");
		hppp.put(4444, "Chennai");

		System.out.println("Data are showing:"+hppp);
		
		//iterating through key and value
	for(Integer entry : hppp.keySet()){
		System.out.println(entry);
	}
  // iterating through value
	
	for(String valuedata:hppp.values()){
		System.out.println(valuedata);
		
		
	}
		
		
	}

}
