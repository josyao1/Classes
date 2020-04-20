package blackjack;

import java.util.ArrayList;


/**
 * Represents all or part player's or dealer's blackjack hand
 */
public class Hand
{
    private ArrayList<Card> cards;
    
    /**
     * Constructs a hand containing the specified 2 cards
     * @param card1 the first card
     * @param card2 the second card
     */
    public Hand(Card card1, Card card2)
    {
        cards = new ArrayList<Card>();
        cards.add(card1);
        cards.add(card2);
    }

    /**
     * Returns the numerical value of this hand according to the rules of blackjack
     * @return the numerical value of this hand
     */
    public int getValue()
    {
        int total = 0;
        int acecounter = 0;
        
        for(int c = 0; c < cards.size(); c++) {
        	if(cards.get(c).getValue() > 10)
        		total += 10;
        	else
        		total += cards.get(c).getValue();
        	
        	if(cards.get(c).getValue() == 1)
        		acecounter++;
        }
        
        if(total <= 11 && acecounter > 0)
        	total += 10;
        
    	return total; 
    }

    /**
     * Returns true if this hand is a blackjack, false otherwise
     * @return true if this hand is a blackjack, false otherwise
     */
    public boolean isBlackjack()
    {
        return getValue() == 21 && getNumCards() == 2; 
    }

    /**
     * Returns the cards in this hand
     * @return the cards in this hand
     */
    public ArrayList<Card> getCards()
    {
        return cards; // TODO: implement
    }
    
    /**
     * Returns the cards in this hand followed by their numerical value
     * Ex: JS AH (21)
     */
    public String toString()
    {
        ArrayList<String> cards = new ArrayList<String>();
        
        for(int i = 0; i < this.cards.size();i++) {
        	cards.add(this.cards.get(i).toString());
        }
        
        return cards.toString() + " (" + Integer.toString(getValue()) + ")";
    	
    }

    /**
     * Adds the specified card to this hand
     * @param card the card to add
     */
    public void addCard(Card card)
    {
        cards.add(card);
    }

    /**
     * Returns the number of cards in this hand
     * @return the number of cards in this hand
     */
    public int getNumCards()
    {
        return cards.size(); 
    }
}