package OPPSConcepts13072023;

interface Water{
	void typeOfWater();
}

class Economical implements Water{
	public void typeOfWater(){
		System.out.println("Economical Water rate is :"+ 20);
	}
} 

class Businessclass implements Water{
	public void typeOfWater(){
		System.out.println("Businessclass Water rate is :"+ 100);
	}
} 

public class PolyMorphismConcept2 {

	public static void main(String[] args) {
		Economical e=new Economical();
		e.typeOfWater();
		
		Businessclass bc=new Businessclass();
		bc.typeOfWater();
	}
}
