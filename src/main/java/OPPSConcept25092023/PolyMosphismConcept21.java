package OPPSConcept25092023;

interface Bank11{
	void rateofinterest();
}
class SBIBank implements Bank11{
	
	public void rateofinterest(){
		System.out.println("Rate of interest of SBI is showing :"+10.12);
	}	
}
class HDFCBank implements Bank11{
	
	public void rateofinterest(){
		System.out.println("Rate of interest of HDFC is showing :"+11.15);
	}		
}
public class PolyMosphismConcept21 {

	public static void main(String[] args) {
		SBIBank sb=new SBIBank();
		sb.rateofinterest();
		
		HDFCBank hb=new HDFCBank();
		hb.rateofinterest();
	}

}
