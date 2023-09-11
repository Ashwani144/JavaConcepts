package OOPCConcepts11092023;

class MotarCycle{
	
	static void cake(){
		System.out.println("cake is coming with good Product");
	}
	static void cake(int x){
		System.out.println("cake is coming with good Price:"+x);
	}
	
}
public class PolyMorphismConcept1109 {

	public static void main(String[] args) {
		MotarCycle.cake();
		MotarCycle.cake(100);
	}

}
