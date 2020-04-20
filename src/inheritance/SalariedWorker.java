package inheritance;

public class SalariedWorker extends Worker {
	
	public SalariedWorker(String name, double income) {
		super(name, income);
	}
	
	public double computePay(double hours) {
		return super.getIncome()*40;
	}
	
	public String sentence() {
		return super.getName() + " makes $" + super.getIncome() + "/hour";
	}
}
