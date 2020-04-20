package inheritance;

public class HourlyWorker extends Worker {
	
	public HourlyWorker(String name, double income) {
		
		super(name, income);
	}

	public double computePay(double hours) {
		
		double pay = hours * super.getIncome();
		double time = hours;
		
		if(hours > 40) {
			time -= 40;
			pay = pay * super.getIncome() * 1.5;
			return pay;
			
		}
		return pay;
	}
	
}
