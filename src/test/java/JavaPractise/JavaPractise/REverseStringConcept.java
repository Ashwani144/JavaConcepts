package JavaPractise.JavaPractise;

import java.util.Scanner;
import java.util.stream.Stream;

public class REverseStringConcept {

	public static void main(String[] args) {

		System.out.println("Please enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String reverse=" ";
		
		for(int i=str.length()-1; i>str.length(); i-- ){
			
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse String is:");
		
		System.out.println(reverse);
	}

}
