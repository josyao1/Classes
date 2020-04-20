package Week2HW;

public class Chapter2Quiz {
	private int years;
	private int months;
	private int ageInYears;
	
	public double myAge(int year, int month) {
		years = year;
		months = month;
		ageInYears = month/12;
		return years+ageInYears;
	}
	
	
}
/*
2. 
	a. BankAccount c = new BankAccount(1);
	b. System.out.println(c.getBalanace());
	c. c.deposit(100)

3.
	a. (2) (2)
	b. (2) (1)
	c. (2) (10)

4. 
	a. Rectangle c = new Rectangle( b.getX(), b,getY(), 7, 7);
	b. Rectangle b = a;

5. 
	a. Rectangle test = new Rectangle(1, 2, 3, 4);
6.
	Constructors:
	Rectangle(int x, int y, int width, int height)
	Mutators:
	void setLocation(int x, int y)
	Acessors:
	double getX()
	double getY()

7.
		new Rectangle(1,1,5,5)
		b. Rectangle a;
	
*/









