package OOPSConcepts14062023;

class Employee{
	
	static void show(){
		System.out.println("I am local Employee");
	}
	
	static void show1(){
		System.out.println("I am local 2nd EMployee");
	}
}	

public class PolyMorphismConcept1 {

	public static void main(String[] args) {

		Employee.show();
		Employee.show1();
	
	}

}
