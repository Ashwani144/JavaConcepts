package JavaPractise.JavaPractise;

interface Bank{
	
	void rateOfInterest();
}

class SBI implements Bank{
	public void rateOfInterest(){
		System.out.println("SBI bank of interest 8% ");
	}
}

class BOI implements Bank{
	public void rateOfInterest(){
		System.out.println("BOI bank of interest 11% ");
	}
}


public class Polymorphism_RunTime {

	public static void main(String[] args) {
		Bank b=new SBI();
		Bank b1=new BOI();
		b.rateOfInterest();
		b1.rateOfInterest();
	}

}
