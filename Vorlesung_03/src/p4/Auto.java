package p4;

public class Auto {

	private String color;
	private double maxSpeed;
	private double speed;
	private double width;
	
	Auto(String color, double maxSpeed, double width) {
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.width = width;
	}
	
	public static void main(String[] args) {
		Auto meinNeuesAuto = new Auto("red", 200.0, 4.5);
		meinNeuesAuto.start();
		meinNeuesAuto.accelerate();
	}	
	
	public void start() {
		System.out.println("Auto gestartet.");
	}
	
	public void stop() {
		System.out.println("Auto gestoppt.");
	}
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	void accelerate() {
		System.out.println("beschleunige...");
	}
	
	void slowDown() {
		System.out.println("bremse...");
	}	
}

