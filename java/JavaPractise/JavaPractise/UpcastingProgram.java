package JavaPractise.JavaPractise;


class parent{
	void show(){
		System.out.println("Hello I am parent");
	}
	
}

class chield extends parent{
	void show(){
		System.out.println("Hello I am chield");
	}
	
}

public class UpcastingProgram {

	public static void main(String[] args) {
		
		parent p= new chield();   // example of upcasting 
		p.show();
	}
	
}
