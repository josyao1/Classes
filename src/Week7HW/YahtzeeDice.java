package Week7HW;

public class YahtzeeDice
{
	private static int NUM_DICE = 5;
	
	private int[] dice;
	
	// makes 5 dice already rolled
	public YahtzeeDice()
	{
		dice = new int[NUM_DICE];
		reRoll(new boolean[NUM_DICE]);
	}
	
	public int[] getRoll()
	{
		return dice.clone();
	}
	
	// parameter is an array of 5 booleans
	// the ones that are true indicate dice to keep
	// false indicate dice to reroll
	public void reRoll(boolean[] keeps)
	{
		for(int i = 0; i < dice.length; i++)
		{
			if( ! keeps[i] )
				dice[i] = (int) (Math.random() * 6) + 1;
		}
	}
	
	
	public int getValueAsUpper(int value)
	{
		int count = 0;
		for(int i = 0; i < dice.length; i++) {
			if(dice[i] == value)
				count++;
		}
		
		return count*value;
		
	}
	
	
	
	public int getValueAsAKind()
	{
		int[] counts = new int[6];
		int sum = 0;
		boolean threes = false;
		boolean fours = false;
		for (int i = 0; i < 5; i++)
		{
			
			sum += dice[i];
			
			
			counts[dice[i]-1]++;
		}	
		
		for(int i = 0; i < counts.length; i++) {
			if(counts[i] == 3) {
				threes = true;
			}
			if(counts[i] == 4) {
				fours = true;
			}
			
		}
		
		if((threes && fours)|| (threes || fours)) {
			return sum;
		}
		else
			return 0;
		
		
	}

	
	public int getValueAsFullHouse()
	{
	
		int[] counts = new int[6];
		boolean threes = false;
		boolean twos = false;
		
		for (int i = 0; i < 5; i++)
		{
			counts[dice[i]-1]++;

		}		
		
		for(int i = 0; i < counts.length; i++) {
			if(counts[i] == 3) {
				threes = true;
			}
			else if(counts[i] == 2) {
				twos = true;
			}
		}
				
		
		if(threes && twos)
			return 25;
		else
			return 0;
	
	}

	public int getValueStraight(int smallorlarge)
	{
		boolean ans = false;
		int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixes = 0;
		
		for (int i = 0; i < 5; i++)
		{
			if (dice[i] == 1)
				ones++;
			if (dice[i] == 2)
				twos++;
			if (dice[i] == 3)
				threes++;
			if (dice[i] == 4)
				fours++;
			if (dice[i] == 5)
				fives++;
			if (dice[i] == 6)
				sixes++;
		}
		if (smallorlarge == 4)
			ans = (ones >= 1 && twos >= 1 && threes >= 1 && fours >= 1) ||
			 		(twos >= 1 && threes >= 1 && fours >= 1 &&	fives >= 1) ||
					  (threes >= 1 && fours >= 1 && fives >= 1 && sixes >= 1);
	
		if (smallorlarge == 5)
			ans = (ones >= 1 && twos >= 1 && threes >= 1 && fours >= 1 &&
					fives >= 1) || (twos >= 1 && threes >= 1 && fours >= 1 &&
						fives >= 1 && sixes >= 1);
		
		if(ans == true && smallorlarge == 4)
			return 30;
		else if(ans == true && smallorlarge == 5)
			return 40;
		else
			return 0;
	}
	
	
	
	public int getValueAsYahtzee()
	{
		int count = 0;
		int number = 0;
		for(int i = 0; i < dice.length; i++) {
			number = dice[0];
			if(dice[i] == number)
				count++;
			else
				break;
		}
		
		if(count == 6)
			return 50;
		else
			return 0;
	}
	
	public int getValueAsChance()
	{
		int total = 0;
		for(int i = 0; i < dice.length; i++) {
			total += dice[i];
			
		}
		return total;
	}
}

