package Chapter13;

public class Executive extends Manager{
	
	public Executive(String name, double salary, String department) {
		super(name, salary, department);
	}
	
	public String toString() {
		return getName() + " is an executive and makes $" + getSalary() + "/year in the " + getDepo() + " department";
	}


}
