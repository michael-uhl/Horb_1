package examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		List<? extends Comparable<?>> example = new LinkedList<String>();
		Comparable<?> c = example.get(0);
		//example.add((Comparable<String>)"lfajdfklds");
		c.compareTo(null);
		
		/*
		example.add(null);
		example.add("1");
		example.add("2");
		example.add("3");
		example.add("4");
		example.add("5");
		System.out.println(example.get(0));
		List<String> subList = example.subList(0, 3);
		System.out.println(subList.size());
		subList.set(0, "A");
		subList.set(2, "C");
		System.out.println(example);
		*/
	}

}
