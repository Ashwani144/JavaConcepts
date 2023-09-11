package OOPCConcepts11092023;

class Electronic {
	void sound() {
		System.out.println("Electrinic is providing the service of sound");
	}
}
class Mobile extends Electronic {
	void voicee() {
		System.out.println("Voices is coming from good Product");
	}
}
public class InheritanceConcept1109 {

	public static void main(String[] args) {

		Mobile mtt=new Mobile();
		mtt.voicee();
		mtt.sound();
	}

}
