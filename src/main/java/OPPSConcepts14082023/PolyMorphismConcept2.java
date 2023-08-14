package OPPSConcepts14082023;

interface Loan {
	void rateofInterest();
}

class SBILOan implements Loan {
	public void rateofInterest() {
		System.out.println("SBILoan is low in comppare to Private Bank");
	}
}

class HDFCLOAN implements Loan {
	public void rateofInterest() {
		System.out.println("HDFCLOAN is high in compare to Goverment Bank");
	}
}

public class PolyMorphismConcept2 {

	public static void main(String[] args) {
		SBILOan sl = new SBILOan();
		sl.rateofInterest();

		HDFCLOAN hl = new HDFCLOAN();
		hl.rateofInterest();
	}

}
