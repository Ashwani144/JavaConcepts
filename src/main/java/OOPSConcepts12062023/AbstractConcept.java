package OOPSConcepts12062023;
// Abstarct class ka Object nahi bana sakte only uska reference bana sakte hai 

// Upcasting - Child class ka bana k store kar sakte hai parent class 

abstract class Dummy{
	
	Dummy (){
		System.out.println("This is Default constructor");
	}
	
	abstract void show();
}

class Demo extends Dummy {
	
	void show(){
		System.out.println("This is my First Show");
	}
}

public class AbstractConcept {

	public static void main(String[] args) {
		Dummy d=new Demo();
		d.show();

	}

}
