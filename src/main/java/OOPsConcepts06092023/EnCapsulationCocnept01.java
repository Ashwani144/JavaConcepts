package OOPsConcepts06092023;

class Teacher01 {

	private String name;

	void setValue(String name) {
		this.name = name;
	}

	String getValue() {
		return name;
	}
}
public class EnCapsulationCocnept01 {

	public static void main(String[] args) {
		Teacher01 tpp = new Teacher01();
		tpp.setValue("Kamlesh Yadav");
		System.out.println("Updated Name are showing:"+tpp.getValue());
	}

}
