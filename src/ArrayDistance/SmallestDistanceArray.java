package ArrayDistance;

public class SmallestDistanceArray
{
	/*
	 * Returns the smallest distance between num1 and num2.
	 * If num1 and num2 are adjacent, returns 0. If num1 or
	 * num2 is not present in arr, returns -1.
	 */
	public static int smallestDistance(int[] arr, int num1, int num2)
	{
		int locnum1 = -1;
		int locnum2 = -1;
		int minDistance = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num1)
				locnum1 = i;
			else if(arr[i] == num2)
				locnum2 = i;
			
			if(locnum1 != -1 && locnum2 != -1) {
				if(Math.abs(locnum1-locnum2)-1 < minDistance || minDistance == -1) {
					minDistance = Math.abs(locnum1-locnum2)-1;
				}
			}
		}
		
		return minDistance;
	}
}
