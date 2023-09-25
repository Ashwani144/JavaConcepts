package OPPSConcept25092023;

class HotelEmployee{
	private String name;
	
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
}
public class EnCapsulationCocept1 {

	public static void main(String[] args) {
		HotelEmployee HEE=new HotelEmployee();
		HEE.setName("Rakesh");
		System.out.println("Name are showing :" + HEE.getName());

	}

}
