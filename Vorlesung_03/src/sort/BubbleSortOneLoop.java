package sort;

import java.util.Arrays;

public class BubbleSortOneLoop {
	public static void main(String[] args) {
		//int[] list = { 2, 6, 7, 8, 1, 3, 5 };
		int[] list = { 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(list));
		bubbleSort(list);
		System.out.println(Arrays.toString(list));
	}

	private static void bubbleSort(int[] list) {
		int n = list.length - 1;
		for (int i = 0; i < n * n; i++) {
			if (list[i % n] > list[(i % n) + 1]) {
				int h = list[i % n];
				list[i % n] = list[(i % n) + 1];
				list[(i % n) + 1] = h;
			}
		}
	}
}
