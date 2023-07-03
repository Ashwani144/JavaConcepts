package OPPSConcepts03072023;

class Teacher {
	private String name;

	public void SetName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
}

public class EncapsulationConcept1 {

	public static void main(String[] args) {

		Teacher t=new Teacher();
		t.SetName("Mohan");
		System.out.println("Name is showing :" + t.getName());
	}

}
