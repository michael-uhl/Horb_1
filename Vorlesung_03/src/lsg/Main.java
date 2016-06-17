package lsg;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Sorter sorter = new BubbleSort();
		int[] input = { 2, 6, 7, 8, 1, 3, 5 };
		System.out.println(Arrays.toString(sorter.sort(input)));
	}
}
