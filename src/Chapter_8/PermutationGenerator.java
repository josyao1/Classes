package Chapter_8;

import java.util.ArrayList;

public class PermutationGenerator {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		ArrayList<Integer> random = new ArrayList<Integer>();
		
		
		
		for(int i = 0; i < 10; i++) {
			
			int index = (int)(Math.random()*(10-i));
			random.add(numbers.get(index)); 
			numbers.remove(index);
		}
		
		System.out.println(random);
		
	}

}
