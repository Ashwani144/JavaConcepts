package OPPSConcepts29062023;

class Dental{
	
	static void cleanUp(){
		System.out.println("This is Default constructor");
	}
	
	static void fee(int x){
		System.out.println("This is Customized constructor and Fee will be :" +x);
	}
}
public class PolyMorphismConcept1 {

	public static void main(String[] args) {

	//	Dental d=new Dental();
	//	d.cleanUp();
	//	d.fee(10);
	//	OR -- If make a method static then we can call by class 
		Dental.cleanUp();
		Dental.fee(15);
		
	}

}
