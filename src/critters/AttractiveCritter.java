package critters;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class AttractiveCritter extends Critter{
	
	///Gets location of all actors on grid excluding the attractive critter itself
	public ArrayList<Actor> getActors(){
		
		ArrayList<Location> occupiedLocations = getGrid().getOccupiedLocations();
		occupiedLocations.remove(getLocation());
		ArrayList<Actor> actors = new ArrayList<Actor>();
		
		for(int i = 0; i < occupiedLocations.size(); i++) {
			actors.add(getGrid().get(occupiedLocations.get(i)));
		}
		
		return actors;
	}
	
	///moves every actor from getActors one spot closer to the attractivecritter
	public void processActors(ArrayList<Actor> actors) {
		
		for(int i = 0; i < actors.size(); i++) {
			Actor a = actors.get(i);
			Location current = a.getLocation();
			Location moveTo = a.getLocation().getAdjacentLocation(current.getDirectionToward(getLocation()));
			
			if(getGrid().isValid(moveTo) && getGrid().get(moveTo) == null) {
				a.moveTo(moveTo);
			}
		}
		
	}

}
