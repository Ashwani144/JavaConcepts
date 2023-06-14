package CollectionsConcept;

import java.util.LinkedList;

public class ArrayListConcept2 {

	public static void main(String[] args) {
		
		LinkedList<String> animal=new LinkedList<String>();
		
		animal.add("Cow");
		animal.add("Dog");
		animal.add("Lemon");
		
		System.out.println("Linked List data are showing ::"+animal);
		
		animal.add(1, "Cow");
		
		System.out.println("Updated Linked List data are showing ::"+animal);
	}

}
