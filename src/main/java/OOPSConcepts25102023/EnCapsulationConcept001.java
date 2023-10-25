package OOPSConcepts25102023;

class EmployeeList {

	private String name;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}
public class EnCapsulationConcept001 {

	public static void main(String[] args) {
		EmployeeList ell=new EmployeeList();
		ell.setName("Mohan Lal");
		System.out.println("Updated Name are showing:"+ell.getName());
	}

}
