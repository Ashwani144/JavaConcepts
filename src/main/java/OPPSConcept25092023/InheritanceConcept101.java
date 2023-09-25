package OPPSConcept25092023;

class Parent {

	void talented() {
		System.out.println("Parent has quality of talaented in term of Smart work");
	}
}
class Child extends Parent {
	void shine() {
		System.out.println("Child are also shining in term of smart personality");
	}
}
public class InheritanceConcept101 {

	public static void main(String[] args) {
		Child cll = new Child();
		cll.shine();
		cll.talented();
	}

}
