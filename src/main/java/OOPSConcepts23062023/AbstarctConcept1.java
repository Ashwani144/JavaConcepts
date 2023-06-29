package OOPSConcepts23062023;

abstract class Demo1{
	
	// We can create Abstartc class of constructor 
	Demo1(){
		
		System.out.println("I am part of constructor But Present in abstartc class");
	}
	
	abstract void show();
}

class Shine extends Demo1{
	
	void show(){
		System.out.println("I am Part of other class but Method of Abstarct");
	}
	
}


public class AbstarctConcept1 {

	public static void main(String[] args) {

		Shine s=new Shine();
		s.show();
	}

}
