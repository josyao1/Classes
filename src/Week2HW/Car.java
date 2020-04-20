package Week2HW;
///P3.6
public class Car {
	private double mpg, gallons;
	public Car(double effiecency) {
		mpg = effiecency;
		gallons = 0;		
		
	}
	public void addGas(double gas) {
		gallons = gallons+gas;
	}
	
	public void drive(double miles) {
		gallons = gallons - (mpg/miles);
		
	}
	
	public double getGasOfCar() {
		return gallons;
	}
	
	public static void main(String[] args) {
		Car myCar = new Car(25);
		myCar.addGas(2);
		myCar.drive(25);
		System.out.println(myCar.getGasOfCar());
		
	}
	
}
