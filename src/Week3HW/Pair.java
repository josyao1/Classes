package Week3HW;

public class Pair {

	private double first;
	private double second;
	public Pair(double aFirst, double aSecond) {
		first = aFirst;
		second = aSecond;
			
	}
	
	public double getSum() {
		return first + second;
		
	}
	
	public double getDifference() {
		return first - second;
	}
	
	public double getProduct() {
		return first * second;
	}
	
	public double getAve() {
		return (first * second)/2;
		
	}
	
	public double abs() {
		return Math.abs(getDifference());
	}
	
	public double max() {
		return Math.max(first, second);
		
	}
	
	public double min() {
		return Math.min(first, second);
		
		
	}
	

}

