package OOPSConcepts23062023;

class Teacher{
	
	static void show(){
		System.out.println("I am Teacher of Part1");
	} 
	
	static void show(int x){
		System.out.println("I am student of part1");
	}
	
}


public class PolymorphismConcept1 {

	public static void main(String[] args) {
		Teacher.show();
		Teacher.show(10);
	}

}
