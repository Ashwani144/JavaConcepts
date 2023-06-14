package CollectionsConcept;

import java.util.LinkedList;

public class LinkedListConcept2 {

	public static void main(String[] args) {

		LinkedList<String> ls=new LinkedList<String>();
		
		ls.add("cow");
		ls.add("camel");
		ls.add("goat");
		
		System.out.println("New Data are showing of LikedList :"+ls);
		
		ls.remove(2);
		
		System.out.println("New Data are showing of LikedList after remove action :"+ls);
		
		 // change elements at index 3
		ls.set(1, "Guguli");
		
		System.out.println("New Data are showing of LikedList after remove action :"+ls);
	}

}
