package OPPSConcepts06102023;

class TrainList {

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
		TrainList tl=new TrainList();
		tl.setName("Ashwani Pandey");
		System.out.println("Updated Name are showing:"+tl.getName());
	}

}
