package Week3HW;

public class CashRegister {
	
	private double purchase;
	private double payment;
	private int pennies;
	
	public CashRegister() {
		
	}
	
	public void recordPurchase(double price) {
		purchase = price;
	}
	
	public void recordPayment(int o, int q, int d, int n, int p) {
		pennies = p;
		payment = o + q * .25 + d * .1 + n * .05 * p * .01;
		
	}
	
	public int returnDollars() {
		double penny = payment - purchase;
		pennies = (int) (penny*100);
		int dollars=pennies/100;
		pennies = pennies%100;
		return dollars;
	}
	
	public int returnQuarters() {
		int quarters = pennies/25;
        pennies = pennies%25;
        return quarters;
		
	}
	
	public int returnDimes() {
		int dimes = pennies/10;
        pennies = pennies%10;
        return dimes;
	}
	
	public int returnNickels() {
		int nickels = pennies/5;
        pennies = pennies%5;
        return nickels;
	}
	
	public int returnPennies() {
		pennies = pennies/1;
		return pennies;
	}
	
	
	public static void main(String[] args) {
		CashRegister register = new CashRegister(); 
		register.recordPurchase(8.37);
		register.recordPayment(10, 0, 0, 0, 0);
		System.out.println(register.returnDollars()); 
		System.out.println(register.returnQuarters());
		System.out.println(register.returnDimes());
		System.out.println(register.returnNickels()); 
		System.out.println(register.returnPennies());
		
		
	}
}










