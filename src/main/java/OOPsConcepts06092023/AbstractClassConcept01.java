package OOPsConcepts06092023;

abstract class Mouse {
	
	Mouse(){
		System.out.println("I am Part of constructor and fall in class of mouse");
	}

	abstract void click();
}
class Keyword extends Mouse {
	void click() {
		System.out.println("Keyword is better then mouse for writting the pointers");
	}

	void blink(){
		System.out.println("blink is the part of other class");
	}
}
public class AbstractClassConcept01 {

	public static void main(String[] args) {
		Keyword kd=new Keyword();
		kd.click();
		kd.blink();
	}

}
