package p5_abstract;

public abstract class Auto extends Fahrzeug {

	String color;
	double maxSpeed;
	double speed;
	double width;
	static int numberOfWheels = 4;
	
	public Auto(String color, double maxSpeed, double width) {
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.width = width;
	}
	
	public static int getNumberOfWheels() {
		return numberOfWheels;
	}	
	
	public void start() {
		System.out.println("Auto gestartet.");
	}
	
	public void stop() {
		System.out.println("Auto gestoppt.");
	}
	
	public abstract void accelerate();
	
	public abstract void slowDown();
}








