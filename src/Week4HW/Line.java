package Week4HW;


public class Line {
	
	static private int x1, x2, y1, y2;
	static private double slope;
	static private int  yint, xint;
	
	public Line(int x, int y, double slant) {
		
		x1 = x;
		y1 = y;
		slope = slant;
		
	}
	
	public Line(int x, int y, int xx, int yy) {
		
		x1 = x;
		x2 = xx;
		y1 = y;
		y2 = yy;
		
	}
	
	public Line(double slant, int intercept) {
		
		slope = slant;
		yint = intercept;
		
	}

	public Line(int intercept) {
		
		xint = intercept;
		
	}
	
	public boolean intersects(Line other) {
		
		return slope != Line.slope;
		
	}
	
	public boolean isParallel(Line other) {
		
		return slope == Line.slope;
			
		
	}
	
	public boolean equals(Line other) {
		
		return slope == Line.slope && x1 == Line.x1;
		
	}
	
	public static void main(String[] args) {
		
		
	}

	

}


