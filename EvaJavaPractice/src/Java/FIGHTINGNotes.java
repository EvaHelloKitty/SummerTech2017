package Java;
import java.util.*;

public class FIGHTINGNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner scan = new Scanner (System.in);
	
	boolean fighting = true;
	while (fighting){
		Random rand = new Random();
		System.out.println("You confront an enemy. Type [FIGHT] to see who wins!");
		String fight = scan.next();
		if (fight.equals("FIGHT")){
			int a = rand.nextInt(11);
			if (a>5){
			System.out.println("You win! :D");
				}
			else if (a<5){
				System.out.println("You lose :(");
				}
	}
	}

	}

}
