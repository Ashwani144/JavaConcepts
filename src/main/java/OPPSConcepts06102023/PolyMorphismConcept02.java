package OPPSConcepts06102023;

interface Bank {
	void rateOfInterest();
}
class HDFCBank implements Bank {
	public void rateOfInterest() {
		System.out.println("HDFCBank loan rate Of Interest:" + 10.55);
	}
}
class SBIBank implements Bank {
	public void rateOfInterest() {
		System.out.println("SBIBank loan rate Of Interest:" + 9.55);
	}
}
public class PolyMorphismConcept02 {

	public static void main(String[] args) {
		HDFCBank hb=new HDFCBank();
		hb.rateOfInterest();
		
		SBIBank sb=new SBIBank();
		sb.rateOfInterest();
	}

}
