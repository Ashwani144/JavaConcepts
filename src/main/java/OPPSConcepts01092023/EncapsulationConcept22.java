package OPPSConcepts01092023;

class PrincipalList {
	private String name;

	void setName(String name) {
		this.name = name;
	}

	String getName(){
		return name;
	}
}

public class EncapsulationConcept22 {

	public static void main(String[] args) {
		PrincipalList pl=new PrincipalList();
		pl.setName("Mohan Lal Yadav");
		System.out.println("Principal Name is showing:"+pl.getName());
	}
}
