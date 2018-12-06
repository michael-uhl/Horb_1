package sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		// Array mit Beispielzahlen
		int[] list = { 2, 6, 7, 8, 1, 3, 5 };
		// Groesse initialisieren
		int size = list.length;
		// BubbleSort verbesserter Algorithmus
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				// falls Vorgaenger > Nachfolger -> switchen
				if (list[j] > list[j + 1]) {
					int tmp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(list));
	}

	public static int[] bubbleSort(int[] num) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) // change to > for ascending sort
				{
					temp = num[j]; // swap elements
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
		
		return num;
	}
}
