package Chapter_8;

public class R8_10 {

	public static void main(String[] args) {
		int[] squares = new int[20];
		for(int i = 0; i < squares.length; i++) {
			squares[i] = i*i;
			for(int j = 0; j < squares.length; j++ )
				System.out.println(squares[j]);
		}
		
	}
	
	//it gets filled with zeros

		
}
