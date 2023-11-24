package OOPSConcept24112023;

abstract class Charger {

	abstract void quality();

	Charger() {
		System.out.println("This class is fall into this inner constructor");
	}

}
class Motar extends Charger {

	void quality() {
		System.out.println("Motar quality is better in term of other feature");
	}
}
public class AbstractConcept01 {

	public static void main(String[] args) {

		Motar mtt = new Motar();
		mtt.quality();
	}

}
