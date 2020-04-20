package WeekTenHW;

public class Cannonball {
	
	private double initialv;
	private double velocity;
	final double GRAVITY = -9.81;
	final double DELTAT = 0.01;
	private double position = 0;
	private double time = 0;

	
	public Cannonball(double v0) {
		initialv = v0;
		velocity = v0;
	}
	
	public double getPos(){
		
		return position;
		
	}
	
	public double getVelo() {
		return velocity;
	}
	
	public void update() {
		position = position + velocity * DELTAT;
		velocity = initialv - GRAVITY * DELTAT;
		time += DELTAT;

	}
	
	public double exactPos() {
		double exactpos = -.5 * GRAVITY * (DELTAT*DELTAT) + (initialv * DELTAT);
		return exactpos;
	}
	
	
	
	public static void main(String[] args) {
		
		Cannonball test = new Cannonball(100);
		double position = 987654;
		while(position > 0) {
				for(int i = 0; i < 100; i++) {
					test.update();
					position = test.getPos();
				}
				
			System.out.println(test.getPos());
			System.out.println(test.exactPos());
			
		
		}
	}
	
	

}
