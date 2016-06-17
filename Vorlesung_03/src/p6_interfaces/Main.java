package p6_interfaces;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		Auto meinNeuesAuto = new Golf("red", 200.0, 4.5);
		meinNeuesAuto.start();
		meinNeuesAuto.accelerate();
		meinNeuesAuto.slowDown();
		meinNeuesAuto.stop();
		
		meinNeuesAuto = new Porsche("red", 200.0, 4.5);
		meinNeuesAuto.start();
		meinNeuesAuto.accelerate();
		meinNeuesAuto.slowDown();
		meinNeuesAuto.stop();

	}	
	

	
}
