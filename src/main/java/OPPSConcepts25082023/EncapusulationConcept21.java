package OPPSConcepts25082023;

class EmployeeEx {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class EncapusulationConcept21 {

	public static void main(String[] args) {

		EmployeeEx exx = new EmployeeEx();
		exx.setName("Rakesh");
		System.out.println("Updated Name are showing:" + exx.getName());
	}

}
