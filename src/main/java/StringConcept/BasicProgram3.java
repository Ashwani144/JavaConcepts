package StringConcept;

public class BasicProgram3 {

	public static void main(String[] args) {

		String s1="Hello";
		String s2=new String("Hello");
		String s3="Hello";
		
		if(s1==s2){
			System.out.println("s1 and s2 are equal");
		} else {
			System.out.println("s1 and s2 are not equal");
		}
		
		if(s1==s3){
			System.out.println("s1 and s3 are equal");
		}
		else {
			System.out.println("s1 and s3 are not equal");
		}
		
	}

}
