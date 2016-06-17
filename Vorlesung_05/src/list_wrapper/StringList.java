package list_wrapper;

import java.util.ArrayList;
import java.util.List;

public class StringList {

	List internal = new ArrayList();
	
	public int size() {
		return internal.size();
	}
	
	public boolean add(String toAdd) {
		return internal.add(toAdd);
	}
	
	public String get(int index) {
		return (String) internal.get(index);
	}
}
