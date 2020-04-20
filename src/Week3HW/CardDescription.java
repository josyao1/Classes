package Week3HW;

public class CardDescription{
	
	private String card;
	private String suite;
	private String String1;
	private String String2;

	public CardDescription(String input)
	{
		card = input.substring(0, 1);
		suite = input.substring(1);
	}

	public String getDescription()
	{
		if (card.equalsIgnoreCase("K"))
		{
			String1 = "King";
		}
		else if (card.equalsIgnoreCase("Q"))
		{
			String1 = "Queen";
		}
		else if (card.equalsIgnoreCase("J"))
		{
			String1 = "Jack";
		}
		else if (card.equals("10"))
		{
			String1 = "Ten";
		}
		else if (card.equals("9"))
		{
			String1 = "Nine";
		}
		else if (card.equals("8"))
		{
			String1 = "Eight";
		}
		else if (card.equals("7"))
		{
			String1 = "Seven";
		}
		else if (card.equals("6"))
		{
			String1 = "Six";
		}
		else if (card.equals("5"))
		{
			String1 = "Five";
		}
		else if (card.equals("4"))
		{
			String1 = "Four";
		}
		else if (card.equals("3"))
		{
			String1 = "Three";
		}
		else if (card.equals("2"))
		{
			String1 = "Two";
		}
		else if (card.equalsIgnoreCase("A"))
		{
			String1 = "Ace";
		}


		if (suite.equalsIgnoreCase("D"))
		{
			String2 = "Diamonds";
		}
		else if (suite.equalsIgnoreCase("H"))
		{
			String2 = "Hearts";
		}
		else if (suite.equalsIgnoreCase("C"))
		{
			String2 = "Clubs";
		}
		else if (suite.equalsIgnoreCase("S"))
		{
			String2 = "Spades";
		}

		return String1 + " of " + String2;
	}
}