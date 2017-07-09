package Java;

import java.util.Scanner;

public class ThePlayerGame {




	public static void bakingDay1 (Player Eric){

		boolean bakingDay1loop=true;
		while (bakingDay1loop){

			Scanner scan=new Scanner(System.in);
			Scanner scan2=new Scanner(System.in);
			System.out.println("DAY 1...");
			System.out.println("'Welcome to your bakery, Eric!' Your assitant tells you as you walk in.");
			System.out.println("Quick! Name your assistant!");
			String assistantName = scan2.nextLine();
			System.out.println(assistantName + ": They just installed the new equiptment in the shop.\nThey instructed me on how it works, so now, I can teach you.");
			System.out.println("Follow me to the couter");
			String pause1= scan.next(); 
			System.out.println("Here, like always, you take customers' orders and write them down.\nJot down the main components onto the new computer.\nBe on the look out for flavors, frostings and toppings.");

			System.out.println("Let's do a practice run. A customer's order will look something like this:\n \n---------------------------------------------------------------------\n" + assistantName + " - Chocolate Cup Cake - Vanilla Frosting - Rainbow Sprinkles\n---------------------------------------------------------------------\n");
			System.out.println("Jot it down now.");
			String note1= scan2.nextLine();
			System.out.println(note1);
			System.out.println("  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
			
			if (note1.equals(assistantName + " - Chocolate Cup Cake - Vanilla Frosting - Rainbow Sprinkles")){
				System.out.println("Great job! You're getting the hang of it.");
				System.out.println("Now, re-type it onto the recipe card to bake it.");
				
				String note2= scan2.nextLine();
				if (note2.equals(assistantName + " - Chocolate Cup Cake - Vanilla Frosting - Rainbow Sprinkles")){
					System.out.println("Great Job!\nYou've Earned Expierience Points!\nThese points will help you to level up in the game.\n");
					//Get EXP
					Eric.win();
					System.out.println("EXP: " + Eric.getExp());
				}
				else{ 
					System.out.println("Oh no! You made a mistake.\nYou lose expierience points!");
					//Lose EXP
					Eric.lose();
					System.out.println("EXP: " + Eric.getExp());
				}

				System.out.println("Look!\nHere comes your first customer!\nI'll be in the back if you need me, Eric.\n(Leaves)\n \n");
				break;


			}
			else{

			}

		}
	}

	public static void orders (String people[], String cake[], String frosting[], String toppings[], Player Eric){
		Scanner scan=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);


		boolean orders=true;
		while (orders){

			int random = (int)(Math.random()*13);
			int random1 = (int)(Math.random()*13);
			int random2 = (int)(Math.random()*13);
			int random3 = (int)(Math.random()*13);

			System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

			if (people[random].equals("Eric II")){
				System.out.println("Eric II - Pretty Pretty Princess Cake - Cream Cheese Frosting - Gummy Bears Topping");
			}

			else{
				System.out.println((people[random]) + " - " + (cake[random1]) + " - " + (frosting[random2]) + " - " + (toppings[random3]));
			}

			System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

			System.out.println("Copy it down.");
			String copy1 = scan2.nextLine();
			if (copy1.equals((people[random]) + " - " + (cake[random1]) + " - " + (frosting[random2]) + " - " + (toppings[random3]))){
					//||copy1.equals("Eric II - Pretty Pretty Princess Cake- Cream Cheese Frosting - Gummy Bears Topping")){
				System.out.println("Order Correct");
				System.out.println("  \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("Then, re-type it onto the recipe card to bake it.");
				String copy2= scan2.nextLine();
				System.out.println(copy2);
				if (copy2.equals((people[random]) + " - " + (cake[random1]) + " - " + (frosting[random2]) + " - " + (toppings[random3]))||copy1.equals("Eric II - Pretty Pretty Princess Cake- Cream Cheese Frosting - Gummy Bears Topping")){
					System.out.println("Correct!");
					//Gain EXP
					Eric.win();
					System.out.println("EXP: " + Eric.getExp());
					return;

				}
				else{
					System.out.println("Incorrect!");
					//Lose EXP
					Eric.lose();
					System.out.println("EXP: " + Eric.getExp());
					return;
				}



			}

			else{
				System.out.println("You made a mistake.");
				Eric.lose(); 
				System.out.println("EXP: " + Eric.getExp());
				return;
			}




		}
	}



	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		Player Eric= new Player(100);

		String people[]=new String[13];
		String cake[]= new String[13];
		String frosting[]= new String[13];
		String toppings[]= new String [13];




		people[0]= "Scarlet"; 
		people[1]= "Grayson"; 
		people[2]= "Frank"; 
		people[3]= "Steve"; 
		people[4]= "Claire"; 
		people[5]= "Blake"; 
		people[6]= "Crescent"; 
		people[7]= "Mo"; 
		people[8]= "Jack"; 
		people[9]= "Beatrice"; 
		people[10]= "Eric II"; 
		people[11]= "Eva"; 
		people[12]= "Anna"; 

		cake[0]= "Vanilla Cake";
		cake[1]= "Chocolate Cake";
		cake[2]= "Strawberry Cake";
		cake[3]= "Red Velvet Cake";
		cake[4]= "Pretty Pretty Princess Cake";
		cake[5]= "Peanut Butter Cake";
		cake[6]= "Mint Chocolate Chip Cake";
		cake[7]= "S'mores Cake";
		cake[8]= "Cookie Dough Cake";
		cake[9]= "Confetti Cake";
		cake[10]= "Carrot Cake";
		cake[11]= "Banana Cake";
		cake[12]= "The 'Eric' Cake";

		frosting[0]= "Vanilla Frosting";
		frosting[1]= "Chocolate Frosting";
		frosting[2]= "Cream Cheese Frosting";
		frosting[3]= "Strawberry Frosting";
		frosting[4]= "Marshmallow Frosting";
		frosting[5]= "Whipped Frosting";
		frosting[6]= "Banana Frosting";
		frosting[7]= "Lemon Frosting";
		frosting[8]= "Cookie Frosting";
		frosting[9]= "Nutella Frosting";
		frosting[10]= "Peaunut Butter Frosting";
		frosting[11]= "Cheese Cake Frosting";
		frosting[12]= "The 'Eric' Frosting";

		toppings[0]= "Rainbow Sprinkles Topping";
		toppings[1]= "Chocolate Syrup Topping";
		toppings[2]= "Chocolate Sprinkles Topping";
		toppings[3]= "Chocolate Chips Topping";
		toppings[4]= "Strawberry Syrup Topping";
		toppings[5]= "White Chocolate Chips Topping";
		toppings[6]= "Banana Slice Topping";
		toppings[7]= "M & M's Topping";
		toppings[8]= "Cookie Crumbs Topping";
		toppings[9]= "Reese's Pieces Topping";
		toppings[10]= "Gummy Bears Topping";
		toppings[11]= "Teddy Grahams Topping";
		toppings[12]= "The 'Eric' Topping";



		boolean CUPCAKECOP=true;
		while (CUPCAKECOP){


			
			CupcakePic.myLittlecupcake();
			System.out.println();
			System.out.println("Welcome to Cupcake Cop!\nPlease Type [START] to begin!\n");
			String start =scan.next();
			if (start.equals("START")){
				System.out.println("STORY:\n \n Eric lives in a world of forced occupations, and Eric finds that he is forced to be a cupcake baker.\nAt first, Eric was disappoited.\n'I can't be a cupcake baker,' he thought. 'Baking cute little cupcakes is not for me. I would rather be Java coding and looking at pictures of trains.'");
				System.out.println("But then, he found that as a baker, he had a very special double purpose- to fight the evil Bad Batch-ers of the cupcakes he baked.");
				System.out.println("He became the Cupcake Cop.\nCupcake baker by day, Cop by night.");
				System.out.println("Please type [CONTINUE] to continue on to the game.");
				String beginGame = scan.next();
				if (beginGame.equals("CONTINUE")){
					bakingDay1 (Eric);
				}
				
				orders (people,cake, frosting, toppings, Eric); 


			}


		}
	}

}

//	System.out.println("Eric: Greetings! You must be my new apprentice. You're destined to be a cupcake baker too?");
//	String response1= scan.next();
//	System.out.println("Eric: Don't worry, there's more to this cupcake shop than most people think.");
//	System.out.println("He winks at you.");
//	System.out.println("What's your name?");
//	String name= scan.nextLine();
//}
