package NewPractise_Java;


class Meta{
	
	void DataScienc(){
		System.out.println("I Know Data Sceience as parent");
	}
	
}
class Google extends Meta{
	
	void Automation(){
		System.out.println("I know Automation as chield");
	}
}

public class InheritancePart1 {

	public static void main(String[] args) {

		Google g=new Google();
		g.Automation();
	//	g.DataScienc();
		
		
	}

}
