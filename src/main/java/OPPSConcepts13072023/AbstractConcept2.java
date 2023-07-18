package OPPSConcepts13072023;
// we can not create object of abstract class

abstract class Shine{
	
	Shine(){
		System.out.println("Hello");
	}
	
	abstract void singhshine();
}

class Shadow extends Shine{
	
	void singhshine(){
		System.out.println("Shadow is part of different class and extends method from abstarct Method");
	}	
}
public class AbstractConcept2 {

	public static void main(String[] args) {
		Shadow s=new Shadow();
			s.singhshine();		
	}

}
