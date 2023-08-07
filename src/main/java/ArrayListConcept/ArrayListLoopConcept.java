package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListLoopConcept {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("India");
		al.add("France");
		al.add("UK");
		al.add("Canada");
		
		//Loop are using with show the data 
		
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		
		
	}

}
