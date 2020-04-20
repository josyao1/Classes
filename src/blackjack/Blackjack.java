package blackjack;

import java.util.ArrayList;

/**
 * The Blackjack class allows a single player to play a game of blackjack.
 * The class tracks the player's bankroll but makes no attempt to prevent
 * a negative bankroll.
 *
 */
public class Blackjack
{
	private static final int DECKS = 6, CARDS_PER_DECK = 52;
	private static final double SHOE_PENETRATION = 0.75;
	
    private Shoe shoe;
    
    private double playersMoney;
    
    private Hand playersHand;
    private double playersBet;
    
    private Hand dealersHand;
    
    /**
     * Constructs a blackjack object that is ready to play.
     * @param playersMoney the player's starting bankroll (all values, including 0 and negative values, are permitted)
     */
    public Blackjack(double playersMoney)
    {
        this.playersMoney = playersMoney;
        shoe = new Shoe(DECKS);
        reset();
    }
    
    /**
     * Resets for another round, including reseting shoe if necessary
     */
    private void reset()
    {
    	playersHand = null;
        playersBet = 0;
        dealersHand = null;
        if(shoe.cardsLeft() < DECKS*CARDS_PER_DECK*(1-SHOE_PENETRATION)) {
        	shoe = new Shoe(DECKS);
        }
    }
    
    /**
     * Returns the player's money (can be negative)
     * @return the player's money
     */
    public double getPlayersMoney()
    {
        return playersMoney; // TODO: implement
    }
    
    /**
     * Returns the player's bet
     * @return the player's bet for the hand
     */
    public double getPlayersBet()
    {
        return playersBet; // TODO: implement
    }
    
    /**
     * Places a bet at the start of a round. Deals cards to the player and dealer.
     * @param amount the amount to bet
     */
    public void placeBetAndDealCards(double amount)
    {
        playersBet = amount;
        playersMoney -= amount;
        Card playerscard1 = shoe.dealCard();
        Card dealercard1 = shoe.dealCard();
        playersHand = new Hand(playerscard1, shoe.dealCard());
        dealersHand = new Hand(dealercard1, shoe.dealCard());
    }
    
    /**
     * Returns the player's hand
     * @return the player's hand
     */
    public Hand getPlayersHand()
    {
        return playersHand; // TODO: implement
    }
    
    /**
     * Returns the dealer's hand
     * @return the dealer's hand
     */
    public Hand getDealersHand()
    {
        return dealersHand; // TODO: implement
    }
    
    /**
     * Returns true if the player can hit, false otherwise
     * @return true if the player can hit, false otherwise
     */
    public boolean canHit()
    {
        return playersHand.getValue() < 21; // TODO: implement
    }
    
    /**
     * Deals another card to the player's hand.
     * 
     * Precondition: canHit()
     */
    public void hit()
    {
        if(canHit()) {
        	playersHand.addCard(shoe.dealCard());
        }
    }
    
    /**
     * Plays the dealer's hand.
     */
    public void playDealersHand()
    {
       if(playersHand.getValue() > 21 || playersHand.isBlackjack()) {
    	   return;
       }
    	
    	while(dealersHand.getValue() < 17) {
    	   dealersHand.addCard(shoe.dealCard());
       }
       
    }
    
    /**
     * Returns true if the player's hand is a push, false otherwise
     * @return true if the player's hand is a push, false otherwise
     */
    public boolean isPush()
    {
        boolean equalsum = playersHand.getValue() == dealersHand.getValue();
        boolean notbust = playersHand.getValue() <= 21 && dealersHand.getValue() <= 21;
        boolean blackjack = (playersHand.isBlackjack() && dealersHand.isBlackjack()) || 
        		(!playersHand.isBlackjack() && !dealersHand.isBlackjack());
    	return equalsum && notbust && blackjack; 
    }
    
    /**
     * Returns true if the player's hand is a player win, false otherwise
     * @return true if the player's hand is a player win, false otherwise
     */
    public boolean isPlayerWin()
    {
        return (playersHand.getValue() > dealersHand.getValue() && playersHand.getValue() <= 21) || 
        	   (dealersHand.getValue() > 21 && playersHand.getValue() <= 21);
    }
    
    /**
     * Returns true if the player has blackjack, false otherwise
     * @return true if the player has blackjack, false otherwise
     * 
     * Precondition: isPlayerWin()
     */
    public boolean isPlayerBlackjack()
    {
        return isPlayerWin() && playersHand.isBlackjack(); // TODO: implement
    }
    
    /**
     * Resolves the player's bets (updates player's money based on the
     * results of the round) and resets for another round
     */
    public void resolveBetsAndReset()
    {
        if(isPlayerWin() && isPlayerBlackjack()) {
        	playersMoney += playersBet * 2.5;
        }
        else if(isPlayerWin())
        	playersMoney += playersBet*2;
        else if(isPush())
        	playersMoney += playersBet;
        reset();
    }
}
