package CollectionsConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapSetConcept {

	public static void main(String[] args) {

		HashMap<Integer, String> mppp = new HashMap<Integer, String>();
		mppp.put(101, "Mohan");
		mppp.put(102, "Rajesh Lal");
		mppp.put(103, "Mohan Seth");
		mppp.put(104, "Rajnish");

		System.out.println("Iterating HashMap");

		for (Map.Entry m : mppp.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());    		}

	}
}
