package OPPSConcepts18072023;

abstract class Tablet{
	
	// we can create constructor of abstract class 
	Tablet (){
		System.out.println("I am part of constructor of abstartc class");
	}
	
	abstract void medicine();
}

class Water extends Tablet{
	
	void medicine(){
		System.out.println("Water need to that time when take madicine ");
	}	
}
public class AbstractConcept10 {

	public static void main(String[] args) {

		Water w=new Water();
		w.medicine();
	}
}
