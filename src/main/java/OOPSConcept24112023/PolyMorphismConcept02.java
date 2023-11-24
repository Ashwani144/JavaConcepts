package OOPSConcept24112023;

interface Bank {
	void rateOfInterest();
}

class SBIBank implements Bank {
	public void rateOfInterest() {
		System.out.println("SBI Bank Rate Of Interest :" + 8.5);
	}
}

class HDFCBank implements Bank {
	public void rateOfInterest() {
		System.out.println("HDFC Bank Rate Of Interest :" + 11.5);
	}
}

public class PolyMorphismConcept02 {

	public static void main(String[] args) {
		SBIBank sbb = new SBIBank();
		sbb.rateOfInterest();
		HDFCBank hbb = new HDFCBank();
		hbb.rateOfInterest();

	}

}
