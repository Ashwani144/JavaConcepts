package OPPSConcepts14082023;

class Tea {

	static void sweet() {
		System.out.println("Sweet of Tea is better");
	}

	static void sweet(int x) {
		System.out.println("Sweet of Tea is better with cost :" + x);
	}
}

public class PolyMorphismConcept1 {

	public static void main(String[] args) {
		Tea t1 = new Tea();
		t1.sweet();
		t1.sweet(20);
	}

}
