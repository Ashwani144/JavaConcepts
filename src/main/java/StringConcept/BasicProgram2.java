package StringConcept;

public class BasicProgram2 {

	public static void main(String[] args) {

		String s1="Hello I am Java";
		
		System.out.println(s1);
		
		int len = s1.length();
		System.out.println("String length are showing:"+len);
		
		String s2=" Mohan India";
		String s3=s1.concat(s2);
		
		System.out.println(s3);
		
		System.out.println(s3.length());
		
		String s4=new String(" Kaka");
	}

}
