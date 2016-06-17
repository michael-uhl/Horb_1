package aufgaben;

import java.text.SimpleDateFormat;

public class Falschausgabe {

	public static void main(String... args) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("mm/DD/yyyy");
		System.out.println(formatter.parse("08/16/2011"));

		java.util.List<Double> liste = java.util.Arrays.asList(1.5, 2.3, 3.4, 7.8);
		double summe = 0.0;
		for (double x : liste)
			summe += x;
		System.out.printf("Summe: %6.2f%n", summe);

	}
}
