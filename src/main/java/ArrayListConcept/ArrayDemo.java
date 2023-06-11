package ArrayListConcept;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10);
		al.add("Demo");
		al.add(12.33);
		al.add("True");
	    System.out.println(al);
	    
	    System.out.println(al.get(3));
	  //  System.out.println(al.get(9));
	    
	}

}
