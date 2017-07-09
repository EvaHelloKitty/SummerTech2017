package Java;

import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("Choose a noun (an animal maybe)");
		String noun1 = scan.next();
		System.out.println("Choose 2 names");
		String name1 = scan.next();
		String name2 = scan.next();
		System.out.println("Pick an adjective");
		String adjective1 = scan.next();
		System.out.println("Pick a verb (-ing)");
		String verb1 = scan.next();
		System.out.println("Pick another verb (-ing)");
		String verb2 = scan.next();
		System.out.println("Pick two places!");
		String place = scan.next();
		String place2 = scan.next();
		System.out.println("Pick a food...");
		String food = scan.next();
		System.out.println("Choose a feeling");
		String feeling = scan.next();
		System.out.println("What is something someone would want");
		String desire = scan.next();
		
		
		//Scanning a phrase or more than one word. ???
		//Why doesn't \n print??
		
		
		System.out.println("\n--------------------------------STORY:------------------------------------------\n");
		System.out.println("Once upon a time there was a " + noun1 + ". The " + noun1 + " thought the day was great");
		System.out.println("Its friends were named " + name1 + " and " + name2 + ". They thought that the " + noun1 + " was really " +adjective1 + ".");
		System.out.println("They spent the whole day " + verb1 + " and " + verb2 + ".");
		System.out.println("They went to the " + place + " and ate some " + food + ", and they were very " + feeling);
		System.out.println("The " + noun1 + " realized the he lost his " + desire + " and " + name1 + " and " + name2 + " wanted to help it find it.");
		System.out.println("They took the " + noun1 + " back to retrace its steps, and they found themselves in " + place2);

	}

}
