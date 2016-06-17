package p3;

public class Golf extends Auto {


	public Golf(String color, double width) {
		super(color, 200.0, width);
	}	
	
	public void accelerate() {
		super.accelerate();
		System.out.println("Beschleunige wie ein Golf.");
	}
}
