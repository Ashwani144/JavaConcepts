package OPPSConcepts01092023;

interface PersonalLoan {
	public void rateofInterest();
}
class SBIBank implements PersonalLoan {

	public void rateofInterest() {
		System.out.println("SBIBank personal loan rate of Interest:" + 10.75);
	}
}
class HDFCBank implements PersonalLoan {

	public void rateofInterest() {
		System.out.println("HDFC Bank personal loan rate of Interest:" + 18.75);
	}
}
public class PolyMorphismConcept121 {

	public static void main(String[] args) {
		SBIBank sb=new SBIBank();
		sb.rateofInterest();
		HDFCBank hb=new HDFCBank();
		hb.rateofInterest();
	}
}
