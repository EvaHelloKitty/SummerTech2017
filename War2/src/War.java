import java.util.ArrayList;
import java.util.Scanner;

public class War {
	
	
	public final static boolean INTERACTIVE = false;
	
	/**
	 * The pot of cards on the table.  The winner gets these
	 */
	static ArrayList<Card> pot;
	
	static ArrayList<Card> playerAhand;
	static ArrayList<Card> playerBhand;
	
	static Scanner scan;
	
	
	
	
	private static void printPot() {
		
		
		System.out.println("Current Pot:");
		for(int i=0; i<pot.size(); i++) {
			System.out.print(pot.get(i) + ",");
			
			
		}
		System.out.println("----------------------");
		
		
	}
	
	
	/**
	 * This is the Tit for Tat state of the game.
	 * 
	 */
	private static void skirmishState() {
		
		Card lastA = null;
		Card lastB = null;
		
		System.out.println("Player A, input a random character to draw");
		
		String not ="";
		
		if (INTERACTIVE) not = scan.next();
		
		if(playerAhand.isEmpty()) {
			gameOver("PlayerA");
		} else {
			lastA = playerAhand.remove(0);
			pot.add(lastA);
		}
		
		System.out.println("Player B, input a random character to draw");
	
		if (INTERACTIVE) not = scan.next();
		
		
		if(playerBhand.isEmpty()) {
			gameOver("PlayerB");
		} else {
			lastB = playerBhand.remove(0);
			pot.add(lastB);
		}
		
		
		System.out.println("Player A throws down a " + lastA);
		System.out.println("Player B throws down a " + lastB);
		
		
		printPot();
	
		if (lastA.getNumber()>lastB.getNumber()) {
			System.out.println("Player A won the cards!");
			playerAhand.addAll(pot);
			pot.clear();
		} else if (lastB.getNumber()>lastA.getNumber()) {
			System.out.println("Player B won the cards!");
			playerBhand.addAll(pot);
			pot.clear();
		} else {
			warState();
		}
		
		
		System.out.println("Player A has " + playerAhand.size() + " cards remaining!");
		System.out.println("Player B has " + playerBhand.size() + " cards remaining!");
		
		
		skirmishState();
		
		
	}
	
	
	private static void warState() {
		System.out.println("WAR!!!!");

		if(playerAhand.size() < 3) {
			gameOver("PlayerA");
		} else {
			
			Card lastA = null;
			for(int i = 0; i < 3; i++) {
				lastA = playerAhand.remove(0);
				pot.add(lastA);
				
			}
			System.out.print("PLayer A threw down 3 cards....");
		}
		if(playerBhand.size() < 3) {
			gameOver("PlayerB");
		} else {
			
			Card lastB = null;
			for(int i = 0; i < 3; i++) {
				lastB = playerBhand.remove(0);
				pot.add(lastB);
				
			}
			System.out.print("PLayer B threw down 3 cards....");
		}
		skirmishState();
		
	}

	
	private static void gameOver(String loser) {
		System.out.println(loser + " is out of cards!!! GAME OVER");
		//Hard exit
		System.exit(0);
	}
	
	
	
	public static void main(String[] args) {
		
		
		int place=0;
		System.out.println("Welcome to War!");
		scan = new Scanner(System.in);
		boolean quit=false;
		
		//Make an empty pot
		pot = new ArrayList();
		
		
		
		//Deal the hands
		playerAhand= new ArrayList<Card>();
		playerBhand= new ArrayList<Card>();
		
		CardDeck newDeck = new CardDeck();
		newDeck=Shuffle.shuffle(newDeck);
		
		
		for (int x=0;x<26;x++) {
			playerAhand.add(newDeck.deck[x]);
		}
		ArrayList<Card> dealerHand= new ArrayList<Card>();
		for (int y=26;y<52;y++) {
			playerBhand.add(newDeck.deck[y]);
		}
		
		//Launch the game in skirmish mode
		skirmishState();
		
		//STATE0;   Deck divided
		
		
		//STATE1:  card for card
		
		//11:PlayerA adds next card in the the Pot
		
		//12:PlayerB adds next card in the the Pot
		
		//13: Cards are compared
		
		//14: Clear cut winner -->  winner gets Pot;  Pot emptied; goto 11
		
		//15:  Else Goto Melee STATE
		
		
		//STATE 2:  War round
		
		//21:  Player A add three to  Pot (down)
		//22:  Player B adds three to Pot (down)
		//24:  Player A adds one more to pot (up)
		//25:  PLayer B adds one more to pot (up)
		
		//26:  Last two cards compared.  Winner gets pot.  Goto 11
		//27:  If tie; goto 21
		
		
		//Corner cases?  What if can't support all 4 cards in Melee?
		
		//STATE 4:  Player exhausts all cards.  Game over.
		
		
		
		
	}

}
