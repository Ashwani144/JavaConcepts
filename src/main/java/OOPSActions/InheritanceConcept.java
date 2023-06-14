package OOPSActions;

class Parent{
	
	void bike(){
		System.out.println("This is HERO Bike");
	}
}
class Child extends Parent{
	
	void cycle(){
		System.out.println("Altals Cycle");
	}
}
public class InheritanceConcept {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.bike();
		c.cycle();
	}
}
