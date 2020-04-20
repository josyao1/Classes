package WeekTenHW;

public class RandomWalk {

	private int xposition = 0;
	private int yposition = 0;
	
	
	public RandomWalk() {
	
	}
	
	public void RandomMovement() {
		int r = (int) (Math.random() * 4) + 1;
		if (r == 1 && yposition < 10)
        {
            yposition++;
        }
        else if (r == 2 && xposition < 10)
        {
            xposition++;
        }
        else if (r == 3)
        {
            yposition--;
        }
        else if (r == 4)
        {
            xposition--;
        }
		
	}
	
	public String getPos() {
		return ("The position on the x y coordinate plane is (" + xposition + "," + yposition + ")");
	}
	
	public static void main(String[] args) {
		RandomWalk drunkdude = new RandomWalk();
		for(int i = 1; i <= 100; i++) {
			drunkdude.RandomMovement();
		}
		System.out.println(drunkdude.getPos());
	}
	
	
}
