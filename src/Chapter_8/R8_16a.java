package Chapter_8;

public class R8_16a {

	public R8_16a() {
		
	}
	
	public boolean test_equal(int[] array1, int[] array2) {
		if (array1.length == array2.length)
		{
		    int i = 0;
		    while (i < array1.length)
		    {
		        if (array1[i] == array2[i]) 
		           i++;
		        else
		           return false; 
		    }
		    return true;
		}
		else
		   return false; 

	}
	
	public static void main(String[] args) {
		R8_16a test = new R8_16a();
		int[] a1 = new int[] {5,4,3};
		int[] a2 = new int[] {5,4,3};

		System.out.println(test.test_equal(a1, a2));
	}

		
}
