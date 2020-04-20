package critters;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.util.ArrayList;


public class KingCrab extends CrabCritter{

	public void moveActors(ArrayList<Actor> actors)
	{
		actors = super.getActors();
		for(int i = 0; i < actors.size(); i++)
		{
			Actor a = actors.get(i);
			Location current = a.getLocation();
			Location moveTo = current.getAdjacentLocation(getLocation().getDirectionToward(current));
	
		if(getGrid().isValid(moveTo)) {
			a.moveTo(moveTo);
		}
		else{
			a.removeSelfFromGrid();
		}
	
	
		}
	
	}

}