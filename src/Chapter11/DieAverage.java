package Chapter11;

public class DieAverage {

	public static void main(String[] args) {
		DataSet averager = new DataSet();
		
		for(int i = 0; i < 100; i++) {
			averager.add(new Die(6));
		}
		System.out.println(averager.getAverage());
	}
	
	
	

}
