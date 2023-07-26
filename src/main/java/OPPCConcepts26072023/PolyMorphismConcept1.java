package OPPCConcepts26072023;

class MobileStore{
	
	static void mobileBrand(){
		System.out.println("Mobile Brand is coming with Samsung , Vivo and Iphone");
	}
	
	static void mobileBrand(int x){
		System.out.println("Mobile Brands are price :" +x);
	}
}

public class PolyMorphismConcept1 {

	public static void main(String[] args) {
		MobileStore.mobileBrand();
		MobileStore.mobileBrand(1100);

	}

}
