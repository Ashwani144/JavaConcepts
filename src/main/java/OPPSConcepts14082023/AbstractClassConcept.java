package OPPSConcepts14082023;

abstract class Wood {

	Wood (){
		System.out.println("I am Part of constructor of abstract class");
	}
	abstract void good();
}

class Pipe extends Wood {

	void good() {
		System.out.println("Hello I am Good for Pipe in compre to Wood");
	}
	
	void better(){
		System.out.println("I am part of child class ");
	}

}
public class AbstractClassConcept {

	public static void main(String[] args) {
		Pipe p1 = new Pipe();
		p1.good();
		p1.better();
	}

}
