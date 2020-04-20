package Chapter_8;

public class R8_6 {
	
	public static void main(String[] args) {
	double max = 0; // Contains an error! 
	int[] values = new int[] {5,5,3,2,1};
	for (int x : values) {
		if (x > max) 
		  max = x;
	}
	System.out.println(max);
	}
	

	
}
