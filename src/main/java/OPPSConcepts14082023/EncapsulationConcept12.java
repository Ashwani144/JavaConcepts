package OPPSConcepts14082023;

class Student {

	private String name;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

public class EncapsulationConcept12 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Mohan");
		System.out.println("Name is showing:" + s1.getName());
	}

}
