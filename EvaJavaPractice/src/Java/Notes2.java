package Java;
import java.util.*;
import java.util.Scanner;

public class Notes2 {

	public static void main(String[] args) {
		
		
		System.out.println("");
		//This prints out what is in parenthesis
		
		Scanner scan = new Scanner(System.in);
		
		//String dog = scan.next();
		//This makes a variable called "dog"
		
		System.out.println("What is Matt's favorite color?\nA. Blue\nB. Red\nC. Orange");
		String color = scan.next();
		if (color.equals("B")||(color.equals("b"))){ 
			System.out.println("That is CORRECT!");
		}
		else{
			System.out.println("That is INCORRECT!");
		}
		

	}

}



//LESSON PLAN
//1 - HELLO WORLD
//2 - SETTING VARIABLES TO DEFINED VALUES/STRINGS VS. INTS
//3 - MAD LIBS
//4 - QUIZ GAME
//5 - CALCULATOR
//6 - GUESSING GAME 
//7 - RPG
//8 - FOR LOOPS AND SHAPES
//9 - ARRAYS AND SHOPPING LISTS
//10 - TIC TAC TOE AND MAZ GAME
//11 - OBJECTS 
//12 - CONNECT FOUR


