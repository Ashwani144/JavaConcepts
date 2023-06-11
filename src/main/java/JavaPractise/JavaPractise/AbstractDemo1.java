package JavaPractise.JavaPractise;

 abstract class Person{
	 
	 Person(){
		 System.out.println("Person");
	 }
	 
	 abstract void show();
}
 class Sir extends Person{
	 void show(){
		 System.out.println("SIR");
	 }
	 
 }

public class AbstractDemo1 {

	public static void main(String[] args) {
		Person s=new Sir();
		s.show();
	}

}
