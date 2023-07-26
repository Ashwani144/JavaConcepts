package OPPCConcepts26072023;

class MetroEmployee{
	
	private String name;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
public class EncapsulationConcept {

	public static void main(String[] args) {
		MetroEmployee me=new MetroEmployee();
		me.setName("Rajesh");
		System.out.println("Name are showing :"+me.getName());

	}

}
