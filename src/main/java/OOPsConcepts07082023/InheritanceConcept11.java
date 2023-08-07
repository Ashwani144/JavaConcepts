package OOPsConcepts07082023;

class Fruits {

	void sweet() {
		System.out.println("Fruits are sweet and healthy");
	}

}
class Mango extends Fruits {
	
	void lesssweet(){
		System.out.println("mango is Part of Fruits in compare to Boundle of ");
	}
	
}
public class InheritanceConcept11 {

	public static void main(String[] args) {

		Mango ft=new Mango();
		ft.sweet();
		ft.lesssweet();
		
	}

}
