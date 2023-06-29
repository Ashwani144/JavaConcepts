package OOPSConcepts23062023;

class Demo{
	
	void show(){
		System.out.println("Hello I am Start at Part of Parent class");
	}
}

class Dummy extends Demo{
	 
	void Shine(){
		System.out.println("Hello I am local child class message");
		
	}
	
}

public class InheritanceConcept1 {

	public static void main(String[] args) {

		Dummy d=new Dummy();
		d.show();
		d.Shine();
	}

}
