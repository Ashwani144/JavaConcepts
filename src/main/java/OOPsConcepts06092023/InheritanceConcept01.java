package OOPsConcepts06092023;

class Mobile {
	void sound() {
		System.out.println("Hello I am Branded mobile");
	}
}
class Samsung extends Mobile {
	void Price() {
		System.out.println("Samsung Mobile is Price is higher than other mobile set");
	}
}
public class InheritanceConcept01 {

	public static void main(String[] args) {

		Samsung st = new Samsung();
		st.sound();
		st.Price();
	}
}
