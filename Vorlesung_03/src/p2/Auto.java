package p2;

import p3.Golf;

public class Auto {

	private String color;
	double maxSpeed;
	double speed;
	double width;
	
	Auto(String color, double maxSpeed, double width) {
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.width = width;
	}
	
	public static void main(String[] args) {
		Auto meinNeuesAuto = new Auto("red", 200.0, 4.5);
		Golf g = new Golf("ff", 5.0);
		meinNeuesAuto.start();
		int rate = 5;
		meinNeuesAuto.accelerate(rate);
		System.out.println(rate);
		meinNeuesAuto.slowDown();
	}	
	
	void start() {
		System.out.println("Auto gestartet.");
	}
	
	void stop() {
		color = "a";
		System.out.println("Auto gestoppt.");
	}
	
	private void accelerate(double endGeschw) {
		System.out.println("beschleunige...");
	}
	
	void accelerate(int rate) {
		System.out.println("beschleunige..Integer Fall. " + rate );
		rate =6;
	}	
	
	void slowDown() {
		System.out.println("bremse..." + color);
	}	
}

