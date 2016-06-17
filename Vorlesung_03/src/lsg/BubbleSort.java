package lsg;

public class BubbleSort implements Sorter {

	@Override
	public int[] sort(int[] toSort) {
		// Gr��e initialisieren
		int size = toSort.length;
		// BubbleSort � verbesserter Algorithmus
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				// falls Vorg�nger > Nachfolger -> switchen
				if (toSort[j] > toSort[j + 1]) {
					int tmp = toSort[j + 1];
					toSort[j + 1] = toSort[j];
					toSort[j] = tmp;
				}
			}
		}
		return toSort;
	}

}
