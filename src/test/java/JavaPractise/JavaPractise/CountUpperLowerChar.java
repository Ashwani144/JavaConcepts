package JavaPractise.JavaPractise;

public class CountUpperLowerChar {

	public static void main(String[] args) {

		int i,l, c1=0,c2=0,c3=0;
		char ch;
		String s = "Mohan101";
		
		l=s.length();
		
		for(i=1; i<l; i++){
			{
				ch=s.charAt(i);
						if(Character.isLowerCase(ch))
							c1++;
						
						else if(Character.isUpperCase(ch))
				           c2++;
						else if(Character.isDigit(ch))
						c3++;
			}
			System.out.println("No of Lower Case count :"+c1);
			
			System.out.println("No of Upper Case count :"+c2);
			System.out.println("No of Digit count :"+c3);
		}
	}

}
