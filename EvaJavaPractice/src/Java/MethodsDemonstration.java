package Java;

import java.util.Scanner;

public class MethodsDemonstration {

	//The code jumps to HERE, runs this code to the bottom, and then continues printing what is in the main method...
	public static void RightDoor(String name){
		System.out.println("You chose to go through the door on the right.\nYou found a cute puppy inside.");
		System.out.println("You go bachk to the main room");
		System.out.println(name);
	}
	public static void LeftDoor(){
		System.out.println("You chose to go through the door on the left.\nYou found a bucket of gold inside the room.");
		System.out.println("You go back to the main room");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
			String name = scan.nextLine();
			System.out.println("You are in a room. Where do you want to go?\nLEFT\nRIGHT\n");
			boolean tryeverything =true;
			while (tryeverything){
			String door = scan.nextLine();
			if (door.equals("right")){
				//This is where I am going to call the method RightDoor
				RightDoor(name);
			}
			else if (door.equals("left")){
				//This is where I am going to call the method LeftDoor
				LeftDoor();
			}

			System.out.println("Where do you want to go now?\nLEFT\nRIGHT\n");

		}
	}

}
