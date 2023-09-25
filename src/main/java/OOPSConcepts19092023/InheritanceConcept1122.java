package OOPSConcepts19092023;

class FRuites {
	void sweet() {
		System.out.println("Fruites are showing sweet");
	}
}
class Mango extends FRuites {
	void cost() {
		System.out.println("Mango are better sweets in compare to other fruites");
	}
}
public class InheritanceConcept1122 {

	public static void main(String[] args) {
		Mango mt = new Mango();

		mt.sweet();
		mt.cost();
	}

}
