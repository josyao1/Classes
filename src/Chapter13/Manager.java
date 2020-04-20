package Chapter13;

public class Manager extends Employee{
	
	private String department;
	
	public Manager(String name, double salary, String department) {
		super(name,salary);
		this.department = department;
	}
	
	public String getDepo() {
		return department;
	}
	
	public String toString() {
		return getName() + " is a manager and makes $" + getSalary() + "/year in the " + getDepo() + " department";
	}

}
