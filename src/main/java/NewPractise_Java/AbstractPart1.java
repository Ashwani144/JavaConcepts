package NewPractise_Java;

abstract class Person{
	
	Person(){
		System.out.println("I am 1st Person");
	}
	
	abstract void show();
}

class Senior extends Person {
	
	void show(){
		System.out.println("I am 2nd senior");
	}
	
}
public class AbstractPart1 {

	public static void main(String[] args) {

		Person p=new Senior();
		p.show();
		
	}

}
