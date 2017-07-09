import java.util.Scanner;

public class ForRefresh {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		boolean shape=true;
		while (shape){
			System.out.println("\nWould you like a\n \nA-triangle \n \nor \n \nB-a square\n \nor\n \nC-a half-diamond");
			String whichshape= scan.next();
			System.out.println(whichshape);
			System.out.println("How big do you want your shape?");
			if (whichshape.equals("C")){
				System.out.println("Please note that the size you input will be doubled for the vertical length\nbecause you chose the half-diamond.\nExample: 5 -> 10 stars vertical length/5 stars horizontal width");
			}

			//else{
			//	continue;
			//}
			int max= scan.nextInt();
			System.out.println("Hi");

			//			for (int i=0;i<5;i++){
			//				System.out.println("Java coding is fun :)");
			//				System.out.println();
			//			}

			//TRIANGLE
			if (whichshape.equals("A")){
				// For loop B does the inner for loop 5 times
				for (int i=0;i<max;i++){

					// For loop A goes to 5...
					for (int j=0;j<i+1;j++){
						System.out.print("*");
					}

					System.out.println();
				}

			}
			//SQUARE
			if (whichshape.equals("B")){
				for (int i=0;i<max;i++){

					for (int j=0;j<max;j++){
						System.out.print("*");

					}
					System.out.println();
				}	
			}

			//Experiment: Half Diamond
			if (whichshape.equals("C")){

				//Top Half
				for (int i=0;i<max;i++){

					for (int j=0;j<max-i;j++){
					System.out.print(" ");
					}

					for (int j=0;j<i;j++){
						System.out.print("*");
					}
					

					
					for (int j=0;j<i;j++){
						System.out.print("*");
					}

					System.out.println();
					
					
				}

				//Bottom Half
				for (int i=0;i<max;i++){

					for (int j=0;j<i;j++){
						System.out.print(" ");
					}


					for (int j=0;j<max-i;j++){
						System.out.print("*");
					}
					
					for (int j=0; j<max-i;j++){
						System.out.print("*");
					}

					System.out.println();
				}

				System.out.println("Your shape has "+ max +" stars on each half.");

			}


			//QUITING
			System.out.println("Here is your shape!\nWould you like to quit now?");
			String quit1= scan.next();
			if (quit1.equals("Yes")||quit1.equals("yes")){
				System.out.println("Okay! Goodbye!");
				shape=false;
			}
			else{
				continue;
			}




			//			for (int j=0;j<5;j++){
			//				System.out.print("*");
			//				System.out.println();
			//
			//			}







		}
	}
}
