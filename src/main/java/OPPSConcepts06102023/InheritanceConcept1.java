package OPPSConcepts06102023;

class Pen{
	void colour(){
		System.out.println("Pen colur are showing good in term of black");
	}
}
class BallPen extends Pen{
	
	void wrtite(){
		System.out.println("BallPen is writting better approach and better quality of line ");
	}	
}
public class InheritanceConcept1 {

	public static void main(String[] args) {

		BallPen bp=new BallPen();
		bp.wrtite();
		bp.colour();
	}

}
