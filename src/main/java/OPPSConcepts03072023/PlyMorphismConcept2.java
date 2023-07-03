package OPPSConcepts03072023;

interface School{
	void fee();
}

class PrivateSchool implements School{
	public void fee(){
		System.out.println("Private school fee will be : "+ 1500);
	}
}

class GovermentSchool implements School{
	public void fee(){
		System.out.println("Goverment school fee will be : "+ 700);
	}
}

public class PlyMorphismConcept2 {

	public static void main(String[] args) {
		PrivateSchool ps=new PrivateSchool();
		ps.fee();
		
		GovermentSchool gs=new GovermentSchool();
		gs.fee();
	}

}
