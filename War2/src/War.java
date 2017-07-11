import java.util.ArrayList;
import java.util.Scanner;

public class War {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Card> yourHand= new ArrayList<Card>();
		CardDeck newDeck = new CardDeck();
		newDeck=Shuffle.shuffle(newDeck);
		ArrayList<Card> Player1War= new ArrayList<Card>();
		ArrayList<Card> Player2War= new ArrayList<Card>();
		for (int x=0;x<26;x++) {
			yourHand.add(newDeck.deck[x]);
		}
		ArrayList<Card> dealerHand= new ArrayList<Card>();
		for (int y=26;y<52;y++) {
			dealerHand.add(newDeck.deck[y]);
		}
		int place=0;
		System.out.println("Welcome to War!");
		Scanner scan = new Scanner(System.in);
		boolean quit=false;
		while (!quit) {
			System.out.println("Player 1, input a random character to draw");
			String not = scan.next();
			System.out.println("Player1 drew a "+yourHand.get(place));
			System.out.println(place);
			System.out.println("Player 2, input a random character to draw");
			String not2 = scan.next();
			System.out.println("Player 2 drew a "+dealerHand.get(place));
			System.out.println(place);
			if (yourHand.get(place).getNumber()>dealerHand.get(place).getNumber()) {
				for (int x=0;x<=place;x++) {
					yourHand.add(dealerHand.get(0));
					dealerHand.remove(0);
					yourHand.add(yourHand.get(0));
					yourHand.remove(0);
				}
				place=0;
				System.out.println("Player 1 won the cards!");
			}
			else if (yourHand.get(place).getNumber()<dealerHand.get(place).getNumber()) {
				Player1War.add(yourHand.get(place));
				
				/*for (int x=0;x<=Player2War.size();x++) {
					yourHand.add(Player2War.get(x));
					dealerHand.remove(place);
					yourHand.add(yourHand.get(place));
					yourHand.remove(place);
					place=0;
				}
				*/
				System.out.println("Player 2 won the cards!");
			}
			else if (yourHand.get(place).getNumber()==yourHand.get(place).getNumber()) {
				System.out.println("War!");
				Player1War.add(yourHand.get(place));
				Player1War.add(yourHand.get(place+1));
				Player1War.add(yourHand.get(place+2));
				Player1War.add(yourHand.get(place+3));
				Player1War.add(yourHand.get(place+4));
				//System.out.println("Player 1 drew a "+yourHand.get(place+4));
				Player2War.add(dealerHand.get(place));
				Player2War.add(dealerHand.get(place+1));
				Player2War.add(dealerHand.get(place+2));
				Player2War.add(dealerHand.get(place+3));
				Player2War.add(dealerHand.get(place+4));
				//System.out.println("Player 2 drew a "+dealerHand.get(place+4));
				place+=4;
			}
		}
	}

}
