package sortedset;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() == o2.length()) {
			return 0;
		} else if (o1.length() > o2.length()) {
			return 1;
		}
		return -1;
	}

}
