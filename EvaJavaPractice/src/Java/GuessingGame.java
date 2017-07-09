	


package Java;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int random = (int)(Math.random()*100); 

		
		System.out.println("Hello! Welcome to Guessing Game! ");
		boolean guess=true;
		while (guess){
			
			

			System.out.println("Please guess a number between 1 to 100!");
			double numb1= scan.nextDouble();

			//Too High 
			if (numb1 > random){
				System.out.println("Oh! Sorry! Your number is too high! Guess again!");
			}
			
			//Too Low
			else if (numb1 < random){
				System.out.println("Ooops! Too low! Guess again!");
			}
			
			//Guessed Correctly
			else if (numb1 == random){
				System.out.println("Hooray! You guessed it!!!!");
				System.out.println("Would you like to quit now?");
				String quit1 = scan.next();
				//Wants to Quit
				if (quit1.equals("Yes")||(quit1.equals("yes"))){
					System.out.println("Okay, thanks for playing!");
					guess=false;
				}
				//Wants to Continue
				else{
					System.out.println("Time to play again, then!");
					System.out.println("Welcome back to Guessing Game!");
					continue;
				}
			}


		}
	}
	}


