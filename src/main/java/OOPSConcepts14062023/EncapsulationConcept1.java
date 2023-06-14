package OOPSConcepts14062023;

class Student{
	
	String name;
	
	public void setdata(String name){
		this.name=name;
	}
	
	public String getdata(){
		return name;
	}
}

public class EncapsulationConcept1 {

	public static void main(String[] args) {

		Student s=new Student();
		s.setdata("mohan");
		System.out.println("data are showing ::" +s.getdata());
	}

}
