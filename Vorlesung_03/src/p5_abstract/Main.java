package p5_abstract;

public class Main {
	
	public static void main(String[] args) {
		Auto meinNeuesAuto = new Golf("red", 200.0, 4.5);
		meinNeuesAuto.start();
		meinNeuesAuto.accelerate();
		meinNeuesAuto.slowDown();
		meinNeuesAuto.stop();
		
		System.out.println(Auto.getNumberOfWheels());
		
		meinNeuesAuto = new Porsche("red", 200.0, 4.5);
		meinNeuesAuto.start();
		meinNeuesAuto.accelerate();
		meinNeuesAuto.slowDown();
		meinNeuesAuto.stop();
	}	
	
}
