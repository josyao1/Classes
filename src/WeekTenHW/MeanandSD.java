package WeekTenHW;

import java.util.ArrayList;
import java.math.*;

public class MeanandSD {
	
	private double avg = 0;
	private double sd = 0;
	private double total = 0;
	private ArrayList<Double> numbers;
	
	
	public MeanandSD(ArrayList<Double> nums) {
		numbers = nums;
		
		for(int i = 0; i < numbers.size(); i++) {
			total += numbers.get(i);
		}
	}
	
	public void addValue(double num) {
		numbers.add(num);
		for(int i = 0; i < numbers.size(); i++) {
			total += numbers.get(i);
		}
	}
	
	public double getAve() {
		avg = total/numbers.size();
		return total/numbers.size();
		
	}
	
	public double getSD() {
		double t = 0;
		for(int i = 0; i < numbers.size(); i++) {
			t+= (numbers.get(i)-avg)*(numbers.get(i)-avg);
			t = t/numbers.size();
		}
		
		sd = Math.sqrt(t);
		return sd;
		
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<Double> array = new ArrayList<Double>();
        array.add(5.0);
        array.add(7.0);
        array.add(7.0);
        array.add(5.0);
        array.add(7.0);
        array.add(7.0);
        array.add(7.0);
        array.add(7.0);
        array.add(9.0);
        array.add(5.0);
        array.add(7.0);
        array.add(7.0);
        
        MeanandSD test = new MeanandSD(array);
        System.out.println(test.getAve());
        System.out.println(test.getSD());

	}

}
