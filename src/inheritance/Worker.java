package inheritance;

public abstract class Worker {

	private String name;
	private double income;
	
	public Worker(String name, double income) {
		this.name = name;
		this.income = income;
	}
	
	public String getName() {
		return name;
	}
	
	public double getIncome() {
		return income;			
}

	public abstract double computePay(double hours);

	
	
}
