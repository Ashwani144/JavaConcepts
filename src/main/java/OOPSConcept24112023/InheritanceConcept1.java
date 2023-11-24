package OOPSConcept24112023;

class Tea {

	void sweet() {
		System.out.println("Tea is Best option in the office");
	}
}
class BlackTea extends Tea {
	void water() {
		System.out.println("Black Tea is better for sugar person");
	}

}
public class InheritanceConcept1 {

	public static void main(String[] args) {

		BlackTea bt=new BlackTea();
		bt.water();
		bt.sweet();
	}

}
