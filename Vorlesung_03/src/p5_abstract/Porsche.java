package p5_abstract;

public class Porsche extends Auto {

	Porsche(String color, double maxSpeed, double width) {
		super(color, maxSpeed, width);
	}

	public void accelerate() {
		System.out.println("beschleunige sehr schnell.");
	}

	public void slowDown() {
		System.out.println("bremse.");
	}
}	
