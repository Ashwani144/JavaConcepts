package OPPSConcepts29062023;

class Student{
	
	private String name;
	
	public void setData(String name){
		this.name=name;
	}
	public String getData(){
		return name;
	}	
}

public class EncapsulationConcept1 {

	public static void main(String[] args) {
	Student s=new Student();
	s.setData("Mohan");	
	
	System.out.println("Updated Name is showing : "+ s.getData());
	}
}
