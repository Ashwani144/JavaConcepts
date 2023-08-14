package OPPSConcepts14082023;

class Tom {

	void Loan() {
		System.out.println("Loan is providing the Bank");
	}
}
class KIK extends Tom {

	void gold() {

		System.out.println("Gold is providing the Good Interest ");
	}
}
public class InheritanceConcept12 {

	public static void main(String[] args) {

		KIK t=new KIK();
		t.gold();
	}

}
