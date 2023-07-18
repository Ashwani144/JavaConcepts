package OPPSConcepts18072023;

class Mobile {

	void sound() {
		System.out.println("Mobile sound is coming fine ");
	}
}

class Samsung extends Mobile {
	void speakar() {
		System.out.println("Samsung Mobile voice is coming clear");
	}

}

public class InheritanceConcept10 {

	public static void main(String[] args) {

		Samsung s= new Samsung();
		s.speakar();
		s.sound();
	}

}
