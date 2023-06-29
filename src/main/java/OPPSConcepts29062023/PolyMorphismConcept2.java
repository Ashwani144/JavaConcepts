package OPPSConcepts29062023;

interface Bank{
	void RateofInterest();
	
}

class SBI implements Bank{
	public void RateofInterest(){
		System.out.println("SBI Bank of RateofInterest: " + 8.0);
	}
}

class BOI implements Bank{
	public void RateofInterest(){
		System.out.println("BOI Bank of RateofInterest: " + 11.0);
	}
}

public class PolyMorphismConcept2 {

	public static void main(String[] args) {

		Bank b=new SBI();
		b.RateofInterest();
		
		Bank b1=new BOI();
		b1.RateofInterest();
		
	}

}
