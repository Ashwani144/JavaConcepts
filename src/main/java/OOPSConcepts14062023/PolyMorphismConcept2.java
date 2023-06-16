package OOPSConcepts14062023;

interface Bank{
	
	void rateofinterest();
}

class SBI implements Bank{
	
	public void rateofinterest(){
		System.out.println("SBI rate of Interest is :: " + 8.0);	
	}	
}

class BOI implements Bank{
	
	public void rateofinterest(){
		System.out.println("BOI rate of Interest is :: " + 11.0);	
	}	
}

public class PolyMorphismConcept2 {

	public static void main(String[] args) {
	
		SBI s=new SBI();
		s.rateofinterest();
		
		BOI b=new BOI();
		b.rateofinterest();

	}

}
