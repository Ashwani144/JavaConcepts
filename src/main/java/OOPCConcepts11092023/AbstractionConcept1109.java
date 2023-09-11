package OOPCConcepts11092023;

abstract class Track{
	
	Track(){
		
		System.out.println("Track is showing one way and both way");
	}
	abstract void line();
}

class OneLineTrack extends Track{
	void line(){
		System.out.println("One Line Track is facing some type of Issue");
	}
}
public class AbstractionConcept1109 {

	public static void main(String[] args) {
		OneLineTrack ott=new OneLineTrack();
		ott.line();
	
	}

}
