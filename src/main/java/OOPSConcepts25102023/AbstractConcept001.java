package OOPSConcepts25102023;

abstract class Glass {

	abstract void water();
}
class Cuppp extends Glass {

	void water() {
		System.out.println("In Cup water is coming very less in compare to Glass");
	}
}
public class AbstractConcept001 {
	public static void main(String[] args) {
		Cuppp cp = new Cuppp();
		cp.water();
	}
}
