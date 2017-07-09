package Java;

import java.util.Scanner;

public class ArrayTeaching2016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		
		
		
		System.out.println("Please enter the number of items you want in your shopping list.");
		int a = scan2.nextInt();
		
		String array[]= new String[a];
		
		for (int i=0; i<a; i++){
			System.out.println("Please Add an Item...");
			array[i]= scan.nextLine();
		}
		for (int j=0; j<a; j++){
			System.out.println();
			System.out.print(array[j]);
		}
		
		System.out.println("Would you like to add an item?");
		String add = scan.nextLine();
		if (add.equals("yes")){
			System.out.println("How many items would you like to add?");
			int b = scan2.nextInt();
			String array2[]= new String[b];
			
			for (int j=0; j<a; j++){
				System.out.println();
				System.out.print(array[j]);
			}
			System.out.println("Added Items:");
			for (int f=0; f<b; f++){
				
				System.out.println(array[f]);
			}
		}
		
	}
	
	

}
