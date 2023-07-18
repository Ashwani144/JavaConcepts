package OPPSConcepts18072023;

interface Bank {
	public void rateofInterest();

}

class SBI implements Bank {
	public void rateofInterest() {
		System.out.println("SBI home loan rateofInterest :" + 9.5);
	}
}

class HDFC implements Bank {
	public void rateofInterest() {
		System.out.println("HDFC home loan rateofInterest :" + 11.5);
	}
}

public class PolyMorphismConcept11 {

	public static void main(String[] args) {

		SBI sb=new SBI();
		sb.rateofInterest();
		HDFC hd=new HDFC();
		hd.rateofInterest();
		
	}

}
