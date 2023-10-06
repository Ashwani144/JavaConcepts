package OPPSConcepts06102023;

abstract class Glass {
	//we can create constructor in abstract class
	Glass(){
		System.out.println("Hello I am part of constructor and Inside this class");
	}
	abstract void water();
}
class Cuppp extends Glass {

	void water() {
		System.out.println("water is coming very less in the cup in term of water");
	}
	void tea(){
		System.out.println("Tea is part of child class inside the child ");
	}
}
public class AbstractConcept01 {

	public static void main(String[] args) {
		Cuppp cpp = new Cuppp();
		cpp.water();
		cpp.tea();
	}

}
