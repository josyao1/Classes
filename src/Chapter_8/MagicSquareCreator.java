package Chapter_8;

import java.util.Arrays;

public class MagicSquareCreator {
	
	public static void main(String[] args) {
		int[][]square = makeMagicSquare(5);
		for (int[] row : square) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	public static int[][] makeMagicSquare(int n){
		int[][] square = new int[n][n];
		int r = n-1;
		int c = n/2;
		int prevrow = 0;
		int prevcol = 0;
		square[r][c] = 1;
		for(int val = 2; val <= n*n; val++ ) {
			r += 1;
			c += 1;
			r = r%n;
			c = c%n;
			
			if(square[r][c] == 0) {
				square[r][c] = val;
				prevrow = r;
				prevcol = c;
			}
			else {
				r = prevrow - 1;
				c = prevcol;
				square[r][c] = val;
				
			}	

		}
		
		return square;
	}
	

}