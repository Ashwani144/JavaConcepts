package OPPSConcepts03072023;

class Fruites{
	
	void tasty(){
		System.out.println("Fuites are Tasty");
	}
}

class Mango extends Fruites{
	
	void sweeet(){
		System.out.println("Mango are Sweet is part of Fruites");
	}
}

public class InheritanceConcept1 {

	public static void main(String[] args) {

		Mango m=new Mango();
		m.sweeet();
		m.tasty();
	}

}
