package OOPSConcepts14062023;

abstract class Dummy{
	
	Dummy(){
		
		System.out.println("I am part of abstarct class as constructor");
	}
	
	abstract void show();
}

class Demo extends Dummy{
	
	void show(){
		System.out.println("I am show with child class");
	}
}

public class AbstractConcept {

	public static void main(String[] args) {

		Demo d=new Demo();
		d.show();
		
	}
}
