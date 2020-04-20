package Week8a9HW;

public class MatrixManipulatorTester
{
    public static void main(String[] args)
    {
        //testSum();
        //testScalarMultiplication();
        testRowColMultiplication();
        //testMultiplication();
    }
    
	public static void testSum()
	{
	
		int[][] first = new int[][] {{1,2,3,4,5}, {6,7,8,9,10}};
		int[][] second = new int[2][5];
		int counter = 0;
		for(int r = 0; r < second.length; r++)
		{
		for(int c = 0; c < second[0].length; c++)
		{
		second[r][c] = counter;
		counter++;
		}
		}

		// initialize first and second to the size shown in the sample output
		// initialize first and second with the values shown in the sample output

		int[][] sum = MatrixManipulator.add(first, second);

		printMatrix(first);
		System.out.println("+");
		printMatrix(second);
		System.out.println("=");
		printMatrix(sum);
	}

	public static void testScalarMultiplication()
	{
		int[][] matrix = null;
		int scalar = 2;

		// initialize matrix to the size shown in the sample output
		// initialize matrix with the values shown in the sample output

		int[][] scalarProduct = MatrixManipulator.multiplyByScalar(scalar, matrix);

		printMatrix(matrix);
		System.out.println("*");
		System.out.println(scalar);
		System.out.println("=");
		printMatrix(scalarProduct);
	}

	public static void testRowColMultiplication()
	{
		int[][] first = null;
		int[][] second = null;

		// initialize first and second to the sizes shown in the sample output
		// initialize first and second with the values shown in the sample output

		int product = MatrixManipulator.multiply(first, 0, second, 0);
		System.out.println("first:");
		printMatrix(first);
		System.out.println("\nsecond:");
		printMatrix(second);
		System.out.println();
		System.out.println("MatrixManipulator.multiply(first, 0, second, 0): ");
		System.out.println(product);

		product = MatrixManipulator.multiply(first, 0, second, 1);
		System.out.println("\nMatrixManipulator.multiply(first, 0, second, 1): ");
		System.out.println(product);

		product = MatrixManipulator.multiply(first, 1, second, 0);
		System.out.println("\nMatrixManipulator.multiply(first, 1, second, 0): ");
		System.out.println(product);

		product = MatrixManipulator.multiply(first, 1, second, 1);
		System.out.println("\nMatrixManipulator.multiply(first, 1, second, 1): ");
		System.out.println(product);
	}

	public static void testMultiplication()
	{
		int[][] first = null;
		int[][] second = null;

		// initialize first and second to the sizes shown in the sample output
		// initialize first and second with the values shown in the sample output

		int[][] product = MatrixManipulator.multiply(first, second);

		printMatrix(first);
		System.out.println("*");
		printMatrix(second);
		System.out.println("=");
		printMatrix(product);
	}

	private static void printMatrix(int[][] matrix)
	{
		if (matrix != null)
			for (int row = 0; row < matrix.length; row++)
				System.out.println(java.util.Arrays.toString(matrix[row]));
		else
			System.out.println("null");
	}}