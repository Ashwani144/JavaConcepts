package OPPSConcepts03072023;

class Glass {

	static void water() {
		System.out.println("A Glass Have good Water");
	}

	static void water(int x) {
		System.out.println("Water cost will be 10");
	}
}

public class PolyMorphismConcept1 {

	public static void main(String[] args) {
		Glass.water();
		Glass.water(25);

	}

}
