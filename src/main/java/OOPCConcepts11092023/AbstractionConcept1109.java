package OOPCConcepts11092023;

abstract class Track{
	
	 abstract void line();
}

class OneLineTrack extends Track{
	void line(){
		System.out.println("One Line Track is facing some type of Issue");
	}
	
	void sink(){
		System.out.println("Hello I am 2nd");
	}
}
public class AbstractionConcept1109 {

	public static void main(String[] args) {
		OneLineTrack ott=new OneLineTrack();
		ott.line();
		ott.sink();
	
	}

}
