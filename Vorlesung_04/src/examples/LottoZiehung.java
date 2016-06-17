package examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LottoZiehung {
	public static void main(String[] args) {
		Set<Integer> zahlen = new TreeSet<Integer>();
		// Lottozahlen erzeugen
		while (zahlen.size() < 6) {
			int num = get_1_aus_49();
			if (zahlen.add(new Integer(num))) {
				System.out.println("Neue Zahl " + num);
			} else {
				System.out.println("Doppelte Zahl " + num);
			}
		}
		
		// Lottozahlen ausgeben
		System.out.println(zahlen);
	}
	
	private static int get_1_aus_49() {
		return (int) (Math.random() * 49) + 1;
	}
}