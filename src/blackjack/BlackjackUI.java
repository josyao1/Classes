package blackjack;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * A text based user interface that allows the user to
 * play a game of blackjack.
 */
public class BlackjackUI
{
	private Blackjack bj; 
	private Scanner fromKeyboard;
	private NumberFormat nf;
	
	/**
	 * Constructs a blackjack game with $1,000 in player bankroll
	 */
	public BlackjackUI()
	{
		bj = new Blackjack(1000);
		fromKeyboard = new Scanner(System.in);
		///what are scanner and numberforamt
	}
	
	/**
     * Returns a valid numerical bet obtained from the player
     * @return a valid numerical bet obtained from the player
     */
    private double getValidBet()
    {
        System.out.println("How much do you want to bet");
    	String bet = fromKeyboard.nextLine();
    	
    	while(stringToNumber(bet) <= 0) {
    		System.out.println("How much do you want to bet");
        	bet = fromKeyboard.nextLine();
    	}	
    	return stringToNumber(bet); // TODO: implement
    }
    
	/**
	 * Plays a single hand of blackjack
	 */
    public void playHand()
    {
    	double bet = getValidBet();
    	bj.placeBetAndDealCards(bet);
    	displayHand(true);
    	playPlayersHand();
    	bj.playDealersHand();
    	displayHand(false);
    	displayResult();
    	bj.resolveBetsAndReset(); 
    	System.out.println("Money Remaining: " + bj.getPlayersMoney());
    }
    
    /**
     * Plays blackjack hands until the user chooses to quit
     */
    public void playHandsUntilQuit()
    {

    	System.out.println("Do you want to play? [Y]es or [N]o");
    	String result = fromKeyboard.nextLine();

    	while(result.equals("y")||result.equals("Y"))
    	{
    		playHand();

    		System.out.println("Do you want to play? [Y]es or [N]o");
    		result = fromKeyboard.nextLine();
    	}    
    }

    /**
     * Allows the player to hit until it is no longer possible
     * to do so or until the player chooses to stand
     */
	private void playPlayersHand()
	{
	    while(bj.canHit()) {
	    	System.out.println("[H]it or [S]tay");
	    	String result = fromKeyboard.nextLine();
	    	if(result.equals("H") || result.equals("h")){
	    		bj.hit();
	        	displayHand(true);
	    	}
	    	else
	    		return;
;	    }
	}

	/**
	 * Displays the result of the hand (push, player win, player blackjack or loss)
	 */
	private void displayResult()
	{
	    if(bj.isPlayerWin() && bj.isPlayerBlackjack()) {
	    	System.out.println("Player got Blackjack");
	    }
	    
	    else if(bj.isPlayerWin()) {
	    	System.out.println("Player Wins");
	    }
	    
	    else if(bj.isPush()) {
	    	System.out.println("Pushed");
	    }
	    
	    else
	    	System.out.println("Players Lost");
	}
	
	private void displayHand(boolean firstcard) {
		
		System.out.println("Players Hand: " + bj.getPlayersHand().toString());
		
		if(firstcard)
			System.out.println("Dealers Hand: " + bj.getDealersHand().getCards().get(0).toString());
		else
			System.out.println("Dealers Hand: " + bj.getDealersHand().toString());
	}

	/**
	 * Returns the numeric representation of input or -1 if input is not numeric
	 * @param input the value to be converted to a number
	 * @return numeric representation or -1
	 */
	private double stringToNumber(String input)
	{
		try
		{
			return Double.parseDouble(input);
		}
		catch(NumberFormatException e)
		{
			return -1;
		}
	}
}
