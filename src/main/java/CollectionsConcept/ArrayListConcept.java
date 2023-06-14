package CollectionsConcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<String>();
		
		al.add("mohan");
		al.add("Sohan");
		al.add("Rakesh");
		al.add("Raja");
	
		System.out.println("List are showing :" +al);
		
		
		ArrayList arr = new ArrayList();
		
		arr.add(123);
		arr.add("Hello");
		arr.add("Rajesh");
		
		System.out.println("Data are showing :" +arr);
		
		//// add JavaScript at index 1
		
		ArrayList<String> adata=new ArrayList<String>();
		
		adata.add("Kamal");
		adata.add("rakesh");
		
		System.out.println("Data are showing :" +adata);
		
		String str = adata.get(0);
		
		System.out.println("Indexing data are showing :: "+str);
	}

}
