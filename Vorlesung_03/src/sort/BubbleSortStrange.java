package sort;

import java.util.Arrays;

public class BubbleSortStrange {
	public static void main(String[] args) {
		int[] unsortedList = { 2, 15, 7, 23, 4, 1, 0, 6, 2, 19, 17, 3 };
		System.out.println(Arrays.toString(unsortedList));
		System.out.println(Arrays.toString(bubblesort(unsortedList)));
	}

	public static int[] bubblesort(int[] liste) {
		int temp;
		for (int i = 0; i < liste.length - 1; i++) {
			if (liste[i + 1] < liste[i]) {
				temp = liste[i + 1];
				liste[i + 1] = liste[i];
				liste[i] = temp;
				i = -1;
			}
		}
		return liste;
	}
}
