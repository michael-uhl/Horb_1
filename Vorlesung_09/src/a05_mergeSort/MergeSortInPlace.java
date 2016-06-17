package a05_mergeSort;

import java.util.Arrays;

class MergeSortInPlace
{
    public static void main(String[] args) {
    	MergeSortInPlace sort = new MergeSortInPlace();
        int[] a = {8, 7, 9, 1, 3, 4};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(sort.sort(a)));
    }
    
    public int[] sort(int[] arr) {
        // Preconditions
        if (arr == null || arr.length == 0) {
            return arr;
        }
        return merge(arr, 0, arr.length - 1);
    }


    private int[] merge(int[] arr, int lower, int upper) {
        if (lower == upper) {
            return arr;
        }
        
        int mid = (lower + upper) >> 1;
        merge(arr, lower, mid); 
        merge(arr, mid + 1, upper);
        
        return mergeArrays(arr, lower, mid + 1, upper + 1);
    }

    private int[] mergeArrays(int[] arr, int lower, int mid, int upper) {
        int temp = mid;
        int i = 0;
        while (lower < temp && mid < upper){
            if (arr[lower] < arr[mid]) {
                lower++;
            }
            else {
                swap(arr, mid, lower);
                mid++;
            }
            i++;
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}

