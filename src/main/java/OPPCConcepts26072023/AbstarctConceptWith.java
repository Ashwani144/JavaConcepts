package OPPCConcepts26072023;

abstract class Glass{
	 abstract void glassblank();
	
}

class Thali extends Glass {
	
	void glassblank(){
		System.out.println("Thali is bigger space in compare to Glass");
	}
}

public class AbstarctConceptWith {

	public static void main(String[] args) {
	
		Thali th=new Thali();
		th.glassblank();
	}

}
