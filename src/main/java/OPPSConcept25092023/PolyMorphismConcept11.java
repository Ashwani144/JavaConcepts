package OPPSConcept25092023;

class Dummy {

	static void show() {
		System.out.println("Dafault constructor is showing ");
	}

	static void show(int x) {
		System.out.println("Parametrized constructor is showing :" + 110);
	}
}

public class PolyMorphismConcept11 {

	public static void main(String[] args) {
		Dummy.show();
		Dummy.show(200);

	}

}
