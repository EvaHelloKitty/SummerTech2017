package Lasttry;

import java.util.Scanner;

public class printObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person anna= new Person("Anna", "brown", 5, "brown");
		System.out.println(anna.getName());
		Scanner scan = new Scanner(System.in);
		System.out.println("What eyecolor would you like your person to have?");
		String eyes= scan.next();
		anna.setEyecolor(eyes);
		System.out.println("Your person's eyecolor is now "+anna.getEyecolor());
	}

}
