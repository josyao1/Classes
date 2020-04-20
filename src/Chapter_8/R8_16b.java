package Chapter_8;

import java.util.Arrays;

public class R8_16b {

	public static void main(String[] args) {
		int[] test = new int[] {4,3,2,1,4,2,2};
		int[] result = new int[test.length];
		for(int i = 0; i < test.length; i++) {
			result[i] = test[i];
		}
		System.out.println(Arrays.toString(result));
	}

}
