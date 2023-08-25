package OPPSConcepts25082023;

abstract class Mobile {
	Mobile() {
		System.out.println("I am part of constructor");
	}
	abstract void sound();
}
class Recharge extends Mobile {
	void sound() {
		System.out.println("Rechargabke mobile of sound is better");
	}
}
public class AbstarctClassConcept21 {

	public static void main(String[] args) {

		Recharge re = new Recharge();
		re.sound();
	}

}
