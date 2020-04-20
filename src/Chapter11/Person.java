package Chapter11;

public class Person implements Measurable{
	
	
	private String name;
	private double height;
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getMeasure() {
		return height;
	}
	
}
