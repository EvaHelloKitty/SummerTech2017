import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CardDeck deck= new CardDeck();
		int p=0;
		System.out.println("Welcome to Blackjack! Cards with a number over 10 (11,12,13) have a value of 10.");
		ArrayList<Card> yourHand= new ArrayList<Card>();
		System.out.println("Your Hand:");
		System.out.println(deck.topCard(p));
		yourHand.add(deck.topCard(p));
		p++;
		System.out.println(deck.topCard(p));
		yourHand.add(deck.topCard(p));
		p++;
		Scanner scan= new Scanner(System.in);
		int hits=2;
		ArrayList<Card> dealersHand= new ArrayList<Card>();
		System.out.println("Dealer's Hand:");
		System.out.println(deck.topCard(p));
		dealersHand.add(deck.topCard(p));
		p++;
		System.out.println(deck.topCard(p));
		dealersHand.add(deck.topCard(p));
		System.out.println("Your total: "+total(deck,yourHand));
		System.out.println("Dealer's total: "+dealerTotal(deck,dealersHand));
		boolean dealerHitting=true;

		boolean game=true;
		while (game){
			System.out.println("Would you like to hit or stop?");
			String input=scan.next();
			if(input.equals("hit")){
				p++;
				System.out.println(deck.topCard(p));
				yourHand.add(deck.topCard(p));
				int m=total(deck,yourHand);
				System.out.println("Your total: "+m);
				hits++;
				if (m>21){
					//System.out.println("Your total: "+total(deck,yourHand));
					System.out.println("You lost! The dealer wins!");
					game=false;
					System.exit(0);
				}
			}
			if (input.equals("stop")){
				int n=total(deck,yourHand);
				System.out.println("Your total: "+n);
				game=false;
				if (dealerHitting){
					while (dealerTotal(deck,dealersHand)<n){
						dealersHand.add(deck.topCard(p));
						System.out.println("The dealer drew a "+deck.topCard(p));
						System.out.println("Dealer's total: "+dealerTotal(deck,dealersHand));
						if (dealerTotal(deck,dealersHand)>21){
							System.out.println("The dealer lost! You win!");
							System.exit(0);
						}
					}
				}
			}
			if (dealerTotal(deck,dealersHand)<15){
				dealersHand.add(deck.topCard(p));
				System.out.println("The dealer drew a "+deck.topCard(p));
				System.out.println("Dealer's total: "+dealerTotal(deck,dealersHand));
				if (dealerTotal(deck,dealersHand)>21){
					System.out.println("The dealer lost! You win!");
					game=false;
					System.exit(0);
				}
			}
			if (dealerTotal(deck,dealersHand)>=15){
				System.out.println("The dealer has stopped.");
				dealerHitting=false;
			}
		}
		int w=total(deck,yourHand);
		int x=dealerTotal(deck,dealersHand);
		if (21-w>21-x){
			System.out.println("Your total: "+w);
			System.out.println("Dealer's total: "+x);
			System.out.println("The dealer wins!");
		}
		if (21-w<21-x){
			System.out.println("Your total: "+w);
			System.out.println("Dealer's total: "+x);
			System.out.println("You win!");
		}
	}
	public static int total (CardDeck deck,ArrayList<Card> hand){
		Scanner scan= new Scanner(System.in);
		int total=0;
		int ace=0;
		for (int p=0;p<hand.size();p++){
			if (hand.get(p).getNumber()>10){
				total+=10;
			}
			else if (hand.get(p).getNumber()==1){
				System.out.println("Would you like your ace to be worth 1 or 11?");
				int aceInput= scan.nextInt();
				if (aceInput==1){
					total+=1;
				}
				if (aceInput==11){
					total+=11;
				}
			}
			else{
				total+=hand.get(p).getNumber();
			}
		}
		return total;
	}
	public static int dealerTotal (CardDeck deck,ArrayList<Card> hand){
		Scanner scan= new Scanner(System.in);
		int total=0;
		int ace=0;
		for (int p=0;p<hand.size();p++){
			if (hand.get(p).getNumber()>10){
				total+=10;
			}
			else if (hand.get(p).getNumber()==1){
				ace++;
			}
			else{
				total+=hand.get(p).getNumber();
			}
		}
		if (total<=10&&ace==1){
			total+=11;
		}
		if (total>10){
			total+=ace*1;
		}
		if (total<=10&&ace>1){
			total+=ace*1;
		}
		return total;
	}
}
