package SortingSearching;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String arg[]) {
		int[] vals = {71, 86, 79, 36, 78, 35, 75, 86, 24, 11};
		sort(vals);
		System.out.println(Arrays.toString(vals));
		
	}
	
	public static void sort(int[] arr) {

		
		for(int i = 0; i < arr.length - 1; i++) {
			
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex])
					minIndex = j;
					
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
	}
}
