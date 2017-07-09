package Java;

import java.util.Scanner;

public class TestRandomArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		String array[]=new String[13];
		double price[]=new double [13];
		int random = (int)(Math.random()*13);
		int random2 = (int)(Math.random()*13);
		



		array[0]= "1 - Cat Express - Coach Car"; 
		array[1]= "2 - Cat Express - First Class Car"; 
		array[2]= "3 - Sphynx Superliner - Coach Car"; 
		array[3]= "4 - Sphynx Superliner - First Class Car"; 
		array[4]= "5 - Chartuex Shoreliner - Coach Car"; 
		array[5]= "6 - Chartuex Shoreliner - First Class Car"; 
		array[6]= "7 - Egyptian Mau Maglev - Coach Car"; 
		array[7]= "8 - Egyptian Mau Maglev- First Class Car"; 
		array[8]= "9 - Siamese Shinkansen- Coach Car"; 
		array[9]= "10 - Siamese Shinkansen - First Class"; 
		array[10]= "11 - Selkirk Rex Steamtrain - Sleeping Car"; 
		array[11]= "12 - Devon Rex Diesel Train - Dining Car"; 
		array[12]= "13 - Cornish Rex - Caboose"; 

		//boolean test=true;
		//while (test){

			System.out.println(array[random-1]);
			System.out.println(array[random2-1]);
			//String pause=scan.next();
		//}

	}

}
