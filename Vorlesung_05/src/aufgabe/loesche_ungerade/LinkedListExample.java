package aufgabe.loesche_ungerade;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String args[]) {

			System.out.println(beispiel().size());

		
		//Your code goes here.
	}

	private static List<Integer> beispiel()  {
	
			List<Integer> zahlen = new LinkedList<Integer>();
			zahlen.add(5);
			zahlen.add(74);  
			zahlen.add(58);
			zahlen.add(87); 
			zahlen.add(37);
			zahlen.add(4); 
			zahlen.add(35);
			
			System.out.println(zahlen.getClass());
			System.out.println(zahlen instanceof List);
			System.out.println(zahlen instanceof LinkedList);
			System.out.println(zahlen instanceof ArrayList);
		
			zahlen.add(22);

			return zahlen;


	}

}
