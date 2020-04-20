package Week3HW;

public class Smallest_Largest {
	private int num;
	
	public Smallest_Largest(int x) {
		num = x;
	}
	
	public void addValue(int y) {
		num += y;
		
	}
	
	public int getLargest() {
		int largest = 0;
		while(num > 0)  { 
	        int r = num % 10; 
	        largest = Math.max(r, largest);
	        num /= 10;
	        
	    }
		return largest;
		
	}
	
	public int getSmallest() {
		int smallest = 9;
			while(num > 0) {
				int r = num % 10;
				smallest = Math.min(r, smallest);
				num /= 10;
				
			}
		return smallest;
		
	}
	
	
	
	
	
	
	
	

}
