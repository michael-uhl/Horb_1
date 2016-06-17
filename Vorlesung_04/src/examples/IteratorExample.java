package examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> exampleStrings = new ArrayList<String>();
		exampleStrings.add("afjalda");
		exampleStrings.add("afzzz");
		
		Iterator<String> exampleStringsIterator = exampleStrings.listIterator();
		
		while(exampleStringsIterator.hasNext()) {
			System.out.println(exampleStringsIterator.next());
		}
	}

}
