package Week2HW;

public class BigJavaWrittenAnswers {

}


/*
R3.1
A local variable is established within a block of code and can only be accessed by that method or class
A parameter variable is something that you pass into a method or constructor. The method or constructor
will use this variable to return or define something

R3.2
An instance field is a variable that is bound of connected to the object itself. For example, in the 
Triangle code, private int x1 is an instance field

R3.3
The BankAccount(double initialBalance) isn't necessary because you can always just deposit money in if 
you wanted to start with more

R3.4
BankAccount b; established a variable b that doesn't point or store anything but still can be 
manipulated like a BankAccount class

BankAccount b = new BankAccount(5000); b is established as an arrow sign that points to this new
BankAccount class that has 5000 dollars in it

R3.5
new BankAccount(5000); makes a new BankAccount with 5000 in it but has nothing pointing to it therefore
making it basically useless

BankAccount b = new BankAccount(5000); does the same as mentioned above

R3.9
Using "this" you will be able to access the implicit parameter method or otherwise known as the object 
the method is being called upon. 

R3.11

public class SavingsAccount{
	private double interestRate;
	private double money;
	public class SavingsAccount(double interest){
		interestRate = interest;
		
	public void addInterest(){
		money = money + money*interest;
	}
	public double getBalance(){
		return money;

	}
	public void deposit(int deposit){
		money = money+deposit;
	}
	
	
	}
	




*/











