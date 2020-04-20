package Week2HW;

public class SodaCan {
	double height,radius;
	public SodaCan(double tallness,double wideness) {
		height = tallness;
		radius = wideness/2;
		
	}
	
	public double getVolume() {
		return 3.14*height*radius*radius;
	}
	
	public double getSurfaceArea() {
		return 2*3.14*radius*height+2*3.14*(radius*radius);

	}
	public static void main(String[] args) {
		SodaCan sprite = new SodaCan(5,7);
		System.out.println(sprite.getSurfaceArea());
		System.out.println(sprite.getVolume());
	}
}
