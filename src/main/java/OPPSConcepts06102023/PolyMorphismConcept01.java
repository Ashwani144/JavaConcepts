package OPPSConcepts06102023;

class VoterList{
	
	static void age(){
		System.out.println("Age are showing into the VoterList");
	}
	
	static void age(int age){
		System.out.println("Age are showing into the VoterList:"+age);
	}
}
public class PolyMorphismConcept01 {

	public static void main(String[] args) {
		VoterList.age();
		VoterList.age(18);
	}

}
