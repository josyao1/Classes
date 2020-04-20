package Chapter13;

import Week2HW.BankAccount;

public class TimeDepositAccount extends SavingsAccount{

	private int months;
	private final int CHARGEFEE = 25;
	
	public TimeDepositAccount(double intialBalance, double interestRate, int months) {
		super(intialBalance,interestRate);
		this.months = months;
	}
	
	public void endOfMonth() {
		months -= 1;
		super.endOfMonth();
	}
	
	public void withdraw(double withdrawAmount)
	  {
	    if (months > 0) {
		  System.out.println("Not time yet!");
		  super.withdraw(CHARGEFEE);
		  super.withdraw(withdrawAmount);

	    }
	    else {
		  super.withdraw(withdrawAmount);
	    }
	  }

}
