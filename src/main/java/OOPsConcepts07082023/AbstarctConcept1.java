package OOPsConcepts07082023;

abstract class Bottle {
	
	Bottle (){
		System.out.println("Hello I am Part of constructor");
	}

	abstract void clean();

}

class Glass extends Bottle {

	void clean() {

		System.out.println("Hello I am clean the Glass");

	}
}

public class AbstarctConcept1 {

	public static void main(String[] args) {

		Glass gl = new Glass();
		gl.clean();
	}

}
