package StringBasicConcept;

public class LengthConcept {

	public static void main(String[] args) {

		String s1="Hello I am Indian";
		
		System.out.println(s1);
		
		int len = s1.length();
		
		System.out.println("Length of string :"+ len);
		
		//add two string 
		s1="python";
		
		String s2 = s1.concat(" Programming");
		
		System.out.println(s2);
	}

}
