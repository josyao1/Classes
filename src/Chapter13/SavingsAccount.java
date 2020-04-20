package Chapter13;

import Week2HW.BankAccount;

public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	private double minbalance;


	public SavingsAccount(double balance, double rate) {
		super(balance);
		minbalance = balance;
		interestRate = rate;
	}
	
	public void endOfMonth() {
		double interest = minbalance + interestRate / 100;
		super.deposit(interest);
	}
	
	public void withdraw(double withdrawAmount)
	  {
	    if (withdrawAmount > getBalance()){    
	      System.out.println("Insufficient Funds!!!");
	    } 
	    else {
	      super.deposit((-1)*withdrawAmount);
	      if(minbalance > getBalance())
	    	  minbalance = getBalance();
	    }
	  }
	
	
}


