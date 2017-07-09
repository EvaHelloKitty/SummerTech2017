package Lasttry;

import java.util.Scanner;

public class petStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to the Pet Store!!!!\nWhat kind of pet would you like:\nA.Unicorn");
		//Unicorn pony= new Unicorn(String "", String, String, String);
		String pet= scan.next();
		if (pet.equals("A")){
			System.out.println("What would you like to name your Unicorn?");
			String name=scan.next();
			System.out.println("What mane color would you like your unicorn to have?");
			String mane=scan.next();
			System.out.println("What body color would you like your unicorn to have?");
			String color=scan.next();
			System.out.println("Would you like your unicorn to have sparkles?");
			String sparkles=scan.next();
			Unicorn pony= new Unicorn(name,mane,color,sparkles);
			System.out.println("Name: "+pony.getName()+"\nMane Color: "+pony.getManecolor()+"\nColor: "+pony.getBodycolor()+"\nSparkles: "+pony.getSparkles());
			System.out.println("What would you like your unicorn to do:\nA. Go somewhere\nB. Fly");
			String action= scan.next();
			if (action.equals("A")){
				System.out.println("Where would you like your unicorn to go?");
				String place= scan.next();
				pony.go(place);
			}
			if (action.equals("B")){
				pony.fly();
			}
			
		}
	}

}
