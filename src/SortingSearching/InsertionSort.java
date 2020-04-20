package SortingSearching;


public class InsertionSort {

	public static void sort(int[] x) {
		
		sort(x, 1);
		
	}
	  // recursive variant sorts x[start] ... x[x.length - 1]
	private static void sort(int[] x, int start) {
		
		if(start == x.length) {
			return;
		}
		
		insert(x, x[start], start);
		sort(x, start+1);
		
	}

	// inserts value into correct position in x[0]...x[start]
	private static void insert(int[] x, int value, int start) {
		
		if(start == 0 || value >= x[start-1]) {
			x[start] = value;
			return;
		}
		
		x[start] = x[start-1];
		insert(x, value, start-1);
		
	}
	 

	
}
