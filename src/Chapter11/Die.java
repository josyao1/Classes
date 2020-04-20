package Chapter11;

import java.util.Random;

/**
   This class models a die that, when cast, lands on a random
   face.
*/
public class Die implements Measurable
{
   /**
      Constructs a die with a given number of sides.
      @param s the number of sides, e.g. 6 for a normal die
   */
   public Die(int s)
   {
      sides = s;
      generator = new Random();
      cast();
   }

   /**
      Simulates a throw of the die
      @return the face of the die
   */
   public int cast()
   {
      numberShowing = 1 + generator.nextInt(sides);
	   return numberShowing;
   }
   
   public double getMeasure() {
	   
	   return numberShowing;
   }

   private Random generator;
   private int sides;
   private int numberShowing;
}
