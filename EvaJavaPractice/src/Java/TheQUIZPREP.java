package Java;
import java.util.Scanner;

public class TheQUIZPREP {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		Scanner scan2 = new Scanner (System.in);
		QuizObject Eva= new QuizObject();
		System.out.println("Welcome to Quiz Game! Type [START] to begin!");
		String start = scan.nextLine();
		if (start.equals("START")){
			System.out.println("Great! Note, please put all answers in ALl CAPS!!!\n\n\n\n");
			System.out.println("QUESTION 1: What is Eva's favorite color?");
			String color = scan.nextLine();
			System.out.println(color);
			if (color.equals("PINK")){
				System.out.println("That is CORRECT!");
				Eva.win();
			}
			else{
				System.out.println("That is INCORRECT");
				Eva.lose();
			}
			System.out.println("QUESTION2: When was the Declaration of Independence signed?");
			String president = scan.nextLine();
			if (president.equals("1776")){
				System.out.println("That is correct");
				Eva.win();
			}
			else{
				System.out.println("That is incorrect");
				Eva.lose();
			}
			System.out.println("QUESTION3: What is Eva's fuLl name?");
			String name = scan.nextLine();
			if (president.equals("EVA HENDERSON")||president.equals("Eva Henderson")){
				System.out.println("That is correct");  
				
			}
			else{
				System.out.println("That is incorrect");
				
			}
			String one = "";
			if (one.equals("right")){
				System.out.println("You do something....");	
			}
			else if (one.equals("left")){
				
			}
			
			
		}
		
		
	}


}

