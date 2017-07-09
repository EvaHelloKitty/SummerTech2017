package Java;

import java.util.Scanner;

public class TheForLoopReview2016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		
	   //initialization;termination;inCriment
		
		//This for loop counts up from 1
		//It starts with 1, counts up until 'f' can't be less than eleven, and counts UP
		for (int f=1;f<11; f++){
			System.out.println("Count is: " + f);
			System.out.println(" ");
		}
		
		System.out.println("\n-------------------------------------\n");
		//This for loop counts down from 10
		//It starts with 10, counts down until 'i' can't be greater than 0, and counts DOWN
		for (int i=10; i>0; i--){
			System.out.println("Count is: " + i);
			System.out.println(" ");
		}
		
		System.out.println("\n-------------------------------------\n");
		
		for (int g=1;g<11; g++){
			System.out.println("This is " + g + "*");
		}
		System.out.println("\n-------------------------------------\n");
		int max = scan.nextInt();
		for (int m=0;m<max;m++){
			
			for (int n=0;n<m+1;n++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i=0;i<max;i++){
			

			// For loop A goes to 5...
			for (int j=0;j<i+1;j++){
				System.out.print("*");
			}

			System.out.println();
		}

		
		

	}

}
