package Week7HW;

import java.util.Arrays;

public class YahtzeeDiceTest {

	public static void main(String[] args) {

	
		for(int i = 0; i < 10; i++) {
			YahtzeeDice testCode = new YahtzeeDice();
			System.out.println(Arrays.toString(testCode.getRoll()));
			System.out.println(testCode.getValueAsUpper(5));
			System.out.println(testCode.getValueAsUpper(3));
			System.out.println(testCode.getValueAsAKind());
			System.out.println(testCode.getValueAsFullHouse());
			System.out.println(testCode.getValueAsYahtzee());
			System.out.println(testCode.getValueStraight(4));
			System.out.println(testCode.getValueStraight(5));
		}
		
	}

}
