package generic.runtime.array;

import java.util.NoSuchElementException;

public interface ListIterator<E> {
	boolean hasPrevious();
	E previous();
	int nextIndex();
	int previousIndex();
	void set(E e);
	void add(E e);
}
