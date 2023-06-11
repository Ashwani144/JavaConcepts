package JavaPractise.JavaPractise;

class First{
	
	static void show(){
		System.out.println("show");
		
	}
	//Staic - I mentioned because we want creat memory at Copile tile 2nd we ca call by class name
	
	static void show(int x){
		System.out.println(x);
		
	}
	
}
public class Polymorphism_Compile {

	public static void main(String[] args) {

		First.show();
		First.show(15);
	}

}
