package lsg;

public class BubbleSort2 implements Sorter2 {

	@Override
	public int[] sort(int[] toSort) {
		return bubbleSort(toSort);
	}
	
	private int[] bubbleSort(int[] num) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable

		while (flag) {
			// set flag to false awaiting a possible swap
			flag = false; 
			for (j = 0; j < num.length - 1; j++) {
				// change to > for ascending sort
				if (num[j] < num[j + 1]) {
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
