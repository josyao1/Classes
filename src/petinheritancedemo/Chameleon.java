package petinheritancedemo;

import java.awt.Color;

public class Chameleon extends Pet
{
	// all Chameleons are named Oliver
	public Chameleon()
	{
		super("Oliver");
		
		// Every subclass constructor MUST call
		// a superclass constructor (either explicitly
		// or implicitly).
		
		// If a subclass does not explicitly call a superclass
		// constructor, the subclass will implicitly call
		// the default constructor IFFFFF one exists.
	}
	
	public Color getColor()
	{
		return new Color((int) (
				Math.random() * 256),
				(int) (Math.random() * 256),
				(int) (Math.random() * 256));
	}
	
	public boolean willEat(String foodType)
	{
		return foodType.equals("leaf");
	}
}
