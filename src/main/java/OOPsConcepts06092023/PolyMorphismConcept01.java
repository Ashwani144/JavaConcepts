package OOPsConcepts06092023;

class Mark{
	
	static void shonwn(){
		System.out.println("Hello I am showin with default constructor");
	}
	
	static void shonwn(int x){
		System.out.println("Hello I am Paid constrictor :"+x);
	}
}
public class PolyMorphismConcept01 {

	public static void main(String[] args) {
	
		Mark.shonwn();
		Mark.shonwn(20);
	}

}
