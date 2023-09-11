package CollectionsConcept;

import java.util.ArrayList;

public class ArrayListConcept200 {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mohan");
		al.add("Kamlesh");
		al.add("kaka");
		al.add(3, "Sajan");
		
		System.out.println("List of Name are showing:"+al);
		
		al.add("kalesh");
		
		System.out.println("List of Name are showing:"+al);
		
		for(String e :al){
			System.out.println(e);
		}
	}

}
