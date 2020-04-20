package Week2HW;
import java.lang.Math; 

public class Triangle
{
    /**
     * Constructs a triangle with the specified points
     * @param x1 x coordinate of point 1
     * @param y1 y coordinate of point 1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     */
	private int x1,  y1,  x2,  y2,  x3,  y3 ;
	private double length1, length2, length3;
	
    public Triangle(int X1, int Y1, int X2, int Y2, int X3, int Y3)
    {
        x1 = X1;
        x2 = X2;
        x3 = X3;
        y1 = Y1;
        y2 = Y2;
        y3 = Y3;
        
    }
    
    /**
     * Returns the length of the side (x1, y1), (x2, y2)
     * @return the length of the requested side
     */
    public double getLengthOne()
    {
    	length1 = Math.hypot(Math.abs(y2 - y1), Math.abs(x2-x1));
    	return Math.hypot(Math.abs(y2 - y1), Math.abs(x2-x1)); 
    }
    
    public double getLengthTwo()
    {
    	length2 = Math.hypot(Math.abs(y2 - y3), Math.abs(x2-x3));
    	return Math.hypot(Math.abs(y2 - y3), Math.abs(x2-x3)); 
    }
    
    public double getLengthThree()
    {
    	length3 = Math.hypot(Math.abs(y3 - y1), Math.abs(x3-x1));
    	return Math.hypot(Math.abs(y3 - y1), Math.abs(x3-x1)); 
    }
    
    
    /**
     * 
     * @return angle at point (x1, y1) 
     */
    public double getAngleOne()
    {
        return Math.toDegrees(Math.acos((Math.pow(length2, 2)+Math.pow(length3, 2)-Math.pow(length1, 2))/(2*length2*length3)));
    }
    
    public double getAngleTwo()
    {
    	return Math.toDegrees(Math.acos((Math.pow(length1, 2)+Math.pow(length3, 2)-Math.pow(length2, 2))/(2*length1*length3)));
    }
    
    public double getAngleThree()
    {
    	return Math.toDegrees(Math.acos((Math.pow(length2, 2)+Math.pow(length1, 2)-Math.pow(length3, 2))/(2*length2*length1)));
    }
    
    
    public double getPerimeter()
    {
        return length1 + length2 + length3;
    }
    
    /*public double getArea()
    {
        
    }
}*/
}
