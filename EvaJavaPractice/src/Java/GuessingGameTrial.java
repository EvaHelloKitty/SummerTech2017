
package Java;
import java.util.*;

public class GuessingGameTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		boolean set = true;
		while (set) {
		int a = rand.nextInt(10);
		
		 
		
		System.out.println("Welcome to Guessing Game!");
		boolean game=true;
		while (game){
		System.out.println("Please Guess a Number.");
		int guess = scan.nextInt();
		if (guess==a){
			System.out.println("YOU WIN");
			System.out.println("Do You Want to Quit? [y/n]");
			String quit = scan.next();
			if (quit.equals("y")){
				System.out.println("Okay! Thanks for plying!");
				
				set=false;
			}
			else{
				System.out.println("Welcome Back to Guessing Game!");
				break;
			}
		}
		else if (guess<a&&guess>0){
			System.out.println("Oh! Too Low!");
		}
		else if (guess>a&&guess<11){
			System.out.println("Whoa! Too High!");
		}
		else{
			System.out.println("Please Pick a Number From 1 to 10.\nTry Again!");
			continue;
		}
		}
		}
	}

}
