package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListConcept4 {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		
		al.add(30);
		al.add(40);
		al.add(60);
		
		for(Integer num :al){
			System.out.println("number are showing:"+num);
		}
		
		if(al.contains(35)){
			System.out.println("Number is present in array List:"+al);
		}else {
			System.out.println("Number is not present in array List:"+al);
		}
	}

}
