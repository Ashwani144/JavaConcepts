package OOPSConcepts12062023;

interface Bank{
	void RateOfInterest();
	
}
class SBI implements Bank{
	
	public void RateOfInterest(){
		System.out.println("SBI Rate of Interest :: "+ 8.0);
	}
}

class BOI implements Bank{
	
	public void RateOfInterest(){
		System.out.println("BOI Rate of Interest :: "+ 11.0);
	}
}

public class PolyMorphismConcept2 {

	public static void main(String[] args) {
		Bank b = new SBI();
		b.RateOfInterest();
		
		Bank b1= new BOI();
		b1.RateOfInterest();

	}

}
