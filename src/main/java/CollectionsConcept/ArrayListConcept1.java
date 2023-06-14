package CollectionsConcept;

import java.util.ArrayList;

public class ArrayListConcept1 {

	public static void main(String[] args) {

		ArrayList<String> adata = new ArrayList<String>();

		adata.add("Kamal");
		adata.add("rakesh");
		
		System.out.println("Data are displaying ::"+adata);

		adata.set(1, "Kamlesh");
		
		System.out.println("New Updated Data are displaying ::"+adata);
		
		
		ArrayList<String> adata1 = new ArrayList<String>();

		adata1.add("kakesh");
		adata1.add("Hello India");
		
		System.out.println("2nd Time Data are displaying ::"+adata1);
		adata1.remove(1);
		
		System.out.println("2nd Time Data are displaying after remove ::"+adata1);
		
	}

}
