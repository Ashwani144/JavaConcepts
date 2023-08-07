package JavaPractise.JavaPractise;

public class CountofUperLevel {

	public static void main(String[] args) {

		String str="Hello I am Indian";
		int count =0;
		
		for(char c :str.toCharArray()){
			
			if(Character.isUpperCase(c))
			{
				count++;
				System.out.println("Uppper Case count is that :"+count);
			}
		
			else {
				System.out.println("Lower Case count is that :"+count);
			}
		}
		
	}

}
