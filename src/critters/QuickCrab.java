package critters;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class QuickCrab extends CrabCritter{

	public ArrayList<Location> getMoveLocations(){  //Puts the locations two to the right and left into a list
		
		ArrayList<Location> locs = new ArrayList<Location>();
		
		
		if(addTwoAway(getDirection() + Location.LEFT) instanceof Location) {
			locs.add(addTwoAway(getDirection() + Location.LEFT));
		}
		
		if(addTwoAway(getDirection() + Location.RIGHT) instanceof Location) {
			locs.add(addTwoAway(getDirection() + Location.LEFT));
		}
		
		if(locs.size() != 0) {
			return locs;
		}
		return super.getMoveLocations();
	}
	
	private Location addTwoAway(int dir){
		 Grid<Actor> g = getGrid();
		 Location currentloc = getLocation();
		 Location oneover = currentloc.getAdjacentLocation(dir);
	
		 if(g.isValid(oneover) && g.get(oneover) == null){
			 Location twoover = oneover.getAdjacentLocation(dir);
			 if(g.isValid(twoover) && g.get(twoover) == null) {
				return twoover;
			 }
		 
		 } 
		 
		 return null;
		 
	}
}

