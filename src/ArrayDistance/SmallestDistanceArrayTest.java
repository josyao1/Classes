package ArrayDistance;

import java.util.Arrays;

import junit.framework.TestCase;

public class SmallestDistanceArrayTest extends TestCase{
	
	public void testRandom() {
		int randomlength = (int) (Math.random()*98) + 3;
		int[] randomarray = new int[randomlength];
		int randomnum1 = (int) (Math.random()*201);
		int randomnum2 = (int) (Math.random()*201);
		while(randomnum1 == randomnum2)
			randomnum2 = (int) (Math.random()*201);
		
		for(int i = 0; i < randomarray.length; i++) {
			int randomnum = (int) (Math.random()*201);
			while(randomnum == randomnum1 || randomnum == randomnum2) 
				randomnum = (int) (Math.random()*201);
			randomarray[i] = randomnum;	
		}
		
		int randompos1 = (int) (Math.random() * randomarray.length);
		int randompos2 = (int) (Math.random() * randomarray.length);
		while(randompos1 == randompos2)
			randompos2 = (int) (Math.random() * randomarray.length);
		randomarray[randompos1] = randomnum1;
		randomarray[randompos2] = randomnum2;
		
		int distance = Math.abs(randompos1 - randompos2)-1;
		
		int result = SmallestDistanceArray.smallestDistance(randomarray,randomnum1,randomnum2);
		System.out.println(Arrays.toString(randomarray));
		System.out.println(randomnum1);
		System.out.println(randomnum2);
		System.out.println(result);
		
		assertTrue(result == distance);
	}
}
