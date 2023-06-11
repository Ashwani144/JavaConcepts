package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {

		ArrayList<Object> al=new ArrayList<Object> ();
		
		System.out.println(al.size()); //pc=0
		
		al.add(100);
		
		System.out.println(al.size()); //pc=1
	}

}
