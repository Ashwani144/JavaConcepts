package OOPsConcepts06092023;

interface City {

	void shine();
}
class BigDistrict implements City {
	public void shine() {
		System.out.println("Hello I am part of interface 1st class:" + 2000);
	}
}
class SmallDistrict implements City {
	public void shine() {
		System.out.println("Hello I am part of interface 2nd class:" + 12500);
	}
}
public class PolyMorphismConcept02 {

	public static void main(String[] args) {
		BigDistrict bd = new BigDistrict();
		bd.shine();

		SmallDistrict sd = new SmallDistrict();
		sd.shine();
	}

}
