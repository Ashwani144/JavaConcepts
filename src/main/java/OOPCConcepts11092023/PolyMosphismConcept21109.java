package OOPCConcepts11092023;

interface Bannk{
	void rateofInterest();
}
class HDFCBank implements Bannk{
	public void rateofInterest(){
		System.out.println("HDFC rate of Interest is showing less:"+10.5);
	}	
}
class SBIBank implements Bannk{
	public void rateofInterest(){
		System.out.println("SBI Bank of Interest is showing more:"+11.5);
	}	
}
public class PolyMosphismConcept21109 {

	public static void main(String[] args) {
		HDFCBank hdd=new HDFCBank();
		hdd.rateofInterest();
		
		SBIBank sbb=new SBIBank();
		sbb.rateofInterest();
		
	}

}
