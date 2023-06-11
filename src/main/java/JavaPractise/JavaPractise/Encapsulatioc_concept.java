package JavaPractise.JavaPractise;


class Employee{
	
	private String name;
	
	public void setName(String name){
	this.name=name;
	}
	
	public String getName(){
		return name;
	}
}

public class Encapsulatioc_concept {

	public static void main(String[] args) {

		Employee e=new Employee();
		e.setName("Ashwani");
		
		System.out.println("Name of Empolyee :"+e.getName());
		
	}

}
