package examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) throws Exception {
		List v = new LinkedList();
		for (int i = 0; i < 4; i++) {
			Integer x = new Integer(i * i);
			v.add(x);
		}
		for (int i = 0; i < v.size(); i++) {
			Integer x = (Integer) (v.get(i));
			System.out.print(x.intValue());
		} // Gesamtausgabe der Schleife: "0149"
		v.remove(2);
		for (int i = 0; i < v.size(); i++) {
			Integer x = (Integer) (v.get(i));
			System.out.print(x.intValue());
		} // Gesamtausgabe der Schleife: "019"
	}



	
	
}
