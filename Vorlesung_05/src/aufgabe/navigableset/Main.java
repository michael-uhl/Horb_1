package aufgabe.navigableset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		NavigableSet<String> s = new TreeSet<String>();
		
		s.add("b");
		s.add("a");
		s.add("d");
		s.add("c");
		
		Iterator<String> it = s.descendingIterator();
		
		while(it.hasNext()){
		  System.out.println("Value :"+it.next());
		}
	}
}
