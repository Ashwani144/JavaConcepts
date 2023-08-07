package ArrayListConcept;

import java.util.ArrayList;

public class ArrayConceptPart2 {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mohan");
		al.add("Rajesh");
		
		System.out.println("Data are showing:"+al);
		
		al.add(2, "KAmlesh");

		System.out.println("Data are showing:"+al);
		
		
	}

}
