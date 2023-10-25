package OOPSConcepts25102023;

class Pen {

	void write() {
		System.out.println("Pen Is writing a Good Quanitity of Paper");
	}

}
class BalPen extends Pen{
	
	void quality(){
		System.out.println("Bal Pen quality is better then Normal pen");
	}
	
}
public class InheritanceConcept0011 {

	public static void main(String[] args) {

		BalPen bp=new BalPen();
		bp.write();
		bp.quality();
	}

}
