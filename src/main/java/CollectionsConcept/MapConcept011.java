package CollectionsConcept;

import java.util.HashMap;

public class MapConcept011 {

	public static void main(String[] args) {

		HashMap<Integer, String> hp=new HashMap<Integer, String>();
		hp.put(1101, "Mohan Lal");
		hp.put(1104, "Rakesh");
		
		System.out.println("Data are showing :"+hp);
		
		hp.replace(1104, "Mobile Prasad");
		System.out.println("Data are showing :"+hp);
	}	
}
