package StringConcept;

public class ToCountUpperAndLowerCase {

	public static void main(String[] args) {

		String s1 = "Hello I am Java";
		
		int count=0;
		
		for(char ch:s1.toCharArray()){
		
			if(Character.isUpperCase(ch)){
				count++;
				System.out.println("Length Count of UpperCase :"+count);
			}
			else{
				System.out.println("Length Count of Lower Case :"+count);
			}
			
		}
		
	}

}
