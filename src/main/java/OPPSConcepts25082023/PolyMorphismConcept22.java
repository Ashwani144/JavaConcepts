package OPPSConcepts25082023;

interface BankLoan {
	public void rateofInterest();
}

class HDFCLoan implements BankLoan {
	public void rateofInterest() {
		System.out.println("HDFC load interest is coming High");
	}
}

class SBILoan implements BankLoan {
	public void rateofInterest() {
		System.out.println("HDFC load interest is coming High");
	}
}

public class PolyMorphismConcept22 {
	public static void main(String[] args) {
		HDFCLoan hl = new HDFCLoan();
		hl.rateofInterest();

		SBILoan sl = new SBILoan();
		sl.rateofInterest();
	}

}
