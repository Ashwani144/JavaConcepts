package JavaPractise.JavaPractise;

class DadaJi {
	void scootar() {
		System.out.println("HERO");
	}
}

class Papa extends DadaJi {
	void car() {
		System.out.println("BMW");
	}
}

class Son extends Papa {
	void cycle() {
		System.out.println("ATLAS");
	}
}

public class Inheritance_Multilevelconcept {

	public static void main(String[] args) {

		Son s=new Son();
		s.scootar();
		
	}

}
