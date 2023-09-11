package CollectionsConcept;

import java.util.ArrayList;

public class ArrayListConcept0101 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(25);
		al.add(45);
		al.add(85);
		if (al.contains(35)) {
			System.out.println("Data are showing into the list");
		} else {
			System.out.println("Data are not showing into the list");
		}
	}
}
