package OPPSConcepts03072023;

abstract class Tiger{
	
	Tiger(){
		System.out.println("Tiger is sher of Jungle");
	}
	
	abstract void crods();
}

class Lion extends Tiger{
	
	void crods(){
		System.out.println("Lion is king of Jungle");
	}
	
}
public class AbstractConcept1 {

	public static void main(String[] args) {

		Lion l=new Lion();
		l.crods();
	}

}
