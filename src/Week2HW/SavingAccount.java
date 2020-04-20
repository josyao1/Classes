package Week2HW;
///P3.3
public class SavingAccount {
	private double money, interest;
 

    /**
     * Constructs a bank account with a zero balance.
     */
    public SavingAccount(){
        money = 0;
        interest = 0;
    }

    
    public SavingAccount(double initialBalance,double initialRate){
        money = initialBalance;
        interest = initialRate;
    }
    public void deposit(double amount){
        money = money + amount;
    }

    
    public void withdraw(double amount){
        money = money - amount;
    }

    public void addInterest(){
        money = money + (money * interest) / 100;
    }

   
    public double getBalance(){
        return money;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount josh = new SavingAccount(1000,10);
		josh.addInterest();
		josh.addInterest();
		josh.addInterest();
		josh.addInterest();
		josh.addInterest();
		System.out.println(josh.getBalance());
	}

}
