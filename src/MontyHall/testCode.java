package MontyHall;

public class testCode {

	public static void main(String[] args) {

		for(int i = 0; i <= 10; i++) { 
			MontyHallMechanic tester = new MontyHallMechanic();
	//		 tester.pickDoor(1);
	//		 tester.pickDoor(2);
	//		 tester.pickDoor(-5);
			 System.out.println("Goat Location:"+tester.revealGoat());
			 System.out.println("Prize location:" + tester.prizeloc());
			 System.out.println("");

			}
		
	}

}
