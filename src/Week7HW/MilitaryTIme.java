package Week7HW;

import java.util.*;

public class MilitaryTIme {
	
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("First Time:");
		String time1 = s.nextLine();
		
		Scanner d = new Scanner(System.in);
		System.out.println("Second Time:");
		String time2 = s.nextLine();
		
		
		
		int answer[] = new int[2];
		answer = compareTo(time1, time2);
		//answer = compareTo("1357", "0523");
		
		System.out.println("Hours: "+answer[0]+" "+"Min: " + answer[1]);

	}
	
	public static int[] compareTo (String time1, String time2)
	{
		
		int hour1 = Integer.parseInt(time1.substring(0, 2));
		int min1 = Integer.parseInt(time1.substring(2));
		
		
		int hour2 = Integer.parseInt(time2.substring(0, 2));
		int min2 = Integer.parseInt(time2.substring(2));
		
		int ovrmin1 = (hour1 * 60) + min1;
		int ovrmin2 = (hour2 * 60) + min2;
		
		if(ovrmin2 < ovrmin1)
		{
			ovrmin2 = ovrmin2 + (24*60);
		}
		
		int diff = ovrmin2 - ovrmin1;
		
		//System.out.println(diff);
		
		int val1 = diff/60;
		int val2 = diff%60;
		
		//System.out.println(val1 + " " + val2);
		
		int [] result = new int[2];
		result[0] = val1;
		result[1] = val2;
		return result;
	}

}
