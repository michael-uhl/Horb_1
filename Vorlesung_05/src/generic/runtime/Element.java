package generic.runtime;

public class Element<T> {
	private T value;
	
	public Element(T aValue) {
		value= aValue;
	}
	
	public T getValue() {
		return value;
	}
}
