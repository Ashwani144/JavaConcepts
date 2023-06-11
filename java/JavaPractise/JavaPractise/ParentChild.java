package JavaPractise.JavaPractise;

class Parentt{
	int x=10;
	public void show(){
		System.out.println("parent-show");
	}
	
	public void onlyparentshow(){
		System.out.println("only-parent-show");
	}	
}

class Child extends Parentt{
	int x=20;
	public void show(){
		System.out.println("Chield - show");
	}
	
	public void onlychildshow(){
		System.out.println("only-child-show");	
	}
	
}
public class ParentChild {

	public static void main(String[] args) 
	{
		Parentt p=new Child();
		p.show();
		p.onlyparentshow();
		System.out.println(p.x);
		
	}
	
}



