package OOPSActions;

//Encapulation in java is a process of wrapping code and data together into single Unit

class Studentdata{
	
	private String name;
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
}
public class EncapsulationCon {

	public static void main(String[] args) {

		Studentdata s=new Studentdata();
		s.setName("Mohan");
		System.out.println("Name is show :::" + s.getName());
	}

}
