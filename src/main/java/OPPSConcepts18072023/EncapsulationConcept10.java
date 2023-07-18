package OPPSConcepts18072023;

class TTecher {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class EncapsulationConcept10 {

	public static void main(String[] args) {

		TTecher tt=new TTecher();
		tt.setName("Rakesh");
		System.out.println("Latest Name is showing :"+tt.getName());
	}

}
