package OPPSConcepts13072023;

class Game{
	
	void sittingPlay(){
		System.out.println("There is many type of Games");
	}	
}

class TableTenis extends Game{
	void standgame(){
		System.out.println("Table Tenis is part of Game");
	}	
}

public class InheritanceConcept2 {

	public static void main(String[] args) {
	
		TableTenis t=new TableTenis();
		t.standgame();
		t.sittingPlay();

	}

}
