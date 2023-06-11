package JavaPractise.JavaPractise;

public class Bottle_ConstructorConcept {
	
	String color;
	int price;
	double vol;
	String brand;

	public static void main(String[] args) {

		Bottle_ConstructorConcept bc=new Bottle_ConstructorConcept();
		bc.color="Blue";
		bc.price=15;
		bc.vol=1.0;
		bc.brand="PearlPel";
		
		System.out.println("color :" +bc.color);
		System.out.println("volume :" +bc.vol);
		System.out.println("Brand :" +bc.brand);
		System.out.println("Price :" +bc.price);
		
	}

}
