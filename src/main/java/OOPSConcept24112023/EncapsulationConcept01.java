package OOPSConcept24112023;

class EmployeeData {

	private String name;

	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
}
public class EncapsulationConcept01 {

	public static void main(String[] args) {
		EmployeeData edd=new EmployeeData();
		edd.setName("Mohan Singh");
		System.out.println("Name are showing:"+edd.getName());
	}

}
