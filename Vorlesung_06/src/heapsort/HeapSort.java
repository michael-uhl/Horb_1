package heapsort;

import java.util.Arrays;

public class HeapSort implements Sorter {

	private int[] a;
	
	public static void main(String[] args) {
		int[] a = { 2, 6, 7, 8, 1, 3, 5 };
		System.out.println(Arrays.toString(a));
		Sorter sorter = new HeapSort(a);
		System.out.println(Arrays.toString(sorter.sort(a)));
	}
	
	
	
	public HeapSort(int[] a) {
		this.a = a;
	}


	public int[] sort(int[] toSort) {
		baueHeap();
		for (int i = a.length - 1; i > 0; i--) {
			tausche(0, i);
			heapify(0, i - 1);
		}
		
		return a;
	}

	void heapify(int dieserKnoten, int heapSize) {
		int links = 2 * dieserKnoten;
		int rechts = links + 1;
		if (links <= heapSize && rechts > heapSize) {
			if (a[dieserKnoten] > a[links]) {
				tausche(dieserKnoten, links);
			}
		} else if (rechts <= heapSize) {
			int derSohn = (a[links] < a[rechts] ? links : rechts);
			if (a[dieserKnoten] > a[derSohn]) {
				tausche(dieserKnoten, derSohn);
				heapify(derSohn, heapSize);
			}
		}
	}

	private void tausche(int dieserKnoten, int links) {
		int t = a[dieserKnoten];
		a[dieserKnoten] = a[links];
		a[links] = t;
	}

	public void baueHeap() {
		for (int i = (a.length - 1) / 2; i >= 0; i--) {
			heapify(i, a.length - 1);
		}
	}


	
}
