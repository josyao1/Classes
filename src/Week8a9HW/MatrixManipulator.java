package Week8a9HW;

/**
 * Offers the specified operations on integer matrices.
 */
public class MatrixManipulator
{
/**
 * Determines if (first + second) is defined where + indicates matrix addition.
 * @return true if matrix addition is defined, false otherwise.
 */
	private static boolean atLeastOneByOne(int[][] matrix)
	{
		return matrix != null && matrix.length > 0 && matrix[0].length > 0;
	}
	
	public static boolean addable(int[][] first, int[][] second) {
		
		return atLeastOneByOne(first) && atLeastOneByOne(second) && first.length == second.length && first[0].length == second[0].length;
	}
	
	/**
	 * Performs (first + second) where + indicates matrix addition. (Precondition: addable(first, second) returns true.)
	 * 
	 * @return the result of first + second.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] add(int[][] first, int[][] second)
	{
		if(!addable(first, second))
		{
		throw new IllegalArgumentException();
		}
	
		int [][] sum = new int[first.length][first[0].length];
	
		for(int r = 0; r < sum.length; r++)
		{
			for(int c = 0; c < sum[0].length; c++)
			{
				sum[r][c] = first[r][c] + second[r][c];
		}
		}
		return sum;
	}
	
	/**
	 * Performs (scalar * matrix) where * indicates scalar multiplication of a matrix. (Precondition: matrix.length > 0 && matrix[0].length > 0)
	 * 
	 * @return the result of scalar * matrix.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] multiplyByScalar(int scalar, int[][] matrix)
	{
		int [][] result = new int[matrix.length][matrix[0].length];
		for(int r = 0; r < result.length; r++) 
		{
			for(int c = 0; c < result[0].length; c++) {
				result[r][c] = matrix[r][c] * scalar;
			}
		}
		return result;
	}
	
	/**
	 * Multiplies the specified row of first and the specified column of second. (Precondition: first[row].length > 0 && first[row].length == second.length)
	 * 
	 * @return the result of multipliying the specified row and column.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int multiply(int[][] first, int row, int[][] second, int col)
	{
		int result = 0;
		for(int i = 0; i < first[0].length; i++)
		{
			result += first[row][i]*second[i][col];
		}
		return result;
		}
	
	/**
	 * Determines if (first * second) is defined where * indicates matrix multiplication.
	 * 
	 * @return true if matrix multiplication is defined, false otherwise.
	 */
	public static boolean multipliable(int[][] first, int[][] second)
	{
		return true; // remove this
	}
	
	/**
	 * Performs (first * second) where * indicates matrix multiplication. (Precondition: multipliable(first, second) returns true.)
	 * 
	 * @return the result of first * second.
	 * @throws IllegalArgumentException
	 *             if the precondition is not met.
	 */
	public static int[][] multiply(int[][] first, int[][] second)
	{
		int[][] result = new int[first.length][second[0].length];
		for(int r = 0; r < result.length; r++) {
	
			for(int c = 0; c < result[0].length; c++) {
					result[r][c] = multiply(first,r,second,c);
			}
	}
		return result;
	
	}
	
	
	}
	
