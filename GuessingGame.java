import st.Prompt;


public class GuessingGame
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int random = (int)(Math.random()*100+1);

		System.out.println("Welcome to Guessing Game!\n");
		System.out.print("I'm thinking of a number from one to one hundred! I bet you can't guess it!\n");

		double number1= Prompt.getDouble ("What is Your Guess?");

		int counter = 0;
		while (number1 != random){

			counter ++;

			if (number1 > random){
				System.out.println("Too High!\n");
			}

			else {
				System.out.println("Too Low!\n");
			}

			number1= Prompt.getDouble ("Guess Again!");

			if (counter == 10){
				System.out.println("You ran out of guesses! You lose :(");
				return;
			}
		}

		System.out.println("Congrats! You guessed the number! You win! :D");

	}

}
