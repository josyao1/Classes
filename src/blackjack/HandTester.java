package blackjack;

public class HandTester {

	public static void main(String[] args) {
		Shoe deck = new Shoe(6);
		Card card1 = deck.dealCard();
		Card card2 = deck.dealCard();
		Hand test = new Hand(card1, card2);
		
		System.out.println("Card 1: " + card1);
		System.out.println("Card 2: " + card2);
		System.out.println("Value: " + test.getValue());
		System.out.println("Hand: " + test.toString());
		
		Card card3 = deck.dealCard();
		test.addCard(card3);
		System.out.println("Card 3: " + card3);
		System.out.println("Value: " + test.getValue());
		System.out.println("# of Cards: " + test.getNumCards());
		System.out.println("Hand: " + test.toString());
		
	}

}
