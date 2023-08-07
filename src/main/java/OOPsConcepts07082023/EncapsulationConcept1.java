package OOPsConcepts07082023;

class Employee {

	private String name;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

public class EncapsulationConcept1 {

	public static void main(String[] args) {

		Employee e1=new Employee();
		e1.setName("Rakesh");
		System.out.println("Updated Name are showing:"+e1.getName());
	}

}
