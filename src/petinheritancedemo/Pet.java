package petinheritancedemo;

public abstract class Pet
{
	private String name;
	
	public Pet(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "My pet " + name;
	}
	
	public abstract boolean willEat(String foodType);
}
