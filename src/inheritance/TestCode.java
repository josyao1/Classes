package inheritance;

public class TestCode {

	public static void main(String[] args) {
		
		Worker w1 = new HourlyWorker("John", 50);
		
		if(Math.random() < 0.5)
			w1 = new SalariedWorker("Jim", 45); 
		
		System.out.println(w1.getName());
		System.out.println(w1.getIncome());
		
		if(w1 instanceof SalariedWorker) {
			
			SalariedWorker s1 = (SalariedWorker) w1;
			System.out.println(s1.sentence());
		}
		
	}

}
