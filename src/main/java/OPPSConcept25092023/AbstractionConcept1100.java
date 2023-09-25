package OPPSConcept25092023;

abstract class MotoMobile {

	MotoMobile() {
		System.out.println("I am Part of constructor of abstract class");
	}

	abstract void sound();
}
class Samsung extends MotoMobile {
	void sound() {
		System.out.println("samsung sound is also good in compare with Moto Mobile  ");
	}
}
public class AbstractionConcept1100 {

	public static void main(String[] args) {
		Samsung st = new Samsung();
		st.sound();
	}

}
