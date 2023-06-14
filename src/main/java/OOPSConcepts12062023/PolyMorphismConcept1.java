package OOPSConcepts12062023;

class DummyCycle{
	
	static void show(){
		System.out.println("This is default constructor");
	}
	
	static void show(int x){
		System.out.println(x);
	}
}

public class PolyMorphismConcept1 {

	public static void main(String[] args) {
         DummyCycle.show();
         DummyCycle.show(10);
		
	}
}
