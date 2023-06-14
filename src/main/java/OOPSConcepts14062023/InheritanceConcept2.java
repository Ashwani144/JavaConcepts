package OOPSConcepts14062023;

//Method overriding in Java Inheritance
class Animal{
	
	public void eat(){
		System.out.println("I can Eat");
	} 
}

class Dog extends Animal{
	public void eat(){
		System.out.println("I eat dog food");
	}
	
	//new method of sub class 
	
	public void bark(){
		System.out.println("I can bark");
	}
}

public class InheritanceConcept2 {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();

	}

}
