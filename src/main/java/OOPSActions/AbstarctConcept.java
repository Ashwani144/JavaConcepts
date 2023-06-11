package OOPSActions;

abstract class Teacher{
	
	Teacher(){
		System.out.println("Hello I am constructor");
	}
	abstract void show();
	
}
class Student extends Teacher{
	
	void show(){
		System.out.println("Hello I am Teacher");
	}
}

public class AbstarctConcept {

	public static void main(String[] args) {
		
		Teacher t=new Student();
		t.show();
	}

}
