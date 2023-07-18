package OPPSConcepts18072023;


class Shadow{
	
	static void trip(){
		System.out.println("Trip is coming as Free");
	}
	
	static void trip(int x){
		System.out.println("TRip charges is :"+x);
	}
}
public class PolyMorphismConcept10 {

	public static void main(String[] args) {
		Shadow.trip();
		Shadow.trip(50);
	}

}
