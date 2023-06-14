package OOPSConcepts14062023;

class parent{
	void show(){
		System.out.println("I am parent class");
	}
}

class child extends parent{
	void childshow(){
		System.out.println("I am child class");
	}
} 

public class InheritanceConcept1 {

	public static void main(String[] args) {
		
		//Create object of sub class
		child p = new child();
	    p.show();
	    p.childshow();
		
	}
}
