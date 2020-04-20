package critters;

/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

/**
 * This class runs a world that contains critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class CritterRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(2, 8), new Flower(Color.BLUE));
        world.add(new Location(5, 5), new Flower(Color.PINK));
        world.add(new Location(1, 5), new Flower(Color.RED));
        world.add(new Location(7, 2), new Flower(Color.YELLOW));
        world.add(new Location(4, 4), new Critter());
        world.add(new Location(5, 8), new Critter());
        world.show();
        
	

    }
}

/**

Do You Know Part 7

1. getActors, processActors, getMoveLocations, selectMoveLocation, makeMove
2. same as above?
3. If any subclasses of the Critter class gets Actors from a different place the Critter class, then it should be overwritten
4. moveTo(), setColor(), something else?
5. First Step: getMoveLocations() --> returns empty locations in an ArrayList surrounding the critter
   Second Step: selectMoveLocation() --> Randomly returns a chosen location
   Third Step: makeMove() --> Critter is moved
6. Without a specified constructor, the Critter class defaults to the basic constructor which the actor class also uses 

Do you Know Part 8

1. The ChameleonCritter class doesn't override act but instead overrides makeMove(), resulting in the move method being different
2. super.makeMove() calls for the makeMove() method in Critter rather than ChameleonCritter because those are two different methods
3. From Appendix C
 
	 Location oldLoc = getLocation();
	 super.makeMove(loc);
	 if(!oldLoc.equals(loc)){
		 Flower flo = new Flower(getColor());
		 flo.putSelfInGrid(getGrid(), oldLoc);
	 }
  

4. It uses the same list that Critter does
5. Actor class
6. Actor Class --> getGrid()

Do you know Part 9

1. The CrabCritter also uses the same list that critter does
2. A CrabCritter eats whatever is in front, to the right, or to the left of it. It will not eat a rock or another critter.
   A CrabCritter can move only right or to the left. If both locations are empty, it randomly selects one. If a CrabCritter cannot 
   move, then it turns 90 degrees, randomly to the left or right.
3. CrabCritter uses this method to determine which adjacent locations can be traveled to by the CrabCritter
4. (4,3), (4,4), and (4,5) 
5. Both randomly choose where to move. However, a CrabCritter can only move left or right while a Critter can move in all directions
6. It turns when there are no legal places to move
7. It inherits something from the Critter class that prohibits this


**/