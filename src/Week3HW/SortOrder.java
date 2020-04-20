package Week3HW;

public class SortOrder {

	private double v1, v2, v3;
	
	public SortOrder(double first, double second, double third) {
		
		v1 = first;
		v2 = second;
		v3 = third;	
		
		
	}
	
	public String Sort() {
		
		if (v1 > v2) {
		      double temp = v1;
		      v1 = v2;
		      v2 = temp;
		    }

		/// Shifting the numbers over one
		 if (v2 > v3) {
		      double temp = v2;
		      v2 = v3;
		      v3 = temp;
		    }
		 /// Shifting over the numbers
		 if (v1 > v2) {
		      double temp = v1;
		      v1 = v2;
		      v2 = temp;
		    }
		 
		 return v1 + " " + v2 + " " + v3;
		

	}
}
