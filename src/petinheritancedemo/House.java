package petinheritancedemo;

public class House
{

	public static void main(String[] args)
	{
		
		Pet p1 = new Chameleon();
		
		if(Math.random() < 0.5)
			p1 = new Dog("Clifford", "Big Red"); // dog eats Chameleon
		
		// The reference type determines what methods CAN BE run.
		// The object type determines what method is actually run.
		
		System.out.println(p1.getName()); // A & J: Pet
//		System.out.println(p1.getBreed()); // compile time error
//		System.out.println(p1.getColor()); // compile time error
		System.out.println(p1.toString()); // Pet or Dog (polymorphism)
		System.out.println(p1); // same as toString
		
		System.out.println(p1.willEat("Chameleon"));
		
		// What do I need to do to run getBreed?
		if(p1 instanceof Dog)
		{
			Dog d1 = (Dog) p1;
			System.out.println(d1.getBreed());
		}
	}

}
