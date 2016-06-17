package p3;

public class Porsche extends Auto {

	Porsche(String color, double maxSpeed, double width) {
		super(color, maxSpeed, width);
		accelerate();
	}

	@Override
	void accelerate() {
		System.out.println("beschleunige sehr schnell.");
	}
	
	public void telefoniere() {
		
	}

	
}
