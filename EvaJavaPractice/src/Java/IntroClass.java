package Java;

import java.util.Scanner;
public class IntroClass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		//		boolean pony=true;
		//		while (pony){
		//			
		//			System.out.println("Please Type Something! (Hint: hello)");
		//			String rainbowdash= scan.nextLine();
		//			System.out.println("Please Type Something Else!");
		//			String pinkiepie= scan.nextLine();
		//
		//			System.out.println(rainbowdash+" "+pinkiepie);
		//
		//			if (rainbowdash.equals("Hello")||rainbowdash.equals("hello")){
		//				System.out.println("Great! You said hello first!");
		//			}
		//
		//			else{
		//				System.out.println("Oh no! You didn't say hello first!");
		//			}
		//			
		//
		//		}


		System.out.println("Hello. Welcome to the calculator!");
		boolean calc=true;
		while (calc){

			System.out.println("Please input a number.");
			double numb1 = scan.nextDouble();
			
			System.out.println("Okay, now input another number.");
			double numb2 = scan.nextDouble();
			System.out.println("Now, what operation would you like the calculator to do?");
			String operation = scan.next();

			//Addition
			if (operation.equals("+")||operation.equals("add")||operation.equals("Add")){
				System.out.println("That equals:");
				System.out.println(numb1 + numb2);
			}
			
			//Subtraction
			else if (operation.equals("-")||operation.equals("subtract")||operation.equals("Subtract")){
				System.out.println("That equals:");
				System.out.println(numb1 - numb2);
			}
			
			//Multiplication
			else if (operation.equals("*")||operation.equals("multiply")||operation.equals("Multiply")){
				System.out.println("That equals:");
				System.out.println(numb1*numb2);
			}
			
			//Division
			else if (operation.equals("/")||operation.equals("divide")||operation.equals("Divide")){
				System.out.println("That equals:");
				System.out.println(numb1/numb2);
			}
			
			//Equals
			else if (operation.equals("=")||operation.equals("Equality")){
				if ((int) (numb1)== (int)(numb2)){
					System.out.println("These two numbers are equal!");
				}
				else{
					System.out.println("These numbers are not equal. Sorry. :(");
				}
			}
			
			else{
				System.out.println("I'm sorry, I don't compute. Please try again.");
			}
			
			System.out.println("Would you like to quit?");
			String quit = scan.next();
			if (quit.equals("Yes")||quit.equals("yes")){
				System.out.println("Okay! Goodbye!");
				calc=false;
			}
			
			else{
				System.out.println("Okay. Your calculator is ready to calculate again!");
				continue;
			}



		}


	}

}
