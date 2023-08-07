package OOPsConcepts07082023;

class School{
	
	static void fee (){
		System.out.println("Govermenet school fee are Free");
	} 
	
	static void fee(int x){
		System.out.println("Private School fee is costlt : 12");
	}
}
public class PolyMorphismConcept11 {

	public static void main(String[] args) {

		School.fee();
		School.fee(12);
	}

}
