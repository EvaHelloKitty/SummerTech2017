import java.util.ArrayList;
import java.util.Scanner;

public class PetStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan= new Scanner(System.in);
		System.out.println("Welcome to the pet store!");

		ArrayList<Pet> inventory=new ArrayList();



		boolean buyingPets=true;
		while (buyingPets==true){


			System.out.println("Which Pet would you like to buy?\nA. dog\nB. unicorn\nC. cat");
			String whichPet= scan.next();
			Pet yourPet = null;
			if (whichPet.equalsIgnoreCase("A")){
				System.out.println("What would you like to name your dog?");
				String name=scan.next();

				System.out.println("Which breed of dog would you like to purchase?");
				String breed=scan.next();
				yourPet = new Dog(name, breed);
				System.out.println(yourPet.toString());
			}
			else if (whichPet.equalsIgnoreCase("B")){
				System.out.println("What would you like to name your unicorn?");
				String name=scan.next();

				System.out.println("What color unicorn would you like to purchase?");
				String color=scan.next();
				yourPet= new Unicorn (name, color);
				System.out.println(yourPet.toString());
			}
			else if (whichPet.equalsIgnoreCase("C")){
				System.out.println("What would you like to name your cat?");
				String name=scan.next();

				System.out.println("What breed of cat would you like to purchase?");
				String breed=scan.next();
				yourPet= new Cat (name, breed);
				System.out.println(yourPet.toString());
			}
			inventory.add(yourPet);
			System.out.println("Would you like to buy another pet [Buy], or play with your pet(s) [Play]?");
			String buyAnotherPet= scan.next();

			if (buyAnotherPet.equalsIgnoreCase("Buy")){
				buyingPets=true;
			}
			else if (buyAnotherPet.equalsIgnoreCase("Play")){
				buyingPets=false;
			}
		}
		
		
		System.out.println("Let's play with your pet(s)!");
		boolean playWithPets=true;
		while (playWithPets==true){
			//System.out.println("Would you like to play with "+inventory.get(0).getName()+"?");
			System.out.println("You have "+inventory.size()+" pet(s).");
			for (int x=0;x<inventory.size();x++){
				System.out.println(inventory.get(x).toString());
				
			}
			System.out.println("Which pet would you like to play with?");
			int playMate = scan.nextInt();
			inventory.get(playMate).;
		}

	}

}


