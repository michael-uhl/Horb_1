package a06_quicksort;

import java.util.Arrays;

public class Quicksort {
	private int[] a;
	
	public Quicksort(int[] anArray) {
		a = anArray;
	}
	public static void main(String[] args) {
		int[] a = { 2, 6, 7, 8, 1, 3, 5 };
		System.out.println(Arrays.toString(a));
		Quicksort sorter = new Quicksort(a);
		sorter.sort();
		System.out.println(Arrays.toString(sorter.getSorted()));
	}
	
	/**
	 * Sorts the array managed by this sorter
	 */
	public void sort() {
		sort(0, a.length - 1);
	}

	public void sort(int low, int high) {
		if (low >= high)
			return;
		int p = partition(low, high);
		sort(low, p);
		sort(p + 1, high);
	}

	private int partition(int low, int high) {
		// First element
		//int pivot = a[low];

		// Middle element
		// int middle = (low + high) / 2;
		// int pivot = a[middle];

		// Median of three - sort low, middle, and high
		int middle = (low + high) / 2;
		if (a[middle] < a[low])
			swap(low, middle);
		if (a[high] < a[low])
			swap(low, high);
		if (a[high] < a[middle])
			swap(middle, high);
		int pivot = a[middle];
		
		int i = low - 1;
		int j = high + 1;
		while (i < j) {
			i++;
			while (a[i] < pivot)
				i++;
			j--;
			while (a[j] > pivot)
				j--;
			if (i < j)
				swap(i, j);
		}
		return j;
	}

	/**
	 * Swaps two entries of the array.
	 * 
	 * @param i
	 *            the first position to swap
	 * @param j
	 *            the second position to swap
	 */
	private void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public int[] getSorted() {
		return a;
	}
	
}