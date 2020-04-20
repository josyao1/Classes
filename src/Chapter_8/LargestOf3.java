package Chapter_8;

public class LargestOf3 {

	public static void main(String[] args) {
//		Comparable largest = findLargest(new Integer(5), 7, 9);
		Comparable largest = findLargest("dog", "cat", "fish");
		System.out.println(largest);
		System.out.println((largest).length);
	}
	
	public static Comparable findLargest(Comparable a, Comparable b, Comparable c) {
		
		Comparable max = a;
		
		if(b.compareTo(max) > 0)
			max = b;
		if(c.compareTo(max) > 0)
			max = c;
		
		return max;
		
	}
}
