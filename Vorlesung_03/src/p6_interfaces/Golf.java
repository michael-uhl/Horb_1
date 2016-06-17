package p6_interfaces;

import java.io.Serializable;

public class Golf implements Auto, Serializable {
	
	private String name;
	
	Golf(String color, double maxSpeed, double width) {
		//...
	}

	public void start() {
		System.out.println("Auto gestartet.");
	}
	
	public void stop() {
		System.out.println("Auto gestoppt.");
	}

	public void accelerate() {
		System.out.println("beschleunige.");	
	}

	public void slowDown() {
		System.out.println("bremse.");	
	}

}
