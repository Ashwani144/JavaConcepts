package OPPCConcepts26072023;

class Bigbottle {

	void sweetWater() {
		System.out.println("Big Bottle conains sweet water");
	}

}
class SmallWater extends Bigbottle {
	void lessWater() {
		System.out.println("small Bottle contains triki Water in comapre with Big");
	}
}
public class INheritanceConceptPart2 {
	public static void main(String[] args) {

		SmallWater sw=new SmallWater();
		sw.sweetWater();
		sw.lessWater();
		
	}
}
