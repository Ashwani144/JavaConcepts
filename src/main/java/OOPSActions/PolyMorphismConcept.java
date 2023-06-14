package OOPSActions;

class First{
	
	static void show(){
		System.out.println("Show");
	}
	
	static void show(int x){
		System.out.println(x);
	}
	
}

public class PolyMorphismConcept {

	public static void main(String[] args) {
		First.show();
		First.show(10);
		
	}

}
