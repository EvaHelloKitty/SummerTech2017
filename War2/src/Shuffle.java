import java.util.Random;

public class Shuffle {
	
	public static CardDeck shuffle (CardDeck deck) {
		for (int x=0;x<52;x++) {
		int random1 = (int) (Math.random()*52);
		int random2 = (int)(Math.random()*52);
		Card one= deck.deck[random1];
		Card two= deck.deck[random2];
		deck.deck[random1]=two;
		deck.deck[random2]=one;
		}
		return deck;
	}
}
