package RecursionPractice;

import java.util.Arrays;

public class NumberSorter {
	
	public static void main(String[] args)
	{
		int numbers[] = {4, 3, 54, 12, 42, 110, 92};
		
		leastToGreatest(numbers);
		
		System.out.println(Arrays.toString(numbers)); 
	}

	public static void leastToGreatest(int[] numbers){
		
		if(numbers.length == 1)
			return;
		
		for (int i=0; i<numbers.length-1; i++) 
            if (numbers[i] > numbers[i+1]) 
            { 
                int temp = numbers[i]; 
                numbers[i] = numbers[i+1]; 
                numbers[i+1] = temp; 
            } 
		
		int[] temp = new int[numbers.length-1];
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = numbers[i];
		}
		
		leastToGreatest(temp);
		
	}
}


//List<Integer> ordered = new ArrayList<Integer>();
//if(list.size() == 1) {
//	ordered.add(list.get(0));
//	return ordered;
//}
//
//ordered = leastToGreatest(list.subList(0, list.size()-2));
//
//while()