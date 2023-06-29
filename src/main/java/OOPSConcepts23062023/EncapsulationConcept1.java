package OOPSConcepts23062023;

class Student{
	
	String name;
	
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

		System.out.println("Name are showing :" + s.getData());
	}

}
