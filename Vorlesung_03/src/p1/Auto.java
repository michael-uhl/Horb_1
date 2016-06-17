package p1;

public class Auto {

	String color;
	double maxSpeed;
	double speed = 1.45;
	double width;
	static byte numberOfWheels;
	
	Auto() {
		width = 5.5;
	}
	
	Auto(double width) {
		this.width = width;
	}
		 
	void start() {
		System.out.println("Auto gestartet.");
	}
	
	void start(int a) {
		System.out.println("Auto gestartet.");
	}	
	
	void stop() {
		System.out.println("Auto gestoppt.");
	}
	
	void accelerate() {
		System.out.println("beschleunige...");
	}
	
	void slowDown() {
		System.out.println("bremse...");
	}
	
	static byte getNumberOfWheels() {
		return 4;
	}
	
	public static void main(String[] args) {
		Auto meinNeuesAuto = new Auto(5.1);
		meinNeuesAuto.maxSpeed = 200.0;
		meinNeuesAuto.width = 4.5;
		Auto.numberOfWheels = 4;
		meinNeuesAuto.start();
		meinNeuesAuto.accelerate();
		System.out.println(Auto.getNumberOfWheels());
	}	
}
