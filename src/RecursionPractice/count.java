package RecursionPractice;

public class count {
	
	public static void main(String[] args) {
	}
	
	public static int count(int[] values, int max) {
		return count(values,max,0);
	}
	
	private static int count(int[] values, int max, int index) {
		
		if(index >= values.length)
			return 0;
		
		if(values[index] <= max) {
			return 1 + count(values, max, index+1);
		}
		else
			return count(values, max, index+1);
	}


}
