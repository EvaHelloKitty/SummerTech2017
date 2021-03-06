import java.awt.Color;

public class Card {
	
	private Color color;
	private int number;
	private String suit;
	
	public Card (Color color, int number, String suit){
		this.color=color;
		this.number=number;
		this.suit=suit;
	}

	public Color getColor() {
		return color;
	}

	public int getNumber() {
		return number;
	}

	public String getSuit() {
		return suit;
	}
	public String toString(){
		return number+" of "+suit;
	}
	
}
