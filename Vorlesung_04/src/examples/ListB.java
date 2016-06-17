package examples;

import java.util.Comparator;
import java.util.SortedSet;

public interface ListB extends CollectionB {
	Object get(int i);
	Object set(int i, Object o);
	int indexOf(Object o);
	void add(int i, Object o);
	Object remove(int i);
	public int compareTo(Object o);
	public int compare(Object o1, Object o2);
	Comparator comparator();
	Object first();
	Object last();
	SortedSet headSet(Object o);
	SortedSet tailSet(Object o);
	SortedSet subSet(Object o1, Object o2);
	
}
