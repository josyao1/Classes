package dataSet;

public class DataSet {

	private int sum, amount;
	
	public DataSet() {
		sum = 0;
		amount = 0;
		
	}
	
	public DataSet(int initialValue) {
		sum = initialValue;
		amount = 1;
		
	}
	
	public void addValue(int addedValue) {
		sum += addedValue;
		amount++;
		
	}
	
	public int getSum() {
		return sum;
		
		
	}
	
	public double getAverage() {
		return (double) sum/amount;
		
	}
}
