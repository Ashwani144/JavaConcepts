package OOPCConcepts11092023;

class TeacherList{
	private String name;
	
	void setName(String name){
		this.name=name;
	}	
	String getName(){
		return name;
	}
}
public class EncapsulationConcept1109 {

	public static void main(String[] args) {

		TeacherList tl=new TeacherList();
		tl.setName("Rajan Seth");
		System.out.println("Updated Name are showing:"+tl.getName());
	}

}
