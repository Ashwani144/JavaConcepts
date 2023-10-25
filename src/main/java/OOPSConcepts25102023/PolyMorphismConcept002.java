package OOPSConcepts25102023;

interface Bank {
	public void rateOfInterest();
}

class HDFCBank implements Bank {
	public void rateOfInterest() {
		System.out.println("HDFC Bank rate of Interest is high:" + 11.5);
	}

}

class SBIBank implements Bank {

	public void rateOfInterest() {
		System.out.println("SBI Bank rate of Interest is Low :" + 8.5);
	}
}

public class PolyMorphismConcept002 {

	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.rateOfInterest();

		SBIBank sb = new SBIBank();
		sb.rateOfInterest();
	}
}
