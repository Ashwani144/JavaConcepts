package JavaPractise.JavaPractise;



	class Parent
	{
		void bike(){
		System.out.println("Hero");
	}
	}
	class Chield extends Parent {
		void cycle(){
			System.out.println("Atlas");
		}
		
	}
	
	public class InHeritanceDemo {
	
	public static void main(String[] args) {

		Chield c=new Chield();
		c.bike();
		c.cycle();
	}

}
