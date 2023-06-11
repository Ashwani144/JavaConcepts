package ArrayListConcept;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		
		LinkedList<String> ls=new LinkedList<String>();
		
		ls.add("Ashwani");
		ls.add("Pandey");
		ls.add("Mohan");
		ls.add("RaJaSeth");
		ls.add("Komal");
		ls.add("Rakesh");
		ls.add("Neil");
		
		System.out.println("Content of LinkList :"+ ls);
		
		
		ls.remove(6);
		
		System.out.println("Content of LinkList :"+ ls);
		
	}

}
