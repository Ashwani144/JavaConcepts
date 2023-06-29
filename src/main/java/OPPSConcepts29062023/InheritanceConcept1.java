package OPPSConcepts29062023;

class Bycle{
	void Padlle(){
		System.out.println("This is Padle class of object");
	}
	
}
class Cycle extends Bycle{
	void seat(){
		System.out.println("This is cycle Nature");
	}	
}

class Woodcycle extends Cycle{
	void walk(){
		System.out.println("This is walk way nature");
	}
	
}
public class InheritanceConcept1 {

	public static void main(String[] args) {
		Woodcycle w=new Woodcycle();
		w.Padlle();
		w.seat();
		w.walk();

	}

}
