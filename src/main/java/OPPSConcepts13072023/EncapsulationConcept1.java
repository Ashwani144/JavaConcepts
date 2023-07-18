package OPPSConcepts13072023;

class TeacherYoga {

	private String name;

	public void setTeacherName(String name) {
		this.name = name;
	}

	public String getTecherName() {
		return name;
	}
}

public class EncapsulationConcept1 {

	public static void main(String[] args) {

		TeacherYoga ty=new TeacherYoga();
		ty.setTeacherName("Rajesh");
		
		System.out.println("Name of Yoga Techer is showing :" +ty.getTecherName());
	}

}
