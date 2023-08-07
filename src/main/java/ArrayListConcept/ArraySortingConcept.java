package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraySortingConcept {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("India");
		al.add("France");
		al.add("UK");
		al.add("Canada");
		
		System.out.println("Country List are showing before sorting");
		
		for(String countrylist:al){
			System.out.println(countrylist);
		}
		
		System.out.println("Country List are showing After sorting");
		
		Collections.sort(al);
		
		for(String countrylist:al){
			System.out.println(countrylist);
		}
		
		al.add(4, "India");
		al.add(5, "US");
		
		System.out.println("New country list");
		for(String countrylist:al){
			System.out.println(countrylist);
		}
	}

}
