package Week3HW;

public class DataSet {
	
	private int num;
	
	public DataSet(int x) {
		num = x;
	}

	public void addValue(int y) {
		num += y;
		
	}
	
	public int getSum() {
		int sum = 0;
		while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
		return sum;
	}
	
	public double getAve() {
		double sum = 0;
		int count = 0;
		while (num > 0) {
			sum += num % 10;
			count += 1;
			num /= 10;
		}
		return sum/count;
	}
}
