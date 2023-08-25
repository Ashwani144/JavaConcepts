package OPPSConcepts25082023;

class Pen {

	void write() {
		System.out.println("Pen has writting with 2 different color");
	}
}
class InkPen extends Pen {

	void inkwriteco() {
		System.out.println("inkwriteco has written and Extends from Pen");
	}
}
public class InheritanceConcept21 {

	public static void main(String[] args) {
		InkPen ip = new InkPen();
		ip.inkwriteco();
		ip.write();

	}

}
