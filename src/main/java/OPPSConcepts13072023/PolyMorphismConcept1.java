package OPPSConcepts13072023;

class Glass{
	
	void withoutWater(){
		System.out.println("In Glass, There is no water");
	}
	
	void withoutWater(int x){
		System.out.println("In Glass , There is more water with Price of 10 for full :" +x);
	}
}
public class PolyMorphismConcept1 {

	public static void main(String[] args) {
		
		Glass g=new Glass();
		g.withoutWater();
		g.withoutWater(20);
	}

}
