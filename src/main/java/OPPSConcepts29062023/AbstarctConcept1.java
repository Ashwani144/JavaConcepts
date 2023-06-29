package OPPSConcepts29062023;

abstract class Dummy {
	// we can create constructor of abstarct class
	Dummy() {

		System.out.println("This is Part of constructor");
	}

	abstract void shine();
}

class Demo extends Dummy {

	void shine() {
		System.out.println("This is Demo which is coming from extends of dummy");
	}

	void shadow() {
		System.out.println("This is 2nd shadow");
	}
}

public class AbstarctConcept1 {

	public static void main(String[] args) {

		Demo d = new Demo();
		d.shine();
		d.shadow();

	}

}
