package OOPSConcept24112023;

class Show{
	
	public void rate(){
		System.out.println("School fee are showing free into the system");
	}
	
	public void rate(int x){
		System.out.println("School fee are showing free into the system:"+120.00);
	}
}
public class PolyMorphismConcept01 {

	public static void main(String[] args) {
		Show shh=new Show();
		shh.rate();
		shh.rate(200);

	}

}
