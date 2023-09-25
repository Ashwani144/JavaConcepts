package CollectionsConcept;

import java.util.ArrayList;

public class ArrayListCocept01 {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("rajesh");
		al.add("Mohan");
		al.add("Abhishek Singh");
		al.add("Karan Sharma");
		al.add("Adda");
		
		System.out.println("List of Name are showing:"+al);
		
		al.add(5, "Kajal");
		
		System.out.println("List of Name are showing:"+al);
		
		al.remove(1);
		
		System.out.println("List of Name are showing:"+al);
		
		for(String st : al){
			System.out.println(st);
		}
    }

}
