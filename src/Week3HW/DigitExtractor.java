package Week3HW;


public class DigitExtractor {
	
	private int number;
	
	public DigitExtractor(int x) {
		number = x;
	}
	
	public int nextDigit() {
		int test = 0;
		if(number != 0) {
			test = number % 10;
			number /= 10;
		}
		
		else {
			System.out.println("No more digits remaining");
		}
		
		return test;
	}
	
	public static void main(String[] args) {
//		DigitExtractor myExtractor = new DigitExtractor(12345);
//		System.out.println(myExtractor.nextDigit()); 
//		System.out.println(myExtractor.nextDigit()); 
//		System.out.println(myExtractor.nextDigit());
//		System.out.println(myExtractor.nextDigit()); 
//		System.out.println(myExtractor.nextDigit()); 
		int[][] expectedResult = new int[][]{
            {10, 9, 8, 7},
            {2, 1, -1, 0},
            {6, 5, 4, 3}
        };
        
        System.out.println(expectedResult[0][2]);
		



		
	}

}
