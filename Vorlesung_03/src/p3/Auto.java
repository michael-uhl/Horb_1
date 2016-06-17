package p3;

import p3.unterpacket.Other;



 public class Auto {

	String color;
	double maxSpeed;
	double speed;
	double width;
	
	
	final static int NUMBER_OF_WHEELS = 4;
	
	
	Auto(String color, double maxSpeed, double width) {
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.width = width;

	}
	
	
	public static void main(String[] args) {
		
		Auto meinNeuesAuto = new Golf("red", 4.5);
		meinNeuesAuto.start();
		meinNeuesAuto.accelerate();
		meinNeuesAuto.slowDown();
		meinNeuesAuto.stop();
		

	}	
	
	void start() {
		System.out.println("Auto gestartet.");
	}
	
	void stop() {
		System.out.println("Auto gestoppt.");
	}
	
	  void  accelerate() {
		System.out.println("beschleunige...");
	}
	
	void slowDown() {
		System.out.println("bremse...");
	}	
}

