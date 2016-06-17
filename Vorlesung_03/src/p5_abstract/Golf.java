package p5_abstract;


public class Golf extends Auto {

	Golf(String color, double maxSpeed, double width) {
		super(color, maxSpeed, width);
	}

	@Override
	public void accelerate() {
		System.out.println("beschleunige.");
		Auto a = new Golf("f", 4.3, 5.0);
		
	}

	@Override
	public void slowDown() {
		System.out.println("bremse.");
	}	
}
