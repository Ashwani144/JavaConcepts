package OOPSConcepts19092023;

class EmployeeTrack{
	private String name;
	
	void setName(String name){
		this.name=name;
	}
	
	String getName(){
		return name;
	}
}
public class EncapsulationConcept1 {

	public static void main(String[] args) {
		EmployeeTrack ett=new EmployeeTrack();
		ett.setName("Kamlesh");
		System.out.println("Updated Name are showing:"+ett.getName());
		
	}

}
