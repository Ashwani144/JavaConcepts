package OOPSConcepts25102023;

class Dummy {

	static void show() {
		System.out.println("This is first method where ");
	}

	static void show(int x) {
		System.out.println("Project price is coming high:" + x);
	}
}

public class PolyMorphismConcept001 {

	public static void main(String[] args) {
		Dummy.show();
		Dummy.show(100);
	}

}
