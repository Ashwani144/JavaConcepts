package OPPSConcepts01092023;

class Laptop {

	static void trakingdata() {
		System.out.println("Hello This is traking data");
	}

	static void trakingdata(int x) {
		System.out.println("Traking Data price is showing:" + x);
	}
}
public class PolyMorphismConcept1 {

	public static void main(String[] args) {
		Laptop lp=new Laptop();
		lp.trakingdata();
		lp.trakingdata(200);
		
	}

}
