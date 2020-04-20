package Week2HW;
///P3.2

public abstract class BankAccount {

  private double balance;
  private int accountNumber;

  private static int lastAccountNumber = 0;

  public BankAccount(double intialBalance)
  {
    balance = intialBalance;

    accountNumber = lastAccountNumber + 1;
    lastAccountNumber = accountNumber;
  }

  public void deposit(double depositAmount)
  {
    balance += depositAmount;
  }

  public boolean withdraw(double withdrawAmount)
  {
    if (withdrawAmount > balance){    
      System.out.println("Insufficient Funds!!!");
      return false;
    } else {
      balance -= withdrawAmount;

      return true;
    }
  }

  public int getNumber()
  {
    return accountNumber;
  }
  
  public double getBalance()
  {
    return balance;
  }
  
  public abstract void endOfMonth();
}