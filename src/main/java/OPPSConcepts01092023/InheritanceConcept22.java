package OPPSConcepts01092023;

class Phone {
	void sound() {
		System.out.println("Phone of sound is coming Good");
	}
}
class Samsung extends Phone {

	void price() {
		System.out.println("Price is coming high in compare to sound of good quality");
	}
}
public class InheritanceConcept22 {

	public static void main(String[] args) {

		Samsung ss=new Samsung();
		ss.price();
		ss.sound();
	}

}
