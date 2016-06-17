package a06_quicksort;

import java.util.Arrays;

public class QuicksortComplicated {
	private int[] numbers;
	private int number;
	
	public static void main(String[] args) {
		int[] a = { 2, 6, 7, 8, 1, 3, 5 };
		System.out.println(Arrays.toString(a));
		QuicksortComplicated sorter = new QuicksortComplicated(a);
		sorter.sort();
		System.out.println(Arrays.toString(sorter.getNumbers()));
	}
	
	public QuicksortComplicated(int[] numbers) {
		this.numbers = numbers;
	}



	public void sort() {
		number = numbers.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high - low) / 2];
	
		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (numbers[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (numbers[j] > pivot) {
				j--;
			}
	
			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public int[] getNumbers() {
		return numbers;
	}
	
	
}