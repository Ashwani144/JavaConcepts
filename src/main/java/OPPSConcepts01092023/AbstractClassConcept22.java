package OPPSConcepts01092023;

abstract class Tree{
	
	abstract void plant();
}
class SmallTress extends Tree{
	
	void plant(){
		System.out.println("Plant is life of water and In this smallTRess");
	}	
}
public class AbstractClassConcept22 {

	public static void main(String[] args) {

		SmallTress st=new SmallTress();
		st.plant();
	}

}
