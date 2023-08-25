package Java_Basic;

class DemoofShoes {

	void nice() {

		System.out.println("Hello I am Nice");
	}

	void nice(int x) {
		this.nice(10, 20);
		System.out.println("I am single Parameter");
	}

	void nice(int x, int y) {
		System.out.println("I am double Parameter");
	}
}

public class ThisKeywordConcept {

	public static void main(String[] args) {

		DemoofShoes ds = new DemoofShoes();
		ds.nice(5);

	}

}
