package OPPCConcepts26072023;

interface BankLoan {
	void BankType();
}

class HDFC implements BankLoan {

	public void BankType() {
		System.out.println("HDFC Bank is Type of Bank and It is Private Bank");
	}
}

class SBI implements BankLoan {
	
	public void BankType() {
		System.out.println("SBI Bank is one Type of Bank and It is Goverment Bank");
	}
}
public class PolyMorphismConcept2 {

	public static void main(String[] args) {

		HDFC hd=new HDFC();
		hd.BankType();
		
		SBI sb=new SBI();
		sb.BankType();
		
	}

}
