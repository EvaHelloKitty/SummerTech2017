import java.awt.Color;
import java.util.Random;

public class CardDeck {

	Card[] deck;

	public CardDeck (){
		deck= new Card[52];
		for (int x=0;x<13;x++){
			deck[x]= new Card(Color.RED,x+1,"diamonds");

		}
		for (int x=13;x<26;x++){
			deck[x]=new Card(Color.RED,x-12,"hearts");
		}
		for (int x=26;x<39;x++){
			deck[x]=new Card(Color.BLACK,x-25,"spades");
		}
		for (int x=39;x<52;x++){
			deck[x]=new Card(Color.BLACK,x-38,"clubs");
		}
		//shuffle();
	}
	/*
	public void shuffle (){
		Card[] otherArray= new Card[52];
		Random rand= new Random();
		for (int z=0;z<52;z++){
			boolean x=false;
			int w=0;
			while (!x){
				w=rand.nextInt(52);
				x=true;
				for(int t=0;t<52;t++){
					if (otherArray[t]==deck[w]){
						x=false;
					}
				}
			}
			otherArray[z]=deck[w];
		}
		deck= otherArray;
	}
	*/
	public void printDeck(){
		for (int r=0;r<52;r++){
			System.out.println(deck[r]);
		}
	}
	public Card topCard(int p){
		return deck[p];
	}
	
}
