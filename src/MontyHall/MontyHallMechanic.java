package MontyHall;

public class MontyHallMechanic {

	private int prizeloc;
	private int initialpick;
	private int opendoor;
	private int finalpick;
	
	
	
	public MontyHallMechanic() {
		
		prizeloc =(int)(Math.random()*3);
		initialpick = -1;
		opendoor = -1;
		finalpick = -1;
		
	}
	
	/// returns the array of strings 0-2
	/// each string could be goat/number/prize/picked
	public String[] showDoors() {
		String[] temp = new String[2];
		return temp;
	}
	
	/// door is the index in the array that is picked  0-2
	public void pickDoor(int door) {
		
		if(initialpick != -1)
			throw new IllegalStateException("Door has already been picked");
		if(door < 0 || door > 2)
			throw new IllegalArgumentException("Door out of bounds");
		
		initialpick = door;
	}
	
	public int revealGoat() {
		
		int goat1loc = 0;
		int goat2loc = 1;
		if(goat1loc == prizeloc) {
			goat1loc++;
			goat2loc++;
		}
		if(goat2loc == prizeloc)
			goat2loc++;
		return goat1loc;
	}
	
	public void chooseFinal(boolean stay) {
		
	}
	
	public void reset() {
		
	}
	
	public int prizeloc() {
		return prizeloc;
	}
	
	
}
