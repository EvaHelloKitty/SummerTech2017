package Java;

import java.util.Scanner;

public class MethodsRecap {

	public static int area(int x, int y){
		return x*y;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the length and width of a rectangle. ");
		int length = scan.nextInt();
		int width = scan.nextInt();
		System.out.println("The area is: " + area(length, width));
		System.out.println("Choose an animal to hear its noise!");
		String animalCall =scan.next();
		
		makeSound(animalCall);
	}

	
	public static void makeSound(String animal){
		if (animal.equals("Cat")){
			System.out.println("That animal says: Meow!");
		}
		
	}
	
	

}
