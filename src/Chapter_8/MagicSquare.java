package Chapter_8;

public class MagicSquare {

	public static void main(String[] args) {
		 int[][] magicSquare = new int[][]{
	            {16, 3, 2, 13},
	            {5, 10, 11, 8},
	            {9, 6, 7, 12},
	            {4, 15, 14, 1}
	        };	
	        
	      System.out.println(isMagic(magicSquare));
	      System.out.println(4%-2);
	}
	
	
	public static boolean isMagic(int[][] square) {
		int result = sumRow(square, 0);
		
		for(int i = 0; i < square.length; i++) {
			if(sumRow(square, i) != result)	
				return false;
			if(sumCol(square, i) != result)
				return false;
		}
		
		if(sumDiagL2R(square) != result)
			return false;
		
		if(sumDiagR2L(square) != result)
			return false;
			
		return true;
		
		
	}
	
	public static int sumRow(int[][] square, int rowIndex) {
		int sum = 0;
		for(int c = 0; c < square[rowIndex].length; c++) {
			sum += square[rowIndex][c];
		}
		return sum;
	}
	
	public static int sumCol(int[][] square, int colIndex) {
		int sum = 0;
		for(int r = 0; r < square.length; r++) {
			sum += square[r][colIndex];
		}
		return sum;
	}
	
	public static int sumDiagL2R(int[][] square) {
		int sum = 0;
		for(int i = 0; i < square.length; i++) {
			sum += square[i][i];
		}
		return sum;
	}
	
	public static int sumDiagR2L(int [][] square) {
		int sum = 0;
		for(int i = 0; i < square.length; i++) {
			sum += square[square.length - i - 1][i];
		}
		return sum;
	}

}
