package OOPSConcepts19092023;

abstract class Table{
	
	Table(){
		System.out.println("This is constructor and uses in abstarct class");
	}
	abstract void circle();
}
class Chair extends Table{
	void circle(){
		System.out.println("Chair is design by good woods and adding few table");
	}
}
public class AbstractClassConcept11 {

	public static void main(String[] args) {

		Chair ch=new Chair();
		ch.circle();
	}

}
