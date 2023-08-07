package OOPsConcepts07082023;

interface Bank {
	void rateofInterest();
}

class ICICI implements Bank {
	public void rateofInterest() {
		System.out.println("ICICI Rate of Interest :" + 9.0);
	}
}

class SBI implements Bank {
	public void rateofInterest() {
		System.out.println("SBI Rate of Interest :" + 7.5);
	}
}

public class PolyMorphismConcept2 {

	public static void main(String[] args) {

		Bank b1 = new ICICI();
		b1.rateofInterest();

		Bank b2 = new SBI();
		b2.rateofInterest();

	}
}
