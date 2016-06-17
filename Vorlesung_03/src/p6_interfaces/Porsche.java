package p6_interfaces;

public class Porsche implements Auto {

	public Porsche(String color, double maxSpeed, double width) {
		//...
	}
	
	public void start() {
		System.out.println("Auto gestartet.");
	}
	
	public void stop() {
		System.out.println("Auto gestoppt.");
	}

	
	public void accelerate() {
		System.out.println("beschleunige sehr schnell.");	
	}

	public void slowDown() {
		System.out.println("bremse.");	
	}

}
