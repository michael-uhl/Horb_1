import java.util.Arrays;


public class FindMax {
	public static void main(String[] args) {
		int[] unsortedList = {4, 8, 99, 136, 42, 3, 7};
		findMax(unsortedList);
	}
	
	public static int findMax(int[] anUnsortedList) {
		System.out.println(Arrays.toString(anUnsortedList));
		
		int max = 0;
		
		for(int i = 0; i < anUnsortedList.length; i++) {
			if (anUnsortedList[i] > max)  {
				max = anUnsortedList[i] ;
			}
		}
		
		Arrays.sort(anUnsortedList);
		return anUnsortedList[anUnsortedList.length - 1];
	}
}
