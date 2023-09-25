package OOPSConcepts19092023;

interface MutualFund{
	void amount();
}
class SBIBank implements MutualFund{
	public void amount(){
		System.out.println("SBIBank mutual Funds are showing high percentage");
	}
}
class HDFCBank implements MutualFund{
	public void amount(){
		System.out.println("HDFCBank mutual Funds are showing Low percentage");
	}
}
public class PolyMorphismConcept02 {

	public static void main(String[] args) {
		SBIBank sb=new SBIBank();
		sb.amount();
		
		HDFCBank hdd=new HDFCBank();
		hdd.amount();
	}

}
