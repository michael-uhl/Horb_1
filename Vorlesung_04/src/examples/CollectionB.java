package examples;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public interface CollectionB {
	boolean add(Object obj);
	boolean contains(Object obj);
	boolean isEmpty();
	Iterator<String> iterator();
	boolean remove(Object obj);
	boolean addAll(CollectionB c);
	boolean containsAll(CollectionB c);
	boolean removeAll(CollectionB c);
	boolean retainAll(CollectionB c);
	void clear();
	Object[] toArray();
	Object[] toArray(Object[] a);
	Object get(Object key);
	Object put(Object key, Object val);
	 void sort(List list);
	 void sort(List list, Comparator c);
} 
